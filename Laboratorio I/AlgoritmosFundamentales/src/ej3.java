
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Un Valor Entero Para Crear Un Array Bidimensional : ");
        int tamanio = sc.nextInt();

        int arrayBidi[][] = new int[tamanio][tamanio];

        cargarArrayIdentidad(arrayBidi);
        mostrarArrayBidi(arrayBidi);
    }

    public static void cargarArrayIdentidad(int arrayBidi[][]) {

        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi.length; j++) {
                if (i == j) {
                    arrayBidi[i][i] = 1;
                } else {
                    arrayBidi[i][j] = 0;
                }
            }
        }

    }

    public static void mostrarArrayBidi(int arrayBidi[][]) {
        System.out.println("-------------------------------------------------");
        System.out.println("ARRAY IDENTIDAD ");
        System.out.println("-------------------------------------------------");

        for (int x = 0; x < arrayBidi.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < arrayBidi[x].length; y++) {
                System.out.print(arrayBidi[x][y]);
                if (y != arrayBidi[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }

        System.out.println("-------------------------------------------------");

    }
}
