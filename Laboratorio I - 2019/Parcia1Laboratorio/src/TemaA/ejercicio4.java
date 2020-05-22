package TemaA;


import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        cargarArray(sc);

    }

    public static void cargarArray(Scanner sc) {

        System.out.println("-----------------------------");
        System.out.println("Defina el tamaño del array : ");

        int tamanio = sc.nextInt();
        int numeros[] = new int[tamanio];
        int cantidadPares = 0;
        int cantidadImpares = 0;

        int valor;
        int valorPar;
        int valorImpar;

        System.out.println("----------------------------");
        System.out.println("Ingrese " + tamanio + " valores enteros : ");
        System.out.println("Almenos un impar y un impar");

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {

                valorPar = numeros[i];
                cantidadPares++;
            } else {

                valorImpar = numeros[i];
                cantidadImpares++;
            }

        }

        String cadena = "";
        for (int i = 0; i < numeros.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (numeros[i]);

        }
        System.out.println("------------------------------------------------------");
        System.out.println("Valores Cargados Por Usuario : " + "[ " + cadena + " ]");

        int arrayPares[] = new int[cantidadPares];
        int arrayImpares[] = new int[cantidadImpares];

        int cont1 = 0;
        int cont2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                arrayPares[cont1] = numeros[i];
                cont1++;

            }
            if (numeros[i] % 2 != 0) {
                arrayImpares[cont2] = numeros[i];
                cont2++;

            }

        }
        String cadenaPar = "";
        String cadenaImpar = "";
        for (int i = 0; i < arrayPares.length; i++) {
            if (i > 0) {
                cadenaPar += " | ";
            }
            cadenaPar += (arrayPares[i]);
        }

        for (int i = 0; i < arrayImpares.length; i++) {
            if (i > 0) {
                cadenaImpar += " | ";
            }
            cadenaImpar += (arrayImpares[i]);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Valores Pares : " + "[ " + cadenaPar + " ]");
        System.out.println("------------------------------------------------------");
        System.out.println("Valores Impares : " + "[ " + cadenaImpar + " ]");
        System.out.println("------------------------------------------------------");

        //Multiplicacion y suma de arrays par impar
        int[] arrayResultante = new int[cantidadPares];

        for (int i = 0; i < arrayPares.length; i++) {
            for (int j = 0; j < arrayImpares.length; j++) {

                arrayResultante[i] += arrayPares[i] * arrayImpares[j];

            }

        }

        String cadena2 = "";
        for (int i = 0; i < arrayResultante.length; i++) {
            if (i > 0) {
                cadena2 += " | ";
            }
            cadena2 += (arrayResultante[i]);
        }

        System.out.println("Resultante : " + "[ " + cadena2 + " ]");
        System.out.println("------------------------------------------------------");
    }

}
