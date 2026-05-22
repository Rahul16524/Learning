grammar SQL;

query: SELECT .*? EOF;

SELECT: 'SELECT';
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;


