package arraydosdimensiones;

import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class practica1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Filas :");
//        int filas = sc.nextInt();
        String arrayArticulos[][] = new String[2][3];

        cargarArraydeArticulos(sc, arrayArticulos);

    }

    public static void cargarArraydeArticulos(Scanner sc, String arrayArticulos[][]) {

        for (int i = 0; i < arrayArticulos.length; i++) {

            System.out.println("Ingrese un Articulo - Precio - Cantidad: ");

            //Articulos
            String articulo = sc.nextLine();
            arrayArticulos[i][0] = articulo;
            //Precio
            String precio = Double.toString(sc.nextDouble());
            arrayArticulos[i][1] = precio;
            //Cantidad
            String cantidad = Integer.toString(sc.nextInt());
            arrayArticulos[i][2] = cantidad;

        }
        System.out.println("---------------------------------------------------------------------------------------");
        String header[][] = {{"Nombre Articulu", "Precio Unitario", "Cantidad"}};
        tabularArray2D(header, 20);
        System.out.println("---------------------------------------------------------------------------------------");
        tabularArray2D(arrayArticulos, 20);
        System.out.println("---------------------------------------------------------------------------------------");

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
