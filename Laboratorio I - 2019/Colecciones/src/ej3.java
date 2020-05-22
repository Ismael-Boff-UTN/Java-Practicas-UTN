
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        cargarListaRandom(numeros);
        promedio(numeros);

    }

    public static void cargarListaRandom(List<Integer> numeros) {
        System.out.println("Se cargaron 20 numeros random a la lista !");

        for (int i = 0; i < 20; i++) {
            numeros.add((int) (Math.random() * 100 + 1));
        }

        //Muestro la lista cargada
        String cadena = "";
        for (int i = 0; i < numeros.size(); i++) {
            if (i > 0) {
                cadena += " | ";
            }

            cadena += (numeros.get(i));
        }

        System.out.println("Numeros Ingresados Random : " + "[ " + cadena + " ]");
        System.out.println("----------------------------------------------------------");
    }

    public static void promedio(List<Integer> numeros) {
        //Calculo El Promdio
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        System.out.println("Suma Total De Los Elementos De La Lista : " + suma);

        double promedio = suma / 20;
        System.out.println("El Promedio De Los Elementos De La Lista Es : " + promedio);

        //Calculo Cantidad De Elementos Mayores, Menores o Iguales Al Promedio
        int iguales = 0;
        int mayores = 0;
        int menores = 0;

        for (Integer elemento : numeros) {

            if (elemento > promedio) {
                mayores++;
            }
            if (elemento < promedio) {
                menores++;
            }
            if (elemento == promedio) {
                iguales++;
            }

        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Cantidad de numeros IGUALES al promedios : " + iguales);
        System.out.println("Cantidad de numeros MAYORES al promedios : " + mayores);
        System.out.println("Cantidad de numeros MENORES al promedios : " + menores);
        System.out.println("------------------------------------------------------");
    }

}
