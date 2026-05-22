package com.example.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
	public static void main(String[] args) {
		String input = "10+2*3";
		
//		it will each character a unique index so that traverse and travel by the lexer
		CharStream cs = CharStreams.fromString(input);
		System.out.println(cs);
		
//		1 and 10 will be indentified by the parser rules, Integer it is [0-9]+, and it will classified entities into tokens, help from Calc.g4 grammar
			CalcLexer lexer = new CalcLexer(cs);
			System.out.println(lexer);
		
//		create tokens, 
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		System.out.println(tokens);
		
//		parser will take tokens as inputs, already grammar is processed in the compile so again not required to pass
		CalcParser parser = new CalcParser(tokens);
		System.out.println(parser);
		
//		Build parse tree,
//		prog is our start rule
		ParseTree tree = parser.prog();
		System.out.println(tree);
		
		//Print tree, converts tree into readable string format, useful for debugging
		System.out.println("Parse Tree: " + tree.toStringTree(parser));
		
		// Evaluate, walks the parse tree, executes logic we defined, belongs to semantic phase
		EvalVisitor visitor = new EvalVisitor();
		int result = visitor.visit(tree);
		
		System.out.println("Result = " + result);
	}
}
