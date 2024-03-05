import javax.swing.*;

public class Assignament19 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz:"));

        if( n == 0){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Error, n no puede ser 0");
            main(args);
        }

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n / 2 && j != 0 && j != n - 1 || j == n - 1 && i >= n / 2) {
                    matriz[i][j] = 1;
                }
            }
        }

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento);
            }
            System.out.println();
        }
    }
}
