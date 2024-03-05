package org.idmr.estructura_de_datos_no_primitiva.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        persona.put("nombre", "Juan");
        persona.put("apellido", "Orgañez");
        persona.put("email", "idmr_02@outlook.com");
        persona.put("ead", "38");

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "128");

        persona.put("Dirección", direccion);
        System.out.println("persona = " + persona);

    }
}