package org.idmr.estructura_de_datos_no_primitiva.map;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put("Nombre", "Juan");
        persona.put("Apellido", "Orgañez");
        persona.put("Email", "idmr_02@outlook.com");
        persona.put("Ead", "38");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("Pais", "USA");
        direccion.put("Estado", "California");
        direccion.put("Ciudad", "Santa Barbara");
        direccion.put("Calle", "One Street");
        direccion.put("Numero", "128");

        persona.put("Dirección", direccion);

        System.out.println("persona = " + persona);

        String apellido = (String) persona.get("Apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>)persona.get("Dirección");
        String pais = direccionPersona.get("Pais");
        String ciudad = direccionPersona.get("Ciudad");
        String barrio = direccionPersona.getOrDefault("Barrio", "La Playa");

        System.out.println("pais = " + pais);
        System.out.println("ciudad = " + ciudad);
        System.out.println("barrio = " + barrio);

        boolean b = persona.remove("apellidoPaterno", "Doe");
        System.out.println("Eliminado " + b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsValue("john.doe@gmail.com");
        System.out.println("b2 = " + b2);

        Collection<Object> valores = persona.values();
        for(Object v: valores){
            System.out.println(v);
        }
        
        Set<String> llaves = persona.keySet();

        System.out.println("============================ value");
        for (String k : llaves){
            System.out.println("k = " + k);
        }

        System.out.println("============================ entrySet");
        for(Map.Entry<String, Object> par : persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
            Object valor = par.getValue();
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            } else {
                System.out.println(par.getKey() + " => " + valor);
            }
        }

        System.out.println("============================ keySet");
        for (String llave : persona.keySet()){
            Object valor = persona.get(llave);
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El país de " + nom + ": " + direccionMap.get("Pais"));
                System.out.println("El estado de " + nom + ": " + direccionMap.get("Estado"));
                System.out.println("La ciudad de " + nom + ": " + direccionMap.get("Ciudad"));
            } else {
                System.out.println(persona.get(llave) + " => " + valor);
            }
        }

        System.out.println("============================ java 8 forEach");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("Total: " + persona.size());
        System.out.println("Contiene elementos= " + !persona.isEmpty());
        boolean b3 = persona.replace("Nombre", "Juan", "Andrés");
        System.out.println("b3 = " + b3);
        System.out.println("persona = " + persona);
    }
}