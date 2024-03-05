import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matemáticas");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promMaths = sumNotasMatematicas/claseMatematicas.length;
        double promHist = sumNotasHistoria/claseHistoria.length;
        double promLeng = sumNotasLenguaje/claseLenguaje.length;
        double promTotal = (promLeng + promHist + promMaths) / 3;

        System.out.println("Promedio clase matemáticas: " + promMaths);
        System.out.println("Promedio clase historia : " + promHist);
        System.out.println("Promedio clase lenguaje : " + promLeng);
        System.out.println("Promedio clase total : " + promTotal);

        System.out.println("Ingrese el identificador del alumno (de 0 - 6)");
        int id = s.nextInt();
        double promAlumno = (claseHistoria[id] + claseLenguaje[id] + claseMatematicas[id])/3;
        System.out.println("Promedio alumno Nro" + id + " : " + promAlumno);
    }
}
