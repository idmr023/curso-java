package org.idmr.básico.flujoControl;

import javax.swing.*;

public class Asiggnament10 {
    public static void texto(String msj){
        System.out.println(msj);
    }

    public static void main(String[] args) {
        String ingreso = JOptionPane.showInputDialog("Ingrese el número para consultar \n" +
                "1. Actualizar \n" +
                "2. Eliminar \n" +
                "3. Agregar \n" +
                "4. Listar \n" +
                "5. Salir");

        int opcion = Integer.parseInt(ingreso);

        switch (opcion){
            case 1: texto("Actualizar"); break ;
            case 2: texto("Eliminar"); break ;
            case 3: texto("Actualizar"); break ;
            case 4: texto("Agregar"); break ;
            case 5: System.exit(0); break ;
            default: texto("Error");
        }
    }
}
