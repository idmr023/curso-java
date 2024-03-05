package org.idmr.poo.interfaces.generics;

import org.idmr.poo.interfaces.pooointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List clientes = new ArrayList();
        clientes.add(new Cliente("Andres", "Guzmán"));

        Cliente andres = (Cliente) clientes.get(0);

        Cliente[] clientesArreglo = {new Cliente("Luci", "Martínez"),
        new Cliente("Andres", "Guzmán")};

        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe", "Luci", "Bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernáncez")});
    }

    /*T se usa para trabajar con Arrays, esto permite convertir al método en uno genérico,
    * ya que este recibe a cualquier tipo de arrays*/
    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    //El extends sirve para que solo reciba un tipo de dato
    public static <T extends Number> List <T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List <T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T [] c, G[] x){
        for ( G elemento : x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
    //Recibe cualquier elemento Cliente como argumento, ya sean padres o hijos
    public static void imprimirClientes(List <? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }
}
