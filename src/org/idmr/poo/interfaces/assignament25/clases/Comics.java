package org.idmr.poo.interfaces.assignament25.clases;

import java.util.Date;

public class Comics extends Libro{
    String personaje;

    public Comics(int precio, Date fcehaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fcehaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }

}
