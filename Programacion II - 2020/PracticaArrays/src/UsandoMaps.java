
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import mylibrary.metodos;

/**
 *
 * @author SkylakeFrost
 */

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
public class UsandoMaps {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Se crea un HashMap
        Map<Integer, Integer> mapaNumeros = new HashMap<>();

        //System.out.println(mayorNumero(cargarMapList(mapaNumeros)));
        //System.out.println(mayorNumeroPrimo(cargarMapList(mapaNumeros)));
        System.out.println("Random : " + numerosPrimosRandom(mapaNumeros).toString());
        //System.out.println(finalizadosEnDigito4(autoCargarMapListRandom(mapaNumeros)));
        //System.out.println(vecesQueSeRepiteElMayor(autoCargarMapListRandom(mapaNumeros)));
    }

    //Punto 1
    public static String mayorNumero(Map<Integer, Integer> mapa) {
        int numeroMayor = 0;
        int keyNumero = 0;

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value > numeroMayor) {
                numeroMayor = value;
                keyNumero = key;
            }

        }

        return "El Mayor Valor Es : " + numeroMayor + ", En La Posicion : " + keyNumero;
    }

    //Punto 2
    public static String mayorNumeroPrimo(Map<Integer, Integer> mapa) {
        int numeroMayorPrimo = 0;
        int keyNumero = 0;

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (metodos.esPrimo(value) == true) {
                if (value > numeroMayorPrimo) {
                    numeroMayorPrimo = value;
                    keyNumero = key;
                }

            }

        }

        return "El Mayor Numero PRIMO Es : " + numeroMayorPrimo + ", En La Posicion : " + keyNumero;
    }

    //Punto 3
    public static Map<Integer, Integer> numerosPrimosRandom(Map<Integer, Integer> mapa) {
        for (int i = 1; i <= 5; i++) {
            int aleatorio = -1;
            boolean generado = false;
            while (!generado) {
                int posible = metodos.secureRandom(100, 300);
                if (!mapa.containsValue(posible) && metodos.esPrimo(posible)) {

                    mapa.put(100 + i, posible);
                    aleatorio = posible;
                    generado = true;
                }
            }

        }

        
        return mapa;

    }

    //Punto 4
    public static String finalizadosEnDigito4(Map<Integer, Integer> mapa) {

        String posiciones = "";
        int seRepite = 0;
        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value.toString().endsWith("4")) {
                posiciones += " | " + key;
                seRepite++;
            }

        }

        return "Hay " + seRepite + " Numeros Finalizados En 4 En Las Posiciones : " + posiciones;

    }

    //Punto 5
    public static String vecesQueSeRepiteElMayor(Map<Integer, Integer> mapa) {

        int mayorValor = 0;
        int seRepite = 0;
        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value > mayorValor) {
                mayorValor = value;

            }

        }

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (mayorValor == value) {
                seRepite++;
            }

        }

        return "El Mayor Valor Es : " + mayorValor + ", Se Repite : " + seRepite;

    }

    public static Map<Integer, Integer> cargarMapList(Map<Integer, Integer> mapa) {
        int i = 0;
        System.out.println("Ingrese 10 Valores Enteros!");
        do {

            System.out.println("Ingrese El " + (i + 1) + " Valor : ");
            mapa.put(i, sc.nextInt());

            i++;

        } while (mapa.size() != 10);
        return mapa;
    }

    public static Map<Integer, Integer> autoCargarMapListRandom(Map<Integer, Integer> mapa) {
        int i = 0;
        System.out.println("Se Generaron 10 Valores Enteros!");
        do {
            int random = (int) (Math.random() * 10);

            mapa.put(i, random);

            i++;

        } while (mapa.size() != 10);

        System.out.println("Mapa : " + mapa);
        return mapa;

    }

}
