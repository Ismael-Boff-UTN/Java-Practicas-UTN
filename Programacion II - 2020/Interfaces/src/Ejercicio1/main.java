package Ejercicio1;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {

        AccesoDatos datos = new ImplementacionMySql();

        System.out.println(datos.nombre());
        ejecutar(datos, "listar");
        datos = new ImplementacionMySql();
        ejecutar(datos, "insertar");

        datos = new ImplementacionOracle();
        ejecutar(datos, "insertar");
        ejecutar(datos, "listar");

    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if ("insertar".equals(accion)) {
            datos.insertar();
        } else if ("listar".equals(accion)) {
            datos.listar();
        }
    }
}
