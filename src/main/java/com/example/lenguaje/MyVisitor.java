package com.example.lenguaje;

import eugenio.parser.LenguajeCParser;
import eugenio.parser.LenguajeDeProgramacionBaseVisitor;
import eugenio.parser.LenguajeDeProgramacionParser;

import java.util.HashMap;

import static eugenio.parser.LenguajeCLexer.*;

public class MyVisitor extends LenguajeDeProgramacionBaseVisitor {

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
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        int valor=(int)visit(ctx.expr());
        if(!memoria.existe(id)){
            throw new NullPointerException("Variable \""+id+"\" no declarada. Linea: "+linea+".");
        }
        memoria.ingresar(id,valor);
        return valor;
    }

    @Override public Integer visitDeclasignar(LenguajeDeProgramacionParser.DeclasignarContext ctx) {
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        int valor=(int)visit(ctx.expr());

        if(memoria.existe(id)){
            throw new NullPointerException("Variable \""+id+"\" anteriormente declarada. Linea: "+linea+".");
        }
        memoria.datos.put(id,valor);
        return valor;
    }


    @Override public Integer visitImpresion(LenguajeDeProgramacionParser.ImpresionContext ctx) {
        Integer valor = (int)visit(ctx.expr());
        LenguajeController controller = new LenguajeController();
        controller.concatenar(valor.toString());
        return 0;
    }

    @Override public Integer visitInt(LenguajeDeProgramacionParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override public Integer visitId(LenguajeDeProgramacionParser.IdContext ctx) {
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        if (memoria.existe(id)) {
            if(memoria.obtener(id)!=null) {
                return memoria.obtener(id);
            }
            else{
                throw new NullPointerException("La variable "+id+" es nula. Linea: "+linea+".");
            }
        } else {
            throw new NullPointerException("Variable \""+id+"\" no declarada. Linea: "+linea+".");
        }
    }

    @Override public Integer visitSumRes(LenguajeDeProgramacionParser.SumResContext ctx) {
        Integer izq=(int)visit(ctx.expr(0));
        Integer der=(int)visit(ctx.expr(1));
        if (ctx.op.getType()==LenguajeDeProgramacionParser.SUM){
            return izq+der;
        }
        else {
            return izq-der;
        }
    }
    @Override public Integer visitMulDiv(LenguajeDeProgramacionParser.MulDivContext ctx) {
        Integer izq=(int)visit(ctx.expr(0));
        Integer der=(int)visit(ctx.expr(1));
        if (ctx.op.getType()==LenguajeDeProgramacionParser.MUL){
            return izq*der;
        }
        else {
            return izq/der;
        }
    }

    @Override public Integer visitParentesis(LenguajeDeProgramacionParser.ParentesisContext ctx) {
        return (int)visit(ctx.expr());
    }

    @Override public Integer visitCondicionales(LenguajeDeProgramacionParser.CondicionalesContext ctx) {
        memoria = new Nodo (memoria);
        if((boolean)visit(ctx.condicion()) ){
            visit(ctx.contenido());
        }
        else{
            if(ctx.sino()!=null){
                visit(ctx.sino());
            }
            else{
                if (ctx.sinoentonces()!=null){
                    visit(ctx.sinoentonces());
                }
            }
        }
        memoria = memoria.anterior;
        return 0;
    }

    @Override public Boolean visitNumero(LenguajeDeProgramacionParser.NumeroContext ctx) {
        return Integer.parseInt(ctx.INT().getText()) != 0;
    }
    @Override public Boolean visitIntnegcondicion(LenguajeDeProgramacionParser.IntnegcondicionContext ctx) {
        return Integer.parseInt("-"+ctx.INT().getText()) != 0; }


    @Override public Boolean visitFalso(LenguajeDeProgramacionParser.FalsoContext ctx) {
        return false;
    }

    @Override public Boolean visitY(LenguajeDeProgramacionParser.YContext ctx) {
        boolean izq= (boolean)visit(ctx.condicion(0));
        boolean der= (boolean)visit(ctx.condicion(1));
        return izq && der;
    }

    @Override public Boolean visitCondiciones(LenguajeDeProgramacionParser.CondicionesContext ctx) {
        int izq = (int)visit(ctx.expr(0));
        int der = (int)visit(ctx.expr(1));
        switch(ctx.ol.getType()){
            case LenguajeDeProgramacionParser.MAY:
                return izq>der;
            case LenguajeDeProgramacionParser.MEN:
                return izq<der;
            case LenguajeDeProgramacionParser.IGU:
                return izq==der;
            case LenguajeDeProgramacionParser.DIF:
                return izq!=der;
            case LenguajeDeProgramacionParser.MAYIGU:
                return izq>=der;
            case LenguajeDeProgramacionParser.MENIGU:
                return izq<=der;
        }
        return false;
    }

    @Override public Boolean visitCondicionparentesis(LenguajeDeProgramacionParser.CondicionparentesisContext ctx) {
        return (boolean)visit(ctx.condicion());
    }

    @Override public Boolean visitVerdadero(LenguajeDeProgramacionParser.VerdaderoContext ctx) {
        return true;
    }

    @Override public Boolean visitO(LenguajeDeProgramacionParser.OContext ctx) {
        boolean izq= (boolean)visit(ctx.condicion(0));
        boolean der= (boolean)visit(ctx.condicion(1));
        return izq || der;
    }

    @Override public Integer visitPlanb(LenguajeDeProgramacionParser.PlanbContext ctx) {
        visit(ctx.contenido());
        return 0;
    }

    @Override public Integer visitSinoentonce(LenguajeDeProgramacionParser.SinoentonceContext ctx) {
        if((boolean)visit(ctx.condicion()) ){
            visit(ctx.contenido());
        }
        else{
            if(ctx.sino()!=null){
                visit(ctx.sino());
            }
            else{
                if(ctx.sinoentonces()!=null){
                    visit(ctx.sinoentonces());
                }
            }
        }
        return 0;
    }

    @Override public Integer visitCiclomientras(LenguajeDeProgramacionParser.CiclomientrasContext ctx) {
        while((boolean)visit(ctx.condicion())){
            memoria = new Nodo (memoria);
            visit(ctx.contenido());
            memoria = memoria.anterior;
        }
        return null;
    }


    @Override public Integer visitIntnegativo(LenguajeDeProgramacionParser.IntnegativoContext ctx) {
        return Integer.valueOf("-"+ctx.INT().getText()); }


}
