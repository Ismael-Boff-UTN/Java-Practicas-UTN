
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mylibrary.metodos;

/**
 *
 * @author SkylakeFrost
 */
public class UsandoListas {

    /*
1.(NumMayor.java) Leer 10 enteros, almacenarlos en un arreglo y determinar en qué 
posición del arreglo está el mayor número leído.
    
2.(NumMayoPrimo.java) Leer 10 enteros, almacenarlos en un arreglo y 
determinar en qué posición del arreglo está el mayor número primo leído.
    
3.(NumPrimos2.java) Almacenar en un arreglo de 10 posiciones los 10 
números primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
    
4.(NumTerminados4.java) Leer 10 números enteros, almacenarlos en un 
arreglo y determinar en qué posiciones se encuentran los números terminados en 4.
    
5.(RepeticionesNumMayor.java) Leer 10 números enteros, almacenarlos en 
un arreglo y determinar cuántas veces está repetido el mayor.
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();

        //System.out.println("El Mayor Esta En La Posición : " + mayorNumero(autoCargarLista(listaNumeros)));
        //System.out.println(mayorNumeroPrimo(autoCargarLista(listaNumeros)));
        //System.out.println("Numeros Primos Random Entre 100 y 300 : "+numerosPrimosRandom(listaNumeros));
        //System.out.println(finalizadosEnDigito4(cargarLista(listaNumeros)));
        //System.out.println(cuantasVecesSeRepiteElMayor(cargarLista(listaNumeros)));
    }

    public static List<Integer> cargarLista(List<Integer> lista) {

        for (int j = 0; j != 10; j++) {
            System.out.println("Ingrese El " + (j + 1) + "° Valor : ");
            lista.add(sc.nextInt());
        }
        return lista;
    }

    public static List<Integer> autoCargarLista(List<Integer> lista) {
        System.out.println("Se Cargaron 10 Numeros Entero Aleatoreos");
        for (int i = 0; i != 10; i++) {
            int random = (int) (Math.random() * 20);
            lista.add(random);
        }
        System.out.println("Lista : " + lista);
        return lista;
    }

    //Punto 1
    public static int mayorNumero(List<Integer> lista) {
        int mayorNumero = 0;
        for (Integer numero : lista) {
            if (numero > mayorNumero) {
                mayorNumero = numero;
            }
        }

        return lista.indexOf(mayorNumero);
    }

    //Punto 2
    public static String mayorNumeroPrimo(List<Integer> lista) {
        int mayorNumeroPrimo = 0;
        for (Integer numero : lista) {
            if (metodos.esPrimo(numero) == true) {
                mayorNumeroPrimo = numero;
            }
        }

        return "El Mayor Numero Primo Es " + mayorNumeroPrimo;
    }

    //Punto 3
    public static List<Integer> numerosPrimosRandom(List<Integer> lista) {
        do {
            int aleatorio = (int) (Math.random() * 200 + 100);
            if (metodos.esPrimo(aleatorio) == true) {
                lista.add(aleatorio);
            }

        } while (lista.size() != 10);

        return lista;

    }

    //Punto 4
    public static String finalizadosEnDigito4(List<Integer> lista) {
        String posiciones = "";
        int seRepite = 0;
        for (Integer numero : lista) {
            if (String.valueOf(numero).endsWith("4")) {
                posiciones += String.valueOf(lista.indexOf(numero)) + " | ";
                seRepite++;
            }
        }

        return "Hay " + seRepite + " Numeros Finalizados En 4 En Las Posiciones : " + posiciones;
    }

    //Punto 5
    public static String cuantasVecesSeRepiteElMayor(List<Integer> lista) {
        int numeroMayor = 0;
        for (Integer numero : lista) {
            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
        }
        int seRepite = 0;
        for (Integer numero : lista) {
            if (numeroMayor == numero) {
                seRepite++;
            }
        }

        return "El Mayor Numero Es : " + numeroMayor + " Y Esta Repetido " + seRepite + " Vez/Veces";
    }

}
