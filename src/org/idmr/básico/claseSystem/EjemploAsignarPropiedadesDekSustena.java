package Section9_claseSystem;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDekSustena {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.puerto.nombre"));
            System.out.println(System.getProperty("config.puerto.email"));

            ps.list(System.out);
        } catch (Exception e){
            System.out.println("No existe el archivo = " + e);
        }
    }
}
