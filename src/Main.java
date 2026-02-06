import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try {
            int n = LeerNumero.leer();
            ArrayList<String> lineas = GenerarLineas.generar(n);
            EscribirFichero.escribir("salida.txt", lineas);

            System.out.println("Fichero salida.txt generado correctamente.");

        } catch (Exception e) {
            System.out.println("Error en la ejecución del programa.");
        }
    }
}