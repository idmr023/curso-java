    package org.idmr.poo.interfaces.assignament26;

    public class Fruta extends Producto{

        double peso;
        String color;

        public Fruta(String nombre, Double precio, double peso, String color) {
            super(nombre, precio);
            this.peso = peso;
            this.color = color;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String retornar(String nombre, Double precio) {
            return super.retornar(nombre, precio) +
                    "\n Peso: " + peso +
                    "\n Color" + color;
        }
    }
