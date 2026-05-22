// Generated from Gql.g4 by ANTLR 4.13.2
package com.example.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, NODE=2, EDGE=3, FROM=4, TO=5, SHOW=6, NODES=7, EDGES=8, CLEAN=9, 
		GRAPH=10, ONLY=11, TEST=12, RLBRACE=13, LLBRACE=14, LBRACE=15, RBRACE=16, 
		COMMA=17, EQUAL=18, NUMBER=19, IDENTIFIER=20, WS=21;
	public static final int
		RULE_command = 0, RULE_statement = 1, RULE_createNode = 2, RULE_createEdge = 3, 
		RULE_showNodes = 4, RULE_showEdges = 5, RULE_cleanGraph = 6, RULE_test = 7, 
		RULE_properties = 8, RULE_property = 9, RULE_identifier = 10, RULE_value = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "statement", "createNode", "createEdge", "showNodes", "showEdges", 
			"cleanGraph", "test", "properties", "property", "identifier", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'NODE'", "'EDGE'", "'FROM'", "'TO'", "'SHOW'", "'NODES'", 
			"'EDGES'", "'CLEAN'", "'GRAPH'", "'ONLY'", "'TEST'", "')'", "'('", "'{'", 
			"'}'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "NODE", "EDGE", "FROM", "TO", "SHOW", "NODES", "EDGES", 
			"CLEAN", "GRAPH", "ONLY", "TEST", "RLBRACE", "LLBRACE", "LBRACE", "RBRACE", 
			"COMMA", "EQUAL", "NUMBER", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GqlParser.EOF, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			statement();
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CreateNodeContext createNode() {
			return getRuleContext(CreateNodeContext.class,0);
		}
		public CreateEdgeContext createEdge() {
			return getRuleContext(CreateEdgeContext.class,0);
		}
		public ShowNodesContext showNodes() {
			return getRuleContext(ShowNodesContext.class,0);
		}
		public ShowEdgesContext showEdges() {
			return getRuleContext(ShowEdgesContext.class,0);
		}
		public CleanGraphContext cleanGraph() {
			return getRuleContext(CleanGraphContext.class,0);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				createNode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				createEdge();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				showNodes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				showEdges();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				cleanGraph();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(32);
				test();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateNodeContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(GqlParser.CREATE, 0); }
		public TerminalNode NODE() { return getToken(GqlParser.NODE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterCreateNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitCreateNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitCreateNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateNodeContext createNode() throws RecognitionException {
		CreateNodeContext _localctx = new CreateNodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(CREATE);
			setState(36);
			match(NODE);
			setState(37);
			identifier();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LLBRACE) {
				{
				setState(38);
				properties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateEdgeContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(GqlParser.CREATE, 0); }
		public TerminalNode EDGE() { return getToken(GqlParser.EDGE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode FROM() { return getToken(GqlParser.FROM, 0); }
		public TerminalNode TO() { return getToken(GqlParser.TO, 0); }
		public CreateEdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createEdge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterCreateEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitCreateEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitCreateEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateEdgeContext createEdge() throws RecognitionException {
		CreateEdgeContext _localctx = new CreateEdgeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createEdge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(CREATE);
			setState(42);
			match(EDGE);
			setState(43);
			identifier();
			setState(44);
			match(FROM);
			setState(45);
			identifier();
			setState(46);
			match(TO);
			setState(47);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShowNodesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GqlParser.SHOW, 0); }
		public TerminalNode NODES() { return getToken(GqlParser.NODES, 0); }
		public TerminalNode ONLY() { return getToken(GqlParser.ONLY, 0); }
		public ShowNodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showNodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterShowNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitShowNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitShowNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowNodesContext showNodes() throws RecognitionException {
		ShowNodesContext _localctx = new ShowNodesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_showNodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(SHOW);
			setState(50);
			match(NODES);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(51);
				match(ONLY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShowEdgesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GqlParser.SHOW, 0); }
		public TerminalNode EDGES() { return getToken(GqlParser.EDGES, 0); }
		public ShowEdgesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showEdges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterShowEdges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitShowEdges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitShowEdges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowEdgesContext showEdges() throws RecognitionException {
		ShowEdgesContext _localctx = new ShowEdgesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_showEdges);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(SHOW);
			setState(55);
			match(EDGES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CleanGraphContext extends ParserRuleContext {
		public TerminalNode CLEAN() { return getToken(GqlParser.CLEAN, 0); }
		public TerminalNode GRAPH() { return getToken(GqlParser.GRAPH, 0); }
		public CleanGraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cleanGraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterCleanGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitCleanGraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitCleanGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CleanGraphContext cleanGraph() throws RecognitionException {
		CleanGraphContext _localctx = new CleanGraphContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cleanGraph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(CLEAN);
			setState(58);
			match(GRAPH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TestContext extends ParserRuleContext {
		public TerminalNode TEST() { return getToken(GqlParser.TEST, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GqlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GqlParser.COMMA, i);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(TEST);
			setState(61);
			match(IDENTIFIER);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62);
				match(COMMA);
				setState(63);
				match(IDENTIFIER);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertiesContext extends ParserRuleContext {
		public TerminalNode LLBRACE() { return getToken(GqlParser.LLBRACE, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode RLBRACE() { return getToken(GqlParser.RLBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GqlParser.COMMA, i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LLBRACE);
			setState(70);
			property();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(71);
				match(COMMA);
				setState(72);
				property();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(RLBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GqlParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			identifier();
			setState(81);
			match(EQUAL);
			setState(82);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GqlParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GqlParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(GqlParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GqlListener ) ((GqlListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GqlVisitor ) return ((GqlVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015Y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00045\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007A\b\u0007\n\u0007"+
		"\f\u0007D\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bJ\b\b\n\b\f\b"+
		"M\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000\u0013\u0014"+
		"U\u0000\u0018\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004"+
		"#\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b1\u0001\u0000"+
		"\u0000\u0000\n6\u0001\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000e"+
		"<\u0001\u0000\u0000\u0000\u0010E\u0001\u0000\u0000\u0000\u0012P\u0001"+
		"\u0000\u0000\u0000\u0014T\u0001\u0000\u0000\u0000\u0016V\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005\u0000\u0000"+
		"\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\"\u0003\u0004\u0002\u0000"+
		"\u001c\"\u0003\u0006\u0003\u0000\u001d\"\u0003\b\u0004\u0000\u001e\"\u0003"+
		"\n\u0005\u0000\u001f\"\u0003\f\u0006\u0000 \"\u0003\u000e\u0007\u0000"+
		"!\u001b\u0001\u0000\u0000\u0000!\u001c\u0001\u0000\u0000\u0000!\u001d"+
		"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000"+
		"#$\u0005\u0001\u0000\u0000$%\u0005\u0002\u0000\u0000%\'\u0003\u0014\n"+
		"\u0000&(\u0003\u0010\b\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0001\u0000\u0000"+
		"*+\u0005\u0003\u0000\u0000+,\u0003\u0014\n\u0000,-\u0005\u0004\u0000\u0000"+
		"-.\u0003\u0014\n\u0000./\u0005\u0005\u0000\u0000/0\u0003\u0014\n\u0000"+
		"0\u0007\u0001\u0000\u0000\u000012\u0005\u0006\u0000\u000024\u0005\u0007"+
		"\u0000\u000035\u0005\u000b\u0000\u000043\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u00005\t\u0001\u0000\u0000\u000067\u0005\u0006\u0000\u0000"+
		"78\u0005\b\u0000\u00008\u000b\u0001\u0000\u0000\u00009:\u0005\t\u0000"+
		"\u0000:;\u0005\n\u0000\u0000;\r\u0001\u0000\u0000\u0000<=\u0005\f\u0000"+
		"\u0000=B\u0005\u0014\u0000\u0000>?\u0005\u0011\u0000\u0000?A\u0005\u0014"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u000f\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u000e\u0000\u0000FK\u0003\u0012"+
		"\t\u0000GH\u0005\u0011\u0000\u0000HJ\u0003\u0012\t\u0000IG\u0001\u0000"+
		"\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NO\u0005\r\u0000\u0000O\u0011\u0001\u0000\u0000\u0000PQ\u0003\u0014\n"+
		"\u0000QR\u0005\u0012\u0000\u0000RS\u0003\u0016\u000b\u0000S\u0013\u0001"+
		"\u0000\u0000\u0000TU\u0005\u0014\u0000\u0000U\u0015\u0001\u0000\u0000"+
		"\u0000VW\u0007\u0000\u0000\u0000W\u0017\u0001\u0000\u0000\u0000\u0005"+
		"!\'4BK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}