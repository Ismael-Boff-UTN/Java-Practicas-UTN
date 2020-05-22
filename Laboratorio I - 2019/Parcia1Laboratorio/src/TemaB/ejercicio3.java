package TemaB;


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
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingrese un numero mayor a 100.000 para sumar sus digitos : ");
            System.out.println("-------------------------------------------");

            numero = sc.nextInt();
            if (numero > 100000) {
                sumarDigitos(numero);
            } else {
                System.out.println("Ud. ha ingresado el numero " + numero + " el cual NO es mayor a 100.000");
                System.out.println("---------------------------------------");
            }
        } while (numero < 100000);
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
