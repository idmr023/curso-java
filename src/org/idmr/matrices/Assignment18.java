import javax.swing.*;

public class Assignment18 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas:"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas:"));

        if( n == 0 || x == 0){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Error, ni n ni x no pueden ser 0");
            main(args);
        }

        String[][] matriz = new String[n][x];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = "_";
                matriz[i][i] = "X";
                matriz[i][n - 1 - i] = "X";
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
