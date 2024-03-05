package Section9_claseSystem;

import java.util.Properties;
//https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator2 " + lineSeparator2 + "Una línea más");

        Properties p = System.getProperties();
        //p.list(System.out);
        //Lista todas las configuraciones del Sistema
    }
}
