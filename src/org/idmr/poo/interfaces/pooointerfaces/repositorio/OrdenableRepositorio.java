package org.idmr.poo.interfaces.pooointerfaces.repositorio;

import pooointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
