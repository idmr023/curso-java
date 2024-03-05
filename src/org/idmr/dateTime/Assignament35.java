package org.idmr.dateTime;

import javax.swing.*;
import java.time.*;

public class Assignament35 {
    public static void main(String[] args) {
        String anos = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento");

        LocalDate fecha2 = LocalDate.parse(anos);
        LocalDate fecha1 = LocalDate.now();

        Period periodo = Period.between(fecha2, fecha1);
        
        System.out.println("Usted tiene = " + periodo.getYears() + " años " +
                periodo.getMonths() + " meses " + periodo.getDays() + " días");
    }
}
