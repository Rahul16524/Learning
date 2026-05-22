grammar Expr;

// Parser rules
prog: expr EOF;

expr: expr '*' expr
	| expr '+' expr
	| INT
	;
	
	
// lexer rules
INT : [0-9]+;
WS : [\t\r\n]+ -> skip;