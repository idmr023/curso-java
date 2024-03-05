package org.idmr.poo.interfaces.pooointerfaces.repositorio;

import pooointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
