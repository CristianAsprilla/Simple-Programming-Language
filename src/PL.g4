grammar PL;

@header {
import backend.*;
}

@members {
}

program returns [Expr expr]
    : {List<Expr> statements = new ArrayList<Expr>();}
        (statement SEMI? {statements.add($statement.expr);})+ EOF
        {$expr = new Block(statements);}
    ;

expression returns [Expr value]
    :   e1=expression op=(MULT|DIV) e2=expression {$value = new Arith($op.text, $e1.value, $e2.value);}
    |   e1=expression op=(PLUS|MINUS) e2=expression {$value = new Arith($op.getText(), $e1.value, $e2.value);}
    |   e1=expression PLUS PLUS e2=expression {$value = new Concat($e1.value, $e2.value);}
    |   e1=expression op=(LT|GT|LE|GE|EQ|NE) e2=expression
    |   INT {$value = new IntLiteral($INT.text);}
    |   FLOAT {$value = new FloatLiteral($FLOAT.text);}
    |   ARRAY
    |   STRING {$value = new StringLiteral($STRING.text.substring(1, $STRING.text.length() - 1));}
    |   ID {$value = new Deref($ID.text);}
    |   BOOL {$value = new BooleanLiteral($BOOL.text);}
    |   ID ASSIGN e=expression {$value = new Assign($ID.text, $e.value);}
    |   ID LPAREN RPAREN {$value = new FuncCall($ID.text, new ArrayList<Expr>());}
    |   LPAREN e=expression RPAREN {$value = $e.value;}
    ;

statement returns [Expr expr]
    :   e=expression {$expr = $e.value;}
    |   PRINT LPAREN e=expression RPAREN {$expr = new Print($e.value);}
    |   FOR LPAREN ID 'in' RANGE RPAREN LBRACE block RBRACE {$expr = new For($ID.text, $RANGE.text, $block.list);}
    |   DO LBRACE block RBRACE WHILE LPAREN e=expression RPAREN
    |   WHILE LPAREN e=expression RPAREN LBRACE block RBRACE
    |   IF LPAREN e=expression  RPAREN LBRACE block RBRACE (ELSE LBRACE block RBRACE)?
    |   FUNCTION ID LPAREN formalParameters? RPAREN LBRACE block RBRACE {$expr = new Declare($ID.text,$formalParameters.list ,$block.list);}
    ;

formalParameters returns [List<String> list]
    : ID (COMMA ID)* {$list.add($ID.text);}
    ;

//// block to handle function, if, else, for,etc body.

block returns [Expr list]
    : {List<Expr> statements = new ArrayList<Expr>();}
        (statement SEMI? {statements.add($statement.expr);})+
        {$list = new Block(statements);}

    ;
FOR : 'for';
FUNCTION : 'function';
DO : 'do';
WHILE : 'while';
IF : 'if';
ELSE : 'else';
PRINT : 'print';

//Tokens definition
    // Data types and identifiers
ID : [a-zA-Z]+;
INT : '-'? DIGIT+;
FLOAT : '-'? DIGIT+ '.' DIGIT*
    | '-'? '.' DIGIT+;
BOOL : 'true' | 'false';
STRING : '"' ( ESC | . )*? '"' ;
// Array
NUM : (INT | FLOAT);
ARRAY : '[' (NUM (COMMA NUM)*)? ']';

    // Operators
LPAREN           : '(';
RPAREN           : ')';
LBRACE           : '{';
RBRACE           : '}';
SEMI             : ';';
COMMA            : ',';
ASSIGN           : '=';
PLUS             : '+';
MINUS            : '-';
MULT             : '*';
DIV              : '/';
LT               : '<';
GT               : '>';
LE               : '<=';
GE               : '>=';
EQ               : '==';
NE               : '!=';
AND              : '&&';
OR               : '||';
NOT              : '!';
RANGE            : (INT '..' INT);
    // Comments and whitespace
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ;
COMMENT: '/*' .*? '*/' -> skip ;
WS : [ \t\n\r]+ -> skip ;


// Fragment rules
fragment DIGIT: [0-9];
fragment ESC : '\\' [btnr"\\] ;
