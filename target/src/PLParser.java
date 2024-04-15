// Generated from java-escape by ANTLR 4.11.1

import backend.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FOR=2, FUNCTION=3, DO=4, WHILE=5, IF=6, ELSE=7, PRINT=8, ID=9, 
		INT=10, FLOAT=11, BOOL=12, STRING=13, LPAREN=14, RPAREN=15, LBRACE=16, 
		RBRACE=17, SEMI=18, COMMA=19, ASSIGN=20, PLUS=21, MINUS=22, MULT=23, DIV=24, 
		LT=25, GT=26, LE=27, GE=28, EQ=29, NE=30, AND=31, OR=32, NOT=33, RANGE=34, 
		LINE_COMMENT=35, COMMENT=36, WS=37;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_statement = 2, RULE_formalParameters = 3, 
		RULE_block = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "statement", "formalParameters", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'in'", "'for'", "'function'", "'do'", "'while'", "'if'", "'else'", 
			"'print'", null, null, null, null, null, "'('", "')'", "'{'", "'}'", 
			"';'", "','", "'='", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FOR", "FUNCTION", "DO", "WHILE", "IF", "ELSE", "PRINT", 
			"ID", "INT", "FLOAT", "BOOL", "STRING", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "COMMA", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", 
			"LT", "GT", "LE", "GE", "EQ", "NE", "AND", "OR", "NOT", "RANGE", "LINE_COMMENT", 
			"COMMENT", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public PLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Expr expr;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(PLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PLParser.SEMI, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expr> statements = new ArrayList<Expr>();
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11);
				((ProgramContext)_localctx).statement = statement();
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(12);
					match(SEMI);
					}
				}

				statements.add(((ProgramContext)_localctx).statement.expr);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 32588L) != 0 );
			setState(21);
			match(EOF);
			((ProgramContext)_localctx).expr =  new Block(statements);
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expr value;
		public ExpressionContext e1;
		public Token INT;
		public Token FLOAT;
		public Token STRING;
		public Token ID;
		public Token BOOL;
		public ExpressionContext e;
		public Token op;
		public ExpressionContext e2;
		public TerminalNode INT() { return getToken(PLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PLParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(PLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(PLParser.BOOL, 0); }
		public TerminalNode ASSIGN() { return getToken(PLParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(PLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PLParser.RPAREN, 0); }
		public TerminalNode MULT() { return getToken(PLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PLParser.DIV, 0); }
		public List<TerminalNode> PLUS() { return getTokens(PLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PLParser.PLUS, i);
		}
		public TerminalNode MINUS() { return getToken(PLParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(PLParser.LT, 0); }
		public TerminalNode GT() { return getToken(PLParser.GT, 0); }
		public TerminalNode LE() { return getToken(PLParser.LE, 0); }
		public TerminalNode GE() { return getToken(PLParser.GE, 0); }
		public TerminalNode EQ() { return getToken(PLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(PLParser.NE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(25);
				((ExpressionContext)_localctx).INT = match(INT);
				((ExpressionContext)_localctx).value =  new IntLiteral((((ExpressionContext)_localctx).INT!=null?((ExpressionContext)_localctx).INT.getText():null));
				}
				break;
			case 2:
				{
				setState(27);
				((ExpressionContext)_localctx).FLOAT = match(FLOAT);
				((ExpressionContext)_localctx).value =  new FloatLiteral((((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getText():null));
				}
				break;
			case 3:
				{
				setState(29);
				((ExpressionContext)_localctx).STRING = match(STRING);
				((ExpressionContext)_localctx).value =  new StringLiteral((((ExpressionContext)_localctx).STRING!=null?((ExpressionContext)_localctx).STRING.getText():null).substring(1, (((ExpressionContext)_localctx).STRING!=null?((ExpressionContext)_localctx).STRING.getText():null).length() - 1));
				}
				break;
			case 4:
				{
				setState(31);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).value =  new Deref((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				{
				setState(33);
				((ExpressionContext)_localctx).BOOL = match(BOOL);
				((ExpressionContext)_localctx).value =  new BooleanLiteral((((ExpressionContext)_localctx).BOOL!=null?((ExpressionContext)_localctx).BOOL.getText():null));
				}
				break;
			case 6:
				{
				setState(35);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(36);
				match(ASSIGN);
				setState(37);
				((ExpressionContext)_localctx).e = expression(3);
				((ExpressionContext)_localctx).value =  new Assign((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e.value);
				}
				break;
			case 7:
				{
				setState(40);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(41);
				match(LPAREN);
				setState(42);
				match(RPAREN);
				((ExpressionContext)_localctx).value =  new FuncCall((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), new ArrayList<Expr>());
				}
				break;
			case 8:
				{
				setState(44);
				match(LPAREN);
				setState(45);
				((ExpressionContext)_localctx).e = expression(0);
				setState(46);
				match(RPAREN);
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).e.value;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(52);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(53);
						((ExpressionContext)_localctx).e2 = expression(13);
						((ExpressionContext)_localctx).value =  new Arith((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.value, ((ExpressionContext)_localctx).e2.value);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(57);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						((ExpressionContext)_localctx).e2 = expression(12);
						((ExpressionContext)_localctx).value =  new Arith(((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).e1.value, ((ExpressionContext)_localctx).e2.value);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(61);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(62);
						match(PLUS);
						setState(63);
						match(PLUS);
						setState(64);
						((ExpressionContext)_localctx).e2 = expression(11);
						((ExpressionContext)_localctx).value =  new Concat(((ExpressionContext)_localctx).e1.value, ((ExpressionContext)_localctx).e2.value);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(67);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(68);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(69);
						((ExpressionContext)_localctx).e2 = expression(10);
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext e;
		public Token ID;
		public Token RANGE;
		public BlockContext block;
		public FormalParametersContext formalParameters;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(PLParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(PLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PLParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(PLParser.FOR, 0); }
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public TerminalNode RANGE() { return getToken(PLParser.RANGE, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(PLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(PLParser.LBRACE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(PLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(PLParser.RBRACE, i);
		}
		public TerminalNode IF() { return getToken(PLParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(PLParser.ELSE, 0); }
		public TerminalNode FUNCTION() { return getToken(PLParser.FUNCTION, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((StatementContext)_localctx).e = expression(0);
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).e.value;
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(PRINT);
				setState(79);
				match(LPAREN);
				setState(80);
				((StatementContext)_localctx).e = expression(0);
				setState(81);
				match(RPAREN);
				((StatementContext)_localctx).expr =  new Print(((StatementContext)_localctx).e.value);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(FOR);
				setState(85);
				match(LPAREN);
				setState(86);
				((StatementContext)_localctx).ID = match(ID);
				setState(87);
				match(T__0);
				setState(88);
				((StatementContext)_localctx).RANGE = match(RANGE);
				setState(89);
				match(RPAREN);
				setState(90);
				match(LBRACE);
				setState(91);
				((StatementContext)_localctx).block = block();
				setState(92);
				match(RBRACE);
				((StatementContext)_localctx).expr =  new For((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), (((StatementContext)_localctx).RANGE!=null?((StatementContext)_localctx).RANGE.getText():null), ((StatementContext)_localctx).block.list);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(IF);
				setState(96);
				match(LPAREN);
				setState(97);
				((StatementContext)_localctx).e = expression(0);
				setState(98);
				match(RPAREN);
				setState(99);
				match(LBRACE);
				setState(100);
				block();
				setState(101);
				match(RBRACE);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(102);
					match(ELSE);
					setState(103);
					match(LBRACE);
					setState(104);
					block();
					setState(105);
					match(RBRACE);
					}
				}

				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(FUNCTION);
				setState(110);
				((StatementContext)_localctx).ID = match(ID);
				setState(111);
				match(LPAREN);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(112);
					((StatementContext)_localctx).formalParameters = formalParameters();
					}
				}

				setState(115);
				match(RPAREN);
				setState(116);
				match(LBRACE);
				setState(117);
				((StatementContext)_localctx).block = block();
				setState(118);
				match(RBRACE);
				((StatementContext)_localctx).expr =  new Declare((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null),((StatementContext)_localctx).formalParameters.list ,((StatementContext)_localctx).block.list);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class FormalParametersContext extends ParserRuleContext {
		public List<String> list;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(PLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLParser.COMMA, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((FormalParametersContext)_localctx).ID = match(ID);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				((FormalParametersContext)_localctx).ID = match(ID);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.list.add((((FormalParametersContext)_localctx).ID!=null?((FormalParametersContext)_localctx).ID.getText():null));
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
	public static class BlockContext extends ParserRuleContext {
		public Expr list;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PLParser.SEMI, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expr> statements = new ArrayList<Expr>();
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				((BlockContext)_localctx).statement = statement();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(135);
					match(SEMI);
					}
				}

				statements.add(((BlockContext)_localctx).statement.expr);
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 32588L) != 0 );
			((BlockContext)_localctx).list =  new Block(statements);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001G\b\u0001\n\u0001\f\u0001J\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002l\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002r\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002z\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u007f\b\u0003\n\u0003\f\u0003\u0082\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0089"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u008d\b\u0004\u000b\u0004"+
		"\f\u0004\u008e\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0001\u0002\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001\u0000\u0017\u0018\u0001\u0000"+
		"\u0015\u0016\u0001\u0000\u0019\u001e\u00a3\u0000\n\u0001\u0000\u0000\u0000"+
		"\u00021\u0001\u0000\u0000\u0000\u0004y\u0001\u0000\u0000\u0000\u0006{"+
		"\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000\n\u0011\u0006"+
		"\u0000\uffff\uffff\u0000\u000b\r\u0003\u0004\u0002\u0000\f\u000e\u0005"+
		"\u0012\u0000\u0000\r\f\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0010\u0006\u0000\uffff"+
		"\uffff\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000b\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0017\u0006\u0000"+
		"\uffff\uffff\u0000\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u0019\u0006"+
		"\u0001\uffff\uffff\u0000\u0019\u001a\u0005\n\u0000\u0000\u001a2\u0006"+
		"\u0001\uffff\uffff\u0000\u001b\u001c\u0005\u000b\u0000\u0000\u001c2\u0006"+
		"\u0001\uffff\uffff\u0000\u001d\u001e\u0005\r\u0000\u0000\u001e2\u0006"+
		"\u0001\uffff\uffff\u0000\u001f \u0005\t\u0000\u0000 2\u0006\u0001\uffff"+
		"\uffff\u0000!\"\u0005\f\u0000\u0000\"2\u0006\u0001\uffff\uffff\u0000#"+
		"$\u0005\t\u0000\u0000$%\u0005\u0014\u0000\u0000%&\u0003\u0002\u0001\u0003"+
		"&\'\u0006\u0001\uffff\uffff\u0000\'2\u0001\u0000\u0000\u0000()\u0005\t"+
		"\u0000\u0000)*\u0005\u000e\u0000\u0000*+\u0005\u000f\u0000\u0000+2\u0006"+
		"\u0001\uffff\uffff\u0000,-\u0005\u000e\u0000\u0000-.\u0003\u0002\u0001"+
		"\u0000./\u0005\u000f\u0000\u0000/0\u0006\u0001\uffff\uffff\u000002\u0001"+
		"\u0000\u0000\u00001\u0018\u0001\u0000\u0000\u00001\u001b\u0001\u0000\u0000"+
		"\u00001\u001d\u0001\u0000\u0000\u00001\u001f\u0001\u0000\u0000\u00001"+
		"!\u0001\u0000\u0000\u00001#\u0001\u0000\u0000\u00001(\u0001\u0000\u0000"+
		"\u00001,\u0001\u0000\u0000\u00002H\u0001\u0000\u0000\u000034\n\f\u0000"+
		"\u000045\u0007\u0000\u0000\u000056\u0003\u0002\u0001\r67\u0006\u0001\uffff"+
		"\uffff\u00007G\u0001\u0000\u0000\u000089\n\u000b\u0000\u00009:\u0007\u0001"+
		"\u0000\u0000:;\u0003\u0002\u0001\f;<\u0006\u0001\uffff\uffff\u0000<G\u0001"+
		"\u0000\u0000\u0000=>\n\n\u0000\u0000>?\u0005\u0015\u0000\u0000?@\u0005"+
		"\u0015\u0000\u0000@A\u0003\u0002\u0001\u000bAB\u0006\u0001\uffff\uffff"+
		"\u0000BG\u0001\u0000\u0000\u0000CD\n\t\u0000\u0000DE\u0007\u0002\u0000"+
		"\u0000EG\u0003\u0002\u0001\nF3\u0001\u0000\u0000\u0000F8\u0001\u0000\u0000"+
		"\u0000F=\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000GJ\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0003"+
		"\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0003\u0002\u0001"+
		"\u0000LM\u0006\u0002\uffff\uffff\u0000Mz\u0001\u0000\u0000\u0000NO\u0005"+
		"\b\u0000\u0000OP\u0005\u000e\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0005"+
		"\u000f\u0000\u0000RS\u0006\u0002\uffff\uffff\u0000Sz\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0002\u0000\u0000UV\u0005\u000e\u0000\u0000VW\u0005\t\u0000"+
		"\u0000WX\u0005\u0001\u0000\u0000XY\u0005\"\u0000\u0000YZ\u0005\u000f\u0000"+
		"\u0000Z[\u0005\u0010\u0000\u0000[\\\u0003\b\u0004\u0000\\]\u0005\u0011"+
		"\u0000\u0000]^\u0006\u0002\uffff\uffff\u0000^z\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0006\u0000\u0000`a\u0005\u000e\u0000\u0000ab\u0003\u0002\u0001"+
		"\u0000bc\u0005\u000f\u0000\u0000cd\u0005\u0010\u0000\u0000de\u0003\b\u0004"+
		"\u0000ek\u0005\u0011\u0000\u0000fg\u0005\u0007\u0000\u0000gh\u0005\u0010"+
		"\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005\u0011\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000kf\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lz\u0001"+
		"\u0000\u0000\u0000mn\u0005\u0003\u0000\u0000no\u0005\t\u0000\u0000oq\u0005"+
		"\u000e\u0000\u0000pr\u0003\u0006\u0003\u0000qp\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u000f\u0000"+
		"\u0000tu\u0005\u0010\u0000\u0000uv\u0003\b\u0004\u0000vw\u0005\u0011\u0000"+
		"\u0000wx\u0006\u0002\uffff\uffff\u0000xz\u0001\u0000\u0000\u0000yK\u0001"+
		"\u0000\u0000\u0000yN\u0001\u0000\u0000\u0000yT\u0001\u0000\u0000\u0000"+
		"y_\u0001\u0000\u0000\u0000ym\u0001\u0000\u0000\u0000z\u0005\u0001\u0000"+
		"\u0000\u0000{\u0080\u0005\t\u0000\u0000|}\u0005\u0013\u0000\u0000}\u007f"+
		"\u0005\t\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0006\u0003\uffff\uffff\u0000\u0084\u0007\u0001\u0000"+
		"\u0000\u0000\u0085\u008c\u0006\u0004\uffff\uffff\u0000\u0086\u0088\u0003"+
		"\u0004\u0002\u0000\u0087\u0089\u0005\u0012\u0000\u0000\u0088\u0087\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0006\u0004\uffff\uffff\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0006\u0004\uffff\uffff\u0000\u0091\t\u0001\u0000\u0000\u0000\u000b\r"+
		"\u00131FHkqy\u0080\u0088\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}