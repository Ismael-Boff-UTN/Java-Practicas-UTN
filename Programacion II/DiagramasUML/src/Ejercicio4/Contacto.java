package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SkylakeFrost
 */
public class Contacto extends Persona {

    private int idContacto;
    private ContactoTipo tipo;
    private List<ContactoDomicilio> domicilios = new ArrayList<>();
    private List<ContactoTelefono> telefonos = new ArrayList<>();

    

    public Contacto(ContactoTipo tipo, String nombre, String apellido, int idPersona) {
        super(nombre, apellido, idPersona);
        this.tipo = tipo;
    }
    
    

    public int getIdContacto() {
        return idContacto;
    }

    public ContactoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ContactoTipo tipo) {
        this.tipo = tipo;
    }

    public List<ContactoDomicilio> getDomicilios() {
        return domicilios;
    }

    public void addDomicilios(ContactoDomicilio domicilio) {
        domicilios.add(domicilio);
    }

    public List<ContactoTelefono> getTelefonos() {
        return telefonos;
    }

    public void addTelefonos(ContactoTelefono telefono) {
        telefonos.add(telefono);
    }

}
