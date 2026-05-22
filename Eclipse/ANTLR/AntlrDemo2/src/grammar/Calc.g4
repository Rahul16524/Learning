grammar Calc;
// parser rules
// prog means starting point, EOF means ending point end of input, when user has stop entering the input
prog   : expr EOF ;

expr   : term (('+'|'-') term)* ;

term   : factor (('*'|'/') factor)* ;

factor : INT
       | '(' expr ')'
       ;

// lexer rules
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;

 // tab, enter