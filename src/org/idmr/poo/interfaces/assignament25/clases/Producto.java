package org.idmr.poo.interfaces.assignament25.clases;

import org.idmr.poo.interfaces.assignament25.interfaces.IProducto;

public abstract class Producto implements IProducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
