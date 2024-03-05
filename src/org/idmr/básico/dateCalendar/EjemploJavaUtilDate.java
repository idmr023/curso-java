package Section8_dateYcalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);

        //Ejemplos y que significa cada letra, "y", "s", "M": https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
    }
}
