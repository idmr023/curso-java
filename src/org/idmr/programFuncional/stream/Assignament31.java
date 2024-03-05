package org.idmr.programFuncional.stream;

import java.util.stream.IntStream;

public class Assignament31 {
    public static void main(String[] args) {
        IntStream div = IntStream.rangeClosed(1, 100)
                .filter(n -> {
                    return n % 10 != 0;
                });
        Double resultado = div
                .mapToDouble(n -> n)
                .map(n -> n/2)
                .reduce(0, (a, b) -> Double.sum(a, b));

        System.out.println(resultado);
    }    


}
