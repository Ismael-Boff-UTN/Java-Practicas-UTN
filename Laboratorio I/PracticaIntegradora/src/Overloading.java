/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SkylakeFrost
 */
public class Overloading {

    public static void main(String[] args) {

        System.out.println(multiplicarNumeros(2, 2));
        System.out.println(multiplicarNumeros(1, 2, 3, 4));

    }
    //se cambia la suma por multiplicacion

    static int multiplicarNumeros(int a, int b) {
        return a * b;
    }
    //al metodo anterior se le agregan dos variables de tipo entero c y d

    static int multiplicarNumeros(int a, int b, int c, int d) {
        return a * b * c * d;
    }

}
