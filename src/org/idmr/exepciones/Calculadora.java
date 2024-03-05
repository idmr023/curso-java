package org.idmr.exepciones;

public class Calculadora {
    public double dividir(int numerador, int divisor){
        if (divisor == 0) {
            System.out.println("¡No se puede dividir por cero!");
        } return numerador / (double) divisor;
    }

    public double dividir (String numerador, String divisor) throws FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException e){
            throw new FormatoNumeroException("Debe ingresar un número en el numerador y divisor");
        }
    }
}
