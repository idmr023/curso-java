package org.idmr.poo.paquetes.hogar;

import org.idmr.poo.paquetes.jardin.Perro;

import static org.aguzman.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
