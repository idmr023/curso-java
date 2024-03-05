package org.idmr.programFuncional.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamFilterOptions {
    public static void main(String[] args) {

        //Comprobar cuantos elementos se encuentran vacíos
        long count = Stream
                .of("Pato Guzman", "Paco", "Pepe Mena", "Pepe Gutierrez", "Patricio", "", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println(count);
        System.out.println("----------------------------");

        //Muestra los elementos una única vez
        Stream .of("Pato Guzman", "Paco", "Pepe Mena", "Pepe Gutierrez", "Patricio",
               "Pato Guzman", "Paco", "Pepe Mena", "Pepe Gutierrez", "Patricio")
                .distinct()
                .forEach(System.out::println);

        System.out.println("----------------------------");

        //Reduce está muy poderoso
        Stream<Integer> nombres = Stream.of(5, 200, 15, 20);
        
        int resultado = nombres.reduce(0, Integer::sum);

        System.out.println("resultado = " + resultado);

        System.out.println("----------------------------");

        //Reduce está muy poderoso
        IntStream names = IntStream.range(5, 20).peek(System.out::println);

        int resultado3 = nombres.reduce(0, Integer::sum);

        System.out.println("resultado = " + resultado3);
    }
}