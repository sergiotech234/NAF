import java.util.ArrayList;

public class GenerarLineas {
    public static ArrayList<String> generar(int numero){
        ArrayList<String> linea = new ArrayList<>();
        for(int i=1;i<=numero;i++){
            StringBuilder builder = new StringBuilder();
            for(int j=1;j<=i;j++){
                builder.append(j).append(" ");
            }
            linea.add(builder.toString().trim());
        }
        return linea;
    }
}
