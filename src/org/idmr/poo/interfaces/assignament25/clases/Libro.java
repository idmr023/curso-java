package org.idmr.poo.interfaces.assignament25.clases;

import org.aguzman.poointerfaces.imprenta.assignament25.interfaces.*;

import java.util.Date;

public class Libro extends Producto implements ILibro, IProducto {

    Date fcehaPublicacion;
    String autor;
    String titulo;
    String editorial;

    public Libro(int precio, Date fcehaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fcehaPublicacion = fcehaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Date getFchaPublicacion() {
        return fcehaPublicacion;
    }

    public void setFchaPublicacion(Date fchaPublicacion) {
        this.fcehaPublicacion = fchaPublicacion;
    }



    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }

    @Override
    public Date getFechaPublicacion() {
        return null;
    }
}
