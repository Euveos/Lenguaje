package com.example.lenguaje;

import eugenio.parser.LenguajeCParser;
import eugenio.parser.LenguajeDeProgramacionBaseVisitor;
import eugenio.parser.LenguajeDeProgramacionParser;

import java.util.ArrayList;
import java.util.HashMap;

import static eugenio.parser.LenguajeCLexer.*;

public class MyVisitor extends LenguajeDeProgramacionBaseVisitor {

    Nodo memoria = new Nodo(null);
    ArrayList<String> posiciones = new ArrayList<String>();

    public String nombreClase;
    public String traduccion="";
    public int ifs=0;
    public int cic=0;

    @Override public String visitEncabezadoclase(LenguajeDeProgramacionParser.EncabezadoclaseContext ctx) {
        nombreClase=ctx.ID().getText();
        traduccion+=".class public "+nombreClase+System.lineSeparator() +
                ".super java/lang/Object"+System.lineSeparator();
        return null;
    }

    @Override public String visitEncabezado(LenguajeDeProgramacionParser.EncabezadoContext ctx) {
        traduccion+=".method public static main([Ljava/lang/String;)V"+System.lineSeparator() +
                "\t.limit stack 10"+System.lineSeparator() +
                "\t.limit locals 10"+System.lineSeparator();
        return null;
    }

    @Override public String visitCerrarmetodo(LenguajeDeProgramacionParser.CerrarmetodoContext ctx) {
        traduccion+="return"+System.lineSeparator();
        traduccion+=".end method";
        return null;
    }

    @Override public String visitCerrarclase(LenguajeDeProgramacionParser.CerrarclaseContext ctx) {
        LenguajeController controller = new LenguajeController();
        controller.setNombreClase(nombreClase);
        controller.setSalida(traduccion);
        return null;
    }

    @Override public Integer visitDeclaracion(LenguajeDeProgramacionParser.DeclaracionContext ctx) {
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        if(memoria.existe(id)){
            throw new NullPointerException("Variable anteriormente declarada: "+id+". Linea: "+linea+".");
        }
        memoria.datos.put(id,null);
        posiciones.add(id);
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
        traduccion+="istore_"+posiciones.indexOf(id)+
                System.lineSeparator();
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
        posiciones.add(id);
        traduccion+="istore_"+posiciones.indexOf(id)+
                System.lineSeparator();
        return valor;
    }


    @Override public Integer visitImpresion(LenguajeDeProgramacionParser.ImpresionContext ctx) {
        traduccion+="getstatic java/lang/System/out Ljava/io/PrintStream;"+ System.lineSeparator();
        visit(ctx.impresiones());
        return 0;
    }

    @Override public Integer visitImprimirexpr(LenguajeDeProgramacionParser.ImprimirexprContext ctx) {
        visit(ctx.expr());
        traduccion+= "invokevirtual java/io/PrintStream/println(I)V"+System.lineSeparator();
        return null; }

    @Override public String visitImprimirstring(LenguajeDeProgramacionParser.ImprimirstringContext ctx) {
        traduccion+="ldc "+ctx.STRING().getText()+System.lineSeparator()+
                "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V"+
                        System.lineSeparator();
        return null; }


    @Override public Integer visitInt(LenguajeDeProgramacionParser.IntContext ctx) {
        int valor= Integer.valueOf(ctx.INT().getText());
        traduccion+="bipush "+valor+System.lineSeparator();
        return valor;
    }

    @Override public Integer visitId(LenguajeDeProgramacionParser.IdContext ctx) {
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        if (memoria.existe(id)) {
            if(memoria.obtener(id)!=null) {
                traduccion+="iload_"+posiciones.indexOf(id)+System.lineSeparator();
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
            traduccion+= "iadd"+System.lineSeparator();
            return izq+der;
        }
        else {
            traduccion+= "isub"+System.lineSeparator();
            return izq-der;
        }
    }

    @Override public Integer visitMulDiv(LenguajeDeProgramacionParser.MulDivContext ctx) {
        Integer izq=(int)visit(ctx.expr(0));
        Integer der=(int)visit(ctx.expr(1));
        if (ctx.op.getType()==LenguajeDeProgramacionParser.MUL){
            traduccion+= "imul"+System.lineSeparator();
            return izq*der;
        }
        else {
            traduccion+= "idiv"+System.lineSeparator();
            return izq/der;
        }
    }

    @Override public Integer visitIncrementar(LenguajeDeProgramacionParser.IncrementarContext ctx) {
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        if(!memoria.existe(id)){
            throw new NullPointerException("Variable \""+id+"\" no declarada. Linea: "+linea+".");
        }
        int valor=memoria.obtener(id);
        memoria.ingresar(id,valor+1);
        return null;
    }

    @Override public Integer visitDecrementar(LenguajeDeProgramacionParser.DecrementarContext ctx) {
        String id = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        if(!memoria.existe(id)){
            throw new NullPointerException("Variable \""+id+"\" no declarada. Linea: "+linea+".");
        }
        int valor=memoria.obtener(id);
        memoria.ingresar(id,valor-1);
        return null;
    }

    @Override public Integer visitParentesis(LenguajeDeProgramacionParser.ParentesisContext ctx) {
        return (int)visit(ctx.expr());
    }

    @Override public Integer visitCondicionales(LenguajeDeProgramacionParser.CondicionalesContext ctx) {
        ifs++;
        memoria = new Nodo (memoria);
        visit(ctx.condicion());
        traduccion+="If"+ifs  + System.lineSeparator();
        if(ctx.sino()!=null){visit(ctx.sino());}
        traduccion+="goto ContinuacionIf"+ifs +System.lineSeparator();
        traduccion+="ContenidoIf"+ifs+": "+System.lineSeparator();
        visit(ctx.contenido());
        traduccion+="ContinuacionIf"+ifs+": "+System.lineSeparator();
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
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        switch(ctx.ol.getType()){
            case LenguajeDeProgramacionParser.MAY:
                traduccion+="if_icmpgt Contenido";
                return null;//izq>der;
            case LenguajeDeProgramacionParser.MEN:
                traduccion+="if_icmplt Contenido";
                return null;//izq<der;
            case LenguajeDeProgramacionParser.IGU:
                traduccion+="if_icmpeq Contenido";
                return null;//izq==der;
            case LenguajeDeProgramacionParser.DIF:
                traduccion+="if_icmpne Contenido";
                return null;//izq!=der;
            case LenguajeDeProgramacionParser.MAYIGU:
                traduccion+="if_icmpge Contenido";
                return null;//izq>=der;
            case LenguajeDeProgramacionParser.MENIGU:
                traduccion+="if_icmple Contenido";
                return null;//izq<=der;
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
            cic++;
            traduccion+="CicloCic"+cic+": "+System.lineSeparator();
            visit(ctx.condicion());
            traduccion+="Cic"+cic  + System.lineSeparator();
            traduccion+="goto ContinuacionCic"+cic+System.lineSeparator();
            traduccion+="ContenidoCic"+cic+": "+System.lineSeparator();
            memoria = new Nodo (memoria);
            visit(ctx.contenido());
            traduccion+="goto CicloCic"+cic+System.lineSeparator();
            memoria = memoria.anterior;
            traduccion+="ContinuacionCic"+cic+": "+System.lineSeparator();
        return null;
    }

    @Override public Integer visitIntnegativo(LenguajeDeProgramacionParser.IntnegativoContext ctx) {
        return Integer.valueOf("-"+ctx.INT().getText()); }


}
