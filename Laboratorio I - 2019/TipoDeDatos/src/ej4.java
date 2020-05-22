
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej4 {

    public static void main(String[] args) {
        System.out.println("Ingrese el dinero total : ");
        System.out.println("--------------------------");
        Scanner sc = new Scanner(System.in);
        double cantidadDinero = sc.nextDouble();

        //todos los billetes y monedas disponibles
        double cash[] = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05};
        //array para llenar y devolver la cantidad segun  el numero ingresado
        double devolucion[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        ayudaCajero(cantidadDinero, cash, devolucion);

    }

    public static void ayudaCajero(double cantidadDinero, double cash[], double devolucion[]) {
        //recorremos el array de billetes y monedas
        for (int i = 0; i < cash.length; i++) {
            if (cantidadDinero >= cash[i]) {
                devolucion[i] = Math.floor(cantidadDinero / cash[i]);

                cantidadDinero = cantidadDinero - (devolucion[i] * cash[i]);
            }
        }

        for (int i = 0; i < cash.length; i++) {
            if (devolucion[i] > 0) {

                if (cash[i] > 2) {
                    System.out.println("Hay " + devolucion[i] + " billetes de : " + cash[i] + " pesos");
                } else {
                    System.out.println("Hay " + devolucion[i] + " mondedas de : " + cash[i] + " centavos ");
                }

            }

        }

    }
}
