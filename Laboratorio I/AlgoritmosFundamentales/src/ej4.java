
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Un Valor Entero Para Crear El Array Identidad Inverso : ");
        int tamanio = sc.nextInt();

        int arrayBidi[][] = new int[tamanio][tamanio];

        cargarArrayIndentidad(arrayBidi);
        mostrarArrayIdentidadInverso(arrayBidi);

    }

    public static void cargarArrayIndentidad(int arrayBidi[][]) {

        System.out.println("--------------------------------------------------");
        //se creo un array indentidad normal con 1 y 0
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

    public static void mostrarArrayIdentidadInverso(int arrayBidi[][]) {

        System.out.println("ARRAY IDENTIDAD INVERSO ");

        //invierto el array 
        for (int i = 0; i < arrayBidi.length / 2; i++) {
            for (int j = 0; j < arrayBidi[1].length; j++) {
                int temp = arrayBidi[i][j];
                arrayBidi[i][j] = arrayBidi[arrayBidi.length - 1 - i][j];
                arrayBidi[arrayBidi.length - 1 - i][j] = temp;
            }
        }
        //muestro el array
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
