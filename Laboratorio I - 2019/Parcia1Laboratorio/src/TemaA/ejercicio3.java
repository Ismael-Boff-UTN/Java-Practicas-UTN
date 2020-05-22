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
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int palabras[] = new int[10];
        cargarMostrarArrayNumeros(palabras, sc);
        obtenerLetra(alfabeto, palabras);

    }

    public static void cargarMostrarArrayNumeros(int palabras[], Scanner sc) {
        System.out.println("----------------------------");
        System.out.println("Ingrese 10 valores enteros entre 0 y 26 : ");

        for (int i = 0; i < palabras.length; i++) {

            System.out.println("Ingrese el valor " + i + " : ");

            palabras[i] = sc.nextInt();

        }

        String cadena = "";
        for (int i = 0; i < palabras.length; i++) {
            if (i > 0) {
                cadena += "  ";
            }
            cadena += (palabras[i]);

        }
        System.out.println("----------------------------");
        System.out.println("Valores Numericos Cargados Por Usuario  : " + cadena);
        System.out.println("----------------------------");

    }

    public static void obtenerLetra(char alfabeto[], int palabras[]) {
        String cadena = "";
        for (int i = 0; i < palabras.length; i++) {

            int posicionLetra = palabras[i];

            if (i > 0) {
                cadena += "  ";
            }
            cadena += (alfabeto[posicionLetra]);

        }
        System.out.println("----------------------------");
        System.out.println("Letras  :                                 " + cadena);
        System.out.println("----------------------------");

    }

}
