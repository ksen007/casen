#include "clome.h"
#include <stdio.h>
#include <stdlib.h>

int32_t N_IDENTIFIERS;
_VALUE _stack[1024];
int32_t _stackp = 0;
_VALUE special_value;
_VALUE special_value2;
_VALUE special_return;
_VALUE special_fun;
int64_t special_idx;
int64_t special_idx2;

_VALUE None;

int64_t GET_BOOL() {
  ASSERT2(PEEK.type==_BOOL); 
  return POP.val.intValue;
}

/*
int64_t GET_INT() {
  ASSERT2(PEEK.type==_INT); 
  return POP.val.intValue;
}

double GET_DOUBLE() {
  ASSERT2(PEEK.type==_DOUBLE); 
  return POP.val.doubleValue;
}

char * GET_STRING() {
  ASSERT2(PEEK.type==_STRING); 
  return POP.val.stringValue.string;
}
*/

int64_t cl_get_bool(_VALUE val) {
  ASSERT2(val.type==_BOOL); 
  return val.val.intValue;
}

int64_t cl_get_int(_VALUE val) {
  ASSERT2(val.type==_INT); 
  return val.val.intValue;
}

double cl_get_double(_VALUE val) {
  ASSERT2(val.type==_DOUBLE); 
  return val.val.doubleValue;
}

char * cl_get_string(_VALUE val) {
  ASSERT2(val.type==_STRING); 
  return val.val.stringValue.string;
}

_VALUE cl_get_field(_VALUE val, int32_t f) {
  PUSH = val;
  GET_FIELD(f);
  return POP;
}

void cl_set_field(_VALUE val, int32_t f, _VALUE v) {
  PUSH = val;
  PUSH = v;
  PUT_FIELD(f);
}

_TYPE cl_get_type(_VALUE val) {
  return val.type;
}

int64_t cl_get_length(_VALUE val) {
  ASSERT2(val.type==_ARRAY); 
  return val.val.arrayValue.length;
}

_VALUE cl_get_item(_VALUE val, int64_t i) {
  PUSH = val;
  LOAD_INT(i)
  GET_ITEM;
  return POP;
}

void cl_set_item(_VALUE val, int64_t i, _VALUE v) {
  PUSH = val;
  LOAD_INT(i);
  PUSH = v;
  PUT_ITEM;
}

int32_t* cl_get_arguments(_VALUE val) {
  ASSERT2(val.type==_FUNCTION); 
  return val.val.functionValue.data->args;
}

int32_t* cl_get_fields(_VALUE val) {
  ASSERT2(val.type==_FUNCTION); 
  return val.val.functionValue.data->fields;
}

int32_t cl_get_argument_count(_VALUE val) {
  ASSERT2(val.type==_FUNCTION); 
  return val.val.functionValue.data->nArgs;
}

int32_t cl_get_field_count(_VALUE val) {
  ASSERT2(val.type==_FUNCTION); 
  return val.val.functionValue.data->nFields;
}

char * cl_get_name(_VALUE val) {
  ASSERT2(val.type==_FUNCTION); 
  return val.val.functionValue.data->name;
}

_VALUE cl_get_closure(_VALUE val) {
  ASSERT2(val.type==_FUNCTION); 
  return *(val.val.functionValue.closure);
}

char * cl_get_field_name(int32_t f) {
  return ID[f];
}

void printval2(_VALUE val,int flag) {
  int32_t i, idx;
  _VALUE constructor;
  switch (val.type) {
  case _UNDEF:
    printf("UNDEF\n");
    break;
  case _BOOL:
    printf("BOOL");
    printf(":%s\n",val.val.intValue?"true":"false");
    break;
  case _INT:
    printf("INT");
    printf(":%qi\n",val.val.intValue);
    break;
  case _DOUBLE:
    printf("DOUBLE");
    printf(":%g\n",val.val.doubleValue);
    break;
  case _STRING:
    printf("STRING");
    printf(":%s\n",val.val.stringValue.string);
    break;
  case _ARRAY:
    printf("ARRAY: %p\n", val.val.arrayValue.array);
    if (flag) {
      for(i=0; i<val.val.arrayValue.length;i++) {
	printf("    %d -> ",i);
	printval2(val.val.arrayValue.array[i],0);
      }
    }
    break;
  case _FUNCTION:
    printf("FUNCTION: %s\n",val.val.functionValue.data->name);
    printf("    args: ");
    for(i=0;i<val.val.functionValue.data->nArgs;i++) {
      printf("%s ",ID[val.val.functionValue.data->args[i]]);
    }
    printf("\n    fields: ");
    for(i=0;i<val.val.functionValue.data->nFields;i++) {
      printf("%s ",ID[val.val.functionValue.data->fields[i]]);
    }
    printf("\n");
    break;
  case _OBJECT:
    printf("OBJECT: %p\n",val.val.objectValue.frame);
    if (flag) {
      constructor = val.val.objectValue.frame[val.val.objectValue.table[CL_CONSTRUCTOR]];
      for(i=0;i<constructor.val.functionValue.data->nFields;i++) {
	idx = constructor.val.functionValue.data->fields[i];
	printf("    %s -> ",ID[idx]);
	printval2(val.val.objectValue.frame[i],0);
      }
    }
    break;
  default:
    printf("BAD  BAD");
    break;
  }
}

