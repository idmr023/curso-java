package org.idmr.estructura_de_datos_no_primitiva.set;

import org.aguzman.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 3));
        sa.add(new Alumno("Joaquin", 10));
        sa.add(new Alumno("Patricio", 6));
        sa.add(new Alumno("Patricio", 6));
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
        //El forEach está en todas las Collections
        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }

}