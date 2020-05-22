
import java.util.Scanner;
import mylibrary.metodos;

/**
 *
 * @author SkylakeFrost
 */
public class UsandoArrays {

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

    public static int[] arrayNumeros = new int[10];

    public static void main(String[] args) {

        //MenuOpciones();
        cargarPrimosRandom(arrayNumeros);
        System.out.println("El Mayor Numero Esta En La Posicion : "+mayorNum(arrayNumeros));

    }

    //Punto 1
    public static void mayorNumero(int array[]) {

        int numMayor = 0;
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numMayor) {
                numMayor = array[i];
                pos = i;
            }
        }
        metodos.colorearPosicionArray(pos, array, "rojo");
        System.out.println("El Mayor Numero Es : " + numMayor + " En La Posicion : " + pos);
    }
    
     //Punto 1
    public static int mayorNum(int array[]) {

        int numMayor = 0;
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numMayor) {
                numMayor = array[i];
                pos = i;
            }
        }
        //metodos.colorearPosicionArray(pos, array, "rojo");
        return pos;
    }
    
    

    //Punto 2
    public static void mayorNumeroPrimo(int array[]) {

        int numeroMayorPrimo = 0;
        int numero;
        int pos = 0;

        for (int i = 0; i < array.length; i++) {
            if (metodos.esPrimo(array[i]) == true) {

                numero = array[i];
                if (numero > numeroMayorPrimo) {
                    numeroMayorPrimo = numero;
                    pos = i;
                }
            }
        }
        metodos.colorearPosicionArray(pos, array, "rojo");
        System.out.println("El Mayor Numero Primo Es : " + numeroMayorPrimo + " En La Posicion : " + pos);

    }

    //Punto 3
    public static int[] cargarPrimosRandom(int array[]) {
        int cargados = 0;

        do {

            int aleatorio = metodos.secureRandom(100, 300);

            if (metodos.esPrimo(aleatorio) == true) {

                array[cargados] = aleatorio;
                cargados++;

            }

        } while (cargados != array.length);

        return array;
    }
    
    

    //Punto 4
    public static String finalizaEnDigito4(int array[]) {
        int seRepite = 0;
        String posiciones = "";
        for (int i = 0; i < array.length; i++) {
            if (String.valueOf(array[i]).endsWith("4")) {
                seRepite++;
                posiciones += String.valueOf(i) + " | ";
            }
        }
        metodos.tabularArray1D("Valores Ingresados ", array);
        return "Hay " + seRepite + " Numeros Finalizados En 4 En Las Posiciones : " + posiciones;
    }

    //Punto 5
    public static String mayorNumeroRepetido(int array[]) {

        int numeroMayor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numeroMayor) {

                numeroMayor = array[i];

            }
        }
        int seRepite = 0;
        for (int i = 0; i < array.length; i++) {
            if (numeroMayor == array[i]) {
                seRepite++;
            }
        }

        return "El Mayor Numero Es : " + numeroMayor + ", Se Repite : " + seRepite + " Vez/Veces";
    }

    public static void MenuOpciones() {
        boolean salir = false;

        int opcion;

        while (!salir) {
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("1. NumMayor.java");
            System.out.println("2. NumMayoPrimo.java");
            System.out.println("3. NumPrimos2.java");
            System.out.println("4. NumTerminados4.java");
            System.out.println("5. RepeticionesNumMayor.java");

            System.out.println("6. Salir");
            System.out.println("----------------------------------------------------------------------------------------------------");

            System.out.println("Escribe una de las opciones");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    System.out.println("----------------------------------------------------------------------------------------------------");

                    mayorNumero(metodos.autoCargarArray(arrayNumeros, 20));
                    break;

                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    System.out.println("----------------------------------------------------------------------------------------------------");

                    mayorNumeroPrimo(metodos.autoCargarArray(arrayNumeros, 20));
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    metodos.tabularArray1D("Numeros Primos Random Entre 100 y 300: \n", cargarPrimosRandom(arrayNumeros));
                    metodos.tabularArray1D("Orden ASC", metodos.ordenamientoASCBurbuja(arrayNumeros));
                    metodos.tabularArray1D("Orden DESC", metodos.ordenamientoDESCBurbuja(arrayNumeros));
                    metodos.tabularArray1D("Ordenado Con Quick : ", metodos.ordenamientoQuicksort(arrayNumeros, 0, arrayNumeros.length - 1));

                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    System.out.println("----------------------------------------------------------------------------------------------------");

                    System.out.println(finalizaEnDigito4(metodos.cargarArray(arrayNumeros)));
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5");
                    System.out.println("----------------------------------------------------------------------------------------------------");

                    System.out.println(mayorNumeroRepetido(metodos.cargarArray(arrayNumeros)));
                    break;

                case 6:
                    System.out.println("Finalizado...Adios!");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");
            }
        }
    }

}
