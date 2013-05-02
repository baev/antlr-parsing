grammar PrefixExpressions;
parse: command parse
    | end;

command: write
    | read
    | assignment
    | branch;

write: 'print' expr;

read: 'scan' name;

branch: 'if' logicExpr operand operand;

operand: command | '(' command+ ')';

mathExpr: mathOperator mathExpr mathExpr
    | INT
    | ID;

mathOperator: '+'
    | '-'
    | '*'
    | '/';

logicExpr: logicOperator logicExpr logicExpr
    | TRUE
    | FALSE
    | compareOperator mathExpr mathExpr
    | NOT logicExpr
    | ID;

compareOperator: '>'
    | '<'
    | '='
    | '>='
    | '<='
    | '<>';

logicOperator: 'AND'
    | 'OR'
    | 'XOR';

assignment: ':=' name expr;

expr: (mathExpr | logicExpr);

name: ID;

end: EOF;

NOT: 'NOT';

TRUE: 'TRUE' | 'True' | 'true';

FALSE: 'FALSE' | 'False' | 'false';

ID: CHAR (CHAR | DIGIT)*;

INT: DIGIT+;

CHAR: [a-zA-Z];

CHAR_LOWER_CASE: [a-z];

DIGIT: '0'..'9';

WS: [ \r\t\n]+ -> skip;

