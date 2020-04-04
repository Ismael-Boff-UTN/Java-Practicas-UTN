
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej1 {

    public static void main(String[] args) {

        int numerito;
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valores numericos enteros : ");
        System.out.println("Para finalizar la ingrese un numero entero negativo :");

        //Agrego Numeros Mientras Sean Mayores A 0 (cero)
        do {

            numerito = sc.nextInt();

            if (numerito >= 0) {
                numeros.add(numerito);
            }

        } while (numerito >= 0);

        //Muestro el ArrayList
        String cadena = "";
        for (int i = 0; i < numeros.size(); i++) {

            if (i > 0) {
                cadena += " | ";
            }

            cadena += (numeros.get(i));
        }

        System.out.println("Numeros Ingresados : " + "[ " + cadena + " ]");

    }

}
