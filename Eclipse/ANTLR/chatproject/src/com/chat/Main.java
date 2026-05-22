package com.chat;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
	public static void main(String[] args) {
		
		String input ="john SHOUTS: hello @michael /red/hi/ there :-) \n";
		
		CharStream cs = CharStreams.fromString(input);
		
		ChatLexer lexer = new ChatLexer(cs);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		ChatParser parser = new ChatParser(tokens);
		
		ParseTree tree = parser.chat();
		
		ChatHtmlListener listener = new ChatHtmlListener();
		
		ParseTreeWalker.DEFAULT.walk(listener, tree);
		
		System.out.println(listener.getHtml());
	}
}
