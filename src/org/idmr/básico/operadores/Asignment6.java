package org.idmr.básico.operadores;

import java.util.Scanner;

public class Asignment6 {
    private static String encontrarNombreMasLargo(String[] nombres) {
        String nombreMasLargo = "";

        for (String nombre : nombres) {
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;
            }
        }

        return nombreMasLargo;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombres[] = new String[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre y apellido de la persona "+i);
            nombres[i] = sc.nextLine();
            String[] nombre_separado = nombres[i].split(" ");
        }
        
        String nombreMasLargo = encontrarNombreMasLargo(nombres);
        
    }
}
