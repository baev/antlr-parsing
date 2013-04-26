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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, ID=21, INT=22, CHAR=23, DIGIT=24, 
		WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'xor'", "')'", "'+'", "'*'", "'-'", "'or'", "'not'", "'('", "'print'", 
		"'if'", "'<'", "'false'", "'='", "'<='", "'>'", "'scan'", "'and'", "'/'", 
		"'>='", "'true'", "ID", "INT", "CHAR", "DIGIT", "WS"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "ID", "INT", "CHAR", "DIGIT", "WS"
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
		case 24: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\33\u008d\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26y\n\26\f\26"+
		"\16\26|\13\26\3\27\6\27\177\n\27\r\27\16\27\u0080\3\30\3\30\3\31\3\31"+
		"\3\32\6\32\u0088\n\32\r\32\16\32\u0089\3\32\3\32\2\33\3\3\1\5\4\1\7\5"+
		"\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
		"\32\1\63\33\2\3\2\4\4C\\c|\5\13\f\17\17\"\"\u0090\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\3\65\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3"+
		"\2\2\2\17D\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25P\3\2\2\2\27S\3\2\2\2\31"+
		"U\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37`\3\2\2\2!b\3\2\2\2#g\3\2\2\2%k\3"+
		"\2\2\2\'m\3\2\2\2)p\3\2\2\2+u\3\2\2\2-~\3\2\2\2/\u0082\3\2\2\2\61\u0084"+
		"\3\2\2\2\63\u0087\3\2\2\2\65\66\7z\2\2\66\67\7q\2\2\678\7t\2\28\4\3\2"+
		"\2\29:\7+\2\2:\6\3\2\2\2;<\7-\2\2<\b\3\2\2\2=>\7,\2\2>\n\3\2\2\2?@\7/"+
		"\2\2@\f\3\2\2\2AB\7q\2\2BC\7t\2\2C\16\3\2\2\2DE\7p\2\2EF\7q\2\2FG\7v\2"+
		"\2G\20\3\2\2\2HI\7*\2\2I\22\3\2\2\2JK\7r\2\2KL\7t\2\2LM\7k\2\2MN\7p\2"+
		"\2NO\7v\2\2O\24\3\2\2\2PQ\7k\2\2QR\7h\2\2R\26\3\2\2\2ST\7>\2\2T\30\3\2"+
		"\2\2UV\7h\2\2VW\7c\2\2WX\7n\2\2XY\7u\2\2YZ\7g\2\2Z\32\3\2\2\2[\\\7?\2"+
		"\2\\\34\3\2\2\2]^\7>\2\2^_\7?\2\2_\36\3\2\2\2`a\7@\2\2a \3\2\2\2bc\7u"+
		"\2\2cd\7e\2\2de\7c\2\2ef\7p\2\2f\"\3\2\2\2gh\7c\2\2hi\7p\2\2ij\7f\2\2"+
		"j$\3\2\2\2kl\7\61\2\2l&\3\2\2\2mn\7@\2\2no\7?\2\2o(\3\2\2\2pq\7v\2\2q"+
		"r\7t\2\2rs\7w\2\2st\7g\2\2t*\3\2\2\2uz\5/\30\2vy\5/\30\2wy\5\61\31\2x"+
		"v\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{,\3\2\2\2|z\3\2\2\2"+
		"}\177\5\61\31\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081.\3\2\2\2\u0082\u0083\t\2\2\2\u0083\60\3\2\2\2\u0084\u0085"+
		"\4\62;\2\u0085\62\3\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\b\32\2\2\u008c\64\3\2\2\2\7\2xz\u0080\u0089";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}