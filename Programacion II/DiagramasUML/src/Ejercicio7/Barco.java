package Ejercicio7;

/**
 *
 * @author SkylakeFrost
 */
public class Barco extends Vehiculo {

    private String tipoBarco;

    public Barco(double velocidadPromedio, int velocidadMinima, Rueda rueda) {
        super(velocidadPromedio, velocidadMinima, rueda);
        
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

}
