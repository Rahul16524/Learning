package com.example.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
	public static void main(String[] args) {
		String input = "CREATE NODE user (name=vijay, age=25)";
		String input2 = "CREATE EDGE follows FROM user TO page";
		String input3 = "SHOWS NODES";
		String input4 = "TEST a,b,c,d";
		
		CharStream cs = CharStreams.fromString(input4);
		
		GqlLexer lexer = new GqlLexer(cs);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		GqlParser parser = new GqlParser(tokens);
		
		ParseTree tree = parser.command();
		
		System.out.println("Parse Tree is");
		System.out.println(tree.toStringTree(parser));
	}
}
