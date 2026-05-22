grammar Gql;


command
	: statement EOF
	;

statement 
	: createNode
	| createEdge
	| showNodes
	| showEdges
	| cleanGraph
	| test
	;
	
createNode
	: CREATE NODE identifier properties?
	;

createEdge
	: CREATE EDGE identifier FROM identifier TO identifier
	;
	
showNodes
	: SHOW NODES ONLY?
	;
	
showEdges
	: SHOW EDGES
	;
	
cleanGraph
	: CLEAN GRAPH
	;
	
test
	: TEST IDENTIFIER (COMMA IDENTIFIER)* 
	;
	
	
properties
	: LLBRACE property (COMMA property)* RLBRACE
	;
	
property
	: identifier EQUAL value
	;
	
	
identifier
	: IDENTIFIER
	;

value
	: IDENTIFIER
	| NUMBER
	;
	
	
// lexer rules

CREATE : 'CREATE';
NODE : 'NODE';
EDGE : 'EDGE';
FROM : 'FROM';
TO : 'TO';
SHOW : 'SHOW';
NODES : 'NODES';
EDGES : 'EDGES';
CLEAN : 'CLEAN';
GRAPH : 'GRAPH';
ONLY : 'ONLY';
TEST : 'TEST';

RLBRACE : ')';
LLBRACE : '(';
LBRACE : '{';
RBRACE : '}';
COMMA : ',';
EQUAL : '=';

NUMBER : [0-9]+;


IDENTIFIER
	: [a-zA-Z_][a-zA-Z0-9_]*
	;
	
WS
	: [ \t\r\n]+ -> skip;

































