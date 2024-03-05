package org.idmr.poo.interfaces.generics;

import org.idmr.poo.interfaces.pooointerfaces.modelo.Cliente;

public class ClientePremium extends Cliente implements Comparable<ClientePremium>{
    public ClientePremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(ClientePremium o) {
        return 0;
    }
}
