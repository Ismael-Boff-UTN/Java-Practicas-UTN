package Ejercicio7;

/**
 *
 * @author SkylakeFrost
 */
public class HondaXR25 extends Moto {

    private String patente;

    public HondaXR25(double velocidadPromedio, int velocidadMinima, Rueda rueda) {
        super(velocidadPromedio, velocidadMinima, rueda);
    }

    public void esquivarObstaculos(int metros) {

    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

}
