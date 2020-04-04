package Ejercicio2;

/**
 *
 * @author SkylakeFrost
 */
public class Suma implements OperacionesMatematicas {

    @Override
    public double operacion(double a, double b) {
        double suma = a + b;
        return suma;
    }

}
