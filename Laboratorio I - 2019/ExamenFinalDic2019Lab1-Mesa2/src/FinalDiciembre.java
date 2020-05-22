
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ismael Boff Lopez
 */
public class FinalDiciembre {

    private static Scanner sc = new Scanner(System.in);
    private static int Array2D[][] = null;
    private static int Array2DDiagonal[] = null;

    private static CeldaMatriz celda = new CeldaMatriz();
    private static int veces = 0;
    private static int promedio;

    public static void main(String[] args) {
        List<CeldaMatriz> lista = new ArrayList<>();
        MenuOpciones(lista);
    }

    public static void MenuOpciones(List<CeldaMatriz> lista) {
        boolean salir = false;

        int opcion;

        while (!salir) {
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("1. Crear y asignar tamaño a Matriz cuadrada impar de tamaño NXN de tipo int.");
            System.out.println("2. Cargar valores a Matriz Origen.");
            System.out.println("3. Mostrar Matriz Origen");
            System.out.println("4. Crear nueva matriz de orden N con los elementos de la diagonal de la matriz  ");
            System.out.println("5. Mostrar Matriz con Elementos Diagonal");
            System.out.println("6. Calcular el promedio de los valores almacenados en la matriz diagonal");
            System.out.println("7. Buscar si el valor promedio (sin decimales) existe en alguna de las celdas de la matriz\n"
                    + "cuadrada original, y asignar las posiciones encontradas en un List<Celda>");
            System.out.println("8. Mostrar la cantidad de elementos cargados y los elementos del List<Celda>");
            System.out.println("9. Salir");
            System.out.println("----------------------------------------------------------------------------------------------------");

            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    definirTamanioArray2D();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    cargarArray2D();
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    mostrarArray2D();
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    obtenerDiagonalPrincipalArray2D();
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    tabularArrayDiagonal();
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion 6");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    promediarArrayDiagonal();
                    break;
                case 7:
                    System.out.println("Has seleccionado la opcion 7");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    BuscarElementosArray2D(lista);
                    break;
                case 8:
                    System.out.println("Has seleccionado la opcion 8");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    mostrarArrayListDeCeldas(lista);
                    break;
                case 9:
                    System.out.println("Finalizado...Adios!");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 9");
            }
        }
    }

    public static void definirTamanioArray2D() {
        int tamanio;
        System.out.println("Para Cargar La Matriz Ingrese Tamaño, Debe Ser Impar!");

        do {
            System.out.println("Tamaño : ");
            tamanio = sc.nextInt();
            if (tamanio % 2 == 0) {
                System.out.println("Debe Ser Un Valor Impar!");
            } else {
                Array2D = new int[tamanio][tamanio];
            }

        } while (tamanio % 2 == 0);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Se Ha Definido Correctamente El Tamaño Del Array!");

    }

    public static void cargarArray2D() {
        if (Array2D == null) {
            System.out.println("No es posible la carga debido a que no ha sido creada la matriz, ejecute opción 1 del menú");
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

    public static void obtenerDiagonalPrincipalArray2D() {
        if (Array2D == null) {
            System.out.println("Los valores no han sido cargados, ejecute opción 2 del menú");
        } else {
            Array2DDiagonal = new int[Array2D.length];
            for (int i = 0; i < Array2D.length; i++) {
                for (int j = 0; j < Array2D[0].length; j++) {
                    if (i == j) {
                        Array2DDiagonal[i] = Array2D[i][j];
                    }
                }
            }

            System.out.println("Se Ha Creado Correctamente El Array Diagonal!");
        }

    }

    public static boolean tabularArrayDiagonal() {
        if (Array2DDiagonal == null) {
            System.out.println("El Array Diagonal No Contiene Datos!");
        } else {
            String cadena = "";
            for (int i = 0; i < Array2DDiagonal.length; i++) {
                if (i > 0) {
                    cadena += " | ";
                }
                cadena += (Array2DDiagonal[i]);
            }
            System.out.println("----------------------------------------------------");
            System.out.println("Array Diagonal >>  [ " + cadena + " ]");
            System.out.println("----------------------------------------------------");

            return false;
        }
        return false;

    }

    public static void promediarArrayDiagonal() {
        if (Array2DDiagonal == null) {
            System.out.println("No Se Puede Promediar Array Diagonal, Se Encuentra Vacio!");
        } else {
            int suma = 0;
            double suma2 = 0;
            for (int i = 0; i < Array2DDiagonal.length; i++) {
                suma += Array2DDiagonal[i];
                suma2 += Array2DDiagonal[i];
            }
            double promedio2 = suma2 / Array2DDiagonal.length;
            promedio = suma / Array2DDiagonal.length;
            tabularArray1D("Los Elementos Del Array Diagonal Son : ", Array2DDiagonal);
            System.out.println("El Promedio Sin Decimales : " + promedio);
            System.out.println("El Promedio Con Decimales : " + promedio2);
        }

    }

    public static void BuscarElementosArray2D(List<CeldaMatriz> lista) {

        if (Array2D == null) {
            System.out.println("Los Arrays Estan Vacios, No Se Puede Realizar La Busqueda!");
            System.out.println("Intente Completar Desde La Opc.1 Antes!");
        } else {
            System.out.println("Se Procede A Buscar El Valor Del Promedio, Que Es >> " + promedio);
            int valor = promedio;

            for (int filas = 0; filas < Array2D.length; filas++) {
                for (int columnas = 0; columnas < Array2D[0].length; columnas++) {
                    if (Array2D[filas][columnas] == valor) {
                        System.out.println("Se Encontro El Valor En Las Siguientes Posiciones!");
                        System.out.println("Fila " + filas);
                        System.out.println("Columnas " + columnas);
                        lista.add(new CeldaMatriz(filas, columnas));
                        veces++;

                    }
                    if (veces == 0) {
                        System.out.println("Sin resultados");
                        break;
                    }

                }

            }

        }
    }

    public static void mostrarArrayListDeCeldas(List<CeldaMatriz> lista) {
        if (lista.isEmpty()) {
            System.out.println("La Lista De Posiciones Esta Vacia!");
        } else {
            System.out.println("Se Encontraron " + veces + " Elementos, Sus Posiciones Son : ");
            int posicion = 1;
            for (CeldaMatriz c : lista) {

                System.out.println("----------------------Posicion : " + posicion + "---------------------------");
                System.out.println("Fila : " + celda.getFila() + " Columna : " + celda.getColumna());
                System.out.println("------------------------------------------------------------------");
                posicion++;
            }
        }

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

}
