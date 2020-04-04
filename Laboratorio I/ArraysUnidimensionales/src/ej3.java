
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */

/*
Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear
una función que rellene el array o arreglo con los múltiplos de un numero pedido por
teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array
contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.

*/
public class ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Defina el tamaño del array : ");

        int tamanio = sc.nextInt();
        int array[] = new int[tamanio];
        cargarArray(sc, array);
        mostrarArrayCargado(array);

    }

    public static void cargarArray(Scanner sc, int array[]) {
        System.out.println("----------------------------");
        System.out.println("INGRESE NUMERO A MULTIPLICAR");

        int numero = sc.nextInt();
        int tabla = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = numero * tabla;
            tabla++;

        }
    }

    public static void mostrarArrayCargado(int array[]) {
        String cadena = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (array[i]);

        }
        System.out.println("----------------------------");
        System.out.println("Valores Multiplos : " + "[ " + cadena + " ]");
        System.out.println("----------------------------");
    }
}
