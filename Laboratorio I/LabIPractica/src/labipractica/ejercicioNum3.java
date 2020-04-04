package labipractica;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ejercicioNum3 {

    public static void main(String[] args) {

        int numeroIngresado;
        //contador para los intentos   
        int intentos = 0;
        //genero el numero random
        int numAleatorio = new Double(Math.random() * 100).intValue();
        //System.out.println("El numero aleatorio es : " + numAleatorio);

        do {
            System.out.println("Intente adivinar el valor generado ");
            System.out.println("Ingrese un valor : ");
            numeroIngresado = new Scanner(System.in).nextInt();

            if (numAleatorio > numeroIngresado) {
                System.out.println("Es Muy Bajo");
            } else {
                System.out.println("Es Muy Alto");
            }

            intentos++;  //se aumenta la cantidad de intentos en uno
        } while (numeroIngresado != numAleatorio);
        System.out.println("FELICIDADES!, el numero generado aleatoriamente es :" + numAleatorio
                + "\nCantidad de intentos : " + intentos);
    }

}
