
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        cargarListaRandom(lista);
        busquedaSecuencial(sc, lista);
    }

    public static void cargarListaRandom(List<Integer> lista) {
        System.out.println("Se cargaron 50 numeros random a la lista !");

        for (int i = 0; i < 50; i++) {
            lista.add((int) (Math.random() * 1000 + 1));
        }

        //Muestro la lista cargada
        String cadena = "";
        for (int i = 0; i < lista.size(); i++) {
            if (i > 0) {
                cadena += " | ";
            }

            cadena += (lista.get(i));
        }

        System.out.println("Numeros Ingresados Random : " + "[ " + cadena + " ]");
        System.out.println("----------------------------------------------------------");
    }

    public static void busquedaSecuencial(Scanner sc, List<Integer> lista) {

        boolean encontrado = false;
        int valor;

        System.out.println("Ingrese el valor que desea buscar : ");
        System.out.println("----------------------------");
        do {
            valor = sc.nextInt();

            for (int i = 0; i < lista.size(); i++) {
                if (valor == lista.get(i)) {
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
