grammar PL;

@header {
import backend.*;
}

@members {
}

program returns [Expr expr]
    : {List<Expr> statements = new ArrayList<Expr>();}
        (statement {statements.add($statement.expr);})+ EOF
        {$expr = new Block(statements);}
    ;

expression returns [Expr value]
    :   '(' e=expression ')' {$value = $e.value;}
    |   e1=expression '+' e2=expression {$value = new Arith(Operator.ADD, $e1.value, $e2.value);}
    |   e1=expression '-' e2=expression {$value = new Arith(Operator.SUB, $e1.value, $e2.value);}
    |   e1=expression '*' e2=expression 
        {
            System.out.println("Left operand type: " + $e1.value.getClass().getSimpleName());
            System.out.println("Right operand type: " + $e2.value.getClass().getSimpleName());
            if ($e1.value instanceof StringLiteral && $e2.value instanceof IntLiteral) {
                $value = new Repeat($e1.value, $e2.value);
            } else {
                // If not string repetition, perform numeric multiplication
                $value = new Arith(Operator.MUL, $e1.value, $e2.value);
            }
        }

    |   e1=expression '/' e2=expression {$value = new Arith(Operator.DIV, $e1.value, $e2.value);}
    |   e1=expression '++' e2=expression {$value = new Concat($e1.value, $e2.value);}
    |   ID {$value = new Deref($ID.text);}
    |   NUM {$value = new IntLiteral($NUM.text);}
    |   STRING {$value = new StringLiteral($STRING.text.substring(1, $STRING.text.length() - 1));}
    |   BOOL {$value = new BooleanLiteral($BOOL.text);}
    ;


assignment returns [Expr var]
    :   'let'? ID '=' e=expression {$var = new Assign($ID.text, $e.value);}
    ;

statement returns [Expr expr]
    :   a=assignment ';'?{$expr = $a.var;}
    |   'print(' e=expression ');' {$expr = new Print($e.value);}
    |   e=expression {$expr = $e.value;}
    ;

ID : [a-zA-Z]+;
NUM : [0-9]+;
STRING : '"' ~'"'* '"';
BOOL : 'true' | 'false';
LPAREN           : '(';
RPAREN           : ')';

WHITESPACE: [ \t\r\n] -> skip;
