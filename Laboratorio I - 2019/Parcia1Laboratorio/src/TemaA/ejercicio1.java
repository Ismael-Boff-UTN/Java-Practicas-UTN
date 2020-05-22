package TemaA;


import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sumatoria(sc);
    }

    public static void sumatoria(Scanner sc) {

        int numero;
        int suma = 0;
        int rango = 1000000;
        int intentos = 0;

        do {
            System.out.println("-------------------------------------------------------");
            System.out.println("Ingrese un numero entero mayor a 0 y menor a 100.000 : ");
            numero = sc.nextInt();

            if (numero <= 100000 && numero > 0) {

                suma += numero;
                System.out.println("------------------------");
                System.out.println("Ingresado  : "+numero);
                System.out.println("Acumulado  : " + suma);
                intentos++;

            } else {
                System.out.println("------------------------------------------------------");
                System.out.println("Numero no valido!");

            }

        } while (suma <= rango);
        System.out.println("------------------------------------------------------------");
        System.out.println("Intentos Realizados : " + intentos);

    }

}
