// Generated from Gql.g4 by ANTLR 4.13.2
package com.example.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GqlParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(GqlParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#createNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateNode(GqlParser.CreateNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#createEdge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEdge(GqlParser.CreateEdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#showNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowNodes(GqlParser.ShowNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#showEdges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEdges(GqlParser.ShowEdgesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#cleanGraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCleanGraph(GqlParser.CleanGraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(GqlParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(GqlParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(GqlParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GqlParser.ValueContext ctx);
}