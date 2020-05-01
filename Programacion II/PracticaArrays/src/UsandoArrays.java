
import java.util.Scanner;

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

        MenuOpciones();

    }

    public static int[] cargarArray(int[] array) {

        System.out.println("Ingrese 10 Numeros Enteros Para El Array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese El " + (i + 1) + " Valor : ");
            int numero = sc.nextInt();
            array[i] = numero;
        }

        tabularArray1D("Los Numeros Ingresados Son : ", array);
        return array;

    }

    //Punto 3
    public static int[] cargarPrimosRandom(int array[]) {
        int cargados = 0;

        do {

            int aleatorio = (int) (Math.random() * 200 + 100);

            if (esPrimo(aleatorio) == true) {

                array[cargados] = aleatorio;
                cargados++;

            }

        } while (cargados != array.length);

        return array;
    }

    //Punto 1
    public static int mayorNumero(int array[]) {

        int numMayor = 0;
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numMayor) {
                numMayor = array[i];
                pos = i;
            }
        }

        return pos;
    }

    //Punto 2
    public static int mayorNumeroPrimo(int array[]) {

        int numeroMayorPrimo = 0;
        int numero;

        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i]) == true) {
                //System.out.println("es primo " + array[i]);
                numero = array[i];
                if (numero > numeroMayorPrimo) {
                    numeroMayorPrimo = numero;
                }
            }
        }

        return numeroMayorPrimo;

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

        return "Hay " + seRepite + " Numeros Finalizados En 4 En Las Posiciones : " + posiciones;
    }

    public static boolean tabularArray1D(String texto, int Array1D[]) {
        String cadena = "";
        for (int i = 0; i < Array1D.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (Array1D[i]);
        }
        System.out.println("----------------------------------------------------");
        System.out.println(texto + "[ " + cadena + " ]");
        System.out.println("----------------------------------------------------");

        return false;
    }

    public static boolean esPrimo(int numero) {
        if (numero == 2) {
            return true; //si es dos, directamente retorna true, ya que 2 es numero primo
        }
        if (numero % 2 == 0) {
            return false; //se comprueba si es multiplo de dos
        }
        for (int i = 3; i * i <= numero; i += 2) { // de no serlo, se comprueba si es divisible entre un numero impar
            if (numero % i == 0) {
                return false;
            }// si no es primo, devuelve false
        }
        return true; // y si lo es, devuelve true
    }

    public static void metodoBurbuja(int array[]) {
        //ORDEN ASCENDENTE
        //iteramos sobre los elementos del arreglo
        for (int i = 0; i < array.length - 1; i++) {
            int menor = i;

            //buscamos el menor número
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    menor = j;    //encontramos el menor número
                }
            }

            if (i != menor) {
                //permutamos los valores
                int aux = array[i];
                array[i] = array[menor];
                array[menor] = aux;
            }

        }

        String cadena = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (array[i]);
        }
        System.out.println("---------------------------------------");
        System.out.println("Array Ordenado Ascendente BURBUJA :" + "[ " + cadena + " ]");
        System.out.println("---------------------------------------");

        //ORDEN DESCENDENTE
        //iteramos sobre los elementos del arreglo
        for (int i = 0; i < array.length - 1; i++) {
            int mayor = i;

            //buscamos el mayor número
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[mayor]) {
                    mayor = j;    //encontramos el mayor número
                }
            }

            if (i != mayor) {
                //permutamos los valores
                int aux = array[i];
                array[i] = array[mayor];
                array[mayor] = aux;
            }

        }

        String cadena2 = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                cadena2 += " | ";
            }
            cadena2 += (array[i]);
        }

        System.out.println("Array Ordenado Descendente BURBUJA :" + "[ " + cadena2 + " ]");
        System.out.println("---------------------------------------");
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
                    System.out.println("Posicion Del Numero Mayor : " + mayorNumero(cargarArray(arrayNumeros)));
                    break;

                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    System.out.println("----------------------------------------------------------------------------------------------------");

                    System.out.println("Posicion Del Mayor Numero Primo : " + mayorNumeroPrimo(cargarArray(arrayNumeros)));
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    tabularArray1D("Numeros Primos Random Entre 100 y 300: \n", cargarPrimosRandom(arrayNumeros));
                    metodoBurbuja(arrayNumeros);
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    System.out.println("----------------------------------------------------------------------------------------------------");

                    System.out.println(finalizaEnDigito4(cargarArray(arrayNumeros)));
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5");
                    System.out.println("----------------------------------------------------------------------------------------------------");

                    System.out.println(mayorNumeroRepetido(cargarArray(arrayNumeros)));
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
