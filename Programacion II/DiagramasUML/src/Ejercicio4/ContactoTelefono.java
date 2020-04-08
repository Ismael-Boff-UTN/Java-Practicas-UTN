package Ejercicio4;

/**
 *
 * @author SkylakeFrost
 */
public class ContactoTelefono {

    private int idContactoTelefono;
    private String codigo;
    private String numero;

    public ContactoTelefono(int idContactoTelefono, String codigo, String numero) {
        this.idContactoTelefono = idContactoTelefono;
        this.codigo = codigo;
        this.numero = numero;
    }

    public int getIdContactoTelefono() {
        return idContactoTelefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
