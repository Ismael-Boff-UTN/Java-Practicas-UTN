
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Defina el tamaño del array :");
        int tamanio = sc.nextInt();
        int array[] = new int[tamanio];
        
        cargarMostrarArray(sc, array, tamanio);
        //quicksort(array, tamanio, tamanio);
        metodoInsercion(array, tamanio);
        metodoBurbuja(array);
        ordenamientoSeleccion(array);
        
        int numeroBuscado;
        System.out.println("Ingrese un numero para buscarlo en el array : ");
        numeroBuscado = sc.nextInt();
        busquedaSecuencial(array, numeroBuscado);
    }

    //CARGAMOS EL ARRAY CON VALORES Y LO MOSTRAMOS, ESTE LUEGO SE ORDENA CON DIFERENTES METODOS DE ORDENAMIENTO
    public static void cargarMostrarArray(Scanner sc, int array[], int tamanio) {
        
        System.out.println("Ingrese " + tamanio + " numeros al array de forma aleatorea :");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        String cadena = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (array[i]);
        }
        System.out.println("-------------------------------");
        System.out.println("Array : " + "[ " + cadena + " ]");
        
    }
    
    public static void quicksort(int array[], int izq, int der) {
        
        int pivote = array[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;
        
        while (i < j) {            // mientras no se crucen las búsquedas
            while (array[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (array[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = array[i];                  // los intercambia
                array[i] = array[j];
                array[j] = aux;
            }
        }
        array[izq] = array[j]; // se coloca el pivote en su lugar de forma que tendremos
        array[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            quicksort(array, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(array, j + 1, der); // ordenamos subarray derecho
        }
        
        for (int k = 0; k < array.length; k++) {
             System.out.println("Array QuickSort : "+array[k]);
        }
       
    }

    //ORDENAMOS EL ARRAY CON EL METODO POR INSERCION
    public static void metodoInsercion(int array[], int tamanio) {
        int pos;
        int numeroActual;
        
        for (int i = 0; i < array.length; i++) {
            pos = i;
            numeroActual = array[i];
            
            while ((pos > 0) && (array[pos - 1]) > numeroActual) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = numeroActual;
            
        }
        //MUESTRO EL ARRAY ORDENADO DE FORMA ASCENDENTE
        String cadena = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (array[i]);
        }
        System.out.println("---------------------------------------");
        System.out.println("Array Ordenado Ascendente INSERCIÓN :" + "[ " + cadena + " ]");
        System.out.println("---------------------------------------");

        //MUESTRO EL ARRAY ORDENADO DE FORMA DESCENDENTE
        String cadenita = "";
        for (int i = tamanio - 1; i >= 0; i--) {
            if (i > 0) {
                cadenita += " | ";
            }
            cadenita += (array[i]);
        }
        
        System.out.println("Array Ordenado Descendente INSERCIÓN : " + "[ " + cadenita + " ]");
    }

    //ORDENAMOS EL ARRAY CON EL METODO BURBUJA
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
    
    public static void ordenamientoSeleccion(int array[]) {
        //ORDENAR DE FORMA ASCENDENTE
        int contador = 1;//solo util para contar las comparaciones
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                
                contador++;
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int aux = array[i];
                array[i] = array[min];
                array[min] = aux;
            }
        }
        
        String cadena = "";
        for (int k = 0; k < array.length; k++) {
            if (k > 0) {
                cadena += " | ";
            }
            cadena += (array[k]);
        }
        System.out.println("Array Ascendente SELECCION : " + "[ " + cadena + " ]");
        System.out.println("----------------------------------------------");

        //ORDEN DESCENDENTE
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
        
        String cadenita = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                cadenita += " | ";
            }
            cadenita += (array[i]);
        }
        System.out.println("Array Descendente SELECCION : " + "[ " + cadenita + " ]");
        System.out.println("-------------------------------------------------------");
        
    }

    //METODO PARA BUSCAR UN VALOR EN EL ARRAY, SI EL VALOR SE REPITE DEVUELVE LAS POSICIONES EN DONDE ESTE SE REPITE
    public static String busquedaSecuencial(int array[], int numeroBuscado) {
        String posiciones = "";
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                posiciones += i + " / ";
            }
        }
        System.out.println("El Numero " + numeroBuscado + " Se Encuentra en la posiciones : " + posiciones + " del array!");
        return posiciones;
        
    }
    
}
