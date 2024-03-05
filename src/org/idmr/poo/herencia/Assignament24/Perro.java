package org.idmr.poo.herencia.Assignament24;

public class Perro extends Caninos{
    int mordidaPSI;

    public int getMordidaPSI() {
        return mordidaPSI;
    }

    public void setMordidaPSI(int mordidaPSI) {
        this.mordidaPSI = mordidaPSI;
    }

    public Perro(String habitat, Double altura, Double largo, Double peso, String nomCientifico, String color, Double tamanoColmillos, int mordidaPSI) {
        super(habitat, altura, largo, peso, nomCientifico, color, tamanoColmillos);
        this.mordidaPSI = mordidaPSI;
    }

    @Override
    public String comer() {
        return "El Perro, cuya potencia de mordida es  " + this.mordidaPSI + " caza junto a su grupo en las llanuras africanas";
    }
    @Override
    public String dormir() {
        return "El Perro duerme junto a su grupo en " + this.habitat;
    }
    @Override
    public String correr() {
        return "El Perro" + this.color + "corre junto a su grupo en" + this.habitat;
    }
    @Override
    public String comunicarse() {
        return "El Perro" + this.color + "se comunica con su grupo en las llanuras africanas";
    }
}
