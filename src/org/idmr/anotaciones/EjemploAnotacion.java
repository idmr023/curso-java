package org.idmr.anotaciones;

import org.idmr.anotaciones.models.Producto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa de centro roble");
        p.setPrecio(1000L);
        Field[] atributos = p.getClass().getDeclaredFields();

        String json = Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JSONAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JSONAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JSONAtributo.class).nombre();

                    try {
                        return "\"" + nombre + "\":\"" + f.get(p) + "\"";
                    } catch (IllegalAccessException e){
                        throw new RuntimeException("Error");
                    }

                })
                .reduce("{", (a,b) -> {
                    if("{".equals(a)){
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
        System.out.println("json = " + json);
    }
}
