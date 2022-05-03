package com.example.lenguaje;

import eugenio.parser.LenguajeCBaseVisitor;
import eugenio.parser.LenguajeCParser;

public class MyCLanguageVisitor extends LenguajeCBaseVisitor<String> {

    public String traduccion="";

    @Override public String visitEncabezar(LenguajeCParser.EncabezarContext ctx) {
        traduccion+="verdugo rey :: ";
        return null;
    }
    @Override public String visitIniciar(LenguajeCParser.IniciarContext ctx) {
        traduccion+="[\n";
        return null;
    }

    @Override public String visitFinalizar(LenguajeCParser.FinalizarContext ctx) {
        traduccion+="]";
        LenguajeController controller = new LenguajeController();
        controller.setTraduccion(traduccion);
        return null;
    }

    @Override public String visitDeclaracion(LenguajeCParser.DeclaracionContext ctx) {
        traduccion+="subdito "+ctx.ID().getText()+"!\n";
        return null;
    }

    @Override public String visitDeclasignar(LenguajeCParser.DeclasignarContext ctx) {
        traduccion+="subdito "+ctx.ID().getText()+" = "+visit(ctx.expr())+"!\n";
        return null;
    }


    @Override public String visitImpresion(LenguajeCParser.ImpresionContext ctx) {
        String expresion = visit(ctx.expr());
        traduccion+="invocacion "+expresion+"!\n";
        return null;
    }

    @Override public String visitAsignacion(LenguajeCParser.AsignacionContext ctx) {
        traduccion+=ctx.ID().getText()+" = "+visit(ctx.expr())+"!\n";
        return null;
    }

    @Override public String visitParentesis(LenguajeCParser.ParentesisContext ctx) {
        return "("+visit(ctx.expr())+")";
    }

    @Override public String visitExpresion(LenguajeCParser.ExpresionContext ctx) {
        String izq=visit(ctx.expr(0));
        String der=visit(ctx.expr(1));
        return izq+ctx.op.getText()+der;
    }

    @Override public String visitId(LenguajeCParser.IdContext ctx) {
        return ctx.ID().getText();
    }

    @Override public String visitInt(LenguajeCParser.IntContext ctx) {
        String entero = ctx.INT().getText();
        return entero;
    }

    @Override public String visitCondicionales(LenguajeCParser.CondicionalesContext ctx) {
        traduccion+="juicio:"+visit(ctx.condicion())+":[\n";
        visit(ctx.contenido());
        traduccion+="]\n";
        if(ctx.sino()!=null){
            visit(ctx.sino());
        }
        else{
            if(ctx.sinoentonces()!=null){
                visit(ctx.sinoentonces());
            }
        }
        return null;
    }

    @Override public String visitNumeros(LenguajeCParser.NumerosContext ctx) {
        return ctx.INT().getText();
    }

    @Override public String visitFalso(LenguajeCParser.FalsoContext ctx) {
        return "loco";
    }

    @Override public String visitY(LenguajeCParser.YContext ctx) {
        String izq=visit(ctx.condicion(0));
        String der=visit(ctx.condicion(1));
        return izq+" && "+der;
    }
    @Override public String visitCondiciones(LenguajeCParser.CondicionesContext ctx) {
        String izq=visit(ctx.expr(0));
        String der=visit(ctx.expr(1));
        return izq+ctx.ol.getText()+der;
    }
    @Override public String visitCondicionparentesis(LenguajeCParser.CondicionparentesisContext ctx) {
        return "("+visit(ctx.condicion())+")";
    }

    @Override public String visitVerdadero(LenguajeCParser.VerdaderoContext ctx) {
        return "cuerdo";
    }
    @Override public String visitO(LenguajeCParser.OContext ctx) {
        String izq=visit(ctx.condicion(0));
        String der=visit(ctx.condicion(1));
        return izq+" || "+der;
    }
    @Override public String visitPlanb(LenguajeCParser.PlanbContext ctx) {
        traduccion+="ejecucion[\n";
        visit(ctx.contenido());
        traduccion+="]\n";
        return null;
    }
    @Override public String visitSinoentonce(LenguajeCParser.SinoentonceContext ctx) {
        traduccion+="sentencia:"+visit(ctx.condicion())+":[\n";
        visit(ctx.contenido());
        traduccion+="]\n";
        if(ctx.sino()!=null){
            visit(ctx.sino());
        }
        else{
            if (ctx.sinoentonces()!=null){
                visit(ctx.sinoentonces());
            }
        }
        return null;
    }

    @Override public String visitCiclowhile(LenguajeCParser.CiclowhileContext ctx) {
        traduccion+="hechizo:"+visit(ctx.condicion())+":[\n";
        visit(ctx.contenido());
        traduccion+="]\n";
        return null;
    }


    @Override public String visitIntnegativo(LenguajeCParser.IntnegativoContext ctx) { return "-"+ctx.INT().getText(); }


}
