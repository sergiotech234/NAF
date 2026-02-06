import java.util.Scanner;

public class LeerNumero {
    public static  int leer() {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero = Teclado.nextInt();
        Teclado.close();
        return numero;
    }
}
