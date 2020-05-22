
/**
 *
 * @author SkylakeFrost
 */
public class ejercicio2 {

    public static void main(String[] args) {

        callMyMethod("sumarrrrrrrrrr", 2.6);
        numeros();
    }

    public static void callMyMethod(String cadena, double num) {
        if (cadena.equals("sumar")) {

            System.out.println(num);
        } else {
            System.out.println(":v");
        }

    }

    public static void numeros() {

        int numero = 10;

        for (int i = 0; i > numero; i++) {
            System.out.println("El valor del numero es : " + numero);
            numero--;
        }

    }
}
