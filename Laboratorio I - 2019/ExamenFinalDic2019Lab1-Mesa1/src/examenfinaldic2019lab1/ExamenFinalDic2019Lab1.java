package examenfinaldic2019lab1;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ExamenFinalDic2019Lab1 {

    /**
     * @param args the command line arguments
     */
    // Variables Globales
    private static Scanner sc = new Scanner(System.in);
    private static int Array2D[][] = null;
    private static int Array2DTranspuesto[][] = null;
    private static List<Integer> lista = new ArrayList<>();

    public static void main(String[] args) {
        MenuOpciones();
    }

    public static void MenuOpciones() {
        boolean salir = false;

        int opcion;

        while (!salir) {
            System.out.println(
                    "---------------------------------------------------------------------------------------------------");
            System.out.println("1. Crear y asignar tamaño a Matriz cuadrada de tamaño MXN de tipo int.");
            System.out.println("2. Cargar valores a Matriz Origen.");
            System.out.println("3. Mostrar Matriz Origen");
            System.out.println("4. Crear nueva matriz de orden NXM y asigno valores invirtiendo la origen ");
            System.out.println("5. Mostrar Matriz Inversa");
            System.out.println("6. Sumar Filas de Matriz origen y asignar en un List");
            System.out.println("7. Calcular el promedio de los valores del List");
            System.out.println("8. Ordenar el List de valores de menor a mayor.");
            System.out.println("9. Salir");
            System.out.println(
                    "----------------------------------------------------------------------------------------------------");

            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opcion 1");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                definirTamanioArray2D();
                break;
            case 2:
                System.out.println("Has seleccionado la opcion 2");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                cargarArray2D();
                break;
            case 3:
                System.out.println("Has seleccionado la opcion 3");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                mostrarArray2D();
                break;
            case 4:
                System.out.println("Has seleccionado la opcion 4");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                crearArray2DTranspuesto();
                break;
            case 5:
                System.out.println("Has seleccionado la opcion 5");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                mostrarArray2DTranspuesto();
                break;
            case 6:
                System.out.println("Has seleccionado la opcion 7");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                sumarFilasArray2D();
                break;
            case 7:
                System.out.println("Has seleccionado la opcion 8");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                promediarList();
                break;
            case 8:
                System.out.println("Has seleccionado la opcion 9");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                ordenarList();
                break;
            case 9:
                System.out.println("Finalizado...Adios!");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                salir = true;
                break;
            default:
                System.out.println("Solo números entre 1 y 9");
            }
        }
    }

    public static void definirTamanioArray2D() {
        int filas, columnas;
        System.out.println("Para Cargar La Matriz Ingrese La Cantidad De Filas y Columnas!");
        System.out.println("Filas : ");
        filas = sc.nextInt();
        System.out.println("Columnas : ");
        columnas = sc.nextInt();

        Array2D = new int[filas][columnas];
        System.out.println("Se Ha Definido Correctamente El Tamaño Del Array!");

    }

    public static void cargarArray2D() {
        if (Array2D == null) {
            System.out.println(
                    "No es posible la carga debido a que no ha sido creada la matriz, ejecute opción 1 del menú");
        } else {
            int valor;
            for (int i = 0; i < Array2D.length; i++) {
                for (int j = 0; j < Array2D[0].length; j++) {
                    System.out.println("Ingrese Valor Para La Celda >> " + " [" + i + "] " + " [" + j + "]");
                    valor = sc.nextInt();
                    Array2D[i][j] = valor;
                }
            }
            System.out.println("Se Ha Cargado Correctamente El Array!");
        }
    }

    public static void mostrarArray2D() {
        if (Array2D == null) {
            System.out.println("Los valores no han sido cargados, ejecute opción 2 del menú");
        } else {
            System.out.println("Array Bidimensional : ");
            for (int[] row : Array2D) {
                for (int elem : row) {
                    System.out.printf("%4d", elem);
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void crearArray2DTranspuesto() {
        if (Array2D == null) {
            System.out.println("Los valores no han sido cargados, ejecute opción 2 del menú");
        } else {
            Array2DTranspuesto = new int[Array2D.length][Array2D.length];
            for (int i = 0; i < Array2D.length; i++) {
                for (int j = 0; j < Array2D[0].length; j++) {
                    Array2DTranspuesto[i][j] = Array2D[j][i];
                }
            }

            System.out.println("Se Ha Creado Correctamente El Array Transpuesto!");
        }

    }

    public static void mostrarArray2DTranspuesto() {
        if (Array2D == null) {
            System.out.println("La matriz no ha sido generada, ejecute opción 4 del menú");
        } else {
            System.out.println("Array Transpuesto :");
            for (int[] row : Array2DTranspuesto) {
                for (int elem : row) {
                    System.out.printf("%4d", elem);
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void sumarFilasArray2D() {
        if (Array2D == null) {
            System.out.println("Los valores no han sido cargados, ejecute opción 2 del menú");
        } else {
            int sumaDeFila = 0;
            for (int i = 0; i < Array2D.length; i++) {
                for (int j = 0; j < Array2D[0].length; j++) {
                    sumaDeFila += Array2D[i][j];
                }
                lista.add(sumaDeFila);
                sumaDeFila = 0; // Aca Reinicio El Acumulador De sumaDeFila Para Que Siga Sumando Las Demas
                                // Filas!

            }

            System.out.println("Se Han Sumado Las Filas y Cargado Correctamente A La Lista!");
        }

    }

    public static void promediarList() {
        if (Array2D == null) {
            System.out.println("Los valores no han sido cargados en el List, ejecute opción 6 del menú");
        } else {
            int sumarValoresList = 0;
            for (Integer valor : lista) {
                sumarValoresList += valor;
            }

            int promedio = sumarValoresList / lista.size();

            System.out.println("Valores De La Lista : " + lista);
            System.out.println("Promedio De La Lista : " + promedio);
        }

    }

    public static void ordenarList() {
        if (lista.isEmpty()) {
            System.out.println("Los valores no han sido cargados en el List, ejecute opción 6 del menú");
        } else {
            Collections.sort(lista);
            System.out.println("Lista De Menor A Mayor : " + lista);
        }

    }

}
