
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaAscendente = new ArrayList<>();
        List<Integer> listaDescendente = new ArrayList<>();

        Comparator<Integer> comparador = Collections.reverseOrder();

        cargarLista(sc, lista);
        ordenamiento(lista, listaAscendente, listaDescendente, comparador);
    }

    public static void cargarLista(Scanner sc, List<Integer> lista) {

        System.out.println("Ingrese 10 valores numericos enteros : ");

        int numeritoIngresado;
        int cantidadNumeros = 0;

        do {
            numeritoIngresado = sc.nextInt();

            if (numeritoIngresado >= 0) {
                lista.add(numeritoIngresado);
                cantidadNumeros++;
            }
            if (numeritoIngresado < 0) {
                System.out.println("Los Numeros Deben Ser Positivos!");
                System.out.println("Intente Nuevamente Ingresando Numeros Positivos! :");
            }

        } while (cantidadNumeros < 10);

        //Muestro la Lista por consola
        String cadena = "";
        for (Integer e : lista) {
            if (e > 0) {
                cadena += " | ";
            }
            cadena += (e);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Numeros Ingresados A La Lista : " + "[ " + cadena + " ]");
    }

    public static void ordenamiento(List<Integer> lista, List<Integer> listaAscendente, List<Integer> listaDescendente, Comparator<Integer> comparador) {

        System.out.println("--------------------------------------------------");
        //Forma Ascendente utilizando el metodo sort de la clase collections
        Collections.sort(lista);

        for (Integer e : lista) {
            listaAscendente.add(e);
        }

        String cadena = "";

        for (Integer e : listaAscendente) {
            if (e > 0) {
                cadena += " | ";
            }
            cadena += (e);
        }
        System.out.println("Lista Orden Ascendente :" + "[ " + cadena + " ]");

        //Forma Descendente, se usa un objeto de la clase comparator para que compare los elementos y los ponga en orden inverso
        Collections.sort(lista, comparador);

        for (Integer e : lista) {
            listaDescendente.add(e);
        }

        String cadena2 = "";

        for (Integer e : listaDescendente) {
            if (e > 0) {
                cadena2 += " | ";
            }
            cadena2 += (e);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Lista Orden Descendente :" + "[ " + cadena2 + " ]");
        System.out.println("-----------------------------------------------------");

    }
}
