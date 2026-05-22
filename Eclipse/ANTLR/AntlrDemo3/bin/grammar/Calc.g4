grammar Calc;

// Parser rules
prog : expr EOF;

// causes ambiguity
// expr : expr op=('*'|'/') expr
//		| expr op=('+'|'-') expr
//		| INT
//		| '(' expr ')'
//		;

expr : term (('+'|'-') term )* ;
term : factor (('*'|'/') factor)*;
factor: INT
	| '(' expr ')'
	;

		
// lexer rules
INT : [0-9]+;

WS : [ \t\r\n]+ -> skip;