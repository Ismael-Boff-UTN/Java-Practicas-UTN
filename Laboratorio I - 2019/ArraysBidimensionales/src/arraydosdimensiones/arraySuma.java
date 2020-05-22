package arraydosdimensiones;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class arraySuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Cantidad De Filas :");
        int filas = sc.nextInt();
        System.out.println("Ingrese Cantidad De Columnas :");
        int columnas = sc.nextInt();

        int array1[][] = new int[filas][columnas];
        int array2[][] = new int[filas][columnas];
        int arraySuma[][] = new int[filas][columnas];
        
        cargarArrays(sc, array1, array2);
        sumarArrays(array1, array2, arraySuma);
        mostrarArrays(array1, array2, arraySuma);
    }

    public static void cargarArrays(Scanner sc, int array1[][], int array2[][]) {
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese valores para el array numero 1 ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese valores para el array numero 2 ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                array2[i][j] = sc.nextInt();
            }
        }

    }

    public static void sumarArrays(int array1[][], int array2[][], int arraySuma[][]) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                arraySuma[i][j] = array1[i][j] + array2[i][j];
            }
        }
    }

    public static void mostrarArrays(int array1[][], int array2[][], int arraySuma[][]) {
        //MUESTRO EL PRIMER ARRAY
        System.out.println("-------------------------------------------------");
        System.out.println("VALORES DEL ARRAY 1 ");
        for (int x = 0; x < array1.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < array1[x].length; y++) {
                System.out.print(array1[x][y]);
                if (y != array1[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }
        //MUESTRO EL SEGUNDO
        System.out.println("-------------------------------------------------");
        System.out.println("VALORES DEL ARRAY 2 ");
        for (int x = 0; x < array2.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < array2[x].length; y++) {
                System.out.print(array2[x][y]);
                if (y != array2[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }
        //MUESTRO LA SUMA RESULTANTE
        System.out.println("-------------------------------------------------");
        System.out.println("ARRAY RESULTANTE : SUMA ");
        for (int x = 0; x < arraySuma.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < arraySuma[x].length; y++) {
                System.out.print(arraySuma[x][y]);
                if (y != arraySuma[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }
    }
}
