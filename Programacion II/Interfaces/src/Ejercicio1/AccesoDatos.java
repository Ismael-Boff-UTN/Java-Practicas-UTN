package Ejercicio1;


/**
 *
 * @author SkylakeFrost
 */
public interface AccesoDatos {

    /*Si se omite declarar los atributos como public,static y abstract
    se hace de forma automatica ya que esto es una interface NO una clase
    El nombre de las constantes debe ser escrito en mayusculas y separado por guion
    bajo en caso de contener mas de 1 palabra */
    public static int MAX_REGISTROS = 10;

    public abstract void insertar();

    public abstract void listar();

}
