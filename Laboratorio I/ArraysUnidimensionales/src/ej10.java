
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //arrays de tamaño ya definido que cargo con datos pedidos por teclado
        int enteros[] = new int[5];
        int enteros2[] = new int[10];

        //array donde guardo los resultados de las multiplicaciones
        int resultados[] = new int[10];
        int resultados2[] = new int[10];

        //llamado a metodos
        cargarArraysEnteros(sc, enteros, enteros2);
        mostrarArrayEnteros(enteros, enteros2);
        calculos(enteros, enteros2, resultados, resultados2);
        mostrarArrayResultados(enteros, enteros2, resultados, resultados2);

    }
//metodo que carga los arrays ya definidos anteriormente

    public static void cargarArraysEnteros(Scanner sc, int enteros[], int enteros2[]) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Ingrese 5 valores enteros para el primer array : ");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < enteros.length; i++) {

            enteros[i] = sc.nextInt();
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Ingrese 10 valores enteros para el segundo array : ");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < enteros2.length; i++) {

            enteros2[i] = sc.nextInt();
        }
    }
//metodo para mostrar los arrays 1 y 2 luego de cargarlos

    public static void mostrarArrayEnteros(int enteros[], int enteros2[]) {
        String cadena = "";
        String cadena2 = "";
        for (int i = 0; i < enteros.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (enteros[i]);

        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Los valores cargados en el primer array son : " + "[ " + cadena + " ]");

        for (int i = 0; i < enteros2.length; i++) {
            if (i > 0) {
                cadena2 += " | ";
            }
            cadena2 += (enteros2[i]);
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Lo valores cargados en el segundo array son : " + "[ " + cadena2 + " ]");
    }
//metodo para hacer la operacion de multiplicacion y suma con los arrays 1 y 2

    public static void calculos(int enteros[], int enteros2[], int resultados[], int resultados2[]) {
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros2.length; j++) {
                resultados[i] += enteros[i] * enteros2[j];
            }

        }

        for (int i = 0; i < enteros2.length; i++) {
            for (int j = 0; j < enteros.length; j++) {
                resultados2[i] += enteros[j] * enteros2[i];
            }

        }
    }
//metodo para mostrar el array resultante de operar con los array 1 y 2

    public static void mostrarArrayResultados(int enteros[], int enteros2[], int resultados[], int resultados2[]) {
        String cadenita = "";
        String cadenita2 = "";

        for (int i = 0; i < resultados.length; i++) {
            if (i > 0) {
                cadenita += " | ";
            }
            cadenita += (resultados[i]);
        }
        System.out.println("--------------------------------------------------------------");

        System.out.println("Array Resultante 1Array x 2Array: " + "[ " + cadenita + " ]");

        for (int i = 0; i < resultados2.length; i++) {
            if (i > 0) {
                cadenita2 += " | ";
            }
            cadenita2 += (resultados2[i]);
        }
        System.out.println("---------------------------------------------------------------");

        System.out.println("Array Resultante 2Array x 1Array: " + "[ " + cadenita2 + " ]");
        System.out.println("---------------------------------------------------------------");
    }

}
