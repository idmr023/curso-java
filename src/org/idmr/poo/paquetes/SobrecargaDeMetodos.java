package org.idmr.poo.paquetes;

public class SobrecargaDeMetodos {
    public class Calculadora {

        public int sumar(int a, int b){
            return a + b;
        }

        public float sumar(float x, float y){
            return x + y;
        }

        public float sumar(int x, float y){
            return x + y;
        }
        public double sumar(float x, double y){
            return x + y;
        }
        public String sumar(String x, float y){
            return x + " " +  y;
        }


    }
}
