package Calculo;


import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class Calculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacionMatematica clase = new OperacionMatematica();

        clase.setValor1(4);
        clase.setValor2(4);

        System.out.println("Ingrese la operacion a realizar : +,-,*,/");
        String operacion = sc.nextLine();

        double resultado = clase.aplicarOperacion(operacion);
        System.out.println("resultado : " + resultado);

    }
}
