package labipractica;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ejercicioNum4 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MenuDeOperaciones();
    }

    public static void MenuDeOperaciones() {
        int opcion;
        boolean salir = false;

        while (!salir) {

            System.out.println("------------------------------------------");
            System.out.println("           BEST CALCULADORA 2019          ");
            System.out.println("------------------------------------------");
            System.out.println("Ingrese 1 Para Sumar");
            System.out.println("Ingrese 2 Para Restar");
            System.out.println("Ingrese 3 Para Dividir");
            System.out.println("Ingrese 4 Para Multiplicar");
            System.out.println("Ingrese 5 Para Modulo");
            System.out.println("Ingrese 6 Para Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    suma();
                    break;

                case 2:
                    resta();
                    break;
                case 3:
                    divicion();
                    break;

                case 4:
                    multiplicacion();
                    break;
                case 5:
                    modulo();
                    break;
                case 6:
                    System.out.println("Ud. Salio de la calculadora");
                    salir = true;
                    break;
                default:
                    System.out.println("La Opcion ingresada no existe");

                    break;

            }

        }

    }

    public static void suma() {
        System.out.println("Ingrese el primer valor : ");
        double suma1 = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese el segundo valor : ");
        double suma2 = new Scanner(System.in).nextDouble();
        double suma = suma1 + suma2;
        System.out.println("El resultado de la suma es : " + suma);
    }

    public static void resta() {
        System.out.println("Ingrese el primer valor : ");
        double resta1 = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese el segundo valor : ");
        double resta2 = new Scanner(System.in).nextDouble();
        double resta = resta1 - resta2;
        System.out.println("El resultado de la resta es : " + resta);
    }

    public static void multiplicacion() {
        System.out.println("Ingrese el primer valor : ");
        double mult1 = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese el segundo valor : ");
        double mult2 = new Scanner(System.in).nextDouble();
        double multiplicacion = mult1 * mult2;
        System.out.println("El resultado de la multiplicación es : " + multiplicacion);

    }

    public static void divicion() {
        System.out.println("Ingrese el primer valor : ");
        double div1 = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese el segundo valor : ");
        double div2 = new Scanner(System.in).nextDouble();
        double divicion = div1 / div2;
        System.out.println("El resultado de la divicion es : " + divicion);
    }

    public static void modulo() {
        System.out.println("Ingrese el primer valor : ");
        double mod1 = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese el segundo valor : ");
        double mod2 = new Scanner(System.in).nextDouble();
        double modulo = mod1 % mod2;
        System.out.println("El resultado de la suma es : " + modulo);
    }
}
