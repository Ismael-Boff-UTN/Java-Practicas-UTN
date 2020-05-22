package TemaA;


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
public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        pedirCadena(sc);

    }

    public static void pedirCadena(Scanner sc) {
        
        
        boolean esValida;

        
        do {
            System.out.println("Ingrese una cadena alfanumerica de almenos 50 caracteres sin espacios en blanco : ");
            
            String cadena = sc.nextLine();
            int longitud = cadena.length();

            char[] cadenaNumeros = cadena.toCharArray();
            
            String n = "";
            for (int i = 0; i < cadenaNumeros.length; i++) {
                if (Character.isDigit(cadenaNumeros[i])) {
                    n += cadenaNumeros[i];
                }
            }
            String l = "";
            for (int i = 0; i < cadenaNumeros.length; i++) {
                if (Character.isAlphabetic(cadenaNumeros[i])) {
                    l += cadenaNumeros[i];
                }

            }

            if (longitud < 50 && cadena.contains("")) {
                System.out.println("Cadena no valida!");
                esValida = false;

            } else {
                System.out.println("Numeros : " + n);
                System.out.println("Letras : " + l);
                break;
            }
            
        } while (!esValida);
        System.out.println("");

    }

}
