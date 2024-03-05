package org.idmr.básico.flujoControl;

import java.util.Scanner;

public class Assignament9 {
    public static void main(String[] args) {
        double a, b;
        double sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        a = sc.nextDouble();

        System.out.println("Ingrese el segundo número");
        b = sc.nextDouble();

        for (int i = 0; i <= b-1 ; i++) {
            sum = a + sum;
        }
        System.out.println("El resultado es: " + sum);
    }
}