void printval(_VALUE val) {
  printval2(val,1);
}

#define CL_x 6
#define CL_y 7
#define CL_a 8
#define CL_b 9
#define CL_ret 10
#define CL_foo 11
#define CL_bar 12
#define CL_f 13
#define CL_fac 14
#define CL_n 15

char *ID[] = {"PC","FUN","LS","DS","SS","CONSTRUCTOR","x","y","a","b","ret","foo","bar","f","fac","n"};

void _fun1_fp(_VALUE thisframe, int64_t pc) {
  printf("_fun1\n");
}
int32_t _fun1_arg[] = {10,8};
int32_t _fun1_field[] = {CL_PC, CL_FUN, CL_LS, CL_DS, CL_SS, 6,7,8,10,14};
int32_t _fun1_table[] = {0,1,2,3,4,-1,9,7,6,-1,5,-1,-1,-1,8};
FUNCTION_DATA _fun1_data = { "fun1",_fun1_fp, 2, _fun1_arg, 10, _fun1_field, _fun1_table };


void _fun2_fp(_VALUE thisframe, int64_t pc) {
  printval(thisframe);
  LOAD(CL_n);
  LOAD_INT(1);
  APPLY_NUM_TO_BOOL_BINOP(>);
  if (GET_BOOL()) {
    LOAD(CL_n);
    LOAD(CL_SS);
    GET_FIELD(CL_fac);
    LOAD(CL_n);
    LOAD_INT(1);
    APPLY_NUM_TO_NUM_BINOP(-);
    CALL_FUNCTION_FRESH(1);
    APPLY_NUM_TO_NUM_BINOP(*);
    STORE_RETURN;
  } else {
    LOAD_INT(1);
    STORE_RETURN;
  }
  return;
}

int32_t _fun2_arg[] = {CL_n};
int32_t _fun2_field[] = {CL_PC, CL_FUN, CL_LS, CL_DS, CL_SS, CL_CONSTRUCTOR,CL_n};
int32_t _fun2_table[] = {0,1,2,3,4,5,-1,-1,-1,-1,-1,-1,-1,-1,-1,6};
FUNCTION_DATA _fun2_data = {"fac", _fun2_fp, 1, _fun2_arg, 7, _fun2_field, _fun2_table };

void _fun3_fp(_VALUE thisframe, int64_t pc) {
  printval(thisframe);
  NEW_FUNCTION(_fun2_data);
  STORE(CL_fac);
  LOAD(CL_LS);
  STORE_RETURN;
  return;
}

int32_t _fun3_arg[] = {};
int32_t _fun3_field[] = {CL_PC, CL_FUN, CL_LS, CL_DS, CL_SS, CL_CONSTRUCTOR, CL_fac};
int32_t _fun3_table[] = {0,1,2,3,4,5,-1,-1,-1,-1,-1,-1,-1,-1,6,-1};
FUNCTION_DATA _fun3_data = { "main",_fun3_fp, 0, _fun3_arg, 7, _fun3_field, _fun3_table };


main() {
  N_IDENTIFIERS = 16;
  None.type = _OBJECT;
  None.val.objectValue.table  = (int32_t *)0;
  None.val.objectValue.frame = (struct _value *)0;
  _VALUE thisframe = None;
  NEW_FUNCTION(_fun3_data);
  CALL_FUNCTION_FRESH(0);
  GET_FIELD(CL_fac);
  LOAD_INT(5);
  CALL_FUNCTION_FRESH(1);  
  printval(PEEK);

}

