// Generated from Gql.g4 by ANTLR 4.13.2
package com.example.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GqlParser}.
 */
public interface GqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GqlParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(GqlParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(GqlParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#createNode}.
	 * @param ctx the parse tree
	 */
	void enterCreateNode(GqlParser.CreateNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#createNode}.
	 * @param ctx the parse tree
	 */
	void exitCreateNode(GqlParser.CreateNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#createEdge}.
	 * @param ctx the parse tree
	 */
	void enterCreateEdge(GqlParser.CreateEdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#createEdge}.
	 * @param ctx the parse tree
	 */
	void exitCreateEdge(GqlParser.CreateEdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#showNodes}.
	 * @param ctx the parse tree
	 */
	void enterShowNodes(GqlParser.ShowNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#showNodes}.
	 * @param ctx the parse tree
	 */
	void exitShowNodes(GqlParser.ShowNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#showEdges}.
	 * @param ctx the parse tree
	 */
	void enterShowEdges(GqlParser.ShowEdgesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#showEdges}.
	 * @param ctx the parse tree
	 */
	void exitShowEdges(GqlParser.ShowEdgesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#cleanGraph}.
	 * @param ctx the parse tree
	 */
	void enterCleanGraph(GqlParser.CleanGraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#cleanGraph}.
	 * @param ctx the parse tree
	 */
	void exitCleanGraph(GqlParser.CleanGraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(GqlParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(GqlParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(GqlParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(GqlParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(GqlParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(GqlParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GqlParser.ValueContext ctx);
}