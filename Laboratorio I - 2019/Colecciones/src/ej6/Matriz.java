package ej6;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author SkylakeFrost
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //arraylist donde se guardan los objetos tipo celda
        List<Celda> matrizCuadrada = new ArrayList<>();

        valoresCeldas(sc, matrizCuadrada);
        buscarElementoLista(sc, matrizCuadrada);
    }

    public static void valoresCeldas(Scanner sc, List<Celda> matrizCuadrada) {
        String valorCelda;
        int fila;
        int columna;
        System.out.println("Ingrese Valors Para Los Objetos Tipo Celda");
        System.out.println("Para Finalizar El Ingreso Escriba FIN En El Valor De Celda ");
        do {
            System.out.println("Ingrese Un Valor Para La Celda : ");
            valorCelda = new Scanner(System.in).nextLine();

            if (valorCelda.equalsIgnoreCase("FIN")) {
                break;
            }

            System.out.println("Ingrese Numero De Fila  :");
            fila = sc.nextInt();
            System.out.println("Ingrese Numero De Columna  :");
            columna = sc.nextInt();
            System.out.println("---------------------------------------------");

            //Lleno el arraylist con objetos de la clase celda, hasta que se cumpla la condicion
            matrizCuadrada.add(new Celda(valorCelda, fila, columna));

        } while (!valorCelda.equalsIgnoreCase("FIN"));

        //Muestro los objetos guardados en el arraylist matrizCuadrada
        System.out.println("------------------------------------------------");
        System.out.println("OBJETOS CARGADOS EN LA LISTA <matrizCuadrada> ");
        System.out.println("------------------------------------------------");

        //Hago uso de linkedhashset para eliminar objetos repeditos del arraylist, cuando filas y columnas sean iguales.
        //Para su funcionamiento es necesario implementar los metodos equals y hashcode en la clase celda!
        Set<Celda> linkedHashSet = new LinkedHashSet<>(matrizCuadrada);
        linkedHashSet.addAll(matrizCuadrada);
        matrizCuadrada.clear();
        matrizCuadrada.addAll(linkedHashSet);

        int numObjeto = 1;
        for (Celda c : matrizCuadrada) {

            System.out.println("-------------- Objeto Numero " + numObjeto + " -----------------");
            System.out.println("Valor Celda : " + c.getValor() + " | " + "Fila : " + c.getFila() + " | " + "Columna : " + c.getColumna());

            numObjeto++;
        }

    }

    public static void buscarElementoLista(Scanner sc, List<Celda> matrizCuadrada) {
        int filaBuscada;
        int columnaBuscada;
        boolean encontrado = false;

        do {
            System.out.println("----------------------------------------------------");
            System.out.println("Para Buscar Un Elemento ");
            System.out.println("Ingrese La Fila Y Columna Del Objeto A Buscar ");
            System.out.println("Fila :");
            filaBuscada = sc.nextInt();
            System.out.println("Columna : ");
            columnaBuscada = sc.nextInt();

            System.out.println("----------------------------------------------------");

            for (Celda c : matrizCuadrada) {
                if (c.getFila() == filaBuscada && c.getColumna() == columnaBuscada) {
                    System.out.println("Se Ha Encontrado El Objeto! ");

                    System.out.println("Valor Celda : " + c.getValor());
                    System.out.println("Fila :" + c.getFila());
                    System.out.println("Columna : " + c.getColumna());
                    encontrado = true;
                } else {
                    System.out.println("No Se Ha Encontrado El Objeto :c ");
                    System.out.println("La Fila o Columna No Han Sido Asignadas!");
                }
            }
            System.out.println("----------------------------------------------------");
        } while (encontrado == false);
    }
}
