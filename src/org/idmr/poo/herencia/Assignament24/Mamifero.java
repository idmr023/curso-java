package org.idmr.poo.herencia.Assignament24;

abstract public class Mamifero {
    String habitat;
    Double altura;
    Double largo;
    Double peso;
    String nomCientifico;

    public Mamifero(String habitat, Double altura, Double largo, Double peso, String nomCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nomCientifico = nomCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNomb_cientifico() {
        return nomCientifico;
    }

    public void setNomb_cientifico(String nomCientifico) {
        this.nomCientifico = nomCientifico;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

}
