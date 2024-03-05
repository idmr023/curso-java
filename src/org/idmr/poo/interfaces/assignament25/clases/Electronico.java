package org.idmr.poo.interfaces.assignament25.clases;

import org.aguzman.poointerfaces.imprenta.assignament25.interfaces.*;

public abstract class Electronico implements IElectronico, IProducto {
    String fabricante;

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
