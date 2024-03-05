package org.idmr.poo.herencia.Assignament24;

public class Tigre extends Felinos{
    String tigre;

    public Tigre(String habitat, Double altura, Double largo, Double peso, String nomCientifico, Double tamanoGarras, int velocidad, String tigre) {
        super(habitat, altura, largo, peso, nomCientifico, tamanoGarras, velocidad);
        this.tigre = tigre;
    }

    public String getTigre() {
        return tigre;
    }

    public void setTigre(String tigre) {
        this.tigre = tigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + this.habitat + " caza junto a su grupo en las llanuras africanas";
    }
    @Override
    public String dormir() {
        return "El Tigre duerme junto a su grupo en " + this.habitat;
    }
    @Override
    public String correr() {
        return "El Tigre" + this.tigre + "corre junto a su grupo en" + this.habitat;
    }
    @Override
    public String comunicarse() {
        return "El Tigre que vive en" + this.habitat + "se comunica con su grupo en las llanuras africanas";
    }
}
