// Generated from LenguajeDeProgramacion.g4 by ANTLR 4.7.2
package eugenio.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeDeProgramacionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeDeProgramacionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeDeProgramacionParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LenguajeDeProgramacionParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code encabezadoclase}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabezadoclase(LenguajeDeProgramacionParser.EncabezadoclaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDeProgramacionParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabezado(LenguajeDeProgramacionParser.EncabezadoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cerrarmetodo}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#cierremetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCerrarmetodo(LenguajeDeProgramacionParser.CerrarmetodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cerrarclase}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#cierreclase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCerrarclase(LenguajeDeProgramacionParser.CerrarclaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDeProgramacionParser#tipodereturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipodereturn(LenguajeDeProgramacionParser.TipodereturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDeProgramacionParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(LenguajeDeProgramacionParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresion}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(LenguajeDeProgramacionParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprimirexpr}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#impresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirexpr(LenguajeDeProgramacionParser.ImprimirexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprimirstring}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#impresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirstring(LenguajeDeProgramacionParser.ImprimirstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LenguajeDeProgramacionParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declasignar}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#declararasignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclasignar(LenguajeDeProgramacionParser.DeclasignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDeProgramacionParser#tipodato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipodato(LenguajeDeProgramacionParser.TipodatoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajeDeProgramacionParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionales}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionales(LenguajeDeProgramacionParser.CondicionalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(LenguajeDeProgramacionParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionparentesis}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionparentesis(LenguajeDeProgramacionParser.CondicionparentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falso}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalso(LenguajeDeProgramacionParser.FalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code y}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(LenguajeDeProgramacionParser.YContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condiciones}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(LenguajeDeProgramacionParser.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verdadero}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdadero(LenguajeDeProgramacionParser.VerdaderoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intnegcondicion}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntnegcondicion(LenguajeDeProgramacionParser.IntnegcondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code o}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitO(LenguajeDeProgramacionParser.OContext ctx);
	/**
	 * Visit a parse tree produced by the {@code planb}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlanb(LenguajeDeProgramacionParser.PlanbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinoentonce}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#sinoentonces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinoentonce(LenguajeDeProgramacionParser.SinoentonceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(LenguajeDeProgramacionParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementar}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementar(LenguajeDeProgramacionParser.IncrementarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrementar}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementar(LenguajeDeProgramacionParser.DecrementarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(LenguajeDeProgramacionParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intnegativo}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntnegativo(LenguajeDeProgramacionParser.IntnegativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LenguajeDeProgramacionParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LenguajeDeProgramacionParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LenguajeDeProgramacionParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ciclomientras}
	 * labeled alternative in {@link LenguajeDeProgramacionParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclomientras(LenguajeDeProgramacionParser.CiclomientrasContext ctx);
}