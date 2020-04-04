
import java.util.Scanner;

/**
 *
 * @author SkylakeFrost
 */
public class Algoritmos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        //pedirCadenas(sc);
        //Promedio(sc);
        //System.out.println("Ingrese una frase : ");
        //String cadena = sc.nextLine();
        //stringRecursivo(0, cadena);
        arrayEnteros(array);
    }

    public static void pedirCadenas(Scanner sc) {

        System.out.println("Ingrese una frase :");
        String cadena1 = sc.nextLine();
        int longitudCad1 = cadena1.length();
        System.out.println("Ingrese otra frase :");
        String cadena2 = sc.nextLine();
        int longitudCad2 = cadena2.length();

        if (longitudCad2 <= longitudCad1) {

            if (cadena1.contains(cadena2)) {
                System.out.println("ENCONTRADO!");
            } else {
                System.out.println("NO ENCONTRADO!");
            }
        } else {
            System.out.println("La 2da frase debe ser igual o mas corta que la primera!");
        }

    }

    public static void Promedio(Scanner sc) {

        System.out.println("Cuantas notas desea ingresar? : ");
        int cantidadNotas = sc.nextInt();
        double nota = 0;
        double suma = 0;
        double prom = 0;

        if (cantidadNotas > 0) {
            for (int i = 1; i <= cantidadNotas; i++) {

                System.out.println("Ingrese nota " + i + " de " + cantidadNotas);
                nota = sc.nextDouble();
                suma = suma + nota;
            }
            prom = suma / cantidadNotas;
            System.out.println("Promedio de las notas :" + prom);
        } else {
            System.out.println("El numero de notas debe ser mayor a 0!");
        }

    }

    public static void stringRecursivo(int pos, String cadena) {

        if (pos < cadena.length()) {
            System.out.println("Letra de la posicion :" + pos + "    -----  " + cadena.charAt(pos) + "  ------");
            stringRecursivo(++pos, cadena);
        }
    }

    public static void arrayEnteros(int array[]) {
        System.out.println("----------------------------");
        System.out.println("Se cargaron 10 valores enteros random al array");

        // Esta variable se usa para llenar el arreglo en la posición correspondiente, osea empezando en la pos 0
        int indice = 0;

        // este bucle que se ejecuta hasta que hayamos llenado el array
        while (indice < 10) {
            // Variable que almacenará el número aleatorio propuesto
            int numeroRandom = (int) (Math.random() * 10 + 1);

            // Variable que indica si el número propuesto está repetido
            boolean repetido = false;
            //este bucle que se ejecutara siempre que el numero no este repetido
            while (!repetido) {
                // Bucle que recorre el arreglo comparando el número propuesto con
                // cada uno de los elementos del arreglo
                for (int i = 0; i < array.length; i++) {
                    //realizamos la comparación
                    if (numeroRandom == array[i]) {
                        // si el número se repite, establecemos repetido=true
                        // y salimos del bucle
                        repetido = true;
                        break;
                    }
                }
                // verificamos el estado del valor repetido. Si es false, significa
                // que hemos recorrido el array hasta la posición index sin encontrar
                // coincidencias
                if (!repetido) {
                    // almacenamos el valor propuesto ya que no está repetido
                    // incrementamos el índice
                    array[indice] = numeroRandom;
                    indice++;
                }
            }

        }
        // mostramos los valores por pantalla

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "  ");

        }
        System.out.println("");
    }
}
