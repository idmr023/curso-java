package org.idmr.poo.herencia.Assignament24;

public class Caninos extends Mamifero {

    String color;
    Double tamanoColmillos;

    public Caninos(String habitat, Double altura, Double largo, Double peso, String nomCientifico, String color, Double tamanoColmillos) {
        super(habitat, altura, largo, peso, nomCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }
}
