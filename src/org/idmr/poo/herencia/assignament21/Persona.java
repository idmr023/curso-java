package org.idmr.poo.herencia.assignament21;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String numeroFiscal;
    protected String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "---Datos de la persona---" +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nNúmero fiscal: " + numeroFiscal +
                "\nDirección: " + direccion;
    }
}
