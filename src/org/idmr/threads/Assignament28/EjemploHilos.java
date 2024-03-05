package org.idmr.threads.Assignament28;

import org.ivan.thread.Assignament28.AlfaNumerico;
import org.ivan.thread.Assignament28.Tipo;

public class EjemploHilos {

    public static void main(String[] args) {

        AlfaNumerico h1 = new AlfaNumerico(Tipo.LETRA);
        AlfaNumerico h2 = new AlfaNumerico(Tipo.NUMERO);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
    }
}
