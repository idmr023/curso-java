package org.idmr.estructura_de_datos_no_primitiva.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez : peces){
            if(!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);

        System.out.println(unicos.size() + " elementos no duplicdos: " + unicos);
        System.out.println("duplicados = " + duplicados);
    }
}
