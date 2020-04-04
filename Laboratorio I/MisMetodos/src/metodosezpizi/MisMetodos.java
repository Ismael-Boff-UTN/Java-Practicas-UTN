package metodosezpizi;

import java.util.Scanner;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class MisMetodos {

    public static boolean tabularArray2D(String[][] Array2D, int stringMayor) {

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[0].length; j++) {
                if (Array2D[i][j] != null) {
                    String value = String.format("%" + String.valueOf(stringMayor) + "s", Array2D[i][j]);
                    System.out.print("  " + value + " ");
                }
            }
            if (Array2D[i][0] != null) {
                System.out.println();
            }
        }

        return false;
    }

    public static double sumaColumnas(String[][] Array2D, int posicionColumna) {
        /*este metodo como su nombre indica, realiza la suma de una columna de un array2D
        le pasamos por parametro el array2D y la columna a sumar, luego, haciendo uso de sout
        mostramos la suma*/

        double sumaColumna = 0;
        for (int i = 0; i < Array2D.length; i++) {
            if (Array2D[i][posicionColumna] != null) {
                sumaColumna += (Double.valueOf(Array2D[i][posicionColumna]));
            }
        }

        return sumaColumna;
    }

    public static double sumaColumnasYPromedio(String[][] Array2D, int posicionColumna) {
        double sumaColumna = 0;
        int cantidadColLlenas = 0;

        for (int i = 0; i < Array2D.length; i++) {
            if (Array2D[i][posicionColumna] != null) {
                sumaColumna += (Double.valueOf(Array2D[i][posicionColumna]));
                cantidadColLlenas++;
            }

        }
        //System.out.println("cantidad columnas llenas : "+cantidadColLlenas);
        double promedioColumnas = sumaColumna / cantidadColLlenas;
        return Math.round(promedioColumnas * Math.pow(10, 2)) / Math.pow(10, 2);

    }

    public static double sumaFilas(String[][] Array2D, int posicionFila) {
        double sumaFila = 0;
        for (int i = 0; i < Array2D[posicionFila].length; i++) {
            if (Array2D[posicionFila][i] != null) {
                sumaFila += (Double.valueOf(Array2D[posicionFila][i]));
            }
        }

        return sumaFila;
    }

    public static double sumaFilaYPromedio(String[][] Array2D, int posicionFila) {
        double sumaFila = 0;
        int cantidadFilasLlenas = 0;
        for (int i = 0; i < Array2D[posicionFila].length; i++) {
            if (Array2D[posicionFila][i] != null) {
                sumaFila += (Double.valueOf(Array2D[posicionFila][i]));
                cantidadFilasLlenas++;

            }
        }
        //System.out.println("cantidad filas llenas : "+cantidadFilasLlenas);
        double promedioFila = sumaFila / cantidadFilasLlenas;
        return Math.round(promedioFila * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    public static Double redondearDecimalesDouble(Double numero, int numeroMaxDecimales) {
        return Math.round(numero * Math.pow(10, numeroMaxDecimales)) / Math.pow(10, numeroMaxDecimales);
    }

    public static boolean ordenarArray1DAscendente(String texto, int Array1D[]) {

        //ORDEN ASCENDENTE
        //iteramos sobre los elementos del arreglo
        for (int i = 0; i < Array1D.length - 1; i++) {
            int menor = i;

            //buscamos el menor número
            for (int j = i + 1; j < Array1D.length; j++) {
                if (Array1D[j] < Array1D[menor]) {
                    menor = j;    //encontramos el menor número
                }
            }

            if (i != menor) {
                //permutamos los valores
                int aux = Array1D[i];
                Array1D[i] = Array1D[menor];
                Array1D[menor] = aux;
            }

        }

        String cadena = "";
        for (int i = 0; i < Array1D.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (Array1D[i]);
        }
        System.out.println("---------------------------------------");
        System.out.println(texto + "[ " + cadena + " ]");
        System.out.println("---------------------------------------");

        return false;
    }

    public static boolean ordenarArray1DDescendente(String texto, int Array1D[]) {

        //ORDEN DESCENDENTE
        //iteramos sobre los elementos del arreglo
        for (int i = 0; i < Array1D.length - 1; i++) {
            int mayor = i;

            //buscamos el mayor número
            for (int j = i + 1; j < Array1D.length; j++) {
                if (Array1D[j] > Array1D[mayor]) {
                    mayor = j;    //encontramos el mayor número
                }
            }

            if (i != mayor) {
                //permutamos los valores
                int aux = Array1D[i];
                Array1D[i] = Array1D[mayor];
                Array1D[mayor] = aux;
            }

        }

        String cadena2 = "";
        for (int i = 0; i < Array1D.length; i++) {
            if (i > 0) {
                cadena2 += " | ";
            }
            cadena2 += (Array1D[i]);
        }
        System.out.println("------------------------------");
        System.out.println(texto + "[ " + cadena2 + " ]");
        System.out.println("------------------------------");

        return false;
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

    public static void printlnInColor(String color, String msg) {
        System.out.println(setColor(color, msg));
    }

    public static void errorMensaje(String msg) {
        //uso, valido para succes y warning mensaje tambien
        //solo se pasa el string x parametro y automaticamente es rojo     
        System.out.println(setColor("rojo", msg));
    }

    public static void successMensaje(String msg) {

        System.out.println(setColor("verde", msg));
    }

    public static void warningMensaje(String msg) {
        System.out.println(setColor("amarillo", msg));
    }

    public static void crearLiniesitas(int tamanio) {
        //se le pasa por parametro la cantidad de veces que queremos
        //que se repita la secuencia de lineas, usualmente con 2 o 3 veces esta bien

        String cadena = String.format("%" + String.valueOf(tamanio) + "s", "").replace(" ", "-----------------------------------");
        System.out.println(cadena);
    }

    public static void printInColor(String color, String msg) {
        System.out.print(setColor(color, msg));
    }

    public static void GGEZ() {
        System.out.println(" $$$$$$\\   $$$$$$\\        $$$$$$$$\\ $$$$$$$$\\ ");
        System.out.println("$$  __$$\\ $$  __$$\\       $$  _____|\\____$$  |");
        System.out.println("$$ /  \\__|$$ /  \\__|      $$ |          $$  /");
        System.out.println("$$ |$$$$\\ $$ |$$$$\\       $$$$$\\       $$  / ");
        System.out.println("$$ |\\_$$ |$$ |\\_$$ |      $$  __|     $$  /  ");
        System.out.println("$$ |  $$ |$$ |  $$ |      $$ |       $$  /   ");
        System.out.println("\\$$$$$$  |\\$$$$$$  |      $$$$$$$$\\ $$$$$$$$\\ ");
        System.out.println(" \\______/  \\______/       \\________|\\________|");

    }

    public static void tabularArray2DNumerico(Integer[][] Array2D, int cantidadDigitos) {

        for (Integer[] row : Array2D) {
            for (int elem : row) {
                System.out.printf("%" + cantidadDigitos + "d", elem);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void MenuOpciones() {
        boolean salir = false;

        int opcion;

        while (!salir) {
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("1. Crear y asignar tamaño a Matriz cuadrada de tamaño MXN de tipo int.");
            System.out.println("2. Cargar valores a Matriz Origen.");
            System.out.println("3. Mostrar Matriz Origen");
            System.out.println("4. Crear nueva matriz de orden NXM y asigno valores invirtiendo la origen ");
            System.out.println("5. Mostrar Matriz Inversa");
            System.out.println("6. Sumar Filas de Matriz origen y asignar en un List");
            System.out.println("7. Calcular el promedio de los valores del List");
            System.out.println("8. Ordenar el List de valores de menor a mayor.");
            System.out.println("9. Salir");
            System.out.println("----------------------------------------------------------------------------------------------------");

            System.out.println("Escribe una de las opciones");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                   
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion 7");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                   
                    break;
                case 7:
                    System.out.println("Has seleccionado la opcion 8");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                  
                    break;
                case 8:
                    System.out.println("Has seleccionado la opcion 9");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    
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
}
