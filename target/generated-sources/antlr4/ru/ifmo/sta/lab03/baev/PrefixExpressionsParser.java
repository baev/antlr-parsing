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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, ID=21, INT=22, CHAR=23, DIGIT=24, 
		WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'xor'", "')'", "'+'", "'*'", "'-'", "'or'", "'not'", "'('", 
		"'print'", "'if'", "'<'", "'false'", "'='", "'<='", "'>'", "'scan'", "'and'", 
		"'/'", "'>='", "'true'", "ID", "INT", "CHAR", "DIGIT", "WS"
	};
	public static final int
		RULE_parse = 0, RULE_command = 1, RULE_write = 2, RULE_read = 3, RULE_branch = 4, 
		RULE_operand = 5, RULE_math_expr = 6, RULE_math_operator = 7, RULE_logic_expr = 8, 
		RULE_compare_operator = 9, RULE_logic_operator = 10, RULE_assignment = 11, 
		RULE_expr = 12, RULE_name = 13, RULE_end = 14;
	public static final String[] ruleNames = {
		"parse", "command", "write", "read", "branch", "operand", "math_expr", 
		"math_operator", "logic_expr", "compare_operator", "logic_operator", "assignment", 
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
			case 9:
			case 10:
			case 16:
			case ID:
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
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); write();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); read();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); assignment();
				}
				break;
			case 10:
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
			setState(42); match(9);
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(43); expr();
				}
				break;

			case 2:
				{
				setState(44); name();
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
			setState(47); match(16);
			setState(48); name();
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
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
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
			setState(50); match(10);
			setState(51); logic_expr();
			setState(52); operand();
			setState(53); operand();
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
			setState(64);
			switch (_input.LA(1)) {
			case 9:
			case 10:
			case 16:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); command();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(8);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57); command();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 16) | (1L << ID))) != 0) );
				setState(62); match(2);
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

	public static class Math_exprContext extends ParserRuleContext {
		public Math_operatorContext math_operator() {
			return getRuleContext(Math_operatorContext.class,0);
		}
		public TerminalNode INT() { return getToken(PrefixExpressionsParser.INT, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitMath_expr(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		Math_exprContext _localctx = new Math_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_math_expr);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case 3:
			case 4:
			case 5:
			case 18:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); math_operator();
				setState(67); math_expr();
				setState(68); math_expr();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); name();
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

	public static class Math_operatorContext extends ParserRuleContext {
		public Math_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterMath_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitMath_operator(this);
		}
	}

	public final Math_operatorContext math_operator() throws RecognitionException {
		Math_operatorContext _localctx = new Math_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_math_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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

	public static class Logic_exprContext extends ParserRuleContext {
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Logic_operatorContext logic_operator() {
			return getRuleContext(Logic_operatorContext.class,0);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public Compare_operatorContext compare_operator() {
			return getRuleContext(Compare_operatorContext.class,0);
		}
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitLogic_expr(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logic_expr);
		int _la;
		try {
			setState(88);
			switch (_input.LA(1)) {
			case 1:
			case 6:
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); logic_operator();
				setState(77); logic_expr();
				setState(78); logic_expr();
				}
				break;
			case 12:
			case 20:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				_la = _input.LA(1);
				if ( !(_la==12 || _la==20) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 11:
			case 13:
			case 14:
			case 15:
			case 19:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); compare_operator();
				setState(82); math_expr();
				setState(83); math_expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); match(7);
				setState(86); logic_expr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(87); name();
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

	public static class Compare_operatorContext extends ParserRuleContext {
		public Compare_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterCompare_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitCompare_operator(this);
		}
	}

	public final Compare_operatorContext compare_operator() throws RecognitionException {
		Compare_operatorContext _localctx = new Compare_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compare_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 19))) != 0)) ) {
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

	public static class Logic_operatorContext extends ParserRuleContext {
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).enterLogic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixExpressionsListener ) ((PrefixExpressionsListener)listener).exitLogic_operator(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 17))) != 0)) ) {
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
			setState(94); name();
			setState(95); match(13);
			setState(96); expr();
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
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
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
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(98); math_expr();
				}
				break;

			case 2:
				{
				setState(99); logic_expr();
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
			setState(102); match(ID);
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
			setState(104); match(EOF);
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
		"\2\3\33m\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2"+
		"\3\2\3\2\3\2\5\2%\n\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\5\4\60\n\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7=\n\7\r\7\16\7>\3\7\3"+
		"\7\5\7C\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\5\16g\n\16\3\17\3\17\3\20\3\20\3\20\2\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\6\4\5\7\24\24\4\16\16\26\26\5\r\r\17\21\25"+
		"\25\5\3\3\b\b\23\23k\2$\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b\61\3\2\2\2\n\64"+
		"\3\2\2\2\fB\3\2\2\2\16J\3\2\2\2\20L\3\2\2\2\22Z\3\2\2\2\24\\\3\2\2\2\26"+
		"^\3\2\2\2\30`\3\2\2\2\32f\3\2\2\2\34h\3\2\2\2\36j\3\2\2\2 !\5\4\3\2!\""+
		"\5\2\2\2\"%\3\2\2\2#%\5\36\20\2$ \3\2\2\2$#\3\2\2\2%\3\3\2\2\2&+\5\6\4"+
		"\2\'+\5\b\5\2(+\5\30\r\2)+\5\n\6\2*&\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3"+
		"\2\2\2+\5\3\2\2\2,/\7\13\2\2-\60\5\32\16\2.\60\5\34\17\2/-\3\2\2\2/.\3"+
		"\2\2\2\60\7\3\2\2\2\61\62\7\22\2\2\62\63\5\34\17\2\63\t\3\2\2\2\64\65"+
		"\7\f\2\2\65\66\5\22\n\2\66\67\5\f\7\2\678\5\f\7\28\13\3\2\2\29C\5\4\3"+
		"\2:<\7\n\2\2;=\5\4\3\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2"+
		"\2@A\7\4\2\2AC\3\2\2\2B9\3\2\2\2B:\3\2\2\2C\r\3\2\2\2DE\5\20\t\2EF\5\16"+
		"\b\2FG\5\16\b\2GK\3\2\2\2HK\7\30\2\2IK\5\34\17\2JD\3\2\2\2JH\3\2\2\2J"+
		"I\3\2\2\2K\17\3\2\2\2LM\t\2\2\2M\21\3\2\2\2NO\5\26\f\2OP\5\22\n\2PQ\5"+
		"\22\n\2Q[\3\2\2\2R[\t\3\2\2ST\5\24\13\2TU\5\16\b\2UV\5\16\b\2V[\3\2\2"+
		"\2WX\7\t\2\2X[\5\22\n\2Y[\5\34\17\2ZN\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZW\3"+
		"\2\2\2ZY\3\2\2\2[\23\3\2\2\2\\]\t\4\2\2]\25\3\2\2\2^_\t\5\2\2_\27\3\2"+
		"\2\2`a\5\34\17\2ab\7\17\2\2bc\5\32\16\2c\31\3\2\2\2dg\5\16\b\2eg\5\22"+
		"\n\2fd\3\2\2\2fe\3\2\2\2g\33\3\2\2\2hi\7\27\2\2i\35\3\2\2\2jk\7\1\2\2"+
		"k\37\3\2\2\2\n$*/>BJZf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}