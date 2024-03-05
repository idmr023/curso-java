package org.idmr.poo.interfaces.assignament25.clases;

public class IPhone extends Electronico{
    String color;
    String modelo;

    public IPhone(String fabricante, String color, String modelo) {
        super(fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public int getPrecio() {
        return 0;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
}
