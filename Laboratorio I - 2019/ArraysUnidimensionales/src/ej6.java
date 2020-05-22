
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej6 {

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        Scanner sc = new Scanner(System.in);
        int numeritos[] = new int[50];
        cargarArray(numeritos);
        mostrarArrayCargado(numeritos);
        buscarValor(sc, numeritos);

    }

    public static void cargarArray(int numeritos[]) {
        System.out.println("----------------------------");
        System.out.println("Se cargaron 50 valores random al array sin repetir");

        int indice = 0;

        // este bucle que se ejecuta hasta que hayamos llenado el array
        while (indice < 50) {
            // Variable que almacenará el número aleatorio propuesto
            int numeroRandom = (int) (Math.random() * 100 + 1);

            // Variable que indica si el número propuesto está repetido
            boolean repetido = false;
            //este bucle que se ejecutara siempre que el numero no este repetido
            while (!repetido) {
                // Bucle que recorre el arreglo comparando el número propuesto con
                // cada uno de los elementos del arreglo
                for (int i = 0; i < numeritos.length; i++) {
                    //realizamos la comparación
                    if (numeroRandom == numeritos[i]) {
                        // si el número se repite, establecemos repetido=true
                        // y salimos del bucle
                        repetido = true;
                        break;
                    }
                }
                // verificamos el estado del valor repetido. Si es false, significa
                // que hemos recorrido el array hasta la posición index sin encontrar
                // coincidencias
                if (!repetido) {
                    // almacenamos el valor propuesto ya que no está repetido
                    // incrementamos el índice
                    numeritos[indice] = numeroRandom;
                    indice++;
                }
            }
        }
    }

    public static void mostrarArrayCargado(int numeritos[]) {
        String cadena = "";
        for (int i = 0; i < numeritos.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (numeritos[i]);

        }
        System.out.println("----------------------------");
        System.out.println("Valores Cargados Aleatoriamente  : " + "[ " + cadena + " ]");
        System.out.println("----------------------------");
    }

    public static void buscarValor(Scanner sc, int numeritos[]) {
        boolean encontrado = false;
        int valor;

        System.out.println("Ingrese el valor que desea buscar : ");
        System.out.println("----------------------------");
        do {
            valor = sc.nextInt();

            for (int i = 0; i < numeritos.length; i++) {
                if (valor == numeritos[i]) {
                    System.out.println("----------------------------");
                    System.out.println("El valor " + valor + " se encuentra en la posicion " + i + " del array");
                    System.out.println("----------------------------");
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("----------------------------");
                System.out.println("El valor " + valor + " NO existe en este array");
                System.out.println("Ingrese otro valor : ");

            }
        } while (!encontrado);

    }

}
