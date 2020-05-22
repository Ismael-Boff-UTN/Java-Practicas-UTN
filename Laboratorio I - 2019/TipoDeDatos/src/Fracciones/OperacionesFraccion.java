package Fracciones;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class OperacionesFraccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese El Primer Valor : ");
        int numerador1 = sc.nextInt();
        System.out.println("Ingrese El Segundo Valor : ");
        int denominador1 = sc.nextInt();
        System.out.println("Ingrese El Tercer Valor : ");
        int numerador2 = sc.nextInt();
        System.out.println("Ingrese El Cuarto Valor : ");
        int denominador2 = sc.nextInt();

        Fraccion f1 = new Fraccion(numerador1, denominador1);
        Fraccion f2 = new Fraccion(numerador2, denominador2);

        System.out.println("--------------------------------------------------");
        System.out.println("La primera fraccion es : ");
        f1.mostrarFracciones(f1);
        System.out.println("--------------------------------------------------");
        System.out.println("La segunda fraccion es : ");
        f2.mostrarFracciones(f2);
        System.out.println("--------------------------------------------------");

        Fraccion Suma = new Fraccion();
        Suma.sumarFracciones(f1, f2);
        System.out.println("La suma es : ");
        Suma.mostrarFracciones(Suma);

        Fraccion Resta = new Fraccion();
        Resta.restarFracciones(f1, f2);
        System.out.println("La resta es : ");
        Resta.mostrarFracciones(Resta);

        Fraccion Multipliciacion = new Fraccion();
        Multipliciacion.multiplicarFracciones(f1, f2);
        System.out.println("La multiplicacion es : ");
        Multipliciacion.mostrarFracciones(Multipliciacion);

        Fraccion Divicion = new Fraccion();
        Divicion.dividirFracciones(f1, f2);
        System.out.println("La divicion es : ");
        Divicion.mostrarFracciones(Divicion);
    }
}
