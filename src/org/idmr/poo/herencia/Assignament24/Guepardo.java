package org.idmr.poo.herencia.Assignament24;

public class Guepardo extends Felinos{

    public Guepardo(String habitat, Double altura, Double largo, Double peso, String nomCientifico, Double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nomCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza con sus garras de " + this.tamanoGarras + " cm en las llanuras africanas";
    }
    @Override
    public String dormir() {
        return "El Guepardo duerme junto a su grupo en " + this.habitat;
    }
    @Override
    public String correr() {
        return "El Guepardo corre a una velocidad de  " + this.velocidad + " km/h" + this.habitat;
    }
    @Override
    public String comunicarse() {
        return "El Guepardo se comunica con su grupo en las llanuras africanas";
    }
}
