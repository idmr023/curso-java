package org.idmr.básico.flujoControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "María", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;
        for (int i = 0; i <= count-1; i++) { //<= count-1 // -1 porque si bien el arreglo es de ese tamaño (8), el arreglo inicia desde 0 , lo que quiere decir que el último elemento será 7 (el tamaño - 1)
            if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("pepa".toLowerCase())) {
                continue; //sirve para el ciclo siga iterando sin necesidad de hacer nada cada vez que itere
            }
            System.out.println(i + ".-" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo 'Pepe' o 'Paca'");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }
    }
}
