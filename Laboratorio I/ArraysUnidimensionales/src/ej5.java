
/**
 *
 * @author SkylakeFrost
 */
public class ej5 {

    public static void main(String[] args) {

        int numeritos[] = new int[20];
        cargarArray(numeritos);
        mostrarArrayCargado(numeritos);
        promedio(numeritos);

    }

    public static void cargarArray(int numeritos[]) {
        System.out.println("----------------------------");
        System.out.println("Se cargaron 20 valores random al array");

        for (int i = 0; i < numeritos.length; i++) {
            numeritos[i] = (int) (Math.random() * 100);

        }
    }

    public static void mostrarArrayCargado(int numeritos[]) {
        String cadena = "";
        for (int i = 0; i < numeritos.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (numeritos[i]);

        }
        System.out.println("----------------------------");
        System.out.println("Valores Cargados Aleatoriamente  : " + "[ " + cadena + " ]");
        System.out.println("----------------------------");
    }

    public static void promedio(int numeritos[]) {
        //SUMO LOS ELEMENTOS DEL ARRAY QUE SE GENERARON ALEATOREAMENTE
        int suma = 0;

        for (int i = 0; i < numeritos.length; i++) {
            suma = suma + numeritos[i];

        }
        System.out.println("Total de la suma de los elementos del array : " + suma);
        System.out.println("----------------------------");

        //CALCULO EL PROMEDIO
        double promedio = suma / 20;
        System.out.println("Promedio Total : " + suma + " / " + "20 " + " = " + promedio);
        System.out.println("----------------------------");

        //CUALES SON MAYORES,MENORES O IGUALES AL PROMEDIO
        int iguales = 0;
        int mayores = 0;
        int menores = 0;
        for (int i = 0; i < numeritos.length; i++) {
            if (numeritos[i] > promedio) {
                mayores++;
            }
            if (numeritos[i] == promedio) {
                iguales++;
            }
            if (numeritos[i] < promedio) {
                menores++;
            }

        }

        System.out.println("Cantidad de numeros IGUALES al promedios : " + iguales);
        System.out.println("Cantidad de numeros MAYORES al promedios : " + mayores);
        System.out.println("Cantidad de numeros MENORES al promedios : " + menores);
        System.out.println("----------------------------");

    }
}
