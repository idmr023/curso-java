package org.idmr.básico.operadores;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        
        System.out.println("Ingrese el primer número");
        a = sc.nextInt();
        
        System.out.println("Ingrese el segundo número");
        b = sc.nextInt();
        
        String resultado= a > b ? "El número mayor es"+a : "El número mayor es"+b;
        System.out.println(resultado);
    }
}
