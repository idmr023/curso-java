package org.idmr.básico.operadores;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Operadores {
    //Pre incremento - decremento
    int i = 1;
    int j = ++i;
    int j2 = --i;

    public static void main(String[] args) {
        String[] usernames = {"andres", "admin"};
        String[] passwords = {"12345", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        //Operador ternario
        for (int i = 0; i < usernames.length; i++){
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;
        }

        String resultado = esAutenticado ?
                "Bienvenido usuario ".concat(u).concat("!"):
                "Lo siento, requiere autenticación";
        System.out.println(resultado);
    }
}
