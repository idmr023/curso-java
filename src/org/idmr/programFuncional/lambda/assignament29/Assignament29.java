package org.idmr.programFuncional.lambda.assignament29;

public class Assignament29 {
    public static void main(String[] args) {

        FormatearFrase format = frase -> {
            return frase.replace(".", "")
                    .replace(",", "")
                    .replace(" ", "")
                    .toUpperCase();
        };

        String resultado = format.limpiarYformatear("Pedro Pablo Pérez Pereira, pobre pintor portugués, pinta paisajes por poca plata, para pasear por París.");
        System.out.println(resultado);
    }
}
