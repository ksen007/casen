#ifndef __CASEN__
#define __CASEN__

#ifdef _MSC_VER

typedef __int32 int32_t;
typedef unsigned __int32 uint32_t;
typedef __int64 int64_t;
typedef unsigned __int64 uint64_t;

#else
#include <stdint.h>
#endif

typedef enum _type {_UNDEF, _BOOL, _INT, _DOUBLE, _STRING, _ARRAY, _FUNCTION, _OBJECT} _TYPE;

/* must of the total number of global identifiers */
extern int32_t N_IDENTIFIERS;

/* identifier _pc must map to 0 */
#define CL_PC 0
#define CL_FUN 1
#define CL_LS 2
#define CL_DS 3
#define CL_SS 4
#define CL_CONSTRUCTOR 5
/* start location for a function */
#define START_LOC 0

typedef struct _functiondata {
  char * name;
  void (* fp)();
  int32_t nArgs;
  int32_t* args;
  int32_t nFields;
  int32_t* fields;
  int32_t* table;
} FUNCTION_DATA;

typedef struct _objectvalue {
  int32_t * table;
  struct _value * frame;
} OBJECT_TYPE;

typedef struct _functionvalue {
  struct _value * closure;
  struct _functiondata * data;
} FUNCTION_TYPE;

typedef struct _arrayvalue {
  int64_t length;
  struct _value * array;
} ARRAY_TYPE;

typedef struct _stringvalue {
  int64_t length;
  char * string;
} STRING_TYPE;

typedef struct _value {
  _TYPE type;
  union {
    int64_t intValue;
    double doubleValue;
    OBJECT_TYPE objectValue;
    ARRAY_TYPE arrayValue;
    FUNCTION_TYPE functionValue;
    STRING_TYPE stringValue;
  } val;
} _VALUE;

extern void printval(_VALUE val);


extern _VALUE _stack[];
extern int32_t _stackp;
extern char * ID[];

