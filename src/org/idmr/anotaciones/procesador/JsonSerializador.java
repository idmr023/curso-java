package org.idmr.anotaciones.procesador;

import org.idmr.anotaciones.JSONAtributo;
import org.idmr.anotaciones.Init;
import org.idmr.anotaciones.procesador.exception.JsonSerializadorException;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;

public class JsonSerializador {

    public static void inicializarObjeto(Object object){
        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto a serializar no puede ser null!");
        }
        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m-> {
                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException(
                                "Error al serializar, no se puede iniciar el objeto"
                        + e.getMessage());
                    }
                });
    }

    public static String convertirJson(Object object){

        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto a serializar no puede ser null!");
        }
        inicializarObjeto(object);
        Field[] atributos = object.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JSONAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JSONAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JSONAtributo.class).nombre();
                    try {
                        Object valor = f.get(object);
                        if(f.getAnnotation(JSONAtributo.class).capitalizar() &&
                        valor instanceof String){
                            String nuevoValor = (String) valor;
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                            .map(palabra -> palabra.substring(0, 1).toUpperCase()
                            + palabra.substring(1).toLowerCase())
                            .collect(Collectors.joining(" "));

                            f.set(object, nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializar a json: " + e.getMessage());
                    }
                })
                .reduce("{" , (a,b) -> {
                    if("{".equals(a)){
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }
}
