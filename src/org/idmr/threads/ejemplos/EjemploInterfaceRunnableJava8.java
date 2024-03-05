package org.idmr.threads.ejemplos;

import org.ivan.thread.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
        Runnable viaje = () -> {
            for(int i = 0; i < 10; i ++){
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long)(Math.random() * 1000));
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(" Finalmente me voy de viaje a: " + Thread.currentThread());
        };

        Thread v1 = new Thread(new ViajeTarea("Isla de Pascua"));
        Thread v2 = new Thread(new ViajeTarea("Robinson Crusoe"));
        Thread v3 = new Thread(new ViajeTarea("Juan Fernandez"));
        Thread v4 = new Thread(new ViajeTarea("Isla de Chiloe"));

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        v1.join();
        v2.join();
        v3.join();
        v4.join();

        System.out.println("Continuando con la ejecución del método main: " + main.getName());

    }
}
