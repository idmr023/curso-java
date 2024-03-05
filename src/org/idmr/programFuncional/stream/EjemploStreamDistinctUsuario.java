package org.idmr.programFuncional.stream;

import org.idmr.programFuncional.stream.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.*;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        //Map
        IntStream nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nom -> new Usuario(nom.split(" ")[0], nom.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        IntSummaryStatistics stats = nombres.summaryStatistics();
        System.out.println(stats.getMax());

        //Flatmap, sirve para filtrar

        Stream<Usuario> nombres2 = Stream
                .of("Pato Guzman", "Paco", "Pepe Mena", "Pepe Gutierrez", "Patricio")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split("")[1]))
                .flatMap(u -> {
                    if(u.getNombre().equalsIgnoreCase("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        System.out.println(nombres2.count());




    }
}
