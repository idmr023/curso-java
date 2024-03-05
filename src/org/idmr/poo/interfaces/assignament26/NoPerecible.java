package org.idmr.poo.interfaces.assignament26;

public class NoPerecible extends Producto{

    int contenido;
    int calorias;

    public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String retornar(String nombre, Double precio) {
        return super.retornar(nombre, precio) +
                "\n Contenido: " + contenido +
                "\n Calorias" + calorias;
    }
}
