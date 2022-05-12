package com.example.lenguaje;

import eugenio.parser.LenguajeDeProgramacionBaseVisitor;
import eugenio.parser.LenguajeDeProgramacionParser;

public class MyVerificador extends LenguajeDeProgramacionBaseVisitor {

    Nodo memoria = new Nodo(null);

    @Override public Integer visitDeclaracion(LenguajeDeProgramacionParser.DeclaracionContext ctx) {
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        if(memoria.existe(id)){
            throw new NullPointerException("Variable anteriormente declarada: "+id+". Linea: "+linea+".");
        }
        memoria.datos.put(id,null);
        return 0;
    }

    @Override public Integer visitAsignacion(LenguajeDeProgramacionParser.AsignacionContext ctx) {
        visit(ctx.expr());
        return null;
    }

    @Override public Integer visitDeclasignar(LenguajeDeProgramacionParser.DeclasignarContext ctx) {
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();

        if(memoria.existe(id)){
            throw new NullPointerException("Variable \""+id+"\" anteriormente declarada. Linea: "+linea+".");
        }
        memoria.datos.put(id,null);
        return null;
    }

    @Override public Object visitId(LenguajeDeProgramacionParser.IdContext ctx) {
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        if(!memoria.existe(id)){
            throw new NullPointerException("Variable \""+id+"\" no declarada. Linea: "+linea+".");
        }
        return null;
    }

    @Override public Object visitImpresion(LenguajeDeProgramacionParser.ImpresionContext ctx) {
        visit(ctx.impresiones());
        return null;
    }

    @Override public Object visitParentesis(LenguajeDeProgramacionParser.ParentesisContext ctx) {
        visit(ctx.expr());
        return null;
    }

    @Override public Object visitMulDiv(LenguajeDeProgramacionParser.MulDivContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        return null;
    }

    @Override public Object visitSumRes(LenguajeDeProgramacionParser.SumResContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        return null;
    }

    @Override public Integer visitCondicionales(LenguajeDeProgramacionParser.CondicionalesContext ctx) {
        visit(ctx.condicion());
        memoria = new Nodo (memoria);
        visit(ctx.contenido());
        memoria = memoria.anterior;
        memoria = new Nodo (memoria);
        if(ctx.sino()!=null) {
            visit(ctx.sino());
        }
        memoria = memoria.anterior;
        memoria = new Nodo (memoria);
        if(ctx.sinoentonces()!=null) {
            visit(ctx.sinoentonces());
        }
        memoria = memoria.anterior;
        return 0;
    }

    @Override public Integer visitPlanb(LenguajeDeProgramacionParser.PlanbContext ctx) {
        visit(ctx.contenido());
        return 0;
    }

    @Override public Integer visitSinoentonce(LenguajeDeProgramacionParser.SinoentonceContext ctx) {
        visit(ctx.condicion());
        memoria = new Nodo (memoria);
        visit(ctx.contenido());
        memoria = memoria.anterior;
        memoria = new Nodo (memoria);
        if(ctx.sino()!=null) {
            visit(ctx.sino());
        }
        memoria = memoria.anterior;
        memoria = new Nodo (memoria);
        if(ctx.sinoentonces()!=null) {
            visit(ctx.sinoentonces());
        }
        memoria = memoria.anterior;
        return 0;
    }

    @Override public Object visitCiclomientras(LenguajeDeProgramacionParser.CiclomientrasContext ctx) {
        visit(ctx.condicion());
        memoria = new Nodo(memoria);
        visit(ctx.contenido());
        memoria = memoria.anterior;
        return null;
    }


    @Override public Object visitCondiciones(LenguajeDeProgramacionParser.CondicionesContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        return null;
    }

    @Override public Object visitCondicionparentesis(LenguajeDeProgramacionParser.CondicionparentesisContext ctx) {
        visit(ctx.condicion());
        return null;
    }

    @Override public Object visitO(LenguajeDeProgramacionParser.OContext ctx) {
        visit(ctx.condicion(0));
        visit(ctx.condicion(1));
        return null;
    }

    @Override public Boolean visitY(LenguajeDeProgramacionParser.YContext ctx) {
        visit(ctx.condicion(0));
        visit(ctx.condicion(1));
        return null;
    }

}
