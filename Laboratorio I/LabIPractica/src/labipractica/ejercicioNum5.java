/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labipractica;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ejercicioNum5 {

    public static void main(String[] args) {

        System.out.println("Ingrese un valor para multiplicar : ");
        double num = new Scanner(System.in).nextDouble();

        if (num > 1) {
            recursionMultiplicacion(num);
        } else {
            System.out.println("El numero ingresado debe ser mayor a 0");
        }

    }

    public static double recursionMultiplicacion(double num) {

        double resultado = 0.0;
        if (num <= 100000000) {

            resultado = recursionMultiplicacion(num * num);
            System.out.println(num);
        }
        return resultado;

    }
}
