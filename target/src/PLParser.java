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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, FOR=17, 
		ID=18, INT=19, FLOAT=20, BOOL=21, STRING=22, LPAREN=23, RPAREN=24, RANGE=25, 
		LINE_COMMENT=26, COMMENT=27, WS=28;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_statement = 2, RULE_exprList = 3, 
		RULE_funCall = 4, RULE_type = 5, RULE_varDecl = 6, RULE_formalParameters = 7, 
		RULE_formalParameter = 8, RULE_block = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "statement", "exprList", "funCall", "type", 
			"varDecl", "formalParameters", "formalParameter", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'*'", "'/'", "'+'", "'-'", "'++'", "'print('", "'in'", 
			"'{'", "'}'", "'function'", "','", "'float'", "'int'", "'str'", "'='", 
			"'for'", null, null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "FOR", "ID", "INT", "FLOAT", "BOOL", "STRING", 
			"LPAREN", "RPAREN", "RANGE", "LINE_COMMENT", "COMMENT", "WS"
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				((ProgramContext)_localctx).statement = statement();
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(22);
					match(T__0);
					}
				}

				statements.add(((ProgramContext)_localctx).statement.expr);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 14551168L) != 0 );
			setState(31);
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
		public ExpressionContext e;
		public ExprListContext exprList;
		public Token op;
		public ExpressionContext e2;
		public TerminalNode INT() { return getToken(PLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PLParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(PLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PLParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(35);
				((ExpressionContext)_localctx).INT = match(INT);
				((ExpressionContext)_localctx).value =  new IntLiteral((((ExpressionContext)_localctx).INT!=null?((ExpressionContext)_localctx).INT.getText():null));
				}
				break;
			case 2:
				{
				setState(37);
				((ExpressionContext)_localctx).FLOAT = match(FLOAT);
				((ExpressionContext)_localctx).value =  new FloatLiteral((((ExpressionContext)_localctx).FLOAT!=null?((ExpressionContext)_localctx).FLOAT.getText():null));
				}
				break;
			case 3:
				{
				setState(39);
				((ExpressionContext)_localctx).STRING = match(STRING);
				((ExpressionContext)_localctx).value =  new StringLiteral((((ExpressionContext)_localctx).STRING!=null?((ExpressionContext)_localctx).STRING.getText():null).substring(1, (((ExpressionContext)_localctx).STRING!=null?((ExpressionContext)_localctx).STRING.getText():null).length() - 1));
				}
				break;
			case 4:
				{
				setState(41);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).value =  new Deref((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				{
				setState(43);
				match(LPAREN);
				setState(44);
				((ExpressionContext)_localctx).e = expression(0);
				setState(45);
				match(RPAREN);
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).e.value;
				}
				break;
			case 6:
				{
				setState(48);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(49);
				match(LPAREN);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(50);
					((ExpressionContext)_localctx).exprList = exprList();
					}
				}

				setState(53);
				match(RPAREN);
				((ExpressionContext)_localctx).value =  new Invoke((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).exprList.list);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(58);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__2) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(59);
						((ExpressionContext)_localctx).e2 = expression(10);
						((ExpressionContext)_localctx).value =  new Arith((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.value, ((ExpressionContext)_localctx).e2.value);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(63);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						((ExpressionContext)_localctx).e2 = expression(9);
						((ExpressionContext)_localctx).value =  new Arith(((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).e1.value, ((ExpressionContext)_localctx).e2.value);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(67);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(68);
						match(T__5);
						setState(69);
						((ExpressionContext)_localctx).e2 = expression(8);
						((ExpressionContext)_localctx).value =  new Concat(((ExpressionContext)_localctx).e1.value, ((ExpressionContext)_localctx).e2.value);
						}
						break;
					}
					} 
				}
				setState(76);
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
		public VarDeclContext a;
		public ExpressionContext e;
		public Token ID;
		public Token RANGE;
		public BlockContext block;
		public FormalParametersContext formalParameters;
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PLParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(PLParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(PLParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public TerminalNode RANGE() { return getToken(PLParser.RANGE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				((StatementContext)_localctx).a = varDecl();
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).a.var;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				((StatementContext)_localctx).e = expression(0);
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).e.value;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__6);
				setState(84);
				((StatementContext)_localctx).e = expression(0);
				setState(85);
				match(RPAREN);
				((StatementContext)_localctx).expr =  new Print(((StatementContext)_localctx).e.value);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(FOR);
				setState(89);
				match(LPAREN);
				setState(90);
				((StatementContext)_localctx).ID = match(ID);
				setState(91);
				match(T__7);
				setState(92);
				((StatementContext)_localctx).RANGE = match(RANGE);
				setState(93);
				match(RPAREN);
				setState(94);
				match(T__8);
				setState(95);
				((StatementContext)_localctx).block = block();
				setState(96);
				match(T__9);
				((StatementContext)_localctx).expr =  new For((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), (((StatementContext)_localctx).RANGE!=null?((StatementContext)_localctx).RANGE.getText():null), ((StatementContext)_localctx).block.list);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(T__10);
				setState(100);
				((StatementContext)_localctx).ID = match(ID);
				setState(101);
				match(LPAREN);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(102);
					((StatementContext)_localctx).formalParameters = formalParameters();
					}
				}

				setState(105);
				match(RPAREN);
				setState(106);
				match(T__8);
				setState(107);
				((StatementContext)_localctx).block = block();
				setState(108);
				match(T__9);
				System.out.println((((StatementContext)_localctx).formalParameters!=null?_input.getText(((StatementContext)_localctx).formalParameters.start,((StatementContext)_localctx).formalParameters.stop):null)); ((StatementContext)_localctx).expr =  new Declare((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null),((StatementContext)_localctx).formalParameters.list ,((StatementContext)_localctx).block.list);
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
	public static class ExprListContext extends ParserRuleContext {
		public List<Expr> list;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(PLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLParser.ID, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((ExprListContext)_localctx).ID = match(ID);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(114);
				match(T__11);
				setState(115);
				((ExprListContext)_localctx).ID = match(ID);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ExprListContext)_localctx).list =  new ArrayList<Expr>(); _localctx.list.add(new Deref((((ExprListContext)_localctx).ID!=null?((ExprListContext)_localctx).ID.getText():null)));
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
	public static class FunCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PLParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			setState(124);
			match(LPAREN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(125);
				exprList();
				}
			}

			setState(128);
			match(RPAREN);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public Expr var;
		public Token ID;
		public ExpressionContext e;
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((VarDeclContext)_localctx).ID = match(ID);
			{
			setState(133);
			match(T__15);
			setState(134);
			((VarDeclContext)_localctx).e = expression(0);
			}
			((VarDeclContext)_localctx).var =  new Assign((((VarDeclContext)_localctx).ID!=null?((VarDeclContext)_localctx).ID.getText():null), ((VarDeclContext)_localctx).e.value);
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
		public FormalParameterContext formalParameter;
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((FormalParametersContext)_localctx).formalParameter = formalParameter();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(139);
				match(T__11);
				setState(140);
				((FormalParametersContext)_localctx).formalParameter = formalParameter();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.list.add((((FormalParametersContext)_localctx).formalParameter!=null?_input.getText(((FormalParametersContext)_localctx).formalParameter.start,((FormalParametersContext)_localctx).formalParameter.stop):null));
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
	public static class FormalParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expr> statements = new ArrayList<Expr>();
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				((BlockContext)_localctx).statement = statement();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(152);
					match(T__0);
					}
				}

				statements.add(((BlockContext)_localctx).statement.expr);
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 14551168L) != 0 );
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0018\b\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001c\b\u0000"+
		"\u000b\u0000\f\u0000\u001d\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00014\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001I\b\u0001\n\u0001\f\u0001L\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002p\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003u\b\u0003\n\u0003\f\u0003x\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u007f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u008e\b\u0007\n\u0007\f\u0007\u0091"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u009a\b\t\u0001\t\u0001\t\u0004\t\u009e\b\t\u000b\t\f\t\u009f"+
		"\u0001\t\u0001\t\u0001\t\u0000\u0001\u0002\n\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000\u0002\u0003\u0001\u0000"+
		"\u0004\u0005\u0001\u0000\r\u000f\u00ae\u0000\u0014\u0001\u0000\u0000\u0000"+
		"\u00027\u0001\u0000\u0000\u0000\u0004o\u0001\u0000\u0000\u0000\u0006q"+
		"\u0001\u0000\u0000\u0000\b{\u0001\u0000\u0000\u0000\n\u0082\u0001\u0000"+
		"\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e\u008a\u0001\u0000\u0000"+
		"\u0000\u0010\u0094\u0001\u0000\u0000\u0000\u0012\u0096\u0001\u0000\u0000"+
		"\u0000\u0014\u001b\u0006\u0000\uffff\uffff\u0000\u0015\u0017\u0003\u0004"+
		"\u0002\u0000\u0016\u0018\u0005\u0001\u0000\u0000\u0017\u0016\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0006\u0000\uffff\uffff\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0000"+
		"\u0000\u0001 !\u0006\u0000\uffff\uffff\u0000!\u0001\u0001\u0000\u0000"+
		"\u0000\"#\u0006\u0001\uffff\uffff\u0000#$\u0005\u0013\u0000\u0000$8\u0006"+
		"\u0001\uffff\uffff\u0000%&\u0005\u0014\u0000\u0000&8\u0006\u0001\uffff"+
		"\uffff\u0000\'(\u0005\u0016\u0000\u0000(8\u0006\u0001\uffff\uffff\u0000"+
		")*\u0005\u0012\u0000\u0000*8\u0006\u0001\uffff\uffff\u0000+,\u0005\u0017"+
		"\u0000\u0000,-\u0003\u0002\u0001\u0000-.\u0005\u0018\u0000\u0000./\u0006"+
		"\u0001\uffff\uffff\u0000/8\u0001\u0000\u0000\u000001\u0005\u0012\u0000"+
		"\u000013\u0005\u0017\u0000\u000024\u0003\u0006\u0003\u000032\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005"+
		"\u0018\u0000\u000068\u0006\u0001\uffff\uffff\u00007\"\u0001\u0000\u0000"+
		"\u00007%\u0001\u0000\u0000\u00007\'\u0001\u0000\u0000\u00007)\u0001\u0000"+
		"\u0000\u00007+\u0001\u0000\u0000\u000070\u0001\u0000\u0000\u00008J\u0001"+
		"\u0000\u0000\u00009:\n\t\u0000\u0000:;\u0007\u0000\u0000\u0000;<\u0003"+
		"\u0002\u0001\n<=\u0006\u0001\uffff\uffff\u0000=I\u0001\u0000\u0000\u0000"+
		">?\n\b\u0000\u0000?@\u0007\u0001\u0000\u0000@A\u0003\u0002\u0001\tAB\u0006"+
		"\u0001\uffff\uffff\u0000BI\u0001\u0000\u0000\u0000CD\n\u0007\u0000\u0000"+
		"DE\u0005\u0006\u0000\u0000EF\u0003\u0002\u0001\bFG\u0006\u0001\uffff\uffff"+
		"\u0000GI\u0001\u0000\u0000\u0000H9\u0001\u0000\u0000\u0000H>\u0001\u0000"+
		"\u0000\u0000HC\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0003\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0003\f\u0006\u0000NO\u0006\u0002\uffff"+
		"\uffff\u0000Op\u0001\u0000\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0006"+
		"\u0002\uffff\uffff\u0000Rp\u0001\u0000\u0000\u0000ST\u0005\u0007\u0000"+
		"\u0000TU\u0003\u0002\u0001\u0000UV\u0005\u0018\u0000\u0000VW\u0006\u0002"+
		"\uffff\uffff\u0000Wp\u0001\u0000\u0000\u0000XY\u0005\u0011\u0000\u0000"+
		"YZ\u0005\u0017\u0000\u0000Z[\u0005\u0012\u0000\u0000[\\\u0005\b\u0000"+
		"\u0000\\]\u0005\u0019\u0000\u0000]^\u0005\u0018\u0000\u0000^_\u0005\t"+
		"\u0000\u0000_`\u0003\u0012\t\u0000`a\u0005\n\u0000\u0000ab\u0006\u0002"+
		"\uffff\uffff\u0000bp\u0001\u0000\u0000\u0000cd\u0005\u000b\u0000\u0000"+
		"de\u0005\u0012\u0000\u0000eg\u0005\u0017\u0000\u0000fh\u0003\u000e\u0007"+
		"\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0005\u0018\u0000\u0000jk\u0005\t\u0000\u0000kl\u0003\u0012"+
		"\t\u0000lm\u0005\n\u0000\u0000mn\u0006\u0002\uffff\uffff\u0000np\u0001"+
		"\u0000\u0000\u0000oM\u0001\u0000\u0000\u0000oP\u0001\u0000\u0000\u0000"+
		"oS\u0001\u0000\u0000\u0000oX\u0001\u0000\u0000\u0000oc\u0001\u0000\u0000"+
		"\u0000p\u0005\u0001\u0000\u0000\u0000qv\u0005\u0012\u0000\u0000rs\u0005"+
		"\f\u0000\u0000su\u0005\u0012\u0000\u0000tr\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0006\u0003\uffff"+
		"\uffff\u0000z\u0007\u0001\u0000\u0000\u0000{|\u0005\u0012\u0000\u0000"+
		"|~\u0005\u0017\u0000\u0000}\u007f\u0003\u0006\u0003\u0000~}\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0018\u0000\u0000\u0081\t\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0007\u0002\u0000\u0000\u0083\u000b\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\u0012\u0000\u0000\u0085\u0086\u0005\u0010\u0000\u0000"+
		"\u0086\u0087\u0003\u0002\u0001\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0006\u0006\uffff\uffff\u0000\u0089\r\u0001\u0000\u0000\u0000"+
		"\u008a\u008f\u0003\u0010\b\u0000\u008b\u008c\u0005\f\u0000\u0000\u008c"+
		"\u008e\u0003\u0010\b\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0006\u0007\uffff\uffff\u0000\u0093"+
		"\u000f\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0012\u0000\u0000\u0095"+
		"\u0011\u0001\u0000\u0000\u0000\u0096\u009d\u0006\t\uffff\uffff\u0000\u0097"+
		"\u0099\u0003\u0004\u0002\u0000\u0098\u009a\u0005\u0001\u0000\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0006\t\uffff\uffff\u0000\u009c"+
		"\u009e\u0001\u0000\u0000\u0000\u009d\u0097\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0006\t\uffff\uffff\u0000\u00a2\u0013\u0001\u0000\u0000\u0000\r"+
		"\u0017\u001d37HJgov~\u008f\u0099\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}