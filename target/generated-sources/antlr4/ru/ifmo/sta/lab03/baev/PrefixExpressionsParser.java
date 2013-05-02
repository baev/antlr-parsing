// Generated from ru/ifmo/sta/lab03/baev/PrefixExpressions.g4 by ANTLR 4.0
package ru.ifmo.sta.lab03.baev;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrefixExpressionsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, NOT=20, TRUE=21, FALSE=22, ID=23, INT=24, CHAR=25, 
		CHAR_LOWER_CASE=26, DIGIT=27, WS=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'AND'", "')'", "'+'", "'*'", "'-'", "'('", "'print'", "'if'", 
		"'<>'", "'<'", "'='", "'<='", "'XOR'", "'>'", "'scan'", "'OR'", "':='", 
		"'/'", "'>='", "'NOT'", "TRUE", "FALSE", "ID", "INT", "CHAR", "CHAR_LOWER_CASE", 
		"DIGIT", "WS"
	};
	public static final int
		RULE_parse = 0, RULE_command = 1, RULE_write = 2, RULE_read = 3, RULE_branch = 4, 
		RULE_operand = 5, RULE_mathExpr = 6, RULE_mathOperator = 7, RULE_logicExpr = 8, 
		RULE_compareOperator = 9, RULE_logicOperator = 10, RULE_assignment = 11, 
		RULE_expr = 12, RULE_name = 13, RULE_end = 14;
	public static final String[] ruleNames = {
		"parse", "command", "write", "read", "branch", "operand", "mathExpr", 
		"mathOperator", "logicExpr", "compareOperator", "logicOperator", "assignment", 
		"expr", "name", "end"
	};

	@Override
	public String getGrammarFileName() { return "PrefixExpressions.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrefixExpressionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ParseContext parse() {
			return getRuleContext(ParseContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case 7:
			case 8:
			case 15:
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); command();
				setState(31); parse();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); end();
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

	public static class CommandContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); write();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); read();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 4);
				{
				setState(39); branch();
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

	public static class WriteContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(7);
			setState(43); expr();
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

	public static class ReadContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(15);
			setState(46); name();
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

	public static class BranchContext extends ParserRuleContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitBranch(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(8);
			setState(49); logicExpr();
			setState(50); operand();
			setState(51); operand();
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

	public static class OperandContext extends ParserRuleContext {
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operand);
		int _la;
		try {
			setState(62);
			switch (_input.LA(1)) {
			case 7:
			case 8:
			case 15:
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); command();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(6);
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(55); command();
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 8) | (1L << 15) | (1L << 17))) != 0) );
				setState(60); match(2);
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

	public static class MathExprContext extends ParserRuleContext {
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public TerminalNode INT() { return getToken(PrefixExpressionsParser.INT, 0); }
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(PrefixExpressionsParser.ID, 0); }
		public MathOperatorContext mathOperator() {
			return getRuleContext(MathOperatorContext.class,0);
		}
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitMathExpr(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mathExpr);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case 3:
			case 4:
			case 5:
			case 18:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); mathOperator();
				setState(65); mathExpr();
				setState(66); mathExpr();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(69); match(ID);
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

	public static class MathOperatorContext extends ParserRuleContext {
		public MathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitMathOperator(this);
		}
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 5) | (1L << 18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LogicExprContext extends ParserRuleContext {
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public LogicOperatorContext logicOperator() {
			return getRuleContext(LogicOperatorContext.class,0);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(PrefixExpressionsParser.NOT, 0); }
		public List<LogicExprContext> logicExpr() {
			return getRuleContexts(LogicExprContext.class);
		}
		public TerminalNode ID() { return getToken(PrefixExpressionsParser.ID, 0); }
		public TerminalNode FALSE() { return getToken(PrefixExpressionsParser.FALSE, 0); }
		public LogicExprContext logicExpr(int i) {
			return getRuleContext(LogicExprContext.class,i);
		}
		public CompareOperatorContext compareOperator() {
			return getRuleContext(CompareOperatorContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(PrefixExpressionsParser.TRUE, 0); }
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitLogicExpr(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicExpr);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case 1:
			case 13:
			case 16:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); logicOperator();
				setState(75); logicExpr();
				setState(76); logicExpr();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); match(FALSE);
				}
				break;
			case 9:
			case 10:
			case 11:
			case 12:
			case 14:
			case 19:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); compareOperator();
				setState(81); mathExpr();
				setState(82); mathExpr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(84); match(NOT);
				setState(85); logicExpr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(86); match(ID);
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

	public static class CompareOperatorContext extends ParserRuleContext {
		public CompareOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterCompareOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitCompareOperator(this);
		}
	}

	public final CompareOperatorContext compareOperator() throws RecognitionException {
		CompareOperatorContext _localctx = new CompareOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compareOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LogicOperatorContext extends ParserRuleContext {
		public LogicOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterLogicOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitLogicOperator(this);
		}
	}

	public final LogicOperatorContext logicOperator() throws RecognitionException {
		LogicOperatorContext _localctx = new LogicOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 13) | (1L << 16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AssignmentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(17);
			setState(94); name();
			setState(95); expr();
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

	public static class ExprContext extends ParserRuleContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(97); mathExpr();
				}
				break;

			case 2:
				{
				setState(98); logicExpr();
				}
				break;
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PrefixExpressionsParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(ID);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PrefixExpressionsParser.EOF, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(EOF);
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
		"\2\3\36l\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2"+
		"\3\2\3\2\3\2\5\2%\n\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7;\n\7\r\7\16\7<\3\7\3\7\5\7A\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bI\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\nZ\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\5\16f\n\16\3\17\3\17\3\20\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\5\4\5\7\24\24\5\13\16\20\20\25\25\5\3\3\17\17\22\22"+
		"j\2$\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b/\3\2\2\2\n\62\3\2\2\2\f@\3\2\2\2"+
		"\16H\3\2\2\2\20J\3\2\2\2\22Y\3\2\2\2\24[\3\2\2\2\26]\3\2\2\2\30_\3\2\2"+
		"\2\32e\3\2\2\2\34g\3\2\2\2\36i\3\2\2\2 !\5\4\3\2!\"\5\2\2\2\"%\3\2\2\2"+
		"#%\5\36\20\2$ \3\2\2\2$#\3\2\2\2%\3\3\2\2\2&+\5\6\4\2\'+\5\b\5\2(+\5\30"+
		"\r\2)+\5\n\6\2*&\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\7"+
		"\t\2\2-.\5\32\16\2.\7\3\2\2\2/\60\7\21\2\2\60\61\5\34\17\2\61\t\3\2\2"+
		"\2\62\63\7\n\2\2\63\64\5\22\n\2\64\65\5\f\7\2\65\66\5\f\7\2\66\13\3\2"+
		"\2\2\67A\5\4\3\28:\7\b\2\29;\5\4\3\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=>\3\2\2\2>?\7\4\2\2?A\3\2\2\2@\67\3\2\2\2@8\3\2\2\2A\r\3\2\2\2"+
		"BC\5\20\t\2CD\5\16\b\2DE\5\16\b\2EI\3\2\2\2FI\7\32\2\2GI\7\31\2\2HB\3"+
		"\2\2\2HF\3\2\2\2HG\3\2\2\2I\17\3\2\2\2JK\t\2\2\2K\21\3\2\2\2LM\5\26\f"+
		"\2MN\5\22\n\2NO\5\22\n\2OZ\3\2\2\2PZ\7\27\2\2QZ\7\30\2\2RS\5\24\13\2S"+
		"T\5\16\b\2TU\5\16\b\2UZ\3\2\2\2VW\7\26\2\2WZ\5\22\n\2XZ\7\31\2\2YL\3\2"+
		"\2\2YP\3\2\2\2YQ\3\2\2\2YR\3\2\2\2YV\3\2\2\2YX\3\2\2\2Z\23\3\2\2\2[\\"+
		"\t\3\2\2\\\25\3\2\2\2]^\t\4\2\2^\27\3\2\2\2_`\7\23\2\2`a\5\34\17\2ab\5"+
		"\32\16\2b\31\3\2\2\2cf\5\16\b\2df\5\22\n\2ec\3\2\2\2ed\3\2\2\2f\33\3\2"+
		"\2\2gh\7\31\2\2h\35\3\2\2\2ij\7\1\2\2j\37\3\2\2\2\t$*<@HYe";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}