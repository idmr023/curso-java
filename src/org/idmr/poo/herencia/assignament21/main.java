package org.idmr.poo.herencia.assignament21;

public class main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pablo", "Marquez", "72365187", "Calle Santa Paula 177", 200);
        String texto = gerente.toString();
        System.out.println("Datos = " + texto);
    }
}
