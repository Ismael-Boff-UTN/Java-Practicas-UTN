package Ejercicio7;

/**
 *
 * @author SkylakeFrost
 */
public class Auto extends Vehiculo {

    public int numeroRuedas = 4;

    public Auto(double velocidadPromedio, int velocidadMinima, Rueda rueda) {
        super(velocidadPromedio, velocidadMinima, rueda);
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

}
