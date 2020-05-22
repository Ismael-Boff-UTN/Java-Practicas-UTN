
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej4 {

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        Scanner sc = new Scanner(System.in);
        double numeritos[] = new double[5];
        cargarArray(sc, numeritos);
        mostrarArrayCargado(numeritos);
        mostrarMayorMenor(numeritos);

    }

    public static void cargarArray(Scanner sc, double numeritos[]) {
        System.out.println("----------------------------");
        System.out.println("Ingrese 5 valores decimales");

        for (int i = 0; i < numeritos.length; i++) {

            numeritos[i] = sc.nextDouble();

        }
    }

    public static void mostrarArrayCargado(double numeritos[]) {
        String cadena = "";
        for (int i = 0; i < numeritos.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (numeritos[i]);

        }
        System.out.println("----------------------------");
        System.out.println("Valores cargados  : " + "[ " + cadena + " ]");
    }

    public static void mostrarMayorMenor(double numeritos[]) {
        double mayor = 0;
        double menor = numeritos[0];

        for (int i = 0; i < numeritos.length; i++) {
            if (numeritos[i] > mayor) {
                mayor = numeritos[i];
            } else if (numeritos[i] < menor) {
                menor = numeritos[i];
            }

        }
        System.out.println("--------------------------");
        System.out.println("El mayor es : " + "[ " + mayor + " ]");
        System.out.println("--------------------------");
        System.out.println("El menor es : " + "[ " + menor + " ]");
        System.out.println("--------------------------");
        double resta = mayor - menor;
        System.out.println("Diferencia : " + "[ " + resta + " ]");
        System.out.println("--------------------------");

    }

}
