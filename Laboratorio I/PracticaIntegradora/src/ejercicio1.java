
/**
 *
 * @author SkylakeFrost
 */
public class ejercicio1 {

    public static void main(String[] args) {
        int bucleCuenta = 0;
        int x;
        x = sumarTres();
        //la variable/metodo bucleCuenta no existe
        System.out.println("X es igual a : " + bucleCuenta);

    }

    //es necesario agregar static para poder llamar al metodo desde main
    //nunca se declaro la variable c
    private static int sumarTres() {
        int a, b, c;
        a = 2;
        b = 2;
        c = 2;
        return a + b + c;
    }
}
