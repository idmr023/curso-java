package org.idmr.poo.herencia.Assignament24;

public class Felinos extends Mamifero{
    Double tamanoGarras;
    int velocidad;

    public Felinos(String habitat, Double altura, Double largo, Double peso, String nomCientifico, Double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nomCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Double getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(Double tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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
