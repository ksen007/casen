grammar Casen;

options {
    k=2;
    ASTLabelType=CommonTree;
    output=AST;
}

tokens {
    LSTMT;
    RETURN;
    IFGOTO;
    YIELD;
    RESUME;
    ARG;
    FUN;
    DEF;
    PARAM;
    APPLY;
    CONTEXT;
}

program
    :     NL? stmt_list? -> stmt_list?
    ;    

stmt_list 
    :     labeled_stmt (NL labeled_stmt )* NL? -> labeled_stmt+ 
    ;

labeled_stmt 
    :     ID ':' stmt -> ^(LSTMT ID stmt)
    |    stmt
    ;

stmt 
    :   expr
    |    'return' expr -> ^(RETURN expr)
    |    'return' -> RETURN
    |    'IF' '(' expr ')' 'GOTO' ID -> ^(IFGOTO expr ID)
    |    'yield' expr -> ^(YIELD expr)
    |   'resume' expr -> ^(RESUME expr)
    ;

expr 
    : assign_expr
    ;

assign_expr 
    :    lor_expr (assignop^ assign_expr)?
    ;

allops 
    :         '+'
    |          '-'
    |       '*'
    |       '/'
    |       '%'
    |       '|'
    |        '&'
    |       '~'
    |       '^'
    |       '<<'
    |       '>>'
    |       '||'
    |       '&&'
    |       '!'
    |       '<'
    |       '<='
    |       '>'
    |       '>='
    |       '=='
    |       '!='
    |       '='
    |        '*='
    |         '/='
    |       '%='
    |       '+='
    |       '-='
    |         '<<='
    |       '>>='
    |       '&='
    |       '^='
    |       '|='
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

lor_expr 
    :   (land_expr) ('||'^ land_expr)*
    ;

land_expr 
    :     (or_expr) ('&&'^ or_expr)*
    ;

or_expr 
    :     (xor_expr) ('|'^ xor_expr)*
    ;

xor_expr 
    :     (and_expr) ('^'^ and_expr)*
    ;

and_expr 
    :     (eq_expr) ('&'^ eq_expr)*
    ;

eq_expr 
    :     (ineq_expr) ('=='^ ineq_expr | '!='^ ineq_expr)*
    ;

ineq_expr 
    :     (shift_expr) ('<'^ shift_expr | '<='^ shift_expr | '>='^ shift_expr | '>'^ shift_expr)*
    ;

shift_expr 
    :     (plus_expr) ('<<'^ plus_expr | '>>'^ plus_expr)*
    ;

plus_expr 
    :     (mul_expr) ('+'^ mul_expr | '-'^ mul_expr)*
    ;

mul_expr 
    :     (unop_expr) ('*'^ unop_expr | '/'^ unop_expr | '%'^ unop_expr)*
    ;


unop_expr 
    :     apply_expr
    |    '!'^ unop_expr
    |   '~'^ unop_expr
    |   '-'^ unop_expr
        //    |   '++'^ unop_expr
        //    |   '--'^ unop_expr
    ;

apply_expr 
    :    (atom_expr -> atom_expr) ( c=context_expr -> ^(APPLY $apply_expr $c))*
    ;

context_expr
    : ('[[' expr ']]')? atom_expr -> ^(CONTEXT expr)? atom_expr
    ;

atom_expr 
    :     (atom) ('['^ expr ']'!| '.'^ ID  )* // | '++' | '--'
    ;


atom 
    :   ID 
    |   LID
    |    '(' ')' -> ARG
    |    '(' arglist ')' -> arglist
    |    ICONST 
    |   FCONST 
    |   SCONST 
    |    'def' ID fun  -> ^(DEF ID fun)
    |    'def' allops fun  -> ^(DEF allops fun)
    |    fun 
    ;
arglist 
    :  (expr) (',' expr)* -> ^(ARG expr+)  
    ;



fun 
    :   LBRACE ('|' paramlist '|')? NL? stmt_list? RBRACE -> ^(FUN paramlist? stmt_list?)
    ;

paramlist 
    :      (ID) (',' ID)* -> ^(PARAM ID+)
    ;


LBRACE: '{' NL?;

RBRACE: '}';

LID
    :    '$' LETTER (LETTER|'0'..'9')*
    ;

ID
    :    LETTER (LETTER|'0'..'9')*
    | SYMBOL+
    ;

fragment
LETTER
    :    'A'..'Z'
    |    'a'..'z'
    |    '_'
    ;

fragment
SYMBOL
    : '-'| '&' | '*' | '+' | '%' | '<' | '>' | '=' | '~' | '!' | '|' | '^' | '@' | ':' | '?' ;

SCONST
    :      '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;


ICONST    
    :    DECIMAL_LITERAL 
    |    HEX_LITERAL 
    |    OCTAL_LITERAL 
    ;    

fragment
DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) ;

fragment
HEX_LITERAL : '0' ('x'|'X') HexDigit+  ;

fragment
OCTAL_LITERAL : '0' ('0'..'7')+ ;


fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

FCONST
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? 
    |   '.' ('0'..'9')+ Exponent? 
    |   ('0'..'9')+ Exponent 
    ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

NL: ('\r'|'\n' | ';')+;

WS  :  (' '|'\t'|'\u000C') {$channel=HIDDEN;}
    ;



LINE_COMMENT
    : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

