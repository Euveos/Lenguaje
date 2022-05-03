// Generated from LenguajeDeProgramacion.g4 by ANTLR 4.7.2
package eugenio.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeDeProgramacionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, VOID=4, REY=5, VIVE=6, MUERE=7, DP=8, INVOCACION=9, 
		FIN=10, SUBDITO=11, IF=12, ELSE=13, ELSEIF=14, HECHIZO=15, TRUE=16, FALSE=17, 
		INT=18, AND=19, OR=20, MAY=21, MEN=22, MAYIGU=23, MENIGU=24, IGU=25, DIF=26, 
		ID=27, SUM=28, RES=29, MUL=30, DIV=31, ESPACIOS=32, LINEA=33, BLOQUE=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "VOID", "REY", "VIVE", "MUERE", "DP", "INVOCACION", 
			"FIN", "SUBDITO", "IF", "ELSE", "ELSEIF", "HECHIZO", "TRUE", "FALSE", 
			"INT", "AND", "OR", "MAY", "MEN", "MAYIGU", "MENIGU", "IGU", "DIF", "ID", 
			"SUM", "RES", "MUL", "DIV", "ESPACIOS", "LINEA", "BLOQUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'verdugo'", "'rey'", "'['", "']'", "':'", 
			"'invocacion'", "'!'", "'subdito'", "'juicio'", "'ejecucion'", "'sentencia'", 
			"'hechizo'", "'cuerdo'", "'loco'", null, "'&&'", "'||'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "VOID", "REY", "VIVE", "MUERE", "DP", "INVOCACION", 
			"FIN", "SUBDITO", "IF", "ELSE", "ELSEIF", "HECHIZO", "TRUE", "FALSE", 
			"INT", "AND", "OR", "MAY", "MEN", "MAYIGU", "MENIGU", "IGU", "DIF", "ID", 
			"SUM", "RES", "MUL", "DIV", "ESPACIOS", "LINEA", "BLOQUE"
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


	public LenguajeDeProgramacionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LenguajeDeProgramacion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\6\23\u00a5\n\23\r\23\16\23\u00a6\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\6\34\u00c0\n\34\r\34\16\34\u00c1\3\34\7\34\u00c5"+
		"\n\34\f\34\16\34\u00c8\13\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3!\3\"\3\"\3\"\7\"\u00d9\n\"\f\"\16\"\u00dc\13\"\3\"\3\"\3#\3#\3"+
		"#\7#\u00e3\n#\f#\16#\u00e6\13#\3#\3#\3#\3#\3#\3\u00e4\2$\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3"+
		"\2\7\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2"+
		"\u00f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3"+
		"G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13U\3\2\2\2\rY\3\2\2\2\17["+
		"\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25j\3\2\2\2\27l\3\2\2\2\31t\3\2\2\2\33"+
		"{\3\2\2\2\35\u0085\3\2\2\2\37\u008f\3\2\2\2!\u0097\3\2\2\2#\u009e\3\2"+
		"\2\2%\u00a4\3\2\2\2\'\u00a8\3\2\2\2)\u00ab\3\2\2\2+\u00ae\3\2\2\2-\u00b0"+
		"\3\2\2\2/\u00b2\3\2\2\2\61\u00b5\3\2\2\2\63\u00b8\3\2\2\2\65\u00bb\3\2"+
		"\2\2\67\u00bf\3\2\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00cd\3\2\2\2?\u00cf"+
		"\3\2\2\2A\u00d1\3\2\2\2C\u00d5\3\2\2\2E\u00df\3\2\2\2GH\7?\2\2H\4\3\2"+
		"\2\2IJ\7*\2\2J\6\3\2\2\2KL\7+\2\2L\b\3\2\2\2MN\7x\2\2NO\7g\2\2OP\7t\2"+
		"\2PQ\7f\2\2QR\7w\2\2RS\7i\2\2ST\7q\2\2T\n\3\2\2\2UV\7t\2\2VW\7g\2\2WX"+
		"\7{\2\2X\f\3\2\2\2YZ\7]\2\2Z\16\3\2\2\2[\\\7_\2\2\\\20\3\2\2\2]^\7<\2"+
		"\2^\22\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7x\2\2bc\7q\2\2cd\7e\2\2de\7c\2\2e"+
		"f\7e\2\2fg\7k\2\2gh\7q\2\2hi\7p\2\2i\24\3\2\2\2jk\7#\2\2k\26\3\2\2\2l"+
		"m\7u\2\2mn\7w\2\2no\7d\2\2op\7f\2\2pq\7k\2\2qr\7v\2\2rs\7q\2\2s\30\3\2"+
		"\2\2tu\7l\2\2uv\7w\2\2vw\7k\2\2wx\7e\2\2xy\7k\2\2yz\7q\2\2z\32\3\2\2\2"+
		"{|\7g\2\2|}\7l\2\2}~\7g\2\2~\177\7e\2\2\177\u0080\7w\2\2\u0080\u0081\7"+
		"e\2\2\u0081\u0082\7k\2\2\u0082\u0083\7q\2\2\u0083\u0084\7p\2\2\u0084\34"+
		"\3\2\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087\u0088\7p\2\2\u0088"+
		"\u0089\7v\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7e\2\2"+
		"\u008c\u008d\7k\2\2\u008d\u008e\7c\2\2\u008e\36\3\2\2\2\u008f\u0090\7"+
		"j\2\2\u0090\u0091\7g\2\2\u0091\u0092\7e\2\2\u0092\u0093\7j\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7|\2\2\u0095\u0096\7q\2\2\u0096 \3\2\2\2\u0097\u0098"+
		"\7e\2\2\u0098\u0099\7w\2\2\u0099\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b"+
		"\u009c\7f\2\2\u009c\u009d\7q\2\2\u009d\"\3\2\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7q\2\2\u00a2$\3\2\2\2\u00a3"+
		"\u00a5\t\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7(\2\2\u00a9\u00aa"+
		"\7(\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac\u00ad\7~\2\2\u00ad*\3"+
		"\2\2\2\u00ae\u00af\7@\2\2\u00af,\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1.\3\2"+
		"\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7?\2\2\u00b4\60\3\2\2\2\u00b5\u00b6"+
		"\7>\2\2\u00b6\u00b7\7?\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7?\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd\7?\2\2\u00bd\66"+
		"\3\2\2\2\u00be\u00c0\t\3\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c5\t\4"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c78\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7-\2\2\u00ca"+
		":\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce>"+
		"\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0@\3\2\2\2\u00d1\u00d2\t\5\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\b!\2\2\u00d4B\3\2\2\2\u00d5\u00d6\7&\2\2\u00d6"+
		"\u00da\7&\2\2\u00d7\u00d9\n\6\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\b\"\2\2\u00deD\3\2\2\2\u00df\u00e0\7\'\2\2"+
		"\u00e0\u00e4\7\'\2\2\u00e1\u00e3\13\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7\'\2\2\u00e8\u00e9\7\'\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\b#\2\2\u00ebF\3\2\2\2\b\2\u00a6\u00c1\u00c6\u00da\u00e4"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}