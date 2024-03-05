package org.idmr.programFuncional.stream;

import org.idmr.programFuncional.stream.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        boolean usuario = Stream
                .of("Pato Guzman", "Paco", "Pepe Mena", "Pepe Gutierrez", "Patricio")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split("")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(1));

        System.out.println(usuario);
    }
}