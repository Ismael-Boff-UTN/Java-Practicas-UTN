
/**
 *
 * @author SkylakeFrost
 */
public class ej2 {
    
    public static void main(String[] args) {
        
        int[] pares = {6, 10, 2, 8, 4};
        int[] impares = {7, 9, 5, 1, 3};
        //resultante
        int[] numeros = new int[10];
        
        recorrerArrays(pares, impares, numeros);
        mostrarArrayResultante(numeros);
    }
    
    public static void recorrerArrays(int pares[], int impares[], int numeros[]) {
        int i = 0;
        for (i = 0; i < pares.length; i++) {
            numeros[i] = pares[i];
            
        }
        
        for (int j = 0; j < impares.length; j++) {
            
            numeros[i] = impares[j];
            i++;
        }
        
    }
    //se ordena el array usando el metodo burbuja
    public static void ordenarAscendente(int numeros[]) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0; i < numeros.length - 1; i++) {
            int menor = i;

            //buscamos el menor número
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[menor]) {
                    menor = j;    //encontramos el menor número
                }
            }
            
            if (i != menor) {
                //permutamos los valores
                int aux = numeros[i];
                numeros[i] = numeros[menor];
                numeros[menor] = aux;
            }
            
        }
    }
    
    public static void mostrarArrayResultante(int numeros[]) {
//muestro el array simplemente concatenado
        System.out.println("-------------------------------------------------");
        String cadena = "";
        
        for (int i = 0; i < numeros.length; i++) {
            if (i > 0) {
                cadena += " | ";
            }
            cadena += (numeros[i]);
        }
        
        System.out.println("Array Concatenado : " + "[ " + cadena + " ]");
//muestro el array ordenado de forma ascendente
        ordenarAscendente(numeros);
        System.out.println("-------------------------------------------------");
        String cadena2 = "";
        
        for (int num : numeros) {
            if (num > 0) {
                cadena2 += " | ";
            }
            cadena2 += (num);
        }
        System.out.println("Array Ordenado Ascendente : " + "[ " + cadena2 + " ]");
    }
}
