grammar PrefixExpressions;
parse: command parse
    | end;

command: write
    | read
    | assignment
    | branch;

write: 'print' (expr | name);

read: 'scan' name;

branch: 'if' logic_expr operand operand;

operand: command | '(' command+ ')';

math_expr: math_operator math_expr math_expr
    | INT
    | name;

math_operator: '+'
    | '-'
    | '*'
    | '/';

logic_expr: logic_operator logic_expr logic_expr
    | ('true' | 'false')
    | compare_operator math_expr math_expr
    | 'not' logic_expr
    | name;

compare_operator: '>'
    | '<'
    | '='
    | '>='
    | '<=';

logic_operator: 'and'
    | 'or'
    | 'xor';

assignment: name '=' expr;

expr: (math_expr | logic_expr);

name: ID;

end: EOF;

ID: CHAR (CHAR | DIGIT)*;

INT: DIGIT+;

CHAR: [a-zA-Z];

DIGIT: '0'..'9';

WS: [ \r\t\n]+ -> skip;

