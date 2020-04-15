package Ejercicio7;

/**
 *
 * @author SkylakeFrost
 */
public class HondaXR600 extends Moto {

    private String patente;

    public HondaXR600(double velocidadPromedio, int velocidadMinima, Rueda rueda) {
        super(velocidadPromedio, velocidadMinima, rueda);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

}
