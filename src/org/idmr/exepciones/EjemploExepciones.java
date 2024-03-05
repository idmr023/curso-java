package org.idmr.exepciones;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EjemploExepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor = 0;

        try {
            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        } catch (FormatoNumeroException e) {
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Es opcional, pero se ejecuta siempre");
        }
        System.out.println("Continuamnos con el flujo de nuestra aplicación");
    }
}