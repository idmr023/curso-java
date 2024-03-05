package org.idmr.programFuncional.stream;


import java.util.function.Function;
import java.util.stream.IntStream;

public class Assignament32 {
    public static void main(String[] args) {
        Function<IntStream, Integer> maximo = u -> u.reduce(Integer.MIN_VALUE, Math::max);
        // reduce se utiliza para combinar los elementos del flujo en un solo resultado. Apuntar todos los comandos posibles sin saturarme, hacerlo de marena didáctica, pero tampoco sin dejarlos de lado

        IntStream lista = IntStream.range(5, 2000);
        Integer resultado = maximo.apply(lista);

        System.out.println(resultado);
    }
}
