package Ejercicio1;


/**
 *
 * @author SkylakeFrost
 */
public class ImplementacionMySql implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar Desde My SQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar Desde My SQL");
    }

}
