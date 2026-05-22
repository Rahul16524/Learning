package com.example.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String input = "5+3*2";

        // Step 1: Convert input to CharStream
        //   provide index and cursor, methods to access each character
        CharStream cs = CharStreams.fromString(input);

        // Step 2: Lexer: converts character to tokens (generic term)(lexer rules)
        //		INT + INT + INT
        ExprLexer lexer = new ExprLexer(cs);

	        // Step 3: Token Stream
	        CommonTokenStream tokens = new CommonTokenStream(lexer);	// convert into one by one token, tokens store it

        // Step 4: Parser
        ExprParser parser = new ExprParser(tokens);

        // Step 5: Start rule (prog), in the grammar for parser rules
        ParseTree tree = parser.prog();// supplying the rules

        // Step 6: Print Parse Tree
        System.out.println(tree.toStringTree(parser));
    }
}