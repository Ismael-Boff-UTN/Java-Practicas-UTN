package Ejercicio1;


/**
 *
 * @author SkylakeFrost
 */
public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar Desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar Desde Oracle");
    }

}
