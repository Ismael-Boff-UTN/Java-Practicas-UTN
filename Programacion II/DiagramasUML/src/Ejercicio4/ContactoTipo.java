package Ejercicio4;

/**
 *
 * @author SkylakeFrost
 */
public class ContactoTipo {

    private int idContactoTipo;
    private String descripcion;

    public ContactoTipo(int idContactoTipo, String descripcion) {
        this.idContactoTipo = idContactoTipo;
        this.descripcion = descripcion;
    }

    public int getIdContactoTipo() {
        return idContactoTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
