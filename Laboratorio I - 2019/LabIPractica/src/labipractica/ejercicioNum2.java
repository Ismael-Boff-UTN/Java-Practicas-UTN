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
public class ejercicioNum2 {

    public static void main(String[] args) {

        System.out.println("Ingrese un Numero : ");
        esPar();

    }

    public static void esPar() {
        
        int numero = new Scanner(System.in).nextInt();

        if(numero%2==0){
            System.out.println("El numero es PAR");
            
            
        }else{
            System.out.println("El numero es IMPAR");
            
        }
        
        
        
        
    }
}
