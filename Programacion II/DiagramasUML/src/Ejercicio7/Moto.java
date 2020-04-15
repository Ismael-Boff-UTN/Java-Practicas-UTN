package Ejercicio7;

/**
 *
 * @author SkylakeFrost
 */
public class Moto extends Vehiculo {

    public int numeroRuedas = 2;

    public Moto(double velocidadPromedio, int velocidadMinima, Rueda rueda) {
        super(velocidadPromedio, velocidadMinima, rueda);
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

}
