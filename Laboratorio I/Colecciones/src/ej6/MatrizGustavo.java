package ej6;

import java.util.ArrayList;
import java.util.Scanner;

// @author Gustavo
public class MatrizGustavo {

    public static ArrayList<Celda> matrizCuadrada = new ArrayList<>();

    public static void main(String[] args) {
        Celda c = new Celda();
        int iAux;
        String sAux = "";
        int maxFilas = 0;
        int maxColumnas = 0;
        
        
        do {
            c = new Celda();

            System.out.println("Ingrese un valor para la celda (\"FIN\" para terminar) ");
            sAux = new Scanner(System.in).nextLine();
            if (sAux.equals("FIN")) {
                break;
            }
            c.setValor(sAux);

            System.out.println("Ingrese Fila");
            iAux = new Scanner(System.in).nextInt();
            c.setFila(iAux);

            System.out.println("Ingrese Columna");
            iAux = new Scanner(System.in).nextInt();
            c.setColumna(iAux);

            if (matrizCuadrada != null && matrizCuadrada.isEmpty()) {
            matrizCuadrada.add(c);
            }else{
                for (int i=0; i< matrizCuadrada.size();i++) {
                    if (matrizCuadrada.get(i).getColumna() == c.getColumna()) {
                        if (matrizCuadrada.get(i).getFila() == c.getFila()) {
                        matrizCuadrada.get(i).setValor(c.getValor());
                        }
                    } else {
                        matrizCuadrada.add(c);
                        break;
                    }
                }
            }
        } while (true);

       

        for (Celda p : matrizCuadrada) {
            if (p.getFila() > maxFilas) {
                maxFilas = p.getFila();
            }
            if (p.getColumna() > maxColumnas) {
                maxColumnas = p.getColumna();
            }
        }
        
      
        for (int i = 0; i <= maxFilas; i++) {
            sAux="";
            for (int j = 0; j <= maxColumnas; j++) {
                sAux += fMatrizValor(i,j) + " | ";
            }
            System.out.println(sAux);
        }
        

    }

    public static String fMatrizValoryError(int fila, int columna) {
    String c = fMatrizValor(fila,columna);
        if (c.equals(Character.toString ((char) 27))) {
        return "La fila y columna indicada no ha sido asignada" ;
        }else{
        return c ;
        }
    }
        

        public static String fMatrizValor(int fila, int columna) {

        for (Celda p : matrizCuadrada) {
            if (p.getFila() == fila) {
                if (p.getColumna() == columna) {
                    return p.getValor();
                }
            }
        }

        return Character.toString ((char) 27);
    }

}

