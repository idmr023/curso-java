package org.idmr.poo.interfaces.assignament26;

public class Limpieza extends Producto{

    double litros;
    String componentes;

    public Limpieza(String nombre, Double precio, double litros, String componentes) {
        super(nombre, precio);
        this.litros = litros;
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    @Override
    public String retornar(String nombre, Double precio) {
        return super.retornar(nombre, precio) +
                "\n Litros: " + litros +
                "\n Componentes" + componentes;
    }
}
