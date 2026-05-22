// Generated from Chat.g4 by ANTLR 4.13.2
package com.chat;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChatVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChatParser#chat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChat(ChatParser.ChatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ChatParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ChatParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ChatParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(ChatParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#emoticon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmoticon(ChatParser.EmoticonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(ChatParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(ChatParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#mention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMention(ChatParser.MentionContext ctx);
}