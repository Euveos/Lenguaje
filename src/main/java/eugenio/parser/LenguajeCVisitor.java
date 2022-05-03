// Generated from LenguajeC.g4 by ANTLR 4.7.2
package eugenio.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeCParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LenguajeCParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iniciar}
	 * labeled alternative in {@link LenguajeCParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIniciar(LenguajeCParser.IniciarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code finalizar}
	 * labeled alternative in {@link LenguajeCParser#fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalizar(LenguajeCParser.FinalizarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code encabezar}
	 * labeled alternative in {@link LenguajeCParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabezar(LenguajeCParser.EncabezarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeCParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(LenguajeCParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link LenguajeCParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LenguajeCParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declasignar}
	 * labeled alternative in {@link LenguajeCParser#declararasignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclasignar(LenguajeCParser.DeclasignarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresion}
	 * labeled alternative in {@link LenguajeCParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(LenguajeCParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link LenguajeCParser#asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajeCParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionales}
	 * labeled alternative in {@link LenguajeCParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionales(LenguajeCParser.CondicionalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numeros}
	 * labeled alternative in {@link LenguajeCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeros(LenguajeCParser.NumerosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionparentesis}
	 * labeled alternative in {@link LenguajeCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionparentesis(LenguajeCParser.CondicionparentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falso}
	 * labeled alternative in {@link LenguajeCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalso(LenguajeCParser.FalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code y}
	 * labeled alternative in {@link LenguajeCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(LenguajeCParser.YContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condiciones}
	 * labeled alternative in {@link LenguajeCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(LenguajeCParser.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verdadero}
	 * labeled alternative in {@link LenguajeCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdadero(LenguajeCParser.VerdaderoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intnegcondicion}
	 * labeled alternative in {@link LenguajeCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntnegcondicion(LenguajeCParser.IntnegcondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code o}
	 * labeled alternative in {@link LenguajeCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitO(LenguajeCParser.OContext ctx);
	/**
	 * Visit a parse tree produced by the {@code planb}
	 * labeled alternative in {@link LenguajeCParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlanb(LenguajeCParser.PlanbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinoentonce}
	 * labeled alternative in {@link LenguajeCParser#sinoentonces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinoentonce(LenguajeCParser.SinoentonceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LenguajeCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(LenguajeCParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresion}
	 * labeled alternative in {@link LenguajeCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(LenguajeCParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intnegativo}
	 * labeled alternative in {@link LenguajeCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntnegativo(LenguajeCParser.IntnegativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LenguajeCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LenguajeCParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LenguajeCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LenguajeCParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ciclowhile}
	 * labeled alternative in {@link LenguajeCParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclowhile(LenguajeCParser.CiclowhileContext ctx);
}