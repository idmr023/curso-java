package org.idmr.programFuncional.stream.models;

public class Factura {

    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }

    private String descripcion;
    private Usuario usuario;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
