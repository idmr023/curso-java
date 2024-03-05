package org.idmr.poo.herencia.assignament22;
public class main {
    public static void main(String[] args) {
        Producto[] lista = new Producto[]{
                new Lacteo("Leche", 12.2, 2, 200),
                new Lacteo("Yogurt", 15.2, 4, 250),
                new Fruta("Manzana", 2.2, 5, "rojo"),
                new Fruta("Manzana", 2.5, 5, "verde"),
                new Limpieza("Clorox", 1.3, "CO2", 1.5),
                new Limpieza("Escoba", 10.0, "madera", 1),
                new NoPerecible("Madera", 1.5, 1, 40),
                new NoPerecible("Me quede sin ideas", 1.56, 12, 400)
        };

        for (Producto prod : lista) {
            System.out.println("-------------------------------- " + prod.getClass().getSimpleName() + "---------------------------------");
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
            }
        }

    }
}
