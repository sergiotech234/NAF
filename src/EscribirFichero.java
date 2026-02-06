import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class EscribirFichero {
    public static void escribir(String fichero, ArrayList<String> linea) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Salida.txt"))) {
            for (String l : linea) {
                bw.write(l);
                bw.newLine();
            }
        }
    }
}
