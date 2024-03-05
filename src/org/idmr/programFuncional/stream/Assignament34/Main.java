package org.idmr.programFuncional.stream.Assignament34;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(new Producto(12, 2), new Producto(14, 5));

        double sum = productos.stream()
                .map(p -> p.getCantidad() * p.getPrecio())
                .reduce(0d, Double::sum);
        System.out.println(sum);

    }
}
