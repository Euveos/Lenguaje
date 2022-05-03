// Generated from LenguajeDeProgramacion.g4 by ANTLR 4.7.2
package eugenio.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeDeProgramacionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, VOID=4, REY=5, VIVE=6, MUERE=7, DP=8, INVOCACION=9, 
		FIN=10, SUBDITO=11, IF=12, ELSE=13, ELSEIF=14, HECHIZO=15, TRUE=16, FALSE=17, 
		INT=18, AND=19, OR=20, MAY=21, MEN=22, MAYIGU=23, MENIGU=24, IGU=25, DIF=26, 
		ID=27, SUM=28, RES=29, MUL=30, DIV=31, ESPACIOS=32, LINEA=33, BLOQUE=34;
	public static final int
		RULE_programa = 0, RULE_encabezado = 1, RULE_tipodereturn = 2, RULE_contenido = 3, 
		RULE_imprimir = 4, RULE_declarar = 5, RULE_declararasignar = 6, RULE_tipodato = 7, 
		RULE_asignar = 8, RULE_condicional = 9, RULE_condicion = 10, RULE_sino = 11, 
		RULE_sinoentonces = 12, RULE_expr = 13, RULE_mientras = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "encabezado", "tipodereturn", "contenido", "imprimir", "declarar", 
			"declararasignar", "tipodato", "asignar", "condicional", "condicion", 
			"sino", "sinoentonces", "expr", "mientras"
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

	@Override
	public String getGrammarFileName() { return "LenguajeDeProgramacion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeDeProgramacionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public TerminalNode VIVE() { return getToken(LenguajeDeProgramacionParser.VIVE, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode MUERE() { return getToken(LenguajeDeProgramacionParser.MUERE, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			encabezado();
			setState(31);
			match(VIVE);
			setState(32);
			contenido();
			setState(33);
			match(MUERE);
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

	public static class EncabezadoContext extends ParserRuleContext {
		public TipodereturnContext tipodereturn() {
			return getRuleContext(TipodereturnContext.class,0);
		}
		public TerminalNode REY() { return getToken(LenguajeDeProgramacionParser.REY, 0); }
		public List<TerminalNode> DP() { return getTokens(LenguajeDeProgramacionParser.DP); }
		public TerminalNode DP(int i) {
			return getToken(LenguajeDeProgramacionParser.DP, i);
		}
		public EncabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encabezado; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitEncabezado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncabezadoContext encabezado() throws RecognitionException {
		EncabezadoContext _localctx = new EncabezadoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_encabezado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			tipodereturn();
			setState(36);
			match(REY);
			setState(37);
			match(DP);
			setState(38);
			match(DP);
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

	public static class TipodereturnContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(LenguajeDeProgramacionParser.VOID, 0); }
		public TipodereturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipodereturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitTipodereturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipodereturnContext tipodereturn() throws RecognitionException {
		TipodereturnContext _localctx = new TipodereturnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipodereturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(VOID);
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

	public static class ContenidoContext extends ParserRuleContext {
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public List<DeclararContext> declarar() {
			return getRuleContexts(DeclararContext.class);
		}
		public DeclararContext declarar(int i) {
			return getRuleContext(DeclararContext.class,i);
		}
		public List<AsignarContext> asignar() {
			return getRuleContexts(AsignarContext.class);
		}
		public AsignarContext asignar(int i) {
			return getRuleContext(AsignarContext.class,i);
		}
		public List<DeclararasignarContext> declararasignar() {
			return getRuleContexts(DeclararasignarContext.class);
		}
		public DeclararasignarContext declararasignar(int i) {
			return getRuleContext(DeclararasignarContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<MientrasContext> mientras() {
			return getRuleContexts(MientrasContext.class);
		}
		public MientrasContext mientras(int i) {
			return getRuleContext(MientrasContext.class,i);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitContenido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contenido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVOCACION) | (1L << SUBDITO) | (1L << IF) | (1L << HECHIZO) | (1L << ID))) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(42);
					imprimir();
					}
					break;
				case 2:
					{
					setState(43);
					declarar();
					}
					break;
				case 3:
					{
					setState(44);
					asignar();
					}
					break;
				case 4:
					{
					setState(45);
					declararasignar();
					}
					break;
				case 5:
					{
					setState(46);
					condicional();
					}
					break;
				case 6:
					{
					setState(47);
					mientras();
					}
					break;
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ImprimirContext extends ParserRuleContext {
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	 
		public ImprimirContext() { }
		public void copyFrom(ImprimirContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImpresionContext extends ImprimirContext {
		public TerminalNode INVOCACION() { return getToken(LenguajeDeProgramacionParser.INVOCACION, 0); }
		public TerminalNode FIN() { return getToken(LenguajeDeProgramacionParser.FIN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImpresionContext(ImprimirContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_imprimir);
		int _la;
		try {
			_localctx = new ImpresionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(INVOCACION);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INT) | (1L << ID) | (1L << RES))) != 0)) {
				{
				setState(54);
				expr(0);
				}
			}

			setState(57);
			match(FIN);
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

	public static class DeclararContext extends ParserRuleContext {
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
	 
		public DeclararContext() { }
		public void copyFrom(DeclararContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracionContext extends DeclararContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LenguajeDeProgramacionParser.ID, 0); }
		public TerminalNode FIN() { return getToken(LenguajeDeProgramacionParser.FIN, 0); }
		public DeclaracionContext(DeclararContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarar);
		try {
			_localctx = new DeclaracionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			tipodato();
			setState(60);
			match(ID);
			setState(61);
			match(FIN);
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

	public static class DeclararasignarContext extends ParserRuleContext {
		public DeclararasignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararasignar; }
	 
		public DeclararasignarContext() { }
		public void copyFrom(DeclararasignarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclasignarContext extends DeclararasignarContext {
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LenguajeDeProgramacionParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FIN() { return getToken(LenguajeDeProgramacionParser.FIN, 0); }
		public DeclasignarContext(DeclararasignarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitDeclasignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararasignarContext declararasignar() throws RecognitionException {
		DeclararasignarContext _localctx = new DeclararasignarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declararasignar);
		try {
			_localctx = new DeclasignarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			tipodato();
			setState(64);
			match(ID);
			setState(65);
			match(T__0);
			setState(66);
			expr(0);
			setState(67);
			match(FIN);
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

	public static class TipodatoContext extends ParserRuleContext {
		public TerminalNode SUBDITO() { return getToken(LenguajeDeProgramacionParser.SUBDITO, 0); }
		public TipodatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipodato; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitTipodato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipodatoContext tipodato() throws RecognitionException {
		TipodatoContext _localctx = new TipodatoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipodato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(SUBDITO);
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

	public static class AsignarContext extends ParserRuleContext {
		public AsignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignar; }
	 
		public AsignarContext() { }
		public void copyFrom(AsignarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignacionContext extends AsignarContext {
		public TerminalNode ID() { return getToken(LenguajeDeProgramacionParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FIN() { return getToken(LenguajeDeProgramacionParser.FIN, 0); }
		public AsignacionContext(AsignarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarContext asignar() throws RecognitionException {
		AsignarContext _localctx = new AsignarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignar);
		try {
			_localctx = new AsignacionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(72);
			match(T__0);
			setState(73);
			expr(0);
			setState(74);
			match(FIN);
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

	public static class CondicionalContext extends ParserRuleContext {
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	 
		public CondicionalContext() { }
		public void copyFrom(CondicionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicionalesContext extends CondicionalContext {
		public TerminalNode IF() { return getToken(LenguajeDeProgramacionParser.IF, 0); }
		public List<TerminalNode> DP() { return getTokens(LenguajeDeProgramacionParser.DP); }
		public TerminalNode DP(int i) {
			return getToken(LenguajeDeProgramacionParser.DP, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode VIVE() { return getToken(LenguajeDeProgramacionParser.VIVE, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode MUERE() { return getToken(LenguajeDeProgramacionParser.MUERE, 0); }
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public SinoentoncesContext sinoentonces() {
			return getRuleContext(SinoentoncesContext.class,0);
		}
		public CondicionalesContext(CondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitCondicionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicional);
		try {
			_localctx = new CondicionalesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IF);
			setState(77);
			match(DP);
			setState(78);
			condicion(0);
			setState(79);
			match(DP);
			setState(80);
			match(VIVE);
			setState(81);
			contenido();
			setState(82);
			match(MUERE);
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(83);
				sino();
				}
				break;
			case ELSEIF:
				{
				setState(84);
				sinoentonces();
				}
				break;
			case MUERE:
			case INVOCACION:
			case SUBDITO:
			case IF:
			case HECHIZO:
			case ID:
				break;
			default:
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

	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumeroContext extends CondicionContext {
		public TerminalNode INT() { return getToken(LenguajeDeProgramacionParser.INT, 0); }
		public NumeroContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionparentesisContext extends CondicionContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CondicionparentesisContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitCondicionparentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalsoContext extends CondicionContext {
		public TerminalNode FALSE() { return getToken(LenguajeDeProgramacionParser.FALSE, 0); }
		public FalsoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitFalso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YContext extends CondicionContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode AND() { return getToken(LenguajeDeProgramacionParser.AND, 0); }
		public YContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesContext extends CondicionContext {
		public Token ol;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAY() { return getToken(LenguajeDeProgramacionParser.MAY, 0); }
		public TerminalNode MEN() { return getToken(LenguajeDeProgramacionParser.MEN, 0); }
		public TerminalNode IGU() { return getToken(LenguajeDeProgramacionParser.IGU, 0); }
		public TerminalNode DIF() { return getToken(LenguajeDeProgramacionParser.DIF, 0); }
		public TerminalNode MAYIGU() { return getToken(LenguajeDeProgramacionParser.MAYIGU, 0); }
		public TerminalNode MENIGU() { return getToken(LenguajeDeProgramacionParser.MENIGU, 0); }
		public CondicionesContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitCondiciones(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerdaderoContext extends CondicionContext {
		public TerminalNode TRUE() { return getToken(LenguajeDeProgramacionParser.TRUE, 0); }
		public VerdaderoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitVerdadero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntnegcondicionContext extends CondicionContext {
		public TerminalNode RES() { return getToken(LenguajeDeProgramacionParser.RES, 0); }
		public TerminalNode INT() { return getToken(LenguajeDeProgramacionParser.INT, 0); }
		public IntnegcondicionContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitIntnegcondicion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OContext extends CondicionContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode OR() { return getToken(LenguajeDeProgramacionParser.OR, 0); }
		public OContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new CondicionesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				expr(0);
				setState(89);
				((CondicionesContext)_localctx).ol = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAY) | (1L << MEN) | (1L << MAYIGU) | (1L << MENIGU) | (1L << IGU) | (1L << DIF))) != 0)) ) {
					((CondicionesContext)_localctx).ol = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new IntnegcondicionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(RES);
				setState(95);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new NumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new CondicionparentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(T__1);
				setState(98);
				condicion(0);
				setState(99);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new YContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(103);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(104);
						match(AND);
						setState(105);
						condicion(9);
						}
						break;
					case 2:
						{
						_localctx = new OContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(106);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(107);
						match(OR);
						setState(108);
						condicion(8);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class SinoContext extends ParserRuleContext {
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
	 
		public SinoContext() { }
		public void copyFrom(SinoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlanbContext extends SinoContext {
		public TerminalNode ELSE() { return getToken(LenguajeDeProgramacionParser.ELSE, 0); }
		public TerminalNode VIVE() { return getToken(LenguajeDeProgramacionParser.VIVE, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode MUERE() { return getToken(LenguajeDeProgramacionParser.MUERE, 0); }
		public PlanbContext(SinoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitPlanb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sino);
		try {
			_localctx = new PlanbContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ELSE);
			setState(115);
			match(VIVE);
			setState(116);
			contenido();
			setState(117);
			match(MUERE);
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

	public static class SinoentoncesContext extends ParserRuleContext {
		public SinoentoncesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinoentonces; }
	 
		public SinoentoncesContext() { }
		public void copyFrom(SinoentoncesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SinoentonceContext extends SinoentoncesContext {
		public TerminalNode ELSEIF() { return getToken(LenguajeDeProgramacionParser.ELSEIF, 0); }
		public List<TerminalNode> DP() { return getTokens(LenguajeDeProgramacionParser.DP); }
		public TerminalNode DP(int i) {
			return getToken(LenguajeDeProgramacionParser.DP, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode VIVE() { return getToken(LenguajeDeProgramacionParser.VIVE, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode MUERE() { return getToken(LenguajeDeProgramacionParser.MUERE, 0); }
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public SinoentoncesContext sinoentonces() {
			return getRuleContext(SinoentoncesContext.class,0);
		}
		public SinoentonceContext(SinoentoncesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitSinoentonce(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoentoncesContext sinoentonces() throws RecognitionException {
		SinoentoncesContext _localctx = new SinoentoncesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sinoentonces);
		try {
			_localctx = new SinoentonceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ELSEIF);
			setState(120);
			match(DP);
			setState(121);
			condicion(0);
			setState(122);
			match(DP);
			setState(123);
			match(VIVE);
			setState(124);
			contenido();
			setState(125);
			match(MUERE);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(126);
				sino();
				}
				break;
			case ELSEIF:
				{
				setState(127);
				sinoentonces();
				}
				break;
			case MUERE:
			case INVOCACION:
			case SUBDITO:
			case IF:
			case HECHIZO:
			case ID:
				break;
			default:
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(LenguajeDeProgramacionParser.SUM, 0); }
		public TerminalNode RES() { return getToken(LenguajeDeProgramacionParser.RES, 0); }
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntnegativoContext extends ExprContext {
		public TerminalNode RES() { return getToken(LenguajeDeProgramacionParser.RES, 0); }
		public TerminalNode INT() { return getToken(LenguajeDeProgramacionParser.INT, 0); }
		public IntnegativoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitIntnegativo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajeDeProgramacionParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LenguajeDeProgramacionParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LenguajeDeProgramacionParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LenguajeDeProgramacionParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RES:
				{
				_localctx = new IntnegativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131);
				match(RES);
				setState(132);
				match(INT);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(ID);
				}
				break;
			case T__1:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(T__1);
				setState(136);
				expr(0);
				setState(137);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(142);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(145);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==RES) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class MientrasContext extends ParserRuleContext {
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
	 
		public MientrasContext() { }
		public void copyFrom(MientrasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CiclomientrasContext extends MientrasContext {
		public TerminalNode HECHIZO() { return getToken(LenguajeDeProgramacionParser.HECHIZO, 0); }
		public List<TerminalNode> DP() { return getTokens(LenguajeDeProgramacionParser.DP); }
		public TerminalNode DP(int i) {
			return getToken(LenguajeDeProgramacionParser.DP, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode VIVE() { return getToken(LenguajeDeProgramacionParser.VIVE, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode MUERE() { return getToken(LenguajeDeProgramacionParser.MUERE, 0); }
		public CiclomientrasContext(MientrasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitCiclomientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mientras);
		try {
			_localctx = new CiclomientrasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(HECHIZO);
			setState(153);
			match(DP);
			setState(154);
			condicion(0);
			setState(155);
			match(DP);
			setState(156);
			match(VIVE);
			setState(157);
			contenido();
			setState(158);
			match(MUERE);
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
		case 10:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\63\n\5\f\5\16"+
		"\5\66\13\5\3\6\3\6\5\6:\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13X\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\fh\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fp\n\f\f\f\16\fs\13\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0083"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008e\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\2\4\26\34\21\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36\2\5\3\2\27\34\3\2 !\3\2\36\37\2\u00aa\2 \3\2\2\2"+
		"\4%\3\2\2\2\6*\3\2\2\2\b\64\3\2\2\2\n\67\3\2\2\2\f=\3\2\2\2\16A\3\2\2"+
		"\2\20G\3\2\2\2\22I\3\2\2\2\24N\3\2\2\2\26g\3\2\2\2\30t\3\2\2\2\32y\3\2"+
		"\2\2\34\u008d\3\2\2\2\36\u009a\3\2\2\2 !\5\4\3\2!\"\7\b\2\2\"#\5\b\5\2"+
		"#$\7\t\2\2$\3\3\2\2\2%&\5\6\4\2&\'\7\7\2\2\'(\7\n\2\2()\7\n\2\2)\5\3\2"+
		"\2\2*+\7\6\2\2+\7\3\2\2\2,\63\5\n\6\2-\63\5\f\7\2.\63\5\22\n\2/\63\5\16"+
		"\b\2\60\63\5\24\13\2\61\63\5\36\20\2\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2"+
		"\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\t\3\2\2\2\66\64\3\2\2\2\679\7\13\2\28:\5\34\17\298\3"+
		"\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\f\2\2<\13\3\2\2\2=>\5\20\t\2>?\7\35\2\2"+
		"?@\7\f\2\2@\r\3\2\2\2AB\5\20\t\2BC\7\35\2\2CD\7\3\2\2DE\5\34\17\2EF\7"+
		"\f\2\2F\17\3\2\2\2GH\7\r\2\2H\21\3\2\2\2IJ\7\35\2\2JK\7\3\2\2KL\5\34\17"+
		"\2LM\7\f\2\2M\23\3\2\2\2NO\7\16\2\2OP\7\n\2\2PQ\5\26\f\2QR\7\n\2\2RS\7"+
		"\b\2\2ST\5\b\5\2TW\7\t\2\2UX\5\30\r\2VX\5\32\16\2WU\3\2\2\2WV\3\2\2\2"+
		"WX\3\2\2\2X\25\3\2\2\2YZ\b\f\1\2Z[\5\34\17\2[\\\t\2\2\2\\]\5\34\17\2]"+
		"h\3\2\2\2^h\7\22\2\2_h\7\23\2\2`a\7\37\2\2ah\7\24\2\2bh\7\24\2\2cd\7\4"+
		"\2\2de\5\26\f\2ef\7\5\2\2fh\3\2\2\2gY\3\2\2\2g^\3\2\2\2g_\3\2\2\2g`\3"+
		"\2\2\2gb\3\2\2\2gc\3\2\2\2hq\3\2\2\2ij\f\n\2\2jk\7\25\2\2kp\5\26\f\13"+
		"lm\f\t\2\2mn\7\26\2\2np\5\26\f\noi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2r\27\3\2\2\2sq\3\2\2\2tu\7\17\2\2uv\7\b\2\2vw\5\b\5\2wx\7"+
		"\t\2\2x\31\3\2\2\2yz\7\20\2\2z{\7\n\2\2{|\5\26\f\2|}\7\n\2\2}~\7\b\2\2"+
		"~\177\5\b\5\2\177\u0082\7\t\2\2\u0080\u0083\5\30\r\2\u0081\u0083\5\32"+
		"\16\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\33\3\2\2\2\u0084\u0085\b\17\1\2\u0085\u0086\7\37\2\2\u0086\u008e\7\24"+
		"\2\2\u0087\u008e\7\24\2\2\u0088\u008e\7\35\2\2\u0089\u008a\7\4\2\2\u008a"+
		"\u008b\5\34\17\2\u008b\u008c\7\5\2\2\u008c\u008e\3\2\2\2\u008d\u0084\3"+
		"\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008e"+
		"\u0097\3\2\2\2\u008f\u0090\f\b\2\2\u0090\u0091\t\3\2\2\u0091\u0096\5\34"+
		"\17\t\u0092\u0093\f\7\2\2\u0093\u0094\t\4\2\2\u0094\u0096\5\34\17\b\u0095"+
		"\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\35\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b"+
		"\7\21\2\2\u009b\u009c\7\n\2\2\u009c\u009d\5\26\f\2\u009d\u009e\7\n\2\2"+
		"\u009e\u009f\7\b\2\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\7\t\2\2\u00a1\37"+
		"\3\2\2\2\r\62\649Wgoq\u0082\u008d\u0095\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}