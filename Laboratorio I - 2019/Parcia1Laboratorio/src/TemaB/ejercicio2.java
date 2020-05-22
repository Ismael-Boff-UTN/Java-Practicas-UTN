package TemaB;


import java.util.InputMismatchException;
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

        numerosAgrupados(sc);

    }

    public static void numerosAgrupados(Scanner sc) {
        double numero = 0;
        int numeroGrupo;
        int grupo = 0;
        int numerosIngresados = 0;
        String Stringgrupos = "";
        String str = " ";
        String[] numeros;

        //Pido numeros enteros positivos hasta que se ingrese un numero negativo
        System.out.println("Ingrese numeros decimales, para terminar ingrese un numero negativo : ");
        do {
            try {

                numero = sc.nextDouble();

                if (numero >= 0) {
                    str += String.valueOf(numero) + " - ";
                    numerosIngresados++;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Solo Puedes Ingresar Numeros!");
                sc.next();
            }
            if (numero < 0) {
                System.out.println("Se Ha Ingresado Un Numero Negativo :D ");
                System.out.println("Ahora se procede a realizar el agrupamiento");
                break;
            }

        } while (numero >= 0);

        //Para mostrar el array de numeros ingresados
        str = str.substring(0, str.length() - 1);

        System.out.println("-----------------------------------------------");
        System.out.println("Se Ingresaron " + numerosIngresados + " Numeros");
        System.out.println("Los Números ingresados son " + str);

        System.out.println("-----------------------------------------------");

        do {
            System.out.println("Ingrese un numero entero positivo para ejecutar agrupamiento :");
            System.out.println("-------------------------------------------");
            numeroGrupo = sc.nextInt();

            if (numeroGrupo > numerosIngresados) {
                System.out.println("El numero de agrupamiento supera los numeros ingresados anteriormente ");
            } else if (numeroGrupo < 0) {
                System.out.println("El numero ingresado para agrupar debe ser entero positivo");
            }

        } while (numeroGrupo > numerosIngresados || numeroGrupo < 0);

        double dobleNumIngresados = numerosIngresados;
        double doubleNumeroGrupo = numeroGrupo;

        if ((dobleNumIngresados / doubleNumeroGrupo) > ((int) (dobleNumIngresados / numeroGrupo))) {
            grupo = (int) ((dobleNumIngresados / doubleNumeroGrupo)) + 1;
        } else {
            grupo = (int) ((numerosIngresados / doubleNumeroGrupo));
        }

        System.out.println("Se crearon " + grupo + " grupos");
        System.out.println("-----------------------------------------------");

        numeros = str.split("-");

        for (int i = 0; i < grupo; i++) {
            Stringgrupos = "";

            if (i == grupo - 1) {
                for (int j = (numeroGrupo * i); j < numeros.length; j++) {
                    Stringgrupos += numeros[j] + "-";
                }
            } else {
                for (int j = (numeroGrupo * i); j < (numeroGrupo * (i + 1)); j++) {
                    Stringgrupos += numeros[j] + "-";
                }
            }

            Stringgrupos = Stringgrupos.substring(0, Stringgrupos.length() - 1);
            System.out.println("Grupo " + (i + 1) + " con valores : " + Stringgrupos);
        }

    }

}
