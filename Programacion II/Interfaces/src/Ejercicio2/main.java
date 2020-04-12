package Ejercicio2;

/**
 *
 * @author SkylakeFrost
 */
import java.util.Scanner;

public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        realizarOperacion();
    }

    public static void realizarOperacion() {

        System.out.println("Ingrese 1er Valor : ");
        double v1 = sc.nextDouble();
        System.out.println("Ingrese 2do Valor : ");
        double v2 = sc.nextDouble();
        System.out.println("Ingrese Tipo De Operación , por ej. +,-,*,/");
        String eleccion = new Scanner(System.in).nextLine();

        if (eleccion.equals("+")) {
            OperacionesMatematicas op = new Suma();

            System.out.println("Resultado Suma : " + op.operacion(v1, v2));
        }
        if (eleccion.equals("-")) {
            OperacionesMatematicas op = new Resta();

            System.out.println("Resultado Resta : " + op.operacion(v1, v2));
        }
        if (eleccion.equals("*")) {
            OperacionesMatematicas op = new Multiplicacion();
            System.out.println("Resultado Multiplicacion : " + op.operacion(v1, v2));
        }
        if (eleccion.equals("/")) {
            OperacionesMatematicas op = new Divicion();
            System.out.println("Resultado Divicion : " + op.operacion(v1, v2));
        }

    }
}
