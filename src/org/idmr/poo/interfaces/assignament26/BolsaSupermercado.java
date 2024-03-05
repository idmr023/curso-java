package org.idmr.poo.interfaces.assignament26;

import java.util.*;

public class BolsaSupermercado<T> {

    private List<T> objetos;
    private int max = 5;

    public BolsaSupermercado(int max){
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void addProducto(T objeto){
        if(this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("no hay más espacio.");
        }
    }

    public T getProductos(T objeto){
        for (int i = 0; i >= objetos.size(); i ++){
            return objetos.get(i);
        }
        return null;
    }

}
