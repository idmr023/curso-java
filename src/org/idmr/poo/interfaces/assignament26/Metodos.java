package org.idmr.poo.interfaces.assignament26;

public abstract interface Metodos{
    public default String retornar(String nombre, Double precio){
        return "Nombre: " + nombre +
                "\n Precio " + precio;
    }
}
