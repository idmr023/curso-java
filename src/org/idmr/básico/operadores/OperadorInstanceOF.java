
package org.idmr.básico.operadores;

public class OperadorInstanceOF {

    public static void main(String[] args) {
        //El operador instanceof devuelve true si el valor es del tipo de referencia indicado. Los ancestros son instance of de hijos, pero no los hijos no lo son de los ancestros
        String text = "Probando, 1, 2 ,3";

        Integer num = 4;

        boolean b1 = text instanceof String;
        System.out.println("Texto es del tipo String = "+ b1);
        //True pq Object es el anscentro de todos los elementos
        b1 =num  instanceof Object;
        System.out.println("num es del tipo Object = "+ b1);
        //True pq String e Integer comparten al Object como anscentro
        b1= num instanceof Integer;
        System.out.println("num es del tipo Integer "+ b1);
        //b1= num instanceof Short; sale error pq no tienen  ningún ancestro en común
        
        Double decimal = 133.444;
        
        b1 = decimal instanceof Number;
        System.out.println("Decimal es del tipo number "+ b1);
        
        b1 = decimal instanceof Object;
        System.out.println("Decimal es del tipo Object "+ b1);
    }
}
