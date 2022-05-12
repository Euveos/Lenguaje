// Generated from LenguajeC.g4 by ANTLR 4.7.2
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
public class LenguajeCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, VOID=3, MAIN=4, PA=5, PC=6, LLA=7, LLC=8, IGUAL=9, 
		SEMI=10, DC=11, ELSEIF=12, IF=13, ELSE=14, WHILE=15, AND=16, OR=17, MAY=18, 
		MEN=19, MAYIGU=20, MENIGU=21, IGU=22, DIF=23, TRUE=24, FALSE=25, ENTERO=26, 
		IMPRIMIR=27, INT=28, ID=29, SUM=30, RES=31, MUL=32, DIV=33, STRING=34, 
		ESPACIOS=35, LINEA=36, BLOQUE=37;
	public static final int
		RULE_programa = 0, RULE_clase = 1, RULE_inicio = 2, RULE_fin = 3, RULE_finclase = 4, 
		RULE_encabezado = 5, RULE_contenido = 6, RULE_declarar = 7, RULE_declararasignar = 8, 
		RULE_imprimir = 9, RULE_impresiones = 10, RULE_asignar = 11, RULE_condicional = 12, 
		RULE_condicion = 13, RULE_sino = 14, RULE_sinoentonces = 15, RULE_expr = 16, 
		RULE_mientras = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "clase", "inicio", "fin", "finclase", "encabezado", "contenido", 
			"declarar", "declararasignar", "imprimir", "impresiones", "asignar", 
			"condicional", "condicion", "sino", "sinoentonces", "expr", "mientras"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'void'", "'main'", "'('", "')'", "'{'", 
			"'}'", "'='", "';'", "'\"'", "'else if'", "'if'", "'else'", "'while'", 
			"'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'true'", 
			"'false'", "'int'", "'printf'", null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "VOID", "MAIN", "PA", "PC", "LLA", "LLC", "IGUAL", 
			"SEMI", "DC", "ELSEIF", "IF", "ELSE", "WHILE", "AND", "OR", "MAY", "MEN", 
			"MAYIGU", "MENIGU", "IGU", "DIF", "TRUE", "FALSE", "ENTERO", "IMPRIMIR", 
			"INT", "ID", "SUM", "RES", "MUL", "DIV", "STRING", "ESPACIOS", "LINEA", 
			"BLOQUE"
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
	public String getGrammarFileName() { return "LenguajeC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public ClaseContext clase() {
			return getRuleContext(ClaseContext.class,0);
		}
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public FinContext fin() {
			return getRuleContext(FinContext.class,0);
		}
		public FinclaseContext finclase() {
			return getRuleContext(FinclaseContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			clase();
			setState(37);
			inicio();
			setState(38);
			encabezado();
			setState(39);
			inicio();
			setState(40);
			contenido();
			setState(41);
			fin();
			setState(42);
			finclase();
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
		public TerminalNode PUBLIC() { return getToken(LenguajeCParser.PUBLIC, 0); }
		public TerminalNode CLASS() { return getToken(LenguajeCParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(LenguajeCParser.ID, 0); }
		public EncabezadoclaseContext(ClaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitEncabezadoclase(this);
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
			match(PUBLIC);
			setState(45);
			match(CLASS);
			setState(46);
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

	public static class InicioContext extends ParserRuleContext {
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	 
		public InicioContext() { }
		public void copyFrom(InicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IniciarContext extends InicioContext {
		public TerminalNode LLA() { return getToken(LenguajeCParser.LLA, 0); }
		public IniciarContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitIniciar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicio);
		try {
			_localctx = new IniciarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(LLA);
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

	public static class FinContext extends ParserRuleContext {
		public FinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin; }
	 
		public FinContext() { }
		public void copyFrom(FinContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FinalizarContext extends FinContext {
		public TerminalNode LLC() { return getToken(LenguajeCParser.LLC, 0); }
		public FinalizarContext(FinContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitFinalizar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinContext fin() throws RecognitionException {
		FinContext _localctx = new FinContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fin);
		try {
			_localctx = new FinalizarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LLC);
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

	public static class FinclaseContext extends ParserRuleContext {
		public FinclaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finclase; }
	 
		public FinclaseContext() { }
		public void copyFrom(FinclaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FinalizarclaseContext extends FinclaseContext {
		public TerminalNode LLC() { return getToken(LenguajeCParser.LLC, 0); }
		public FinalizarclaseContext(FinclaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitFinalizarclase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinclaseContext finclase() throws RecognitionException {
		FinclaseContext _localctx = new FinclaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_finclase);
		try {
			_localctx = new FinalizarclaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LLC);
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
		public EncabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encabezado; }
	 
		public EncabezadoContext() { }
		public void copyFrom(EncabezadoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EncabezarContext extends EncabezadoContext {
		public TerminalNode PUBLIC() { return getToken(LenguajeCParser.PUBLIC, 0); }
		public TerminalNode VOID() { return getToken(LenguajeCParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(LenguajeCParser.MAIN, 0); }
		public TerminalNode PA() { return getToken(LenguajeCParser.PA, 0); }
		public TerminalNode PC() { return getToken(LenguajeCParser.PC, 0); }
		public EncabezarContext(EncabezadoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitEncabezar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncabezadoContext encabezado() throws RecognitionException {
		EncabezadoContext _localctx = new EncabezadoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_encabezado);
		try {
			_localctx = new EncabezarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PUBLIC);
			setState(55);
			match(VOID);
			setState(56);
			match(MAIN);
			setState(57);
			match(PA);
			setState(58);
			match(PC);
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
		public List<DeclararContext> declarar() {
			return getRuleContexts(DeclararContext.class);
		}
		public DeclararContext declarar(int i) {
			return getRuleContext(DeclararContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
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
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitContenido(this);
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
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << ENTERO) | (1L << IMPRIMIR) | (1L << ID))) != 0)) {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					declarar();
					}
					break;
				case 2:
					{
					setState(61);
					imprimir();
					}
					break;
				case 3:
					{
					setState(62);
					asignar();
					}
					break;
				case 4:
					{
					setState(63);
					declararasignar();
					}
					break;
				case 5:
					{
					setState(64);
					condicional();
					}
					break;
				case 6:
					{
					setState(65);
					mientras();
					}
					break;
				}
				}
				setState(70);
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
		public TerminalNode ENTERO() { return getToken(LenguajeCParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(LenguajeCParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(LenguajeCParser.SEMI, 0); }
		public DeclaracionContext(DeclararContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarar);
		try {
			_localctx = new DeclaracionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ENTERO);
			setState(72);
			match(ID);
			setState(73);
			match(SEMI);
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
		public TerminalNode ENTERO() { return getToken(LenguajeCParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(LenguajeCParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeCParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LenguajeCParser.SEMI, 0); }
		public DeclasignarContext(DeclararasignarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitDeclasignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararasignarContext declararasignar() throws RecognitionException {
		DeclararasignarContext _localctx = new DeclararasignarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declararasignar);
		try {
			_localctx = new DeclasignarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ENTERO);
			setState(76);
			match(ID);
			setState(77);
			match(IGUAL);
			setState(78);
			expr(0);
			setState(79);
			match(SEMI);
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
		public TerminalNode IMPRIMIR() { return getToken(LenguajeCParser.IMPRIMIR, 0); }
		public TerminalNode PA() { return getToken(LenguajeCParser.PA, 0); }
		public TerminalNode PC() { return getToken(LenguajeCParser.PC, 0); }
		public TerminalNode SEMI() { return getToken(LenguajeCParser.SEMI, 0); }
		public ImpresionesContext impresiones() {
			return getRuleContext(ImpresionesContext.class,0);
		}
		public ImpresionContext(ImprimirContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_imprimir);
		int _la;
		try {
			_localctx = new ImpresionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IMPRIMIR);
			setState(82);
			match(PA);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << INT) | (1L << ID) | (1L << RES) | (1L << STRING))) != 0)) {
				{
				setState(83);
				impresiones();
				}
			}

			setState(86);
			match(PC);
			setState(87);
			match(SEMI);
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
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitImprimirexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImprimirstringContext extends ImpresionesContext {
		public TerminalNode STRING() { return getToken(LenguajeCParser.STRING, 0); }
		public ImprimirstringContext(ImpresionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitImprimirstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionesContext impresiones() throws RecognitionException {
		ImpresionesContext _localctx = new ImpresionesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_impresiones);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case INT:
			case ID:
			case RES:
				_localctx = new ImprimirexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				expr(0);
				}
				break;
			case STRING:
				_localctx = new ImprimirstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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
		public TerminalNode ID() { return getToken(LenguajeCParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeCParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LenguajeCParser.SEMI, 0); }
		public AsignacionContext(AsignarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarContext asignar() throws RecognitionException {
		AsignarContext _localctx = new AsignarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignar);
		try {
			_localctx = new AsignacionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(94);
			match(IGUAL);
			setState(95);
			expr(0);
			setState(96);
			match(SEMI);
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
		public TerminalNode IF() { return getToken(LenguajeCParser.IF, 0); }
		public TerminalNode PA() { return getToken(LenguajeCParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(LenguajeCParser.PC, 0); }
		public TerminalNode LLA() { return getToken(LenguajeCParser.LLA, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode LLC() { return getToken(LenguajeCParser.LLC, 0); }
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public SinoentoncesContext sinoentonces() {
			return getRuleContext(SinoentoncesContext.class,0);
		}
		public CondicionalesContext(CondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitCondicionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicional);
		try {
			_localctx = new CondicionalesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IF);
			setState(99);
			match(PA);
			setState(100);
			condicion(0);
			setState(101);
			match(PC);
			setState(102);
			match(LLA);
			setState(103);
			contenido();
			setState(104);
			match(LLC);
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(105);
				sino();
				}
				break;
			case ELSEIF:
				{
				setState(106);
				sinoentonces();
				}
				break;
			case LLC:
			case IF:
			case WHILE:
			case ENTERO:
			case IMPRIMIR:
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
	public static class NumerosContext extends CondicionContext {
		public TerminalNode INT() { return getToken(LenguajeCParser.INT, 0); }
		public NumerosContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitNumeros(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionparentesisContext extends CondicionContext {
		public TerminalNode PA() { return getToken(LenguajeCParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(LenguajeCParser.PC, 0); }
		public CondicionparentesisContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitCondicionparentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalsoContext extends CondicionContext {
		public TerminalNode FALSE() { return getToken(LenguajeCParser.FALSE, 0); }
		public FalsoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitFalso(this);
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
		public TerminalNode AND() { return getToken(LenguajeCParser.AND, 0); }
		public YContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitY(this);
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
		public TerminalNode MAY() { return getToken(LenguajeCParser.MAY, 0); }
		public TerminalNode MEN() { return getToken(LenguajeCParser.MEN, 0); }
		public TerminalNode IGU() { return getToken(LenguajeCParser.IGU, 0); }
		public TerminalNode DIF() { return getToken(LenguajeCParser.DIF, 0); }
		public TerminalNode MAYIGU() { return getToken(LenguajeCParser.MAYIGU, 0); }
		public TerminalNode MENIGU() { return getToken(LenguajeCParser.MENIGU, 0); }
		public CondicionesContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitCondiciones(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerdaderoContext extends CondicionContext {
		public TerminalNode TRUE() { return getToken(LenguajeCParser.TRUE, 0); }
		public VerdaderoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitVerdadero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntnegcondicionContext extends CondicionContext {
		public TerminalNode RES() { return getToken(LenguajeCParser.RES, 0); }
		public TerminalNode INT() { return getToken(LenguajeCParser.INT, 0); }
		public IntnegcondicionContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitIntnegcondicion(this);
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
		public TerminalNode OR() { return getToken(LenguajeCParser.OR, 0); }
		public OContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitO(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new CondicionesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
				expr(0);
				setState(111);
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
				setState(112);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new IntnegcondicionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(RES);
				setState(117);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new NumerosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new CondicionparentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(PA);
				setState(120);
				condicion(0);
				setState(121);
				match(PC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new YContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(125);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(126);
						match(AND);
						setState(127);
						condicion(9);
						}
						break;
					case 2:
						{
						_localctx = new OContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(128);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(129);
						match(OR);
						setState(130);
						condicion(8);
						}
						break;
					}
					} 
				}
				setState(135);
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
		public TerminalNode ELSE() { return getToken(LenguajeCParser.ELSE, 0); }
		public TerminalNode LLA() { return getToken(LenguajeCParser.LLA, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode LLC() { return getToken(LenguajeCParser.LLC, 0); }
		public PlanbContext(SinoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitPlanb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sino);
		try {
			_localctx = new PlanbContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ELSE);
			setState(137);
			match(LLA);
			setState(138);
			contenido();
			setState(139);
			match(LLC);
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
		public TerminalNode ELSEIF() { return getToken(LenguajeCParser.ELSEIF, 0); }
		public TerminalNode PA() { return getToken(LenguajeCParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(LenguajeCParser.PC, 0); }
		public TerminalNode LLA() { return getToken(LenguajeCParser.LLA, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode LLC() { return getToken(LenguajeCParser.LLC, 0); }
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public SinoentoncesContext sinoentonces() {
			return getRuleContext(SinoentoncesContext.class,0);
		}
		public SinoentonceContext(SinoentoncesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitSinoentonce(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoentoncesContext sinoentonces() throws RecognitionException {
		SinoentoncesContext _localctx = new SinoentoncesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sinoentonces);
		try {
			_localctx = new SinoentonceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ELSEIF);
			setState(142);
			match(PA);
			setState(143);
			condicion(0);
			setState(144);
			match(PC);
			setState(145);
			match(LLA);
			setState(146);
			contenido();
			setState(147);
			match(LLC);
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(148);
				sino();
				}
				break;
			case ELSEIF:
				{
				setState(149);
				sinoentonces();
				}
				break;
			case LLC:
			case IF:
			case WHILE:
			case ENTERO:
			case IMPRIMIR:
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
		public TerminalNode PA() { return getToken(LenguajeCParser.PA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(LenguajeCParser.PC, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementarContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajeCParser.ID, 0); }
		public List<TerminalNode> SUM() { return getTokens(LenguajeCParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(LenguajeCParser.SUM, i);
		}
		public IncrementarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitIncrementar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementarContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajeCParser.ID, 0); }
		public List<TerminalNode> RES() { return getTokens(LenguajeCParser.RES); }
		public TerminalNode RES(int i) {
			return getToken(LenguajeCParser.RES, i);
		}
		public DecrementarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitDecrementar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpresionContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LenguajeCParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LenguajeCParser.DIV, 0); }
		public TerminalNode SUM() { return getToken(LenguajeCParser.SUM, 0); }
		public TerminalNode RES() { return getToken(LenguajeCParser.RES, 0); }
		public ExpresionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntnegativoContext extends ExprContext {
		public TerminalNode RES() { return getToken(LenguajeCParser.RES, 0); }
		public TerminalNode INT() { return getToken(LenguajeCParser.INT, 0); }
		public IntnegativoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitIntnegativo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajeCParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LenguajeCParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitInt(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new IntnegativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				match(RES);
				setState(154);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new IncrementarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(ID);
				setState(156);
				match(SUM);
				setState(157);
				match(SUM);
				}
				break;
			case 3:
				{
				_localctx = new DecrementarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(ID);
				setState(159);
				match(RES);
				setState(160);
				match(RES);
				}
				break;
			case 4:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(PA);
				setState(164);
				expr(0);
				setState(165);
				match(PC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(169);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(170);
					((ExpresionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << RES) | (1L << MUL) | (1L << DIV))) != 0)) ) {
						((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(171);
					expr(8);
					}
					} 
				}
				setState(176);
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
	public static class CiclowhileContext extends MientrasContext {
		public TerminalNode WHILE() { return getToken(LenguajeCParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(LenguajeCParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(LenguajeCParser.PC, 0); }
		public TerminalNode LLA() { return getToken(LenguajeCParser.LLA, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode LLC() { return getToken(LenguajeCParser.LLC, 0); }
		public CiclowhileContext(MientrasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeCVisitor ) return ((LenguajeCVisitor<? extends T>)visitor).visitCiclowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mientras);
		try {
			_localctx = new CiclowhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(WHILE);
			setState(178);
			match(PA);
			setState(179);
			condicion(0);
			setState(180);
			match(PC);
			setState(181);
			match(LLA);
			setState(182);
			contenido();
			setState(183);
			match(LLC);
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
		case 13:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 16:
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
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bE\n\b"+
		"\f\b\16\bH\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13W\n\13\3\13\3\13\3\13\3\f\3\f\5\f^\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16n\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17~\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0086\n\17\f\17\16\17\u0089\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0099"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00aa\n\22\3\22\3\22\3\22\7\22\u00af\n\22\f\22\16\22\u00b2"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\2\4\34\"\24\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\24\31\3\2 #\2\u00c2\2&\3"+
		"\2\2\2\4.\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16"+
		"F\3\2\2\2\20I\3\2\2\2\22M\3\2\2\2\24S\3\2\2\2\26]\3\2\2\2\30_\3\2\2\2"+
		"\32d\3\2\2\2\34}\3\2\2\2\36\u008a\3\2\2\2 \u008f\3\2\2\2\"\u00a9\3\2\2"+
		"\2$\u00b3\3\2\2\2&\'\5\4\3\2\'(\5\6\4\2()\5\f\7\2)*\5\6\4\2*+\5\16\b\2"+
		"+,\5\b\5\2,-\5\n\6\2-\3\3\2\2\2./\7\3\2\2/\60\7\4\2\2\60\61\7\37\2\2\61"+
		"\5\3\2\2\2\62\63\7\t\2\2\63\7\3\2\2\2\64\65\7\n\2\2\65\t\3\2\2\2\66\67"+
		"\7\n\2\2\67\13\3\2\2\289\7\3\2\29:\7\5\2\2:;\7\6\2\2;<\7\7\2\2<=\7\b\2"+
		"\2=\r\3\2\2\2>E\5\20\t\2?E\5\24\13\2@E\5\30\r\2AE\5\22\n\2BE\5\32\16\2"+
		"CE\5$\23\2D>\3\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2"+
		"EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\17\3\2\2\2HF\3\2\2\2IJ\7\34\2\2JK\7\37"+
		"\2\2KL\7\f\2\2L\21\3\2\2\2MN\7\34\2\2NO\7\37\2\2OP\7\13\2\2PQ\5\"\22\2"+
		"QR\7\f\2\2R\23\3\2\2\2ST\7\35\2\2TV\7\7\2\2UW\5\26\f\2VU\3\2\2\2VW\3\2"+
		"\2\2WX\3\2\2\2XY\7\b\2\2YZ\7\f\2\2Z\25\3\2\2\2[^\5\"\22\2\\^\7$\2\2]["+
		"\3\2\2\2]\\\3\2\2\2^\27\3\2\2\2_`\7\37\2\2`a\7\13\2\2ab\5\"\22\2bc\7\f"+
		"\2\2c\31\3\2\2\2de\7\17\2\2ef\7\7\2\2fg\5\34\17\2gh\7\b\2\2hi\7\t\2\2"+
		"ij\5\16\b\2jm\7\n\2\2kn\5\36\20\2ln\5 \21\2mk\3\2\2\2ml\3\2\2\2mn\3\2"+
		"\2\2n\33\3\2\2\2op\b\17\1\2pq\5\"\22\2qr\t\2\2\2rs\5\"\22\2s~\3\2\2\2"+
		"t~\7\32\2\2u~\7\33\2\2vw\7!\2\2w~\7\36\2\2x~\7\36\2\2yz\7\7\2\2z{\5\34"+
		"\17\2{|\7\b\2\2|~\3\2\2\2}o\3\2\2\2}t\3\2\2\2}u\3\2\2\2}v\3\2\2\2}x\3"+
		"\2\2\2}y\3\2\2\2~\u0087\3\2\2\2\177\u0080\f\n\2\2\u0080\u0081\7\22\2\2"+
		"\u0081\u0086\5\34\17\13\u0082\u0083\f\t\2\2\u0083\u0084\7\23\2\2\u0084"+
		"\u0086\5\34\17\n\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\35\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\7\20\2\2\u008b\u008c\7\t\2\2\u008c\u008d\5\16\b\2"+
		"\u008d\u008e\7\n\2\2\u008e\37\3\2\2\2\u008f\u0090\7\16\2\2\u0090\u0091"+
		"\7\7\2\2\u0091\u0092\5\34\17\2\u0092\u0093\7\b\2\2\u0093\u0094\7\t\2\2"+
		"\u0094\u0095\5\16\b\2\u0095\u0098\7\n\2\2\u0096\u0099\5\36\20\2\u0097"+
		"\u0099\5 \21\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099!\3\2\2\2\u009a\u009b\b\22\1\2\u009b\u009c\7!\2\2\u009c\u00aa"+
		"\7\36\2\2\u009d\u009e\7\37\2\2\u009e\u009f\7 \2\2\u009f\u00aa\7 \2\2\u00a0"+
		"\u00a1\7\37\2\2\u00a1\u00a2\7!\2\2\u00a2\u00aa\7!\2\2\u00a3\u00aa\7\36"+
		"\2\2\u00a4\u00aa\7\37\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\5\"\22\2\u00a7"+
		"\u00a8\7\b\2\2\u00a8\u00aa\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9\u009d\3\2"+
		"\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9"+
		"\u00a5\3\2\2\2\u00aa\u00b0\3\2\2\2\u00ab\u00ac\f\t\2\2\u00ac\u00ad\t\3"+
		"\2\2\u00ad\u00af\5\"\22\n\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1#\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b3\u00b4\7\21\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\5\34\17\2\u00b6"+
		"\u00b7\7\b\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00b9\5\16\b\2\u00b9\u00ba\7"+
		"\n\2\2\u00ba%\3\2\2\2\rDFV]m}\u0085\u0087\u0098\u00a9\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}