
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        cargarLista(sc, numeros);
        obtenerMaxMin(numeros);
    }

    public static void cargarLista(Scanner sc, List numeros) {
        System.out.println("Ingrese 5 valores numericos enteros a la Lista : ");

        do {

            numeros.add(sc.nextInt());

        } while (numeros.size() <= 4);

        String cadena = "";
        for (int i = 0; i < numeros.size(); i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (numeros.get(i));
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Numeros Ingresados : " + "[ " + cadena + " ]");
    }

    public static void obtenerMaxMin(List<Integer> numeros) {

        System.out.println("----------------------------------------------------------");

        //obtenemos el mayor y menor elemento del arraylist utilizando expresiones lambda, de la version 8 de java
        int mayor = numeros.stream().mapToInt(i -> i).max().getAsInt();
        int menor = numeros.stream().mapToInt(i -> i).min().getAsInt();

        System.out.println("El Mayor De La Lista Es : " + mayor);
        System.out.println("El Menor De La Lista Es : " + menor);

        int diferencia = mayor - menor;

        System.out.println("La Diferencia Entre El Mayor Y El Menor Es : " + diferencia);
        System.out.println("----------------------------------------------------------");

    }
}
