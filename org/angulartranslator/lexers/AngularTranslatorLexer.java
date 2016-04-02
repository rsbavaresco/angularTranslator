// Generated from AngularTranslator.g4 by ANTLR 4.5.1

  package org.angulartranslator.lexers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AngularTranslatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, EXPORT=11, FUNCTION=12, NEWLINE=13, EOS=14, WS=15, MLC=16, SLC=17, 
		Identifier=18, StringLiteral=19, DoubleStringCharacter=20, SingleStringCharacter=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "EXPORT", "FUNCTION", "NEWLINE", "EOS", "WS", "MLC", "SLC", "Identifier", 
		"Letter", "IdDigit", "StringLiteral", "DoubleStringCharacter", "SingleStringCharacter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'return'", "','", "':'", "'['", "']'", 
		"'.'", "'export'", "'function'", null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "EXPORT", 
		"FUNCTION", "NEWLINE", "EOS", "WS", "MLC", "SLC", "Identifier", "StringLiteral", 
		"DoubleStringCharacter", "SingleStringCharacter"
	};
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


	public AngularTranslatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AngularTranslator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\\\n\16\r\16\16\16]\3\16\3\16\3\17\3\17"+
		"\3\20\6\20e\n\20\r\20\16\20f\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\7\22s\n\22\f\22\16\22v\13\22\3\22\3\22\3\23\3\23\3\23\7\23}\n"+
		"\23\f\23\16\23\u0080\13\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u0088\n"+
		"\26\f\26\16\26\u008b\13\26\3\26\3\26\3\26\7\26\u0090\n\26\f\26\16\26\u0093"+
		"\13\26\3\26\5\26\u0096\n\26\3\27\3\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\2)\2+\25-\26/\27\3\2\n\4\2\f\f\17\17\4\2\13\13\"\"\7\2\"\")),,\60\61"+
		"AA\5\2\f\f\17\17\u202a\u202b\16\2&&C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u2001\u3042\u3191\u3302\u3381\u3402\u3d2f\u4e02\ua001\uf902\ufb01\21"+
		"\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8"+
		"\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52"+
		"\u0e5b\u0ed2\u0edb\u1042\u104b\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\u00a0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2"+
		"\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21D"+
		"\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2\31Q\3\2\2\2\33[\3\2\2\2\35"+
		"a\3\2\2\2\37d\3\2\2\2!j\3\2\2\2#n\3\2\2\2%y\3\2\2\2\'\u0081\3\2\2\2)\u0083"+
		"\3\2\2\2+\u0095\3\2\2\2-\u0097\3\2\2\2/\u0099\3\2\2\2\61\62\7*\2\2\62"+
		"\4\3\2\2\2\63\64\7+\2\2\64\6\3\2\2\2\65\66\7}\2\2\66\b\3\2\2\2\678\7\177"+
		"\2\28\n\3\2\2\29:\7t\2\2:;\7g\2\2;<\7v\2\2<=\7w\2\2=>\7t\2\2>?\7p\2\2"+
		"?\f\3\2\2\2@A\7.\2\2A\16\3\2\2\2BC\7<\2\2C\20\3\2\2\2DE\7]\2\2E\22\3\2"+
		"\2\2FG\7_\2\2G\24\3\2\2\2HI\7\60\2\2I\26\3\2\2\2JK\7g\2\2KL\7z\2\2LM\7"+
		"r\2\2MN\7q\2\2NO\7t\2\2OP\7v\2\2P\30\3\2\2\2QR\7h\2\2RS\7w\2\2ST\7p\2"+
		"\2TU\7e\2\2UV\7v\2\2VW\7k\2\2WX\7q\2\2XY\7p\2\2Y\32\3\2\2\2Z\\\t\2\2\2"+
		"[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\16\2\2`\34\3\2"+
		"\2\2ab\7=\2\2b\36\3\2\2\2ce\t\3\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2gh\3\2\2\2hi\b\20\2\2i \3\2\2\2jk\t\4\2\2kl\3\2\2\2lm\b\21\2\2m"+
		"\"\3\2\2\2no\7\61\2\2op\7\61\2\2pt\3\2\2\2qs\n\5\2\2rq\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\b\22\2\2x$\3\2\2\2y~\5\'"+
		"\24\2z}\5\'\24\2{}\5)\25\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177&\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\t\6\2\2\u0082"+
		"(\3\2\2\2\u0083\u0084\t\7\2\2\u0084*\3\2\2\2\u0085\u0089\7$\2\2\u0086"+
		"\u0088\5-\27\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u0096\7$\2\2\u008d\u0091\7)\2\2\u008e\u0090\5/\30\2\u008f\u008e\3\2\2"+
		"\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\7)\2\2\u0095\u0085\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0096,\3\2\2\2\u0097\u0098\n\b\2\2\u0098.\3\2\2\2\u0099"+
		"\u009a\n\t\2\2\u009a\60\3\2\2\2\13\2]ft|~\u0089\u0091\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}