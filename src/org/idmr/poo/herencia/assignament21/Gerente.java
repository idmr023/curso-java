package org.idmr.poo.herencia.assignament21;

public class Gerente extends Persona{
    protected double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
