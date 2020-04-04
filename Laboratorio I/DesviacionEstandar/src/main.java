
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static String array[][] = null;



    
    public static void main (String[] args) {

        cargarArray();
        tabularArray2D(4);
        calcularDesviacionEstandar();

    }

    public static void cargarArray() {
        System.out.println("Ingrese El Tamaño Del Array : ");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        int tamanio = sc.nextInt();

        array = new String[tamanio][tamanio];
        System.out.println("Se Ha Generado Un Array 2D De Dimensiones " + tamanio + " X " + tamanio);
        int mitad = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                array[i][j] = String.valueOf((int) (Math.random() * -107) + 107);

            }
        }

    }

    public static void calcularDesviacionEstandar() {
        //Obtengo La Media Aritmetica O Promedio
        double suma = 0;
        int cantidadElementos = 0;
        int mitad = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) <= (mitad * 2) && (i - j) >= 0) {
                    suma += Double.valueOf(array[i][j]);
                    cantidadElementos++;
                }

            }
        }
        double promedio = suma / cantidadElementos;
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Promedio : " + promedio);
        System.out.println("Tamaño De La Muestra : " + cantidadElementos + " Para La Poblacion " + (cantidadElementos - 1) + " Para La Muestra");

        //Obtengo La Varianza Poblacional y Muestral
        double varianza = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) <= (mitad * 2) && (i - j) >= 0) {
                    varianza += Math.pow((Integer.valueOf(array[i][j]) - promedio), 2);
                }
            }
        }
        double varianzaPoblacional = varianza / cantidadElementos;
        double varianzaMuestral = varianza / (cantidadElementos - 1);
        System.out.println("Varianza Poblacional : " + varianzaPoblacional);
        System.out.println("Varianza Muestral : " + varianzaMuestral);

        //Obtengo La Desviacion Estandar
        double desviacionEstandarPoblacional = Math.sqrt(varianza / cantidadElementos);
        double desviacionEstandarMuestral = Math.sqrt(varianza / (cantidadElementos - 1));
        System.out.println("Desviacion Estandar Poblacional : " + desviacionEstandarPoblacional);
        System.out.println("Desviacion Estandar Muestral : " + desviacionEstandarMuestral);
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

    public static boolean tabularArray2D(int stringMayor) {
        int mitad = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] != null) {
                    String value = String.format("%" + String.valueOf(stringMayor) + "s", array[i][j]);
                    if ((i + j) <= (mitad * 2) && (i - j) >= 0) {
                        System.out.print(setColor("verde", "  " + value + " "));
                    } else {System.out.print(setColor("verde", "  " + value + " "));
                        System.out.print(setColor("negro", "  " + value + " "));
                    }

                }
            }
            if (array[i][0] != null) {
                System.out.println();
            }
        }

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

}
