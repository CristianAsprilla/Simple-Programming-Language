grammar PL;

@header {
import backend.*;
}

@members {
}

program returns [Expr expr]
    : {List<Expr> statements = new ArrayList<Expr>();}
        (statement ';'? {statements.add($statement.expr);})+ EOF
        {$expr = new Block(statements);}

    ;


expression returns [Expr value]
    :   e1=expression op=('*'|'/') e2=expression {$value = new Arith($op.text, $e1.value, $e2.value);}
    |   e1=expression op=('+'|'-') e2=expression {$value = new Arith($op.getText(), $e1.value, $e2.value);}
    |   e1=expression '++' e2=expression {$value = new Concat($e1.value, $e2.value);}
    |   INT {$value = new IntLiteral($INT.text);}
    |   FLOAT {$value = new FloatLiteral($FLOAT.text);}
    |   STRING {$value = new StringLiteral($STRING.text.substring(1, $STRING.text.length() - 1));}
    |   ID {$value = new Deref($ID.text);}
    |   '(' e=expression ')' {$value = $e.value;}
    ;

statement returns [Expr expr]
    :   a=varDecl {$expr = $a.var;}
    |   e=expression {$expr = $e.value;}
    |   'print(' e=expression ')' {$expr = new Print($e.value);}
    |   FOR '(' ID 'in' RANGE ')' '{' block '}' {$expr = new For($ID.text, $RANGE.text, $block.list);}
    |   'function' ID '(' formalParameters? ')' '{' block '}' {$expr = new Declare($ID.text,$formalParameters.list ,$block.list);}
    ;




type: 'float' | 'int' | 'str' ;


varDecl returns [Expr var]
    : ID ('=' e=expression) {$var = new Assign($ID.text, $e.value);}
    ;

formalParameters returns [List<String> list] // return a list of all the parameters of the function using the values returned by the formalParameter rule
    : formalParameter (',' formalParameter)* {$list.add($formalParameter.text);}
    ;
formalParameter
    : ID ;
//
//// block to handle function, if, else, for,etc body.

block returns [Expr list]
//    :(statement ';'? { $list.add($statement.expr); })*
    : {List<Expr> statements = new ArrayList<Expr>();}
        (statement ';'? {statements.add($statement.expr);})+
        {$list = new Block(statements);}
    ;

//stat
//    : block
//    | varDecl
//    | 'if' expression 'then' stat ('else' stat)?
//    | 'return' expression? ';'
//    | expression '=' expression ';'
//    | expression ';'
//    ;

FOR : 'for';

//retr : 'RETR' INT '\n' ;
//vector : '[' INT+ ']' ;


//Tokens definition
    // Data types and identifiers
ID : [a-zA-Z]+;
INT : '-'? DIGIT+;
FLOAT : '-'? DIGIT+ '.' DIGIT*
    | '-'? '.' DIGIT+;
BOOL : 'true' | 'false';
//STRING : '"' .*? '"';
STRING : '"' ( ESC | . )*? '"' ;

    // Operators
LPAREN           : '(';
RPAREN           : ')';
RANGE            : (INT '..' INT);
    // Comments and whitespace
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ;
COMMENT: '/*' .*? '*/' -> skip ;
WS : [ \t\n\r]+ -> skip ;


// Fragment rules
fragment DIGIT: [0-9];
fragment ESC : '\\' [btnr"\\] ;
