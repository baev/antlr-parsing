grammar PrefixExpressions;
parse: command parse
    | EOF;

command: write
    | read
    | assignment
    | branch;

write: 'print' (expr | ID);

read: 'scan' ID;

branch: 'if' logic_expr operand operand;

operand: command | '(' command+ ')';

math_expr: math_operator math_expr math_expr
    | INT
    | ID;

math_operator: '+'
    | '-'
    | '*'
    | '/';

logic_expr: logic_operator logic_expr logic_expr
    | ('true' | 'false')
    | compare_operator math_expr math_expr
    | 'not' logic_expr
    | ID;

compare_operator: '>'
    | '<'
    | '='
    | '>='
    | '<=';

logic_operator: 'and'
    | 'or'
    | 'xor';

assignment: ID '=' expr;

expr: (math_expr | logic_expr);

ID: CHAR (CHAR | DIGIT)*;

INT: DIGIT+;

CHAR: [a-zA-Z];

DIGIT: '0'..'9';

WS: [ \r\t\n]+ -> skip;

