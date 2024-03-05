package org.idmr.poo.herencia.Assignament24;

public class Leon extends Felinos{
    int manada;
    Double decibelRugido;

    public Leon(String habitat, Double altura, Double largo, Double peso, String nomCientifico, Double tamanoGarras, int velocidad, int manada, Double decibelRugido) {
        super(habitat, altura, largo, peso, nomCientifico, tamanoGarras, velocidad);
        this.manada = manada;
        this.decibelRugido = decibelRugido;
    }

    public int getManada() {
        return manada;
    }

    public void setManada(int manada) {
        this.manada = manada;
    }

    public Double getDecibelRugido() {
        return decibelRugido;
    }

    public void setDecibelRugido(Double decibelRugido) {
        this.decibelRugido = decibelRugido;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + this.manada + " individuos en las llanuras africanas";
    }
    @Override
    public String dormir() {
        return "El León duerme junto a su grupo en " + this.habitat;
    }
    @Override
    public String correr() {
        return "El León corre junto a su grupo de " + this.manada + " en" + this.habitat;
    }
    @Override
    public String comunicarse() {
        return "El León se comunica con su grupo a unos" + this.decibelRugido + " decibeles en las llanuras africanas";
    }
}
