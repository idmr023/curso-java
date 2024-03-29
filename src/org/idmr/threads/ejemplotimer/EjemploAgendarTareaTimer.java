package org.idmr.threads.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if(i > 0){
                    toolkit.beep();
                    System.out.println("Tarea " + i + " realizada en: "
                            + new Date() + " nombre del Thread: "
                            + Thread.currentThread().getName());
                    System.out.println("Finaliza el tiempo");
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }
            }
        },  0,5000);

        System.out.println("Agendamos una tarea para inmediata");
    }
}