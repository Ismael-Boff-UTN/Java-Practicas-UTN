
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej8 {

    public static void main(String[] args) {

        System.out.println("Ingrese una cadena de numeros separadas por guion, ej : 54-23-2343-121");
        Scanner sc = new Scanner(System.in);
        String cadenaNumeros = sc.nextLine();
        //separo cada numero cada vez que se encuentra un guin medio "-" usando el metodo split
        String array[] = cadenaNumeros.split("-");
        //creo un array de tipo entero para guardar los strings parseados
        int arrayInt[] = new int[array.length];
        //aca parseo cada string previamente separado por el guion a int
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }

        mostrarArrayCargado(array);
        SumoElementosYCalculoPromedio(arrayInt);

    }

    public static void mostrarArrayCargado(String array[]) {
        String cadena = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (array[i]);

        }
        System.out.println("----------------------------");
        System.out.println("Valores Cargados  : " + "[ " + cadena + " ]");
        System.out.println("----------------------------");
    }

    //notese que el array pasado en este metodo es el array de tipo entero!
    //osea el array de tipo int que contiene los strings ya parseados
    public static void SumoElementosYCalculoPromedio(int arrayInt[]) {
        int suma = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            suma = suma + arrayInt[i];
        }
        System.out.println("Total de la suma de los elementos del array : " + suma);
        System.out.println("----------------------------");

        int elementos = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            elementos++;
        }
        System.out.println("El Array Posee " + elementos + " elementos.");
        System.out.println("----------------------------");
        double promedio = suma / elementos;
        System.out.println("Promedio Total : " + suma + " / " + elementos + " = " + promedio);
        System.out.println("----------------------------");
    }

}
