package org.idmr.poo.interfaces.assignament26;

public class Lacteo extends Producto{

    int cantidad;
    int proteinas;

    public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String retornar(String nombre, Double precio) {
        return super.retornar(nombre, precio) +
                "\n Cantidad: " + cantidad +
                "\n Proteinas" + proteinas;
    }
}