#define ASSERT(b)							\
  if(!(b)) {								\
    fprintf(stderr,"Assertion failed %s %d. " #b,__FILE__, __LINE__);	\
    exit(1);								\
  }

#define ASSERT2(b)							\
  if(!(b)) {								\
    fprintf(stderr,"Assertion 2 failed %s %d. " #b,__FILE__, __LINE__);	\
    printf("# of elements in stack %d",(_stackp+1));			\
    printval(PEEK); printval(PEEK2);					\
    exit(1);								\
  }

#define PUSH (_stack[_stackp++])
#define POP (_stack[--_stackp])
#define PEEK (_stack[_stackp-1])
#define PEEK2 (_stack[_stackp-2])
#define PEEK3 (_stack[_stackp-3])

extern int64_t GET_BOOL();

extern int64_t GET_INT();

extern double GET_DOUBLE();

extern char * GET_STRING();


#define NEW_FUNCTION(fdata)						\
  PUSH;									\
  PEEK.type = _FUNCTION;						\
  PEEK.val.functionValue.closure = (_VALUE *)malloc(sizeof(_VALUE));	\
  ASSERT2(PEEK.val.functionValue.closure != NULL);			\
  *(PEEK.val.functionValue.closure) = thisframe;			\
  PEEK.val.functionValue.data = &fdata; 

#define NEW_OBJECT							\
  special_value.type = _OBJECT;						\
  special_value.val.objectValue.table = special_fun.val.functionValue.data->table; \
  special_value.val.objectValue.frame = (_VALUE *)malloc(sizeof(_VALUE)*special_fun.val.functionValue.data->nFields); \
  ASSERT2(special_value.val.objectValue.frame != NULL);				\
  for (special_idx = special_fun.val.functionValue.data->nFields; special_idx>0; special_idx--) { \
    (*(special_value.val.objectValue.frame+special_idx-1)).type = _UNDEF;		\
  }									\
  PUSH = special_value;							\
  PUSH = special_value;							\
  PUT_FIELD(CL_LS);							\
  PUSH = special_value;							\
  PUSH = thisframe;							\
  PUT_FIELD(CL_DS);							\
  PUSH = special_value;							\
  PUSH = *(special_fun.val.functionValue.closure);			\
  PUT_FIELD(CL_SS);							\
  PUSH = special_value;							\
  PUSH = special_fun;							\
  PUT_FIELD(CL_CONSTRUCTOR);


#define ASSIGN_ARGUMENT(nargs)						\
  ASSERT2(nargs == special_fun.val.functionValue.data->nArgs);		\
  for (special_idx = 0; special_idx < nargs; special_idx++) {		\
    special_idx2 = special_fun.val.functionValue.data->args[special_idx]; \
    special_value2 = POP;						\
    PUSH = special_value;						\
    PUSH = special_value2;						\
    PUT_FIELD(special_idx2);						\
  }									


#define CALL_FUNCTION_NOFRESH(nargs)					\
  special_fun = _stack[_stackp-2-nargs];				\
  special_val = _stack[_stackp-1-nargs];				\
  ASSERT2(special_fun.type == _FUNCTION);				\
  ASSERT2(special_val.type == _OBJECT);					\
  ASSIGN_ARGUMENT(nargs)						\
  POP;									\
  POP;									\
  special_fun.val.functionValue.data->fp(special_value,START_LOC);	\
  PUSH = special_return;						\
  special_return = None;

#define CALL_FUNCTION_FRESH(nargs)					\
  special_fun = _stack[_stackp-1-nargs];				\
  ASSERT2(special_fun.type == _FUNCTION);				\
  NEW_OBJECT								\
  ASSIGN_ARGUMENT(nargs);						\
  POP;									\
  special_fun.val.functionValue.data->fp(special_value,START_LOC);	\
  PUSH = special_return;						\
  special_return = None;

#define LOAD_BOOL(b)				\
  PUSH;						\
  PEEK.type = _BOOL; PEEK.val.intValue = b;

#define LOAD_INT(i)				\
  PUSH;						\
  PEEK.type = _INT; PEEK.val.intValue = i; 

#define LOAD_DOUBLE(d)				\
  PUSH;						\
  PEEK.type = _DOUBLE; PEEK.val.doubleValue = d;

#define LOAD_STRING(s)					\
  PUSH;							\
  PEEK.type = _STRING; PEEK.val.stringValue.string = s;	\
  PEEK.val.stringValue.length = strlen(s);

#define LOAD(f)							\
  ASSERT(thisframe.type == _OBJECT);				\
  ASSERT(f >=0 && f < N_IDENTIFIERS);				\
  ASSERT2(thisframe.val.objectValue.frame != NULL);		\
  special_idx = thisframe.val.objectValue.table[f];		\
  ASSERT2(special_idx>=0);					\
  PUSH = *(thisframe.val.objectValue.frame+special_idx);

#define STORE(f)						\
  ASSERT(thisframe.type == _OBJECT);				\
  ASSERT(f >=0 && f < N_IDENTIFIERS);				\
  ASSERT2(thisframe.val.objectValue.frame != NULL);		\
  special_idx = thisframe.val.objectValue.table[f];		\
  ASSERT2(special_idx>=0);					\
  *(thisframe.val.objectValue.frame+special_idx) = PEEK;	\
  POP;

#define GET_FIELD(f)					\
  ASSERT2(PEEK.type == _OBJECT);			\
  ASSERT(f >=0 && f < N_IDENTIFIERS);			\
  ASSERT2(PEEK.val.objectValue.frame != NULL);		\
  special_idx = PEEK.val.objectValue.table[f];		\
  ASSERT2(special_idx>=0);				\
  PEEK = *(PEEK.val.objectValue.frame+special_idx);

#define PUT_FIELD(f)					\
  ASSERT2(PEEK2.type == _OBJECT);			\
  ASSERT(f >=0 && f < N_IDENTIFIERS);			\
  ASSERT2(PEEK2.val.objectValue.frame != NULL);		\
  special_idx = PEEK2.val.objectValue.table[f];		\
  ASSERT2(special_idx>=0);				\
  *(PEEK2.val.objectValue.frame+special_idx) = PEEK;	\
  POP; POP;

#define GET_ITEM							\
  ASSERT2(PEEK2.type == _ARRAY);					\
  ASSERT2(PEEK.type == _INT);						\
  ASSERT2(PEEK2.val.arrayValue.array != NULL);				\
  special_idx = PEEK.val.intValue;					\
  ASSERT2(special_idx>=0 && special_idx < PEEK2.val.arrayValue.length);	\
  PEEK2 = *(PEEK2.val.arrayValue.array+special_idx);			\
  POP;

#define PUT_ITEM							\
  ASSERT2(PEEK3.type == _ARRAY);					\
  ASSERT2(PEEK2.type == _INT);						\
  ASSERT2(PEEK3.val.arrayValue.array != NULL);				\
  special_idx = PEEK2.val.intValue;					\
  ASSERT2(special_idx>=0 && special_idx < PEEK3.val.arrayValue.length);	\
  *(PEEK3.val.arrayValue.array+special_idx) = PEEK;			\
  POP; POP;


/* handle + - * / % */
#define APPLY_NUM_TO_NUM_BINOP(op)					\
  ASSERT2((PEEK.type==_INT || PEEK.type==_DOUBLE) && (PEEK2.type==_INT || PEEK2.type==_DOUBLE)); \
  if (PEEK.type==_INT && PEEK2.type==_INT) {				\
    PEEK2.type = _INT;							\
    PEEK2.val.intValue = PEEK2.val.intValue op PEEK.val.intValue;	\
  } else if (PEEK.type==_DOUBLE && PEEK2.type==_INT) {			\
    PEEK2.type = _DOUBLE;						\
    PEEK2.val.doubleValue = PEEK2.val.doubleValue op PEEK.val.intValue;	\
  } else if (PEEK.type==_INT && PEEK2.type==_DOUBLE) {			\
    PEEK2.type = _DOUBLE;						\
    PEEK2.val.doubleValue = PEEK2.val.intValue op PEEK.val.doubleValue;	\
  } else if (PEEK.type==_DOUBLE && PEEK2.type==_DOUBLE) {		\
    PEEK2.type = _DOUBLE;						\
    PEEK2.val.doubleValue = PEEK2.val.doubleValue op PEEK.val.doubleValue; \
  }									\
  POP;

/* handle << >> | & ^  ops */
#define APPLY_INT_TO_INT_BINOP(op)					\
  ASSERT2(PEEK.type==_INT && PEEK2.type==_INT); 			\
  PEEK2.val.intValue = PEEK2.val.intValue op PEEK.val.intValue;		\
  POP;

/* handle <= >= < > == != */
#define APPLY_NUM_TO_BOOL_BINOP(op)					\
  ASSERT2((PEEK.type==_INT || PEEK.type==_DOUBLE) && (PEEK2.type==_INT || PEEK2.type==_DOUBLE)); \
  PEEK2.type = _BOOL;							\
  if (PEEK.type==_INT && PEEK2.type==_INT) {				\
    PEEK2.val.intValue = PEEK2.val.intValue op PEEK.val.intValue;	\
  } else if (PEEK.type==_DOUBLE && PEEK2.type==_INT) {			\
    PEEK2.val.intValue = PEEK2.val.doubleValue op PEEK.val.intValue;	\
  } else if (PEEK.type==_INT && PEEK2.type==_DOUBLE) {			\
    PEEK2.val.intValue = PEEK2.val.intValue op PEEK.val.doubleValue;	\
  } else if (PEEK.type==_DOUBLE && PEEK2.type==_DOUBLE) {		\
    PEEK2.val.intValue = PEEK2.val.doubleValue op PEEK.val.doubleValue; \
  }									\
  POP;

/* handle || &&  */
#define APPLY_BOOL_TO_BOOL_BINOP(op)					\
  ASSERT2(PEEK.type==_BOOL && PEEK2.type==_BOOL);			\
  PEEK2.val.intValue = PEEK2.val.intValue op PEEK.val.intValue;		\
  POP;


/* handle - */
#define APPLY_NUM_TO_NUM_UNNOP(op)					\
  ASSERT2(PEEK.type==_INT || PEEK.type==_DOUBLE);			\
  if (PEEK.type==_INT) {						\
    PEEK.val.intValue = op PEEK.val.intValue;				\
  } else if (PEEK.type==_DOUBLE) {					\
    PEEK.val.doubleValue = op PEEK.val.doubleValue;			\
  } 

/* handle ~ */
#define APPLY_INT_TO_INT_UNNOP(op)					\
  ASSERT2(PEEK.type==_INT);						\
  PEEK.val.intValue = op PEEK.val.intValue;				

/* handle !  */
#define APPLY_BOOL_TO_BOOL_UNNOP(op)					\
  ASSERT2(PEEK.type==_BOOL);						\
  PEEK.val.intValue = op PEEK.val.intValue;				

#define STORE_RETURN special_return = POP;


#endif
