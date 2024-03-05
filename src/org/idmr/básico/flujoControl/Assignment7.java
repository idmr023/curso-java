package org.idmr.básico.flujoControl;

public class Assignment7 {
    public static void main(String[] args) {
        int aux = 0;
        int[] valores = {211,625,930,124,5,666,47,81,9999,16};

        for (int i = 0; i < valores.length-1; i++) {
            aux = valores[i];
            if(valores[i+1] < aux) aux = valores[i+1];

        }

        String salida = aux < 10 ? "El numero menor de la serie: " + aux + ", es menor que 10!" : "El numero menor de la serie: " + aux + ", es igual o mayor que 10";
        System.out.println(salida);

    }
}
