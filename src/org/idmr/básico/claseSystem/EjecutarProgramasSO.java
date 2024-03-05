package Section9_claseSystem;

public class EjecutarProgramasSO {

    public static boolean OSName(String OSName){
        return System.getProperty("os.name").toLowerCase().startsWith(OSName);
    }

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if (OSName("windows")) {
                proceso = rt.exec("notepad");
            } else if (OSName("mac")){
                proceso = rt.exec("textedit");
            } else if (OSName("linux") ||OSName("nix")){
                proceso = rt.exec("textedit");
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e){
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
