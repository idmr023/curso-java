package org.idmr.básico.flujoControl;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //Hasta el número 127 Java hace el Autobxing automático a Integer primitivo a la hora de usar ==
        System.out.println("¿Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿Son el mismo objeto? " + (num1 == num2));

        System.out.println("¿Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("¿Tienen el mismo valor?" + (num1.intValue() == num2.intValue()));
    }
}
