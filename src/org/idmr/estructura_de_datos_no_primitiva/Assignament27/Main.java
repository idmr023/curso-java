package org.idmr.estructura_de_datos_no_primitiva.Assignament27;

import org.aguzman.ejemplos.modelo.Alumno;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static Date Fecha(String fechaStr) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date fecha = dateFormat.parse(fechaStr);
        return fecha;
    }

    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        List<Vuelo> listaVuelos = new ArrayList<>();
        listaVuelos.add(new Vuelo("AAL 933", "New York", "Santiago", df.parse("2021-08-29 05:39"), 62));
        listaVuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", df.parse("2021-08-31 04:45"), 47));
        listaVuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", df.parse("2021-08-30 16:00"), 52));
        listaVuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", df.parse("2021-08-29 13:22"), 59));
        listaVuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", df.parse("2021-08-31 14:05"), 25));
        listaVuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", df.parse("2021-08-31 05:20"), 29));
        listaVuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", df.parse("2021-08-30 08:45"), 55));
        listaVuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", df.parse("2021-08-29 07:41"), 51));
        listaVuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", df.parse("2021-08-30 10:35"), 48));
        listaVuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", df.parse("2021-08-29 09:14"), 59));
        listaVuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", df.parse("2021-08-31 08:33"), 31));
        listaVuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", df.parse("2021-08-31 15:15"), 29));
        listaVuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", df.parse("2021-08-30 08:14"), 47));
        listaVuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", df.parse("2021-08-29 22:53"), 60));
        listaVuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", df.parse("2021-08-31 09:57"), 32));
        listaVuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", df.parse("2021-08-31 04:00"), 35));
        listaVuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", df.parse("2021-08-29 07:45"), 61));
        listaVuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", df.parse("2021-08-30 07:12"), 58));
        listaVuelos.add(new Vuelo("LAT 501", "París", "Santiago", df.parse("2021-08-29 18:29"), 49));
        listaVuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", df.parse("2021-08-30 15:45"), 39));

        listaVuelos.sort(Comparator.comparing(Vuelo::getFecLlegada));

        Vuelo ultViaje = listaVuelos.getLast();
        System.out.println("El último vuelo en llegar es: " + ultViaje.getNombre() + ": " + ultViaje.getOrigen() + ", aterriza el " + ultViaje.getFecLlegada());

        listaVuelos.sort((v1, v2) -> Integer.valueOf(v2.getCantidadPasajeros()).compareTo(v1.getCantidadPasajeros()));
        Vuelo vueloNenorNumero = new LinkedList<>(listaVuelos).peekLast();
        System.out.println("El vuelo con menor número de pasajeros es " + vueloNenorNumero.getNombre() + ": " + vueloNenorNumero.getOrigen()+ ", con " + vueloNenorNumero.getCantidadPasajeros() + " pasajeros.");

    }
}
