package org.idmr.estructura_de_datos_no_primitiva.set;

import org.aguzman.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 3));
        sa.add(new Alumno("Joaquin", 10));
        sa.add(new Alumno("Patricio", 6));
        sa.add(new Alumno("Patricio", 6));
        //Forma 1: Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
        //Forma 2: sa.sort((a,b) -> a.getNota().compareTo(b.getNota()));

        //Forma simplificada
        sa.sort(Comparator.comparing(Alumno::getNota));

        System.out.println(sa);

        System.out.println("Iterando usando un foreach");
        for(Alumno a: sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while e iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        //Forma simplificada: El forEach está en todas las Collections
        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
