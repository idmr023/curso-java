package Section10_claseMath;

import javax.swing.*;
import static java.lang.Math.PI;

public class Assignment12_areaCirculo {
    public static void main(String[] args) {

        double r = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));

        double area = PI*Math.pow(r, 2);
        area = Math.round(area);

        System.out.println("El area de un círculo es:  " + area);
    }
}
