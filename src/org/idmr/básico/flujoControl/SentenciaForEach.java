package org.idmr.básico.flujoControl;
public class SentenciaForEach {
    public static void main(String[] args) {
        //for each solo se usa sobre arrays u objetos de colección de Java
        int[] numeros = {1, 3, 5, 7, 9, 11 ,13, 15};
        for (int num: numeros){
            System.out.println("num = " + num);
        }
        
        String[] nombres = {"Andres", "Pepe", "María", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        //variable de turno : variable del array. Parece un map de React
        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
        
    }
}
