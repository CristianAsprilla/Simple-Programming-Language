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
		INT=10, FLOAT=11, BOOL=12, STRING=13, NUM=14, ARRAY=15, LPAREN=16, RPAREN=17, 
		LBRACE=18, RBRACE=19, SEMI=20, COMMA=21, ASSIGN=22, PLUS=23, MINUS=24, 
		MULT=25, DIV=26, LT=27, GT=28, LE=29, GE=30, EQ=31, NE=32, AND=33, OR=34, 
		NOT=35, RANGE=36, LINE_COMMENT=37, COMMENT=38, WS=39;
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
			"'print'", null, null, null, null, null, null, null, "'('", "')'", "'{'", 
			"'}'", "';'", "','", "'='", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FOR", "FUNCTION", "DO", "WHILE", "IF", "ELSE", "PRINT", 
			"ID", "INT", "FLOAT", "BOOL", "STRING", "NUM", "ARRAY", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SEMI", "COMMA", "ASSIGN", "PLUS", "MINUS", "MULT", 
			"DIV", "LT", "GT", "LE", "GE", "EQ", "NE", "AND", "OR", "NOT", "RANGE", 
			"LINE_COMMENT", "COMMENT", "WS"
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
		public TerminalNode EOF() { return getToken(PLParser.EOF, 0); }
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
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case FUNCTION:
			case DO:
			case WHILE:
			case IF:
			case PRINT:
			case ID:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
			case ARRAY:
			case LPAREN:
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
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 114556L) != 0 );
				((ProgramContext)_localctx).expr =  new Block(statements);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(EOF);
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
		public TerminalNode ARRAY() { return getToken(PLParser.ARRAY, 0); }
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
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(27);
				((ExpressionContext)_localctx).INT = match(INT);
				((ExpressionContext)_localctx).value =  new IntLiteral((((ExpressionContext)_localctx).INT!=null?((ExpressionContext)_localctx).INT.getText():null));
				}
				break;
			case 2:
				{
				setState(29);
				((ExpressionContext)_localctx).FLOAT = match(FLOAT);
				((ExpressionContext)_localctx).value =  new FloatLiteral((((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getText():null));
				}
				break;
			case 3:
				{
				setState(31);
				match(ARRAY);
				}
				break;
			case 4:
				{
				setState(32);
				((ExpressionContext)_localctx).STRING = match(STRING);
				((ExpressionContext)_localctx).value =  new StringLiteral((((ExpressionContext)_localctx).STRING!=null?((ExpressionContext)_localctx).STRING.getText():null).substring(1, (((ExpressionContext)_localctx).STRING!=null?((ExpressionContext)_localctx).STRING.getText():null).length() - 1));
				}
				break;
			case 5:
				{
				setState(34);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).value =  new Deref((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 6:
				{
				setState(36);
				((ExpressionContext)_localctx).BOOL = match(BOOL);
				((ExpressionContext)_localctx).value =  new BooleanLiteral((((ExpressionContext)_localctx).BOOL!=null?((ExpressionContext)_localctx).BOOL.getText():null));
				}
				break;
			case 7:
				{
				setState(38);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(39);
				match(ASSIGN);
				setState(40);
				((ExpressionContext)_localctx).e = expression(3);
				((ExpressionContext)_localctx).value =  new Assign((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e.value);
				}
				break;
			case 8:
				{
				setState(43);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(44);
				match(LPAREN);
				setState(45);
				match(RPAREN);
				((ExpressionContext)_localctx).value =  new FuncCall((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), new ArrayList<Expr>());
				}
				break;
			case 9:
				{
				setState(47);
				match(LPAREN);
				setState(48);
				((ExpressionContext)_localctx).e = expression(0);
				setState(49);
				match(RPAREN);
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).e.value;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(55);
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
						setState(56);
						((ExpressionContext)_localctx).e2 = expression(14);
						((ExpressionContext)_localctx).value =  new Arith((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.value, ((ExpressionContext)_localctx).e2.value);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(60);
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
						setState(61);
						((ExpressionContext)_localctx).e2 = expression(13);
						((ExpressionContext)_localctx).value =  new Arith(((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).e1.value, ((ExpressionContext)_localctx).e2.value);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(64);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(65);
						match(PLUS);
						setState(66);
						match(PLUS);
						setState(67);
						((ExpressionContext)_localctx).e2 = expression(12);
						((ExpressionContext)_localctx).value =  new Concat(((ExpressionContext)_localctx).e1.value, ((ExpressionContext)_localctx).e2.value);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(71);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(72);
						((ExpressionContext)_localctx).e2 = expression(11);
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public TerminalNode DO() { return getToken(PLParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(PLParser.WHILE, 0); }
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
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
			case ARRAY:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((StatementContext)_localctx).e = expression(0);
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).e.value;
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(PRINT);
				setState(82);
				match(LPAREN);
				setState(83);
				((StatementContext)_localctx).e = expression(0);
				setState(84);
				match(RPAREN);
				((StatementContext)_localctx).expr =  new Print(((StatementContext)_localctx).e.value);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(FOR);
				setState(88);
				match(LPAREN);
				setState(89);
				((StatementContext)_localctx).ID = match(ID);
				setState(90);
				match(T__0);
				setState(91);
				((StatementContext)_localctx).RANGE = match(RANGE);
				setState(92);
				match(RPAREN);
				setState(93);
				match(LBRACE);
				setState(94);
				((StatementContext)_localctx).block = block();
				setState(95);
				match(RBRACE);
				((StatementContext)_localctx).expr =  new For((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), (((StatementContext)_localctx).RANGE!=null?((StatementContext)_localctx).RANGE.getText():null), ((StatementContext)_localctx).block.list);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(DO);
				setState(99);
				match(LBRACE);
				setState(100);
				block();
				setState(101);
				match(RBRACE);
				setState(102);
				match(WHILE);
				setState(103);
				match(LPAREN);
				setState(104);
				((StatementContext)_localctx).e = expression(0);
				setState(105);
				match(RPAREN);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				match(WHILE);
				setState(108);
				match(LPAREN);
				setState(109);
				((StatementContext)_localctx).e = expression(0);
				setState(110);
				match(RPAREN);
				setState(111);
				match(LBRACE);
				setState(112);
				block();
				setState(113);
				match(RBRACE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(IF);
				setState(116);
				match(LPAREN);
				setState(117);
				((StatementContext)_localctx).e = expression(0);
				setState(118);
				match(RPAREN);
				setState(119);
				match(LBRACE);
				setState(120);
				block();
				setState(121);
				match(RBRACE);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(122);
					match(ELSE);
					setState(123);
					match(LBRACE);
					setState(124);
					block();
					setState(125);
					match(RBRACE);
					}
				}

				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				match(FUNCTION);
				setState(130);
				((StatementContext)_localctx).ID = match(ID);
				setState(131);
				match(LPAREN);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(132);
					((StatementContext)_localctx).formalParameters = formalParameters();
					}
				}

				setState(135);
				match(RPAREN);
				setState(136);
				match(LBRACE);
				setState(137);
				((StatementContext)_localctx).block = block();
				setState(138);
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
			setState(143);
			((FormalParametersContext)_localctx).ID = match(ID);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				((FormalParametersContext)_localctx).ID = match(ID);
				}
				}
				setState(150);
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
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				((BlockContext)_localctx).statement = statement();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(155);
					match(SEMI);
					}
				}

				statements.add(((BlockContext)_localctx).statement.expr);
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 114556L) != 0 );
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
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001J\b\u0001\n\u0001\f\u0001"+
		"M\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0080\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0086\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008e\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0093\b\u0003\n\u0003"+
		"\f\u0003\u0096\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u009d\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"\u00a1\b\u0004\u000b\u0004\f\u0004\u00a2\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0000\u0001\u0002\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001"+
		"\u0000\u0019\u001a\u0001\u0000\u0017\u0018\u0001\u0000\u001b \u00bb\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u0004\u008d"+
		"\u0001\u0000\u0000\u0000\u0006\u008f\u0001\u0000\u0000\u0000\b\u0099\u0001"+
		"\u0000\u0000\u0000\n\u0011\u0006\u0000\uffff\uffff\u0000\u000b\r\u0003"+
		"\u0004\u0002\u0000\f\u000e\u0005\u0014\u0000\u0000\r\f\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0006\u0000\uffff\uffff\u0000\u0010\u0012\u0001\u0000\u0000"+
		"\u0000\u0011\u000b\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0006\u0000\uffff"+
		"\uffff\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0019\u0005\u0000"+
		"\u0000\u0001\u0018\n\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0006\u0001\uffff"+
		"\uffff\u0000\u001b\u001c\u0005\n\u0000\u0000\u001c5\u0006\u0001\uffff"+
		"\uffff\u0000\u001d\u001e\u0005\u000b\u0000\u0000\u001e5\u0006\u0001\uffff"+
		"\uffff\u0000\u001f5\u0005\u000f\u0000\u0000 !\u0005\r\u0000\u0000!5\u0006"+
		"\u0001\uffff\uffff\u0000\"#\u0005\t\u0000\u0000#5\u0006\u0001\uffff\uffff"+
		"\u0000$%\u0005\f\u0000\u0000%5\u0006\u0001\uffff\uffff\u0000&\'\u0005"+
		"\t\u0000\u0000\'(\u0005\u0016\u0000\u0000()\u0003\u0002\u0001\u0003)*"+
		"\u0006\u0001\uffff\uffff\u0000*5\u0001\u0000\u0000\u0000+,\u0005\t\u0000"+
		"\u0000,-\u0005\u0010\u0000\u0000-.\u0005\u0011\u0000\u0000.5\u0006\u0001"+
		"\uffff\uffff\u0000/0\u0005\u0010\u0000\u000001\u0003\u0002\u0001\u0000"+
		"12\u0005\u0011\u0000\u000023\u0006\u0001\uffff\uffff\u000035\u0001\u0000"+
		"\u0000\u00004\u001a\u0001\u0000\u0000\u00004\u001d\u0001\u0000\u0000\u0000"+
		"4\u001f\u0001\u0000\u0000\u00004 \u0001\u0000\u0000\u00004\"\u0001\u0000"+
		"\u0000\u00004$\u0001\u0000\u0000\u00004&\u0001\u0000\u0000\u00004+\u0001"+
		"\u0000\u0000\u00004/\u0001\u0000\u0000\u00005K\u0001\u0000\u0000\u0000"+
		"67\n\r\u0000\u000078\u0007\u0000\u0000\u000089\u0003\u0002\u0001\u000e"+
		"9:\u0006\u0001\uffff\uffff\u0000:J\u0001\u0000\u0000\u0000;<\n\f\u0000"+
		"\u0000<=\u0007\u0001\u0000\u0000=>\u0003\u0002\u0001\r>?\u0006\u0001\uffff"+
		"\uffff\u0000?J\u0001\u0000\u0000\u0000@A\n\u000b\u0000\u0000AB\u0005\u0017"+
		"\u0000\u0000BC\u0005\u0017\u0000\u0000CD\u0003\u0002\u0001\fDE\u0006\u0001"+
		"\uffff\uffff\u0000EJ\u0001\u0000\u0000\u0000FG\n\n\u0000\u0000GH\u0007"+
		"\u0002\u0000\u0000HJ\u0003\u0002\u0001\u000bI6\u0001\u0000\u0000\u0000"+
		"I;\u0001\u0000\u0000\u0000I@\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000L\u0003\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NO\u0003\u0002\u0001\u0000OP\u0006\u0002\uffff\uffff\u0000P\u008e\u0001"+
		"\u0000\u0000\u0000QR\u0005\b\u0000\u0000RS\u0005\u0010\u0000\u0000ST\u0003"+
		"\u0002\u0001\u0000TU\u0005\u0011\u0000\u0000UV\u0006\u0002\uffff\uffff"+
		"\u0000V\u008e\u0001\u0000\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u0005"+
		"\u0010\u0000\u0000YZ\u0005\t\u0000\u0000Z[\u0005\u0001\u0000\u0000[\\"+
		"\u0005$\u0000\u0000\\]\u0005\u0011\u0000\u0000]^\u0005\u0012\u0000\u0000"+
		"^_\u0003\b\u0004\u0000_`\u0005\u0013\u0000\u0000`a\u0006\u0002\uffff\uffff"+
		"\u0000a\u008e\u0001\u0000\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0005"+
		"\u0012\u0000\u0000de\u0003\b\u0004\u0000ef\u0005\u0013\u0000\u0000fg\u0005"+
		"\u0005\u0000\u0000gh\u0005\u0010\u0000\u0000hi\u0003\u0002\u0001\u0000"+
		"ij\u0005\u0011\u0000\u0000j\u008e\u0001\u0000\u0000\u0000kl\u0005\u0005"+
		"\u0000\u0000lm\u0005\u0010\u0000\u0000mn\u0003\u0002\u0001\u0000no\u0005"+
		"\u0011\u0000\u0000op\u0005\u0012\u0000\u0000pq\u0003\b\u0004\u0000qr\u0005"+
		"\u0013\u0000\u0000r\u008e\u0001\u0000\u0000\u0000st\u0005\u0006\u0000"+
		"\u0000tu\u0005\u0010\u0000\u0000uv\u0003\u0002\u0001\u0000vw\u0005\u0011"+
		"\u0000\u0000wx\u0005\u0012\u0000\u0000xy\u0003\b\u0004\u0000y\u007f\u0005"+
		"\u0013\u0000\u0000z{\u0005\u0007\u0000\u0000{|\u0005\u0012\u0000\u0000"+
		"|}\u0003\b\u0004\u0000}~\u0005\u0013\u0000\u0000~\u0080\u0001\u0000\u0000"+
		"\u0000\u007fz\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u008e\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0003\u0000\u0000"+
		"\u0082\u0083\u0005\t\u0000\u0000\u0083\u0085\u0005\u0010\u0000\u0000\u0084"+
		"\u0086\u0003\u0006\u0003\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\u0011\u0000\u0000\u0088\u0089\u0005\u0012\u0000\u0000\u0089"+
		"\u008a\u0003\b\u0004\u0000\u008a\u008b\u0005\u0013\u0000\u0000\u008b\u008c"+
		"\u0006\u0002\uffff\uffff\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d"+
		"N\u0001\u0000\u0000\u0000\u008dQ\u0001\u0000\u0000\u0000\u008dW\u0001"+
		"\u0000\u0000\u0000\u008db\u0001\u0000\u0000\u0000\u008dk\u0001\u0000\u0000"+
		"\u0000\u008ds\u0001\u0000\u0000\u0000\u008d\u0081\u0001\u0000\u0000\u0000"+
		"\u008e\u0005\u0001\u0000\u0000\u0000\u008f\u0094\u0005\t\u0000\u0000\u0090"+
		"\u0091\u0005\u0015\u0000\u0000\u0091\u0093\u0005\t\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0006\u0003\uffff\uffff\u0000\u0098\u0007\u0001\u0000\u0000\u0000\u0099"+
		"\u00a0\u0006\u0004\uffff\uffff\u0000\u009a\u009c\u0003\u0004\u0002\u0000"+
		"\u009b\u009d\u0005\u0014\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0006\u0004\uffff\uffff\u0000\u009f\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a0\u009a\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0006\u0004\uffff"+
		"\uffff\u0000\u00a5\t\u0001\u0000\u0000\u0000\f\r\u0013\u00184IK\u007f"+
		"\u0085\u008d\u0094\u009c\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}