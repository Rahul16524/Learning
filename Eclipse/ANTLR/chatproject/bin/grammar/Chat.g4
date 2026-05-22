grammar Chat;

chat:
	line+ EOF;

line: name command message NEWLINE;

name: WORD WHITESPACE;

command: (SAYS | SHOUTS) ':' WHITESPACE;

message : (emoticon | color | WORD | WHITESPACE | MENTION)+ ;
color   : '/' WORD '/' message '/' ;
	
emoticon : ':' '-'? ')'
		| ':' '-'? '('
		;

/* Lexer */
fragment S: [sS];
fragment A: [aA];
fragment Y: [yY];

fragment H: [hH];
fragment O: [oO];
fragment U: [uU];
fragment T: [tT];

SAYS: S A Y S;
SHOUTS: S H O U T S;

WORD: [a-zA-Z]+;
MENTION: '@' [a-zA-Z]+;
WHITESPACE: [ \t]+;
NEWLINE: ('\r'? '\n' | '\r')+;