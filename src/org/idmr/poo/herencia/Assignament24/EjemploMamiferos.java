package org.idmr.poo.herencia.Assignament24;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[7];

        Mamifero leon = new Leon("Sur Africa", 120d, 5d, 7.5d, "Leonida", 120d, 220, 190, 2.2);
        Mamifero guepardo = new Guepardo("Africa", 4.9, 130d,  94d, "Guepardus", 140.4, 72);
        Mamifero lobo = new Lobo("Bosque", 1.2d, 3d, 25d, "Canis Lupus", "Gris", 8d, 4, "Canis Lupus");
        Mamifero perro = new Perro("Casa", 0.5d, 1.2d, 7d, "Canis Familiaris", "Marrón", 4d, 300);
        Mamifero tigre = new Tigre("Asia", 1.8d, 4d, 150d, "Panthera Tigris", 100d, 50, "Bengala");

        // Nuevas instancias
        Mamifero leon2 = new Leon("Norte Africa", 110d, 4.5d, 6.8d, "Leonidas", 110d, 200, 180, 2.2);
        Mamifero guepardo2 = new Guepardo("Africa", 4.5, 125d, 94d, "Guepardus", 140.4, 70);

        mamiferos[0] = leon;
        mamiferos[1] = guepardo;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigre;
        mamiferos[5] = leon2;
        mamiferos[6] = guepardo2;
    }
}
