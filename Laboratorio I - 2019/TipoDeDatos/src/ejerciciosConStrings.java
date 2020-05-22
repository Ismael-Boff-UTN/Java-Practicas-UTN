
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ejerciciosConStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //DESCOMENTAR CADA METODO PARA PROBAR
        //numeroToString();
        //tamanioString();
        //vocalesString(sc);
        //replaceInclusivoXD(sc);
        //stringToASCII(sc);
        //MayusAndMin(sc);
        //extratAndCompare(sc);
    }

    //PUNTO 5
    public static void numeroToString(Scanner sc) {

        System.out.println("Ingrese Un Numero Para Convertirlo a String");

        long numero = sc.nextLong();
        String strNum = Long.toString(numero);

        System.out.println("El numero " + numero + " convertido a String : " + strNum);

    }

    //PUNTO 6
    public static void tamanioString() {

        String texto = "La lluvia en mendoza es escasa";

        int longitud = texto.length();

        System.out.println("La longitud del string es de " + longitud + " caracteres");

    }

    //PUNTO 7
    public static void vocalesString(Scanner sc) {
        System.out.println("Escriba una frase :");
        System.out.println("-------------------");
        String texto = sc.nextLine();
        int longitud = texto.length();
        System.out.println("--------------------------------------------------------");
        System.out.println("La longitud del string es de " + longitud + " caracteres");

        int vocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o'
                    || texto.charAt(i) == 'u') {
                vocales++;
            }

        }

        System.out.println("-----------------------------");
        System.out.println("Tiene " + vocales + " vocales");
        System.out.println("-----------------------------");

    }

    //PUNTO 8
    public static void replaceInclusivoXD(Scanner sc) {

        System.out.println("Escriba una frase para pasarla a inclusive");
        System.out.println("------------------------------------------");

        String texto = sc.nextLine();

        String textoInclusivo = texto.replace('o', 'e');

        System.out.println(textoInclusivo);

    }

    //PUNTO 9
    public static void stringToASCII(Scanner sc) {

        System.out.println("Escriba una frase ");
        System.out.println("------------------");

        String texto = sc.nextLine();
        int caracteres[] = new int[texto.length()];

        String cadenita = "";

        for (int i = 0; i < caracteres.length; i++) {

            if (i >= 0) {
                caracteres[i] = texto.charAt(i);

                cadenita += " ";
            }
            cadenita += (caracteres[i]);

        }
        System.out.println("-------------------");
        System.out.println("Caracteres ASCII de la frase : " + cadenita);

    }

    //PUNTO 10 y 11
    public static void MayusAndMin(Scanner sc) {

        System.out.println("Escriba una frase : ");
        String texto = sc.nextLine();
        System.out.println("--------------------");
        System.out.println("Para convertir la frase a Mayusculas escriba (Mayus) ");
        System.out.println("Para convertir la frase a Minusculas escriba (Minus) ");
        String entrada = sc.nextLine();

        if (entrada.equalsIgnoreCase("Mayus")) {

            System.out.println(texto.toUpperCase());

        }
        if (entrada.equalsIgnoreCase("Minus")) {
            System.out.println(texto.toLowerCase());
        }

    }

    //PUNTO 12 y 13
    public static void extratAndCompare(Scanner sc) {

        System.out.println("Escriba una frase : ");
        String texto = sc.nextLine();
        System.out.println("--------------------");
        System.out.println("Escriba otra frase : ");
        String texto2 = sc.nextLine();
        System.out.println("--------------------");

        if (texto.contains(texto2)) {
            System.out.println("se contienen");
        } else {
            System.out.println("No se contienen");
        }

        System.out.println(texto.substring(4));
        System.out.println(texto.substring(5));

    }
}
