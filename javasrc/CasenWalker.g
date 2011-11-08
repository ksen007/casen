grammar CasenWalker;

options {
    ASTLabelType=CommonTree;
    tokenVocab=Casen; 
}

program
    	:     	stmt_list?
    	;    

stmt_list
	:	stmt+
	;

stmt
	:    	^(LSTMT ID stmt)
    |    	expr
    |    	^(RETURN expr)
    |    	RETURN
    |    	^(IFGOTO expr ID)
    |    	^(YIELD expr)
    |    	^(RESUME expr)
    ;

expr [Function fun] returns [Expression expr]
    : 	^(op=assignop e1=expr[fun] e2=expr[fun]) {$expr = new AssignOp(fun,$op.text,$e1.expr,$e2.expr); }
    |   ^(op=bool_to_bool_binop e1=expr[fun] e2=expr[fun]) {$expr = new BoolToBoolBinop(fun,$op.text,$e1.expr,$e2.expr); }
	|   ^(op=num_to_bool_binop e1=expr[fun] e2=expr[fun]) {$expr = new NumToBoolBinop(fun,$op.text,$e1.expr,$e2.expr); }
	|   ^(op=num_to_num_binop e1=expr[fun] e2=expr[fun]) {$expr = new NumToNumBinop(fun,$op.text,$e1.expr,$e2.expr); }
	|   ^(op=int_to_int_binop e1=expr[fun] e2=expr[fun]) {$expr = new IntToIntBinop(fun,$op.text,$e1.expr,$e2.expr); }
    |   ^(op='!' e1=expr[fun]) {$expr = new BoolToBoolUnop(fun,$op.text,$e1.expr); }
    |   ^(op='-' e1=expr[fun]) {$expr = new NumToNumUnop(fun,$op.text,$e1.expr); }
    |   ^(op='~' e1=expr[fun]) {$expr = new IntToIntUnop(fun,$op.text,$e1.expr); }
	|	expr ^(APPLY expr)*
	|	expr ^(CONTEXT expr)?
	|	^('[' expr expr)
	|	^('.' expr ID)
	|	ID
	|	LID
	|	ARG
	|	^(ARG expr+)
	|	ICONST
	|	FCONST
	|	SCONST
	|	^(DEF ID fun)
	|	^(DEF allops fun)
	|	fun		
	;
	
fun	:	^(FUN paramlist? stmt_list?)
    ;

paramlist 
    :      ^(PARAM ID+)
    ;

allops 
    :       assignop
    |       num_to_bool_binop
    |       num_to_num_binop
    |       int_to_int_binop
    |       bool_to_bool_op
    |       '!'
    |       '~'
    ;

num_to_bool_binop
	:	'=='
	|	'!='
	|	'<'
	|	'<='
	|	'=>'
	|	'>'
    ;

num_to_num_binop
	:	'+'
	|	'-'
	|	'*'
	|	'/'
	;

int_to_int_binop
	:	'%'
	|	'<<'
	|	'>>'
	|   '^'
	|   '|'
	|   '&'
    ;

bool_to_bool_binop
    :   '||'
    |   '&&'
    ;

assignop 
    	:       '='
    	|       '*='
    	|       '/='
    	|       '%='
    	|       '+='
    	|       '-='
    	|       '<<='
    	|       '>>='
    	|       '&='
    	|       '|='
    	|       '^='
    	;
