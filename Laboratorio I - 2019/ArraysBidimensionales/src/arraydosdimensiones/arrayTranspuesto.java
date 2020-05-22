package arraydosdimensiones;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class arrayTranspuesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Ingrese Cantidad De Filas :");
        int filas = sc.nextInt();
        System.out.println("Ingrese Cantidad De Columnas :");
        int columnas = sc.nextInt();

        int array2D[][] = new int[filas][columnas];

        int array2DTranspuesta[][] = new int[columnas][filas];

        cargarArray2D(sc, array2D);
        transponerArray2D(array2D, array2DTranspuesta);
        mostrarArrays2D(array2D, array2DTranspuesta);
    }

    public static void cargarArray2D(Scanner sc, int array2D[][]) {
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese valores para el array2D ");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                array2D[i][j] = sc.nextInt();
            }
        }

    }

    public static void transponerArray2D(int array2D[][], int array2DTranspuesta[][]) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {

                array2DTranspuesta[j][i] = array2D[i][j];
            }
        }
    }

    public static void mostrarArrays2D(int array2D[][], int array2DTranspuesta[][]) {
        System.out.println("-------------------------------------------------");
        System.out.println("VALORES DEL ARRAY ");
        for (int x = 0; x < array2D.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < array2D[x].length; y++) {
                System.out.print(array2D[x][y]);
                if (y != array2D[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("VALORES DEL ARRAY TRANSPUESTO ");
        for (int x = 0; x < array2DTranspuesta.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < array2DTranspuesta[x].length; y++) {
                System.out.print(array2DTranspuesta[x][y]);
                if (y != array2DTranspuesta[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }
    }

}
