package org.idmr.estructura_de_datos_no_primitiva.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        //De la misma manera
        Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a));
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts = " + ts);
    }
}
