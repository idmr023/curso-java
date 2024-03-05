package org.idmr.programFuncional.lambda;

import org.idmr.programFuncional.lambda.models.Usuario;

import java.util.*;
import java.util.function.*;

public class EjemploConsumer {
    public static void main(String[] args) {
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + " " + edad);
        consumidorBi.accept("pepe", 20);

        // Significa que el argumento que reciba lo imprima
        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("Andres", "Pepe", "Luz");
        nombres.forEach(consumidor2);

        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andrés");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";

        System.out.println(proveedor.get());
    }
}
