package com.example.lenguaje;

import java.util.HashMap;

public class Nodo {
    HashMap<String,Integer> datos;
    Nodo anterior;

    Nodo(Nodo padre){
        anterior= padre;
        datos= new HashMap<String,Integer>();
    }

    public boolean existe(String id){
        if (this.datos.containsKey(id)){
            return true;
        }
        else if(this.anterior!=null){
            return this.anterior.existe(id);
        }
        return false;
    }

    public Integer obtener(String id){
        if (this.datos.containsKey(id)){
            return this.datos.get(id);
        }
        else{
            return this.anterior.obtener(id);
        }
    }

    public void ingresar(String id, int valor){
        if (this.datos.containsKey(id)){
            this.datos.replace(id,valor);
        }
        else{
            this.anterior.ingresar(id,valor);
        }
    }

}
