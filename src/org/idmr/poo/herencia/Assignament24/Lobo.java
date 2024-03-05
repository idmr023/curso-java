package org.idmr.poo.herencia.Assignament24;

public class Lobo extends Caninos{
    int numCamada;
    String specieLobo;

    public Lobo(String habitat, Double altura, Double largo, Double peso, String nomCientifico, String color, Double tamanoColmillos, int numCamada, String specieLobo) {
        super(habitat, altura, largo, peso, nomCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.specieLobo = specieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getSpecieLobo() {
        return specieLobo;
    }

    public void setSpecieLobo(String specieLobo) {
        this.specieLobo = specieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo  " + this.specieLobo + " caza junto a su grupo en las llanuras africanas";
    }
    @Override
    public String dormir() {
        return "El Lobo duerme junto a su grupo en " + this.habitat;
    }
    @Override
    public String correr() {
        return "El Lobo corre junto a su grupo de " + this.specieLobo + " en" + this.habitat;
    }
    @Override
    public String comunicarse() {
        return "El Lobo" + this.color + "se comunica con su grupo en las llanuras africanas";
    }
}
