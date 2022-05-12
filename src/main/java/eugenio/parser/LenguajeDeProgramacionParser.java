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
		T__0=1, T__1=2, T__2=3, VOID=4, PUEBLO=5, CASTILLO=6, MUNDO=7, REY=8, 
		VIVE=9, MUERE=10, DP=11, INVOCACION=12, FIN=13, SUBDITO=14, IF=15, ELSE=16, 
		ELSEIF=17, HECHIZO=18, TRUE=19, FALSE=20, INT=21, AND=22, OR=23, MAY=24, 
		MEN=25, MAYIGU=26, MENIGU=27, IGU=28, DIF=29, ID=30, SUM=31, RES=32, MUL=33, 
		DIV=34, STRING=35, ESPACIOS=36, LINEA=37, BLOQUE=38;
	public static final int
		RULE_programa = 0, RULE_clase = 1, RULE_encabezado = 2, RULE_cierremetodo = 3, 
		RULE_cierreclase = 4, RULE_tipodereturn = 5, RULE_contenido = 6, RULE_imprimir = 7, 
		RULE_impresiones = 8, RULE_declarar = 9, RULE_declararasignar = 10, RULE_tipodato = 11, 
		RULE_asignar = 12, RULE_condicional = 13, RULE_condicion = 14, RULE_sino = 15, 
		RULE_sinoentonces = 16, RULE_expr = 17, RULE_mientras = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "clase", "encabezado", "cierremetodo", "cierreclase", "tipodereturn", 
			"contenido", "imprimir", "impresiones", "declarar", "declararasignar", 
			"tipodato", "asignar", "condicional", "condicion", "sino", "sinoentonces", 
			"expr", "mientras"
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
		public ClaseContext clase() {
			return getRuleContext(ClaseContext.class,0);
		}
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public CierremetodoContext cierremetodo() {
			return getRuleContext(CierremetodoContext.class,0);
		}
		public CierreclaseContext cierreclase() {
			return getRuleContext(CierreclaseContext.class,0);
		}
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
			setState(38);
			clase();
			setState(39);
			encabezado();
			setState(40);
			contenido();
			setState(41);
			cierremetodo();
			setState(42);
			cierreclase();
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

	public static class ClaseContext extends ParserRuleContext {
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
	 
		public ClaseContext() { }
		public void copyFrom(ClaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EncabezadoclaseContext extends ClaseContext {
		public TerminalNode PUEBLO() { return getToken(LenguajeDeProgramacionParser.PUEBLO, 0); }
		public TerminalNode CASTILLO() { return getToken(LenguajeDeProgramacionParser.CASTILLO, 0); }
		public TerminalNode ID() { return getToken(LenguajeDeProgramacionParser.ID, 0); }
		public TerminalNode VIVE() { return getToken(LenguajeDeProgramacionParser.VIVE, 0); }
		public EncabezadoclaseContext(ClaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitEncabezadoclase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clase);
		try {
			_localctx = new EncabezadoclaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PUEBLO);
			setState(45);
			match(CASTILLO);
			setState(46);
			match(ID);
			setState(47);
			match(VIVE);
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
		public TerminalNode PUEBLO() { return getToken(LenguajeDeProgramacionParser.PUEBLO, 0); }
		public TipodereturnContext tipodereturn() {
			return getRuleContext(TipodereturnContext.class,0);
		}
		public TerminalNode REY() { return getToken(LenguajeDeProgramacionParser.REY, 0); }
		public List<TerminalNode> DP() { return getTokens(LenguajeDeProgramacionParser.DP); }
		public TerminalNode DP(int i) {
			return getToken(LenguajeDeProgramacionParser.DP, i);
		}
		public TerminalNode VIVE() { return getToken(LenguajeDeProgramacionParser.VIVE, 0); }
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
		enterRule(_localctx, 4, RULE_encabezado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(PUEBLO);
			setState(50);
			tipodereturn();
			setState(51);
			match(REY);
			setState(52);
			match(DP);
			setState(53);
			match(DP);
			setState(54);
			match(VIVE);
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

	public static class CierremetodoContext extends ParserRuleContext {
		public CierremetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cierremetodo; }
	 
		public CierremetodoContext() { }
		public void copyFrom(CierremetodoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CerrarmetodoContext extends CierremetodoContext {
		public TerminalNode MUERE() { return getToken(LenguajeDeProgramacionParser.MUERE, 0); }
		public CerrarmetodoContext(CierremetodoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitCerrarmetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CierremetodoContext cierremetodo() throws RecognitionException {
		CierremetodoContext _localctx = new CierremetodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cierremetodo);
		try {
			_localctx = new CerrarmetodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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

	public static class CierreclaseContext extends ParserRuleContext {
		public CierreclaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cierreclase; }
	 
		public CierreclaseContext() { }
		public void copyFrom(CierreclaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CerrarclaseContext extends CierreclaseContext {
		public TerminalNode MUERE() { return getToken(LenguajeDeProgramacionParser.MUERE, 0); }
		public CerrarclaseContext(CierreclaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitCerrarclase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CierreclaseContext cierreclase() throws RecognitionException {
		CierreclaseContext _localctx = new CierreclaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cierreclase);
		try {
			_localctx = new CerrarclaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
		enterRule(_localctx, 10, RULE_tipodereturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
		enterRule(_localctx, 12, RULE_contenido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVOCACION) | (1L << SUBDITO) | (1L << IF) | (1L << HECHIZO) | (1L << ID))) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(62);
					imprimir();
					}
					break;
				case 2:
					{
					setState(63);
					declarar();
					}
					break;
				case 3:
					{
					setState(64);
					asignar();
					}
					break;
				case 4:
					{
					setState(65);
					declararasignar();
					}
					break;
				case 5:
					{
					setState(66);
					condicional();
					}
					break;
				case 6:
					{
					setState(67);
					mientras();
					}
					break;
				}
				}
				setState(72);
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
		public List<TerminalNode> DP() { return getTokens(LenguajeDeProgramacionParser.DP); }
		public TerminalNode DP(int i) {
			return getToken(LenguajeDeProgramacionParser.DP, i);
		}
		public TerminalNode FIN() { return getToken(LenguajeDeProgramacionParser.FIN, 0); }
		public ImpresionesContext impresiones() {
			return getRuleContext(ImpresionesContext.class,0);
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
		enterRule(_localctx, 14, RULE_imprimir);
		int _la;
		try {
			_localctx = new ImpresionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(INVOCACION);
			setState(74);
			match(DP);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INT) | (1L << ID) | (1L << RES) | (1L << STRING))) != 0)) {
				{
				setState(75);
				impresiones();
				}
			}

			setState(78);
			match(DP);
			setState(79);
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

	public static class ImpresionesContext extends ParserRuleContext {
		public ImpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresiones; }
	 
		public ImpresionesContext() { }
		public void copyFrom(ImpresionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImprimirexprContext extends ImpresionesContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImprimirexprContext(ImpresionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitImprimirexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImprimirstringContext extends ImpresionesContext {
		public TerminalNode STRING() { return getToken(LenguajeDeProgramacionParser.STRING, 0); }
		public ImprimirstringContext(ImpresionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitImprimirstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionesContext impresiones() throws RecognitionException {
		ImpresionesContext _localctx = new ImpresionesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_impresiones);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case INT:
			case ID:
			case RES:
				_localctx = new ImprimirexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				expr(0);
				}
				break;
			case STRING:
				_localctx = new ImprimirstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(STRING);
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
		enterRule(_localctx, 18, RULE_declarar);
		try {
			_localctx = new DeclaracionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			tipodato();
			setState(86);
			match(ID);
			setState(87);
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
		enterRule(_localctx, 20, RULE_declararasignar);
		try {
			_localctx = new DeclasignarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			tipodato();
			setState(90);
			match(ID);
			setState(91);
			match(T__0);
			setState(92);
			expr(0);
			setState(93);
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
		enterRule(_localctx, 22, RULE_tipodato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		enterRule(_localctx, 24, RULE_asignar);
		try {
			_localctx = new AsignacionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
			setState(98);
			match(T__0);
			setState(99);
			expr(0);
			setState(100);
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
		enterRule(_localctx, 26, RULE_condicional);
		try {
			_localctx = new CondicionalesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF);
			setState(103);
			match(DP);
			setState(104);
			condicion(0);
			setState(105);
			match(DP);
			setState(106);
			match(VIVE);
			setState(107);
			contenido();
			setState(108);
			match(MUERE);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(109);
				sino();
				}
				break;
			case ELSEIF:
				{
				setState(110);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new CondicionesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(114);
				expr(0);
				setState(115);
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
				setState(116);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new IntnegcondicionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(RES);
				setState(121);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new NumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new CondicionparentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__1);
				setState(124);
				condicion(0);
				setState(125);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new YContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(129);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(130);
						match(AND);
						setState(131);
						condicion(9);
						}
						break;
					case 2:
						{
						_localctx = new OContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(132);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(133);
						match(OR);
						setState(134);
						condicion(8);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 30, RULE_sino);
		try {
			_localctx = new PlanbContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ELSE);
			setState(141);
			match(VIVE);
			setState(142);
			contenido();
			setState(143);
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
		enterRule(_localctx, 32, RULE_sinoentonces);
		try {
			_localctx = new SinoentonceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ELSEIF);
			setState(146);
			match(DP);
			setState(147);
			condicion(0);
			setState(148);
			match(DP);
			setState(149);
			match(VIVE);
			setState(150);
			contenido();
			setState(151);
			match(MUERE);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(152);
				sino();
				}
				break;
			case ELSEIF:
				{
				setState(153);
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
	public static class IncrementarContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajeDeProgramacionParser.ID, 0); }
		public List<TerminalNode> SUM() { return getTokens(LenguajeDeProgramacionParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(LenguajeDeProgramacionParser.SUM, i);
		}
		public IncrementarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitIncrementar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementarContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajeDeProgramacionParser.ID, 0); }
		public List<TerminalNode> RES() { return getTokens(LenguajeDeProgramacionParser.RES); }
		public TerminalNode RES(int i) {
			return getToken(LenguajeDeProgramacionParser.RES, i);
		}
		public DecrementarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDeProgramacionVisitor ) return ((LenguajeDeProgramacionVisitor<? extends T>)visitor).visitDecrementar(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new IntnegativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(157);
				match(RES);
				setState(158);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new IncrementarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(ID);
				setState(160);
				match(SUM);
				setState(161);
				match(SUM);
				}
				break;
			case 3:
				{
				_localctx = new DecrementarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(ID);
				setState(163);
				match(RES);
				setState(164);
				match(RES);
				}
				break;
			case 4:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__1);
				setState(168);
				expr(0);
				setState(169);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(174);
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
						setState(175);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(177);
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
						setState(178);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 36, RULE_mientras);
		try {
			_localctx = new CiclomientrasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(HECHIZO);
			setState(185);
			match(DP);
			setState(186);
			condicion(0);
			setState(187);
			match(DP);
			setState(188);
			match(VIVE);
			setState(189);
			contenido();
			setState(190);
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
		case 14:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 17:
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
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\bG\n\b\f\b\16\bJ\13\b\3\t\3\t\3\t\5\tO\n\t\3\t\3\t\3\t\3\n\3\n\5\n"+
		"V\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17r\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0082\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u008a\n\20\f\20\16"+
		"\20\u008d\13\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u009d\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ae\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00b6\n\23\f\23\16\23\u00b9\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\2\4\36$\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\5\3\2\32\37\3\2#$\3\2!\"\2\u00c9\2(\3\2\2\2\4.\3\2\2\2\6"+
		"\63\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\f>\3\2\2\2\16H\3\2\2\2\20K\3\2\2\2\22"+
		"U\3\2\2\2\24W\3\2\2\2\26[\3\2\2\2\30a\3\2\2\2\32c\3\2\2\2\34h\3\2\2\2"+
		"\36\u0081\3\2\2\2 \u008e\3\2\2\2\"\u0093\3\2\2\2$\u00ad\3\2\2\2&\u00ba"+
		"\3\2\2\2()\5\4\3\2)*\5\6\4\2*+\5\16\b\2+,\5\b\5\2,-\5\n\6\2-\3\3\2\2\2"+
		"./\7\7\2\2/\60\7\b\2\2\60\61\7 \2\2\61\62\7\13\2\2\62\5\3\2\2\2\63\64"+
		"\7\7\2\2\64\65\5\f\7\2\65\66\7\n\2\2\66\67\7\r\2\2\678\7\r\2\289\7\13"+
		"\2\29\7\3\2\2\2:;\7\f\2\2;\t\3\2\2\2<=\7\f\2\2=\13\3\2\2\2>?\7\6\2\2?"+
		"\r\3\2\2\2@G\5\20\t\2AG\5\24\13\2BG\5\32\16\2CG\5\26\f\2DG\5\34\17\2E"+
		"G\5&\24\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2"+
		"GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\17\3\2\2\2JH\3\2\2\2KL\7\16\2\2LN\7\r"+
		"\2\2MO\5\22\n\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\r\2\2QR\7\17\2\2R\21"+
		"\3\2\2\2SV\5$\23\2TV\7%\2\2US\3\2\2\2UT\3\2\2\2V\23\3\2\2\2WX\5\30\r\2"+
		"XY\7 \2\2YZ\7\17\2\2Z\25\3\2\2\2[\\\5\30\r\2\\]\7 \2\2]^\7\3\2\2^_\5$"+
		"\23\2_`\7\17\2\2`\27\3\2\2\2ab\7\20\2\2b\31\3\2\2\2cd\7 \2\2de\7\3\2\2"+
		"ef\5$\23\2fg\7\17\2\2g\33\3\2\2\2hi\7\21\2\2ij\7\r\2\2jk\5\36\20\2kl\7"+
		"\r\2\2lm\7\13\2\2mn\5\16\b\2nq\7\f\2\2or\5 \21\2pr\5\"\22\2qo\3\2\2\2"+
		"qp\3\2\2\2qr\3\2\2\2r\35\3\2\2\2st\b\20\1\2tu\5$\23\2uv\t\2\2\2vw\5$\23"+
		"\2w\u0082\3\2\2\2x\u0082\7\25\2\2y\u0082\7\26\2\2z{\7\"\2\2{\u0082\7\27"+
		"\2\2|\u0082\7\27\2\2}~\7\4\2\2~\177\5\36\20\2\177\u0080\7\5\2\2\u0080"+
		"\u0082\3\2\2\2\u0081s\3\2\2\2\u0081x\3\2\2\2\u0081y\3\2\2\2\u0081z\3\2"+
		"\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0082\u008b\3\2\2\2\u0083\u0084\f\n"+
		"\2\2\u0084\u0085\7\30\2\2\u0085\u008a\5\36\20\13\u0086\u0087\f\t\2\2\u0087"+
		"\u0088\7\31\2\2\u0088\u008a\5\36\20\n\u0089\u0083\3\2\2\2\u0089\u0086"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\37\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\22\2\2\u008f\u0090\7\13"+
		"\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\f\2\2\u0092!\3\2\2\2\u0093\u0094"+
		"\7\23\2\2\u0094\u0095\7\r\2\2\u0095\u0096\5\36\20\2\u0096\u0097\7\r\2"+
		"\2\u0097\u0098\7\13\2\2\u0098\u0099\5\16\b\2\u0099\u009c\7\f\2\2\u009a"+
		"\u009d\5 \21\2\u009b\u009d\5\"\22\2\u009c\u009a\3\2\2\2\u009c\u009b\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d#\3\2\2\2\u009e\u009f\b\23\1\2\u009f\u00a0"+
		"\7\"\2\2\u00a0\u00ae\7\27\2\2\u00a1\u00a2\7 \2\2\u00a2\u00a3\7!\2\2\u00a3"+
		"\u00ae\7!\2\2\u00a4\u00a5\7 \2\2\u00a5\u00a6\7\"\2\2\u00a6\u00ae\7\"\2"+
		"\2\u00a7\u00ae\7\27\2\2\u00a8\u00ae\7 \2\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab"+
		"\5$\23\2\u00ab\u00ac\7\5\2\2\u00ac\u00ae\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad"+
		"\u00a1\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2"+
		"\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00b7\3\2\2\2\u00af\u00b0\f\n\2\2\u00b0"+
		"\u00b1\t\3\2\2\u00b1\u00b6\5$\23\13\u00b2\u00b3\f\t\2\2\u00b3\u00b4\t"+
		"\4\2\2\u00b4\u00b6\5$\23\n\u00b5\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8%\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\24\2\2\u00bb\u00bc\7\r\2\2\u00bc\u00bd"+
		"\5\36\20\2\u00bd\u00be\7\r\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c0\5\16\b"+
		"\2\u00c0\u00c1\7\f\2\2\u00c1\'\3\2\2\2\16FHNUq\u0081\u0089\u008b\u009c"+
		"\u00ad\u00b5\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}