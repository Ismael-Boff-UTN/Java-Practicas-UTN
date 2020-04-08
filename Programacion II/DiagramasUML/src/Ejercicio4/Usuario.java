package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SkylakeFrost
 */
public class Usuario extends Persona {

    private int idUsuario;
    private String usuario;
    private String password;
    private List<Contacto> contactos = new ArrayList<>();

   

    public Usuario(int idUsuario, String usuario, String password, String nombre, String apellido, int idPersona) {
        super(nombre, apellido, idPersona);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }
    
    

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

}
