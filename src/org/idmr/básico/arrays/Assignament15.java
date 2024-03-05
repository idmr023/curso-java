import java.util.Scanner;

public class Assignament15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i, numPosi = 0, numNega = 0, ceros = 0;
        int j = 0, k = 0;
        int promPosi, promNega;
        int arreglo[];
        arreglo = new int[7];

        for (i = 0; i < 7; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }

        for(i = 0; i < arreglo.length; i++){
            if(arreglo[i] > 0){
                numPosi += arreglo[i];
                j++;
            } else if (arreglo[i] < 0){
                numNega += arreglo[i];
                k++;
            } else if (arreglo[i] == 0) {
                ceros++;
            } else {
                System.out.println("Error");
            }
        }

        promPosi = numPosi / j;
        promNega = numNega / k;

        System.out.println(
                "El promedio de números positivos es: " + promPosi +
                        "\n El promedio de números negativos es" + promNega +
                        "\n La cantidad de ceros es " + ceros
        );

    }
}
