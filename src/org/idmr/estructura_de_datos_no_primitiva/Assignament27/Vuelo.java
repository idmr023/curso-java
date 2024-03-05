package org.idmr.estructura_de_datos_no_primitiva.Assignament27;

import java.util.Date;

public class Vuelo {
    String nombre;
    String origen;
    String destino;
    Date fecLlegada;
    int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fecLlegada, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecLlegada = fecLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecLlegada() {
        return fecLlegada;
    }

    public void setFecLlegada(Date fecLlegada) {
        this.fecLlegada = fecLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo: " + nombre + ", Origen: " + origen + ", Destino: " + destino + ", Fecha de llegada: " + fecLlegada + ", Cantidad de pasajeros: " + cantidadPasajeros;
    }

}
