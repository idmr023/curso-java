package Section10_claseMath;
import java.util.Random;

public class EjemploRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random();
        random *= colores.length;

        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        //El objetivo tipo Random incluye negativos
        //Ejemplo con rango de 15 a 25
        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);


        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
