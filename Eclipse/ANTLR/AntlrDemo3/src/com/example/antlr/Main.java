package com.example.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
	public static void main(String[] args) {
		
		String input = "10+2*3";
		
//		Input Stream
		CharStream cs = CharStreams.fromString(input);
		System.out.println(cs);
//		Lexer
			CalcLexer lexer = new CalcLexer(cs);
		
//		Tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
//		Parser
		CalcParser parser = new CalcParser(tokens);
		
//		Parser tree
		ParseTree tree = parser.prog();
		System.out.println(tree);
		
		System.out.println("Parse Tree: ");
		System.out.println(tree.toStringTree(parser));
		System.out.println(tree); 
		
		
//		Listener 
		System.out.println("--Listener Output--");
		ParseTreeWalker walker = new ParseTreeWalker();
		MyListener listener = new MyListener();
		walker.walk( listener, tree);
		
		
//		visitor
		System.out.println("--Visitor Output--");
		MyVisitor visitor = new MyVisitor();	// 1
		int result = visitor.visit(tree);		// 2
		System.out.println("Result= " + result );
		
		
	}
}
