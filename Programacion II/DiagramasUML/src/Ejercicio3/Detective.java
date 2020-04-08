package Ejercicio3;

/**
 *
 * @author SkylakeFrost
 */
public class Detective extends Persona {

    private String numeroPlaca;

    public Detective(String nombre, String apellido, Foto foto, String numeroPlaca) {
        super(nombre, apellido, foto);
        this.numeroPlaca = numeroPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public boolean invetigarMafioso(Mafioso mafioso) {
        return true;
    }

}
