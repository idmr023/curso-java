package org.idmr.básico.operadores;

import java.util.Scanner;

public class Assignmanet5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double capacidadActual;
        String resultado;
        System.out.println("Ingrese la capacidad actual del tanque");
        capacidadActual = sc.nextDouble();
        boolean condicional = capacidadActual instanceof Number;
        
        if (condicional) {
            if (capacidadActual == 70) {
                resultado = "Estanque lleno";
            } else if (capacidadActual >= 60 && capacidadActual < 70) {
                resultado = "Estanque casi lleno";
            } else if (capacidadActual >= 40 && capacidadActual < 60) {
                resultado = "Estanque 3/4";
            } else if (capacidadActual >= 35 && capacidadActual < 40) {
                resultado = "Medio Estanque";
            } else if (capacidadActual >= 20 && capacidadActual < 35) {
                resultado = "Suficiente";
            } else if (capacidadActual >= 1 && capacidadActual < 20) {
                resultado = "Insuficiente";
            } else {
                resultado = "Capacidad fuera de rango";
                main(args);
            }
            System.out.println(resultado);
        } else {
            System.out.println("Sólo se permiten ingresar números");
        }
    }
}
