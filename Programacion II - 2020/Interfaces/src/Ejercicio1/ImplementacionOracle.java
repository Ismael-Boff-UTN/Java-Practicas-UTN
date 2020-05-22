package Ejercicio1;

/**
 *
 * @author SkylakeFrost
 */
public class ImplementacionOracle extends AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar Desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar Desde Oracle");
    }

}
