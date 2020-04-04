
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */

/*
Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores
numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los
números mediante un bucle.

*/
public class ej2 {

    private static int numeros[] = new int[5];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargarArray();
    }

    public static void cargarArray() {
        System.out.println("Ingrese 5 numeros enteros : ");
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = sc.nextInt();
        }

        tabularArray1D("Array : ", numeros);
    }

    public static boolean tabularArray1D(String texto, int Array1D[]) {
        String cadena = "";
        for (int i = 0; i < Array1D.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (Array1D[i]);
        }
        System.out.println("----------------------------------------------------");
        System.out.println(texto + "[ " + cadena + " ]");
        System.out.println("----------------------------------------------------");

        return false;
    }
}
