package arraydosdimensiones;

import java.util.Scanner;

/*para poder multiplicar matrices, las columnas de la primera matriz y
las filas de la segunda matriz deben de ser las mismas, ya que si no, no 
podremos realizar la multiplicación. 

*\
/**
 *
 * @author SkylakeFrost
 */
public class practica2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese cantidad de filas y columnas para el primer array ");
        System.out.println("Filas : ");
        int tamanioFilas = sc.nextInt();
        System.out.println("Columnas :");
        int tamanioColumnas = sc.nextInt();
        System.out.println("Ingrese cantidad de filas y columnas para el segundo array ");
        System.out.println("Filas : ");
        int tamanioFilas2 = sc.nextInt();
        System.out.println("Columnas :");
        int tamanioColumnas2 = sc.nextInt();

        int primerArray[][] = new int[tamanioFilas][tamanioColumnas];
        int segundoArray[][] = new int[tamanioFilas2][tamanioColumnas2];
        //La matriz resultante será del tamaño de las filas de la primera matriz, por las columnas de la segunda matriz.
        int tercerArray[][] = new int[tamanioFilas][tamanioColumnas2];

        if (tamanioColumnas != tamanioFilas2) {
            System.out.println("No se pueden multiplicar los arrays");
            System.out.println("Las columnas del primer array y las filas del segundo array deben de ser las mismas!");
        } else {
            cargarArray(sc, primerArray, segundoArray, tercerArray);
            mostrarArray(sc, primerArray, segundoArray, tercerArray);
        }

    }

    public static void cargarArray(Scanner sc, int primerArray[][], int segundoArray[][], int tercerArray[][]) {
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese valores para el PRIMER array ");
        for (int i = 0; i < primerArray.length; i++) {
            for (int j = 0; j < primerArray[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                primerArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese valores para el SEGUNDO array ");
        for (int i = 0; i < segundoArray.length; i++) {
            for (int j = 0; j < segundoArray[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                segundoArray[i][j] = sc.nextInt();
            }
        }
        int col_m1 = primerArray[0].length;
        //CALCULO LOS VALORES DEL TERCER ARRAY
        for (int i = 0; i < primerArray.length; i++) {
            for (int j = 0; j < segundoArray[i].length; j++) {
                for (int k = 0; k < col_m1; k++) {
                    tercerArray[i][j] += primerArray[i][k] * segundoArray[k][j];
                }

            }
        }

    }

    public static void mostrarArray(Scanner sc, int primerArray[][], int segundoArray[][], int tercerArray[][]) {
        System.out.println("-------------------------------------------------");
        System.out.println("VALORES DEL PRIMER ARRAY ");
        for (int x = 0; x < primerArray.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < primerArray[x].length; y++) {
                System.out.print(primerArray[x][y]);
                if (y != primerArray[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("VALORES DEL SEGUNDO ARRAY ");
        for (int x = 0; x < segundoArray.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < segundoArray[x].length; y++) {
                System.out.print(segundoArray[x][y]);
                if (y != segundoArray[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("VALORES DEL TERCER ARRAY - MULTIPLICACION DEL PRIMER X SEGUNDO ");
        for (int x = 0; x < tercerArray.length; x++) {

            System.out.print("[ ");
            for (int y = 0; y < tercerArray[x].length; y++) {
                System.out.print(tercerArray[x][y]);
                if (y != tercerArray[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" ]");
        }
        System.out.println("----------------------------------------------------");
    }
}
