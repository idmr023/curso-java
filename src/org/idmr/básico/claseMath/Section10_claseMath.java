package Section10_claseMath;

public class Section10_claseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(100.00);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): +"+ Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0) = " + Math.cos(radianes));
    }
}