
import java.util.ArrayList;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class MenuTema1 {//RECUPERATORIO PARCIAL 2 TEMA 1
//declaramos variables privadas de forma global para trabajar con ellas en los diferentes metodos!

    private static Scanner sc = new Scanner(System.in);
    private static int[][] Array2DImpar = null;
    private static int[] ArrayD = null;
    private static List<Integer> ArrayToList = new ArrayList<>();

    public static void main(String[] args) {

        MenuOpciones();

    }

    public static void MenuOpciones() {
        boolean salir = false;

        int opcion;

        while (!salir) {
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("1. Cargar Matriz Cuadrada Impar De Tamaño N De Tipo int.");
            System.out.println("2. Obtener Elementos De La Columna Central Vertical De La Matriz.");
            System.out.println("3. Ordenar La Columna Central Vertical, De Forma Ascendente.");
            System.out.println("4. Buscar elementos inicio celda [0,0] y fin celda [N,N] en array");
            System.out.println("5. Transferir elementos a un List<Integer>");
            System.out.println("6. Calcular el promedio de los valores asignados en la lista anterior");
            System.out.println("7. Salir");
            System.out.println("----------------------------------------------------------------------------------------------------");

            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    CargarArray2D();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    CargarArrayD();
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    OrdenarArrayDAscendente("Orden Ascendente Por Burbuja : ");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    BuscarElementosArray2D();
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5");
                    ArrayToList();
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion 6");
                    PromediarList();
                    break;
                case 7:
                    System.out.println("Finalizado...Adios!");
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 7");
            }
        }
    }

    public static void CargarArray2D() {
        int tamanio;
        do {
            System.out.println("Ingrese Tamaño Para El Array 2D, Debe Ser Un Numero IMPAR! : ");
            tamanio = new Scanner(System.in).nextInt();

            if (tamanio % 2 == 0) {
                System.out.println("-----------------------------");
                System.out.println(setColor("rojo", "El Tamaño Debe Ser IMPAR!"));
                System.out.println(setColor("rojo", "Intente Nuevamente!"));
                System.out.println("-----------------------------");

            } else {
                Array2DImpar = new int[tamanio][tamanio];

                for (int i = 0; i < Array2DImpar.length; i++) {
                    for (int j = 0; j < Array2DImpar[0].length; j++) {
                        do {
                            System.out.println("Ingrese Valor Para La Celda >> " + " [" + i + "] " + " [" + j + "]");

                            String numero = new Scanner(System.in).nextLine();
                            if (!esEntero(numero)) {
                                System.out.println(setColor("rojo", "Solo Son Validos Numeros Enteros Positivos!"));
                                continue;

                            } else {
                                Array2DImpar[i][j] = Integer.valueOf(numero);
                            }
                            break;
                        } while (true);

                    }
                }

                System.out.println("-------------------------------------");
                System.out.println(setColor("verde", "Array Bidimensional : " + tamanio + " X " + tamanio + " !"));
                tabularArray2D(Array2DImpar, 4);

            }

        } while (tamanio % 2 == 0);

    }

    public static void CargarArrayD() {
        if (Array2DImpar == null) {
            System.out.println(setColor("rojo", "El Array2D Impar Esta Vacio, No Se Puede Obtener Su Columna Central!"));
            System.out.println(setColor("rojo", "Intente Completar La Opc.1 Antes!"));
        } else {
            int colCentral = Array2DImpar.length / 2;
            ArrayD = new int[Array2DImpar.length];

            for (int i = 0; i < Array2DImpar.length; i++) {
                ArrayD[i] = Array2DImpar[i][colCentral];
            }
            tabularArray1D(setColor("verde", "Columna Central Vertical : "), ArrayD);
        }

    }

    public static void BuscarElementosArray2D() {
        if (Array2DImpar == null || ArrayD == null) {
            System.out.println(setColor("rojo", "Los Arrays Estan Vacios, No Se Puede Realizar La Busqueda!"));
            System.out.println(setColor("rojo", "Intente Completar Desde La Opc.1 Antes!"));
        } else {
            int Pos00 = -1;
            int PosNN = -1;

            for (int i = 0; i < ArrayD.length; i++) {
                if (Objects.equals(ArrayD[i], Array2DImpar[0][0])) {
                    Pos00 = i;
                }
                if (Objects.equals(ArrayD[i], Array2DImpar[Array2DImpar.length - 1][Array2DImpar.length - 1])) {
                    PosNN = i;
                }
            }
            if (Pos00 != -1) {
                System.out.println("El Numero " + Array2DImpar[0][0] + " SI se encuentra en el Columna Central y corresponde al " + (Pos00 + 1) + "° elemento");
            } else {
                System.out.println("El Numero " + Array2DImpar[0][0] + " NO se encuentra en el Columna Central");
            }
            if (PosNN != -1) {
                System.out.println("El Numero " + Array2DImpar[Array2DImpar.length - 1][Array2DImpar.length - 1] + " SI se encuentra en el Columna Central y corresponde al " + (PosNN + 1) + "° elemento");
            } else {
                System.out.println("El Numero " + Array2DImpar[Array2DImpar.length - 1][Array2DImpar.length - 1] + " NO se encuentra en el Columna Central");
            }
        }
    }

    public static void ArrayToList() {
        if (ArrayD == null) {
            System.out.println(setColor("rojo", "El Array Esta Vacio, No Se Puede Convertir A List!"));
            System.out.println(setColor("rojo", "Intente Completar Las Opciones Correlativas!"));
        } else {
            System.out.println(setColor("verde", "La Conversion De Array A List Fue Exitosa!"));
            ArrayToList = IntStream.of(ArrayD).boxed().collect(Collectors.toCollection(ArrayList::new));
        }
    }

    public static void PromediarList() {
        if (ArrayToList.isEmpty()) {
            System.out.println(setColor("rojo", "La Lista Esta Vacia, No Se Puede Promediar!"));
            System.out.println(setColor("rojo", "Intente Completar La Opc.5 Antes!"));
        } else {
            int sumaValores = 0;
            for (Integer valor : ArrayToList) {
                sumaValores += valor;
            }

            int promedio = sumaValores / ArrayToList.size();
            System.out.println(ArrayToList);
            System.out.println(setColor("verde", "Promedio De La Lista : ") + promedio);
        }
    }

    public static void tabularArray2D(int[][] Array2D, int stringMayor) {

        for (int[] row : Array2D) {
            for (int elem : row) {
                System.out.printf("%4d", elem);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean tabularArray1D(String texto, int Array1D[]) {
        String cadena = "";
        for (int i = 0; i < Array1D.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (Array1D[i]);
        }

        System.out.println(texto + "[ " + cadena + " ]");

        return false;
    }

    public static String setColor(String color, String msg) {
        //uso : haces un sout y dentro le creas este metodo,
        //por ej. System.out.println(setColor("rojo", " tu mensaje "); 
        color = color.toLowerCase(); // para ignorar mayus o minus
        String colorCode;
        switch (color) {
            case "negro":
                colorCode = "\033[30m";
                break;
            case "rojo":
                colorCode = "\033[31m";
                break;
            case "verde":
                colorCode = "\033[32m";
                break;
            case "amarillo":
                colorCode = "\033[33m";
                break;
            case "azul":
                colorCode = "\033[34m";
                break;
            case "magenta":
                colorCode = "\033[35m";
                break;
            case "cyan":
                colorCode = "\033[36m";
                break;
            case "blanco":
                colorCode = "\033[37m";
                break;
            case "purpura":
                colorCode = "\u001B[35m";
                break;
            case "greenBold":
                colorCode = "\033[1;32m";
                break;
            default:
                colorCode = "\033[30m";
                break;
        }
        return colorCode + msg;
    }

    public static boolean OrdenarArrayDAscendente(String texto) {
        if (ArrayD == null) {
            System.out.println(setColor("rojo", "Arrays Vacios, No Se Puede Ordenar!"));
            System.out.println(setColor("rojo", "Intente Completar Otras Opc. Antes!"));
        } else {
            //ORDEN ASCENDENTE
            //iteramos sobre los elementos del arreglo
            for (int i = 0; i < ArrayD.length - 1; i++) {
                int menor = i;

                //buscamos el menor número
                for (int j = i + 1; j < ArrayD.length; j++) {
                    if (ArrayD[j] < ArrayD[menor]) {
                        menor = j;    //encontramos el menor número
                    }
                }

                if (i != menor) {
                    //permutamos los valores
                    int aux = ArrayD[i];
                    ArrayD[i] = ArrayD[menor];
                    ArrayD[menor] = aux;
                }

            }

            String cadena = "";
            for (int i = 0; i < ArrayD.length; i++) {
                if (i > 0) {
                    cadena += " | ";
                }
                cadena += (ArrayD[i]);
            }
            System.out.println("---------------------------------------");
            System.out.println(texto + "[ " + cadena + " ]");
            System.out.println("---------------------------------------");
        }
        return false;

    }

    public static boolean esEntero(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
