
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class ej9 {

    public static void main(String[] args) {
        System.out.println("Ingrese su numero de DNI (sin puntos, xq me rompes el programita) para que se le asigne una letra");

        Scanner sc = new Scanner(System.in);

        int numeroDNI = sc.nextInt();

        char arrayLetras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        obtenerLetra(numeroDNI, arrayLetras);

    }

    public static void obtenerLetra(int numeroDNI, char arrayLetras[]) {

        int resto = numeroDNI % 23;

        int posicion = resto;
        char letraAsiganada = arrayLetras[posicion];

        System.out.println("La letra que corresponde a su DNI es : " + letraAsiganada);
        System.out.println("DNI Final : " + numeroDNI + letraAsiganada);

    }

}
