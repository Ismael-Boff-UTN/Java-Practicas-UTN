package TemaB;


import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cargarMostrarArray(sc);
    }

    public static void cargarMostrarArray(Scanner sc) {

        System.out.println("--------------------------------------------------");
        System.out.println("Defina el tamaño del array : ");
        int tamanio = sc.nextInt();

        int array[] = new int[tamanio];
        int arrayInverso[] = new int[tamanio];
        int arrayNumeroMayor[] = new int[tamanio];

        //creo el primer array con tamaño y valores asignados por el usuario
        System.out.println("--------------------------------------------------");
        System.out.println("Ingrese " + tamanio + " valores para cargar el Array :");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        //muestro el array
        String cadena = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (array[i]);

        }
        System.out.println("--------------------------------------------------");
        System.out.println("Valores Cargados Por Usuario : " + "[ " + cadena + " ]");

        //For para invertir valores del primer Array
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            arrayInverso[j] = array[i];

        }
        //Muestro el array invertido
        String cadena2 = "";
        for (int i = 0; i < arrayInverso.length; i++) {
            if (i <= 0) {
            } else {
                cadena2 += " | ";
            }
            cadena2 += (arrayInverso[i]);

        }
        System.out.println("--------------------------------------------------");

        System.out.println("Valores Del Array Inverso :    " + "[ " + cadena2 + " ]");
        System.out.println("--------------------------------------------------");

        //comparo arrays para saber cual valor es mayor
        for (int i = 0; i < tamanio; i++) {
            if (array[i] > arrayInverso[i]) {
                arrayNumeroMayor[i] = array[i];
            } else {
                arrayNumeroMayor[i] = arrayInverso[i];
            }
        }

        String cadena3 = "";
        for (int i = 0; i < arrayNumeroMayor.length; i++) {
            if (i <= 0) {
            } else {
                cadena3 += " | ";
            }
            cadena3 += (arrayNumeroMayor[i]);

        }

        System.out.println("Valores Del Array Mayor :      " + "[ " + cadena3 + " ]");
        System.out.println("--------------------------------------------------");

    }

}
