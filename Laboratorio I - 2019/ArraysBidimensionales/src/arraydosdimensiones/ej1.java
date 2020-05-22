package arraydosdimensiones;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paises[][] = new String[4][4];

        cargarArray(paises, sc);

    }

    public static void cargarArray(String paises[][], Scanner sc) {

        for (int fila = 0; fila < paises.length; fila++) {

            System.out.println("Ingrese un pais ");
            String pais = sc.nextLine();
            paises[fila][0] = pais;
            System.out.println("Ingrese la primera ciudad para  " + pais);
            String ciudad = sc.nextLine();
            paises[fila][1] = ciudad;
            System.out.println("Ingrese la segunda ciudad para  " + pais);
            String ciudad2 = sc.nextLine();
            paises[fila][2] = ciudad2;
            System.out.println("Ingrese la tercera ciudad para  " + pais);
            String ciudad3 = sc.nextLine();
            paises[fila][3] = ciudad3;

        }
        System.out.println("--------------------------------------------------------------------------------------");
        String header[][] = {{"Nombre Pais", "Ciudad 1", "Ciudad 2", "Ciudad 3"}};
        tabularArray2D(header, 20);
        System.out.println("--------------------------------------------------------------------------------------");
        tabularArray2D(paises, 20);
        System.out.println("--------------------------------------------------------------------------------------");

    }

    public static boolean tabularArray2D(String[][] Array2D, int stringMayor) {

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[0].length; j++) {
                if (Array2D[i][j] != null) {
                    String value = String.format("%" + String.valueOf(stringMayor) + "s", Array2D[i][j]);
                    System.out.print(value);
                }
            }
            if (Array2D[i][0] != null) {
                System.out.println();
            }
        }

        return false;
    }

}
