
package Ejercicio3;

/**
 *
 * @author SkylakeFrost
 */
public class Perfil {
    private int tipoPerfil;
    private String descripcion;

    public Perfil(int tipoPerfil, String descripcion) {
        this.tipoPerfil = tipoPerfil;
        this.descripcion = descripcion;
    }

    public int getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
