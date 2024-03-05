package org.idmr.threads.ejemplosync;

import org.ivan.thread.ejemplosync.runable.Consumidor;
import org.ivan.thread.ejemplosync.runable.Panadero;

public class EjemploProdcuctorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
