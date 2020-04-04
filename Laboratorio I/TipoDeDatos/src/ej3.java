
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SkylakeFrost
 */
public class ej3 {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero para sumar sus digitos : ");
        System.out.println("-------------------------------------------");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        sumarDigitos(numero);
    }

    public static void sumarDigitos(int numero) {

        double resultado = 0;
        while (numero > 0) {

            resultado += numero % 10;

            numero = numero / 10;

        }

        System.out.println("La suma de sus digitos es: " + resultado);

    }

}
