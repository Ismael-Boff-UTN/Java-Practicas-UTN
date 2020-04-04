package arraydosdimensiones;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class arrayBordeada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Un Valor Entero Para Definir Las Dimensiones Del Array Pues wn : ");
        int tamanio = sc.nextInt();

        int arrayBordeada[][] = new int[tamanio][tamanio];
        int arrayBordeada2[][] = new int[tamanio][tamanio];

        cargarArrayBordeadaCeroInterno(tamanio, arrayBordeada);
        mostrarArray(arrayBordeada, arrayBordeada2);
    }

    public static void cargarArrayBordeadaCeroInterno(int tamanio, int arrayBordeada[][]) {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == 0 || i == (tamanio - 1)) {
                    arrayBordeada[i][j] = 1;
                } else if (j == 0 || j == (tamanio - 1)) {
                    arrayBordeada[i][j] = 1;
                }

            }

        }
    }

    public static void cargarArrayBordeadaUnoInterno(int tamanio, int arrayBordeada2[][]) {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == 0 || i == (tamanio - 1)) {
                    arrayBordeada2[i][j] = 0;
                } else if (j == 0 || j == (tamanio - 1)) {
                    arrayBordeada2[i][j] = 0;
                }

            }

        }
    }

    public static void mostrarArray(int arrayBordeada[][], int arrayBordeada2[][]) {

        //muestro el array
        for (int x = 0; x < arrayBordeada.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < arrayBordeada[x].length; y++) {
                System.out.print(arrayBordeada[x][y]);
                if (y != arrayBordeada[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }

        System.out.println("-------------------------------------------------");

        for (int x = 0; x < arrayBordeada2.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < arrayBordeada2[x].length; y++) {
                System.out.print(arrayBordeada2[x][y]);
                if (y != arrayBordeada2[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }

        System.out.println("-------------------------------------------------");
    }
}
