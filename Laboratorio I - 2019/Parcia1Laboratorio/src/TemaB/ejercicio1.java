package TemaB;


import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        cadenitas(sc);
    }

    public static void cadenitas(Scanner sc) {
        String cadena;
        String cadenaAnterior = "";
        String cadenasTotales = "";
        boolean esValida;
        boolean primerCadena = true;
        do {
            do {
                System.out.println("-----------------------------------------");
                System.out.println("Ingrese Una Cadena de Texto :");
                System.out.println("Escriba 000 Para Finalizar!");
                System.out.println("-----------------------------------------");
                cadena = sc.nextLine();
                esValida = false;

                if (cadena.equals("")) {
                    System.out.println("ERROR la cadena no puede estar vacia");
                    esValida = true;
                }
            } while (esValida);

            if (cadena.equals("000")) {
                break;
            }

            longitudCadena(cadena);

            //contiene numeros
            if (contieneNumeros(cadena) == true) {
                System.out.println("NO Contiene Numeros ");
            } else {
                System.out.println("Contiene Numeros ");
            }

            //saber si es primera cadena, etc..
            if (primerCadena) {
                System.out.println("Es la primera cadena ingresada");
                primerCadena = false;
            } else {
                if (cadena.equals(cadenaAnterior)) {
                    System.out.println("La cadena es igual a la anterior");
                } else {
                    System.out.println("La cadena NO ES igual a la anterior");
                }
            }

            cadenaAnterior = cadena;
            cadenasTotales += cadena + " - ";

        } while (true);
        System.out.println(cadenasTotales);
    }

    //METODO PARA SABER LA LONGITUD DE UNA CADENA
    public static void longitudCadena(String str) {
        System.out.println("El tamaño es : " + str.length());
    }

    //METODO PARA SABER SI LA CADENA CONTIENE NUMEROS EN ALGUNO DE SUS CARACTERES
    public static boolean contieneNumeros(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}
