public class Assignament14 {
    public static void main(String[] args) {
        int[] arreglo = {14, 33, 15, 2800, 2801, 21, 43};
        int menor = arreglo[0];

        for(int i = 1; i < arreglo.length; i++){
            if (arreglo[i] > menor) {
                menor = arreglo[i];
            }
        }

        System.out.println("El número mayor es = " + menor);

    }
}