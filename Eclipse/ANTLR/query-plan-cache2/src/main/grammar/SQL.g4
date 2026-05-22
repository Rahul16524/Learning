grammar SQL;

//query: SELECT .*? EOF;

//SELECT: 'SELECT';
//NUMBER: [0-9]+;
//WS: [ \t\r\n]+ -> skip;


query 
	: SELECT STAR FROM tableName (WHERE condition)? EOF
	;
	
condition
	: columnName '=' value
	;
	
value
	: STRING
	| DECIMAL
	| NUMBER
	| BOOLEAN
	| NULL
	;
	
tableName 
	: IDENTIFIER
	;
	
columnName
	: IDENTIFIER
	;

// TOKENS

SELECT : 'SELECT';
FROM : 'FROM';
WHERE: 'WHERE';
STAR: '*';

// Values
STRING : '\''(~['\\] | '\\'.)*'\'';
DECIMAL: '-'?[0-9]+ '.' [0-9]+;
NUMBER: '-'?[0-9]+;
BOOLEAN: 'true' | 'false';
NULL: 'null';

// identifiers 
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

// Ignore spaces
WS : [ \t\r\n]+ -> skip;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	