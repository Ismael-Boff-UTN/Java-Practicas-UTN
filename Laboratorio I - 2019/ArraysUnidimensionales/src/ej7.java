
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Aqui se almacenan los valores ingresados por el usuario

        int numeros[] = new int[10];
        int numerosAsc[] = new int[10];
        int numerosDesc[] = new int[10];
        cargarValores(sc, numeros);
        mostrarArrayDefecto(numeros);

        //MUESTRO ARRAY ASCENDENTE
        System.out.println("Orden Ascendente:");
        System.out.println("---------------------");
        ArrayOrdenAscendente(numeros);

        String cadena = "";
        for (int num : numeros) {
            if (num > 0) {
                cadena += " | ";
            }
            cadena += (num);

        }
        System.out.println("[ " + cadena + " ]");

        //MUESTRO ARRAY DESCENDENTE
        System.out.println("-----------------------");
        System.out.println("Orden Descendente : ");
        ArrayOrdenDescendente(numeros);
        String cadena2 = "";
        for (int num : numeros) {
            if (num > 0) {
                cadena2 += " | ";
            }
            cadena2 += (num);
        }
        System.out.println("[ " + cadena2 + " ]");
        System.out.println("--------------------------");

    }

    public static void cargarValores(Scanner sc, int numeros[]) {
        System.out.println("--------------------------");
        System.out.println("Ingrese 10 numeros");

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = sc.nextInt();
        }

    }

    public static void mostrarArrayDefecto(int numeros[]) {

        System.out.println("--------------------------------------");
        String cadenita = "";
        for (int i = 0; i < numeros.length; i++) {
            if (i > 0) {
                cadenita += " | ";
            }

            cadenita += (numeros[i]);
        }
        System.out.println("El Array Cargado Por El Usuario : " + "[ " + cadenita + " ]");
        System.out.println("--------------------------------------");
    }

    public static void ArrayOrdenAscendente(int numeros[]) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0; i < numeros.length - 1; i++) {
            int menor = i;

            //buscamos el menor número
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[menor]) {
                    menor = j;    //encontramos el menor número
                }
            }

            if (i != menor) {
                //permutamos los valores
                int aux = numeros[i];
                numeros[i] = numeros[menor];
                numeros[menor] = aux;
            }

        }

    }

    public static void ArrayOrdenDescendente(int numeros[]) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0; i < numeros.length - 1; i++) {
            int mayor = i;

            //buscamos el mayor número
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[mayor]) {
                    mayor = j;    //encontramos el mayor número
                }
            }

            if (i != mayor) {
                //permutamos los valores
                int aux = numeros[i];
                numeros[i] = numeros[mayor];
                numeros[mayor] = aux;
            }

        }

    }

}
