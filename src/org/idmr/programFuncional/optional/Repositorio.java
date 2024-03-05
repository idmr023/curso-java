package org.idmr.programFuncional.optional;

import org.idmr.programFuncional.optional.models.*;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
