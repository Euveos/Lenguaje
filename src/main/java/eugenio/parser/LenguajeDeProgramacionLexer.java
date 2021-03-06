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
		T__0=1, T__1=2, T__2=3, VOID=4, PUEBLO=5, CASTILLO=6, MUNDO=7, REY=8, 
		VIVE=9, MUERE=10, DP=11, INVOCACION=12, FIN=13, SUBDITO=14, IF=15, ELSE=16, 
		ELSEIF=17, HECHIZO=18, TRUE=19, FALSE=20, INT=21, AND=22, OR=23, MAY=24, 
		MEN=25, MAYIGU=26, MENIGU=27, IGU=28, DIF=29, ID=30, SUM=31, RES=32, MUL=33, 
		DIV=34, STRING=35, ESPACIOS=36, LINEA=37, BLOQUE=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "VOID", "PUEBLO", "CASTILLO", "MUNDO", "REY", 
			"VIVE", "MUERE", "DP", "INVOCACION", "FIN", "SUBDITO", "IF", "ELSE", 
			"ELSEIF", "HECHIZO", "TRUE", "FALSE", "INT", "AND", "OR", "MAY", "MEN", 
			"MAYIGU", "MENIGU", "IGU", "DIF", "ID", "SUM", "RES", "MUL", "DIV", "STRING", 
			"ESPACIOS", "LINEA", "BLOQUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'verdugo'", "'pueblo'", "'castillo'", "'mundo'", 
			"'rey'", "'['", "']'", "':'", "'invocacion'", "'!'", "'subdito'", "'juicio'", 
			"'ejecucion'", "'sentencia'", "'hechizo'", "'cuerdo'", "'loco'", null, 
			"'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", null, "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "VOID", "PUEBLO", "CASTILLO", "MUNDO", "REY", 
			"VIVE", "MUERE", "DP", "INVOCACION", "FIN", "SUBDITO", "IF", "ELSE", 
			"ELSEIF", "HECHIZO", "TRUE", "FALSE", "INT", "AND", "OR", "MAY", "MEN", 
			"MAYIGU", "MENIGU", "IGU", "DIF", "ID", "SUM", "RES", "MUL", "DIV", "STRING", 
			"ESPACIOS", "LINEA", "BLOQUE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\6\26\u00c3\n\26\r\26\16\26\u00c4\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\6\37\u00de\n\37\r\37\16\37\u00df\3\37\7\37\u00e3\n\37\f"+
		"\37\16\37\u00e6\13\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\7$\u00f4\n"+
		"$\f$\16$\u00f7\13$\3$\3$\3%\3%\3%\3%\3&\3&\3&\7&\u0102\n&\f&\16&\u0105"+
		"\13&\3&\3&\3\'\3\'\3\'\7\'\u010c\n\'\f\'\16\'\u010f\13\'\3\'\3\'\3\'\3"+
		"\'\3\'\4\u00f5\u010d\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\7\3\2\62;\4\2C\\c|\5\2"+
		"\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u011b\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13]\3\2\2\2"+
		"\rd\3\2\2\2\17m\3\2\2\2\21s\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27{\3\2\2"+
		"\2\31}\3\2\2\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37\u0092\3\2\2\2!\u0099"+
		"\3\2\2\2#\u00a3\3\2\2\2%\u00ad\3\2\2\2\'\u00b5\3\2\2\2)\u00bc\3\2\2\2"+
		"+\u00c2\3\2\2\2-\u00c6\3\2\2\2/\u00c9\3\2\2\2\61\u00cc\3\2\2\2\63\u00ce"+
		"\3\2\2\2\65\u00d0\3\2\2\2\67\u00d3\3\2\2\29\u00d6\3\2\2\2;\u00d9\3\2\2"+
		"\2=\u00dd\3\2\2\2?\u00e7\3\2\2\2A\u00e9\3\2\2\2C\u00eb\3\2\2\2E\u00ed"+
		"\3\2\2\2G\u00ef\3\2\2\2I\u00fa\3\2\2\2K\u00fe\3\2\2\2M\u0108\3\2\2\2O"+
		"P\7?\2\2P\4\3\2\2\2QR\7*\2\2R\6\3\2\2\2ST\7+\2\2T\b\3\2\2\2UV\7x\2\2V"+
		"W\7g\2\2WX\7t\2\2XY\7f\2\2YZ\7w\2\2Z[\7i\2\2[\\\7q\2\2\\\n\3\2\2\2]^\7"+
		"r\2\2^_\7w\2\2_`\7g\2\2`a\7d\2\2ab\7n\2\2bc\7q\2\2c\f\3\2\2\2de\7e\2\2"+
		"ef\7c\2\2fg\7u\2\2gh\7v\2\2hi\7k\2\2ij\7n\2\2jk\7n\2\2kl\7q\2\2l\16\3"+
		"\2\2\2mn\7o\2\2no\7w\2\2op\7p\2\2pq\7f\2\2qr\7q\2\2r\20\3\2\2\2st\7t\2"+
		"\2tu\7g\2\2uv\7{\2\2v\22\3\2\2\2wx\7]\2\2x\24\3\2\2\2yz\7_\2\2z\26\3\2"+
		"\2\2{|\7<\2\2|\30\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7x\2\2\u0080"+
		"\u0081\7q\2\2\u0081\u0082\7e\2\2\u0082\u0083\7c\2\2\u0083\u0084\7e\2\2"+
		"\u0084\u0085\7k\2\2\u0085\u0086\7q\2\2\u0086\u0087\7p\2\2\u0087\32\3\2"+
		"\2\2\u0088\u0089\7#\2\2\u0089\34\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c"+
		"\7w\2\2\u008c\u008d\7d\2\2\u008d\u008e\7f\2\2\u008e\u008f\7k\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7q\2\2\u0091\36\3\2\2\2\u0092\u0093\7l\2\2\u0093"+
		"\u0094\7w\2\2\u0094\u0095\7k\2\2\u0095\u0096\7e\2\2\u0096\u0097\7k\2\2"+
		"\u0097\u0098\7q\2\2\u0098 \3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7l\2"+
		"\2\u009b\u009c\7g\2\2\u009c\u009d\7e\2\2\u009d\u009e\7w\2\2\u009e\u009f"+
		"\7e\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7p\2\2\u00a2"+
		"\"\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7e\2\2"+
		"\u00aa\u00ab\7k\2\2\u00ab\u00ac\7c\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7j\2"+
		"\2\u00ae\u00af\7g\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2"+
		"\7k\2\2\u00b2\u00b3\7|\2\2\u00b3\u00b4\7q\2\2\u00b4&\3\2\2\2\u00b5\u00b6"+
		"\7e\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7f\2\2\u00ba\u00bb\7q\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7q\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7q\2\2\u00c0*\3\2\2\2\u00c1"+
		"\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8"+
		"\7(\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7~\2\2\u00ca\u00cb\7~\2\2\u00cb\60"+
		"\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf"+
		"\64\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1\u00d2\7?\2\2\u00d2\66\3\2\2\2\u00d3"+
		"\u00d4\7>\2\2\u00d4\u00d5\7?\2\2\u00d58\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7"+
		"\u00d8\7?\2\2\u00d8:\3\2\2\2\u00d9\u00da\7#\2\2\u00da\u00db\7?\2\2\u00db"+
		"<\3\2\2\2\u00dc\u00de\t\3\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3"+
		"\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5>\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7-\2\2\u00e8"+
		"@\3\2\2\2\u00e9\u00ea\7/\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7,\2\2\u00ecD"+
		"\3\2\2\2\u00ed\u00ee\7\61\2\2\u00eeF\3\2\2\2\u00ef\u00f5\7$\2\2\u00f0"+
		"\u00f1\7^\2\2\u00f1\u00f4\7$\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f0\3\2"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7$"+
		"\2\2\u00f9H\3\2\2\2\u00fa\u00fb\t\5\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\b%\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7&\2\2\u00ff\u0103\7&\2\2\u0100\u0102"+
		"\n\6\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\b&"+
		"\2\2\u0107L\3\2\2\2\u0108\u0109\7\'\2\2\u0109\u010d\7\'\2\2\u010a\u010c"+
		"\13\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010e\3\2\2\2"+
		"\u010d\u010b\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111"+
		"\7\'\2\2\u0111\u0112\7\'\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b\'\2\2\u0114"+
		"N\3\2\2\2\n\2\u00c4\u00df\u00e4\u00f3\u00f5\u0103\u010d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}