package org.idmr.estructura_de_datos_no_primitiva.set;

import java.util.*;

public class EjemplosHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs);

        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);

        System.out.println(lista);
        boolean b = hs.add("tres");
        System.out.println("¿Permite elementos duplicados? " + b);
    }
}