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
		VOID=1, MAIN=2, PA=3, PC=4, LLA=5, LLC=6, IGUAL=7, SEMI=8, DC=9, ELSEIF=10, 
		IF=11, ELSE=12, WHILE=13, AND=14, OR=15, MAY=16, MEN=17, MAYIGU=18, MENIGU=19, 
		IGU=20, DIF=21, TRUE=22, FALSE=23, ENTERO=24, IMPRIMIR=25, INT=26, ID=27, 
		SUM=28, RES=29, MUL=30, DIV=31, ESPACIOS=32, LINEA=33, BLOQUE=34;
	public static final int
		RULE_programa = 0, RULE_inicio = 1, RULE_fin = 2, RULE_encabezado = 3, 
		RULE_contenido = 4, RULE_declarar = 5, RULE_declararasignar = 6, RULE_imprimir = 7, 
		RULE_asignar = 8, RULE_condicional = 9, RULE_condicion = 10, RULE_sino = 11, 
		RULE_sinoentonces = 12, RULE_expr = 13, RULE_mientras = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "inicio", "fin", "encabezado", "contenido", "declarar", "declararasignar", 
			"imprimir", "asignar", "condicional", "condicion", "sino", "sinoentonces", 
			"expr", "mientras"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'main'", "'('", "')'", "'{'", "'}'", "'='", "';'", "'\"'", 
			"'else if'", "'if'", "'else'", "'while'", "'&&'", "'||'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'true'", "'false'", "'int'", "'printf'", 
			null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "MAIN", "PA", "PC", "LLA", "LLC", "IGUAL", "SEMI", "DC", 
			"ELSEIF", "IF", "ELSE", "WHILE", "AND", "OR", "MAY", "MEN", "MAYIGU", 
			"MENIGU", "IGU", "DIF", "TRUE", "FALSE", "ENTERO", "IMPRIMIR", "INT", 
			"ID", "SUM", "RES", "MUL", "DIV", "ESPACIOS", "LINEA", "BLOQUE"
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
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public FinContext fin() {
			return getRuleContext(FinContext.class,0);
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
			setState(30);
			encabezado();
			setState(31);
			inicio();
			setState(32);
			contenido();
			setState(33);
			fin();
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
		enterRule(_localctx, 2, RULE_inicio);
		try {
			_localctx = new IniciarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
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
		enterRule(_localctx, 4, RULE_fin);
		try {
			_localctx = new FinalizarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
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
		enterRule(_localctx, 6, RULE_encabezado);
		try {
			_localctx = new EncabezarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(VOID);
			setState(40);
			match(MAIN);
			setState(41);
			match(PA);
			setState(42);
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
		enterRule(_localctx, 8, RULE_contenido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << ENTERO) | (1L << IMPRIMIR) | (1L << ID))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					declarar();
					}
					break;
				case 2:
					{
					setState(45);
					imprimir();
					}
					break;
				case 3:
					{
					setState(46);
					asignar();
					}
					break;
				case 4:
					{
					setState(47);
					declararasignar();
					}
					break;
				case 5:
					{
					setState(48);
					condicional();
					}
					break;
				case 6:
					{
					setState(49);
					mientras();
					}
					break;
				}
				}
				setState(54);
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
		enterRule(_localctx, 10, RULE_declarar);
		try {
			_localctx = new DeclaracionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ENTERO);
			setState(56);
			match(ID);
			setState(57);
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
		enterRule(_localctx, 12, RULE_declararasignar);
		try {
			_localctx = new DeclasignarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ENTERO);
			setState(60);
			match(ID);
			setState(61);
			match(IGUAL);
			setState(62);
			expr(0);
			setState(63);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 14, RULE_imprimir);
		int _la;
		try {
			_localctx = new ImpresionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IMPRIMIR);
			setState(66);
			match(PA);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << INT) | (1L << ID) | (1L << RES))) != 0)) {
				{
				setState(67);
				expr(0);
				}
			}

			setState(70);
			match(PC);
			setState(71);
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
		enterRule(_localctx, 16, RULE_asignar);
		try {
			_localctx = new AsignacionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			match(IGUAL);
			setState(75);
			expr(0);
			setState(76);
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
		enterRule(_localctx, 18, RULE_condicional);
		try {
			_localctx = new CondicionalesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IF);
			setState(79);
			match(PA);
			setState(80);
			condicion(0);
			setState(81);
			match(PC);
			setState(82);
			match(LLA);
			setState(83);
			contenido();
			setState(84);
			match(LLC);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(85);
				sino();
				}
				break;
			case ELSEIF:
				{
				setState(86);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new CondicionesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				expr(0);
				setState(91);
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
				setState(92);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new IntnegcondicionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(RES);
				setState(97);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new NumerosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new CondicionparentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(PA);
				setState(100);
				condicion(0);
				setState(101);
				match(PC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new YContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(105);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(106);
						match(AND);
						setState(107);
						condicion(9);
						}
						break;
					case 2:
						{
						_localctx = new OContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(108);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(109);
						match(OR);
						setState(110);
						condicion(8);
						}
						break;
					}
					} 
				}
				setState(115);
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
		enterRule(_localctx, 22, RULE_sino);
		try {
			_localctx = new PlanbContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ELSE);
			setState(117);
			match(LLA);
			setState(118);
			contenido();
			setState(119);
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
		enterRule(_localctx, 24, RULE_sinoentonces);
		try {
			_localctx = new SinoentonceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ELSEIF);
			setState(122);
			match(PA);
			setState(123);
			condicion(0);
			setState(124);
			match(PC);
			setState(125);
			match(LLA);
			setState(126);
			contenido();
			setState(127);
			match(LLC);
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(128);
				sino();
				}
				break;
			case ELSEIF:
				{
				setState(129);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RES:
				{
				_localctx = new IntnegativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(133);
				match(RES);
				setState(134);
				match(INT);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(ID);
				}
				break;
			case PA:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(PA);
				setState(138);
				expr(0);
				setState(139);
				match(PC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(143);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(144);
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
					setState(145);
					expr(6);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 28, RULE_mientras);
		try {
			_localctx = new CiclowhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(WHILE);
			setState(152);
			match(PA);
			setState(153);
			condicion(0);
			setState(154);
			match(PC);
			setState(155);
			match(LLA);
			setState(156);
			contenido();
			setState(157);
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
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\65\n"+
		"\6\f\6\16\68\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\5\tG\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13Z\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\fj\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fr\n\f\f\f\16\fu\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0085\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0090\n"+
		"\17\3\17\3\17\3\17\7\17\u0095\n\17\f\17\16\17\u0098\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\2\4\26\34\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\4\3\2\22\27\3\2\36!\2\u00a8\2 \3\2\2\2\4%\3\2\2\2\6"+
		"\'\3\2\2\2\b)\3\2\2\2\n\66\3\2\2\2\f9\3\2\2\2\16=\3\2\2\2\20C\3\2\2\2"+
		"\22K\3\2\2\2\24P\3\2\2\2\26i\3\2\2\2\30v\3\2\2\2\32{\3\2\2\2\34\u008f"+
		"\3\2\2\2\36\u0099\3\2\2\2 !\5\b\5\2!\"\5\4\3\2\"#\5\n\6\2#$\5\6\4\2$\3"+
		"\3\2\2\2%&\7\7\2\2&\5\3\2\2\2\'(\7\b\2\2(\7\3\2\2\2)*\7\3\2\2*+\7\4\2"+
		"\2+,\7\5\2\2,-\7\6\2\2-\t\3\2\2\2.\65\5\f\7\2/\65\5\20\t\2\60\65\5\22"+
		"\n\2\61\65\5\16\b\2\62\65\5\24\13\2\63\65\5\36\20\2\64.\3\2\2\2\64/\3"+
		"\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2"+
		"\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\13\3\2\2\28\66\3\2\2\29:\7\32\2\2"+
		":;\7\35\2\2;<\7\n\2\2<\r\3\2\2\2=>\7\32\2\2>?\7\35\2\2?@\7\t\2\2@A\5\34"+
		"\17\2AB\7\n\2\2B\17\3\2\2\2CD\7\33\2\2DF\7\5\2\2EG\5\34\17\2FE\3\2\2\2"+
		"FG\3\2\2\2GH\3\2\2\2HI\7\6\2\2IJ\7\n\2\2J\21\3\2\2\2KL\7\35\2\2LM\7\t"+
		"\2\2MN\5\34\17\2NO\7\n\2\2O\23\3\2\2\2PQ\7\r\2\2QR\7\5\2\2RS\5\26\f\2"+
		"ST\7\6\2\2TU\7\7\2\2UV\5\n\6\2VY\7\b\2\2WZ\5\30\r\2XZ\5\32\16\2YW\3\2"+
		"\2\2YX\3\2\2\2YZ\3\2\2\2Z\25\3\2\2\2[\\\b\f\1\2\\]\5\34\17\2]^\t\2\2\2"+
		"^_\5\34\17\2_j\3\2\2\2`j\7\30\2\2aj\7\31\2\2bc\7\37\2\2cj\7\34\2\2dj\7"+
		"\34\2\2ef\7\5\2\2fg\5\26\f\2gh\7\6\2\2hj\3\2\2\2i[\3\2\2\2i`\3\2\2\2i"+
		"a\3\2\2\2ib\3\2\2\2id\3\2\2\2ie\3\2\2\2js\3\2\2\2kl\f\n\2\2lm\7\20\2\2"+
		"mr\5\26\f\13no\f\t\2\2op\7\21\2\2pr\5\26\f\nqk\3\2\2\2qn\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2t\27\3\2\2\2us\3\2\2\2vw\7\16\2\2wx\7\7\2\2xy"+
		"\5\n\6\2yz\7\b\2\2z\31\3\2\2\2{|\7\f\2\2|}\7\5\2\2}~\5\26\f\2~\177\7\6"+
		"\2\2\177\u0080\7\7\2\2\u0080\u0081\5\n\6\2\u0081\u0084\7\b\2\2\u0082\u0085"+
		"\5\30\r\2\u0083\u0085\5\32\16\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\33\3\2\2\2\u0086\u0087\b\17\1\2\u0087\u0088"+
		"\7\37\2\2\u0088\u0090\7\34\2\2\u0089\u0090\7\34\2\2\u008a\u0090\7\35\2"+
		"\2\u008b\u008c\7\5\2\2\u008c\u008d\5\34\17\2\u008d\u008e\7\6\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2"+
		"\2\2\u008f\u008b\3\2\2\2\u0090\u0096\3\2\2\2\u0091\u0092\f\7\2\2\u0092"+
		"\u0093\t\3\2\2\u0093\u0095\5\34\17\b\u0094\u0091\3\2\2\2\u0095\u0098\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\35\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u009b\7\5\2\2\u009b\u009c\5"+
		"\26\f\2\u009c\u009d\7\6\2\2\u009d\u009e\7\7\2\2\u009e\u009f\5\n\6\2\u009f"+
		"\u00a0\7\b\2\2\u00a0\37\3\2\2\2\f\64\66FYiqs\u0084\u008f\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}