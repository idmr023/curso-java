package Section8_dateYcalendar;

import java.util.*;

public class Assignment11_calcularEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Calendar calendario = Calendar.getInstance();
        Calendar calendario2 = Calendar.getInstance();

        System.out.println("Ingrese el día de nacimiento de la persona");
        int dia = sc.nextInt();

        System.out.println("Ingrese el mes de nacimiento de la persona");
        int mes = sc.nextInt();

        System.out.println("Ingrese el año de nacimiento de la persona");
        int ano = sc.nextInt();

        calendario.set(ano, mes, dia);

        Date fechaNac = calendario.getTime();

        Date fechaActual = calendario2.getTime();
        
        int edad = calendario2.get(Calendar.YEAR) - calendario.get(Calendar.YEAR);
        System.out.println("edad = " + edad);
    }
}