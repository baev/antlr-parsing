// Generated from ru/ifmo/sta/lab03/baev/PrefixExpressions.g4 by ANTLR 4.0
package ru.ifmo.sta.lab03.baev;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrefixExpressionsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, NOT=20, TRUE=21, FALSE=22, ID=23, INT=24, CHAR=25, 
		CHAR_LOWER_CASE=26, DIGIT=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'AND'", "')'", "'+'", "'*'", "'-'", "'('", "'print'", "'if'", "'<>'", 
		"'<'", "'='", "'<='", "'XOR'", "'>'", "'scan'", "'OR'", "':='", "'/'", 
		"'>='", "'NOT'", "TRUE", "FALSE", "ID", "INT", "CHAR", "CHAR_LOWER_CASE", 
		"DIGIT", "WS"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "NOT", "TRUE", "FALSE", "ID", "INT", "CHAR", "CHAR_LOWER_CASE", 
		"DIGIT", "WS"
	};


	public PrefixExpressionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrefixExpressions.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\36\u00af\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0083\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0094"+
		"\n\27\3\30\3\30\3\30\7\30\u0099\n\30\f\30\16\30\u009c\13\30\3\31\6\31"+
		"\u009f\n\31\r\31\16\31\u00a0\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00aa"+
		"\n\35\r\35\16\35\u00ab\3\35\3\35\2\36\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\2\3\2\5\4C\\c|\3c|\5\13\f\17\17\"\"\u00b6\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5?\3"+
		"\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21O\3"+
		"\2\2\2\23R\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33\\\3\2\2\2\35"+
		"`\3\2\2\2\37b\3\2\2\2!g\3\2\2\2#j\3\2\2\2%m\3\2\2\2\'o\3\2\2\2)r\3\2\2"+
		"\2+\u0082\3\2\2\2-\u0093\3\2\2\2/\u0095\3\2\2\2\61\u009e\3\2\2\2\63\u00a2"+
		"\3\2\2\2\65\u00a4\3\2\2\2\67\u00a6\3\2\2\29\u00a9\3\2\2\2;<\7C\2\2<=\7"+
		"P\2\2=>\7F\2\2>\4\3\2\2\2?@\7+\2\2@\6\3\2\2\2AB\7-\2\2B\b\3\2\2\2CD\7"+
		",\2\2D\n\3\2\2\2EF\7/\2\2F\f\3\2\2\2GH\7*\2\2H\16\3\2\2\2IJ\7r\2\2JK\7"+
		"t\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2N\20\3\2\2\2OP\7k\2\2PQ\7h\2\2Q\22\3\2"+
		"\2\2RS\7>\2\2ST\7@\2\2T\24\3\2\2\2UV\7>\2\2V\26\3\2\2\2WX\7?\2\2X\30\3"+
		"\2\2\2YZ\7>\2\2Z[\7?\2\2[\32\3\2\2\2\\]\7Z\2\2]^\7Q\2\2^_\7T\2\2_\34\3"+
		"\2\2\2`a\7@\2\2a\36\3\2\2\2bc\7u\2\2cd\7e\2\2de\7c\2\2ef\7p\2\2f \3\2"+
		"\2\2gh\7Q\2\2hi\7T\2\2i\"\3\2\2\2jk\7<\2\2kl\7?\2\2l$\3\2\2\2mn\7\61\2"+
		"\2n&\3\2\2\2op\7@\2\2pq\7?\2\2q(\3\2\2\2rs\7P\2\2st\7Q\2\2tu\7V\2\2u*"+
		"\3\2\2\2vw\7V\2\2wx\7T\2\2xy\7W\2\2y\u0083\7G\2\2z{\7V\2\2{|\7t\2\2|}"+
		"\7w\2\2}\u0083\7g\2\2~\177\7v\2\2\177\u0080\7t\2\2\u0080\u0081\7w\2\2"+
		"\u0081\u0083\7g\2\2\u0082v\3\2\2\2\u0082z\3\2\2\2\u0082~\3\2\2\2\u0083"+
		",\3\2\2\2\u0084\u0085\7H\2\2\u0085\u0086\7C\2\2\u0086\u0087\7N\2\2\u0087"+
		"\u0088\7U\2\2\u0088\u0094\7G\2\2\u0089\u008a\7H\2\2\u008a\u008b\7c\2\2"+
		"\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u0094\7g\2\2\u008e\u008f"+
		"\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092"+
		"\u0094\7g\2\2\u0093\u0084\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u008e\3\2"+
		"\2\2\u0094.\3\2\2\2\u0095\u009a\5\63\32\2\u0096\u0099\5\63\32\2\u0097"+
		"\u0099\5\67\34\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\60\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009f\5\67\34\2\u009e\u009d\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\62\3\2\2\2\u00a2"+
		"\u00a3\t\2\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5\66\3\2\2\2\u00a6"+
		"\u00a7\4\62;\2\u00a78\3\2\2\2\u00a8\u00aa\t\4\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ae\b\35\2\2\u00ae:\3\2\2\2\t\2\u0082\u0093\u0098\u009a"+
		"\u00a0\u00ab";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}