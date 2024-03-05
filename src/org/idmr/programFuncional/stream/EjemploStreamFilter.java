package org.idmr.programFuncional.stream;

import org.idmr.programFuncional.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco", "Pepe Mena", "Pepe Gutierrez", "Patricio")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split("")[1]))
                .filter(u -> u.getNombre().equals("Patricio"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.get());



    }
}