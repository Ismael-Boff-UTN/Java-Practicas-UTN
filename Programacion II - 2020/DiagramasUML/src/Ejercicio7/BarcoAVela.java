package Ejercicio7;

/**
 *
 * @author SkylakeFrost
 */
public class BarcoAVela extends Barco {

    private int numVeleas;

    public BarcoAVela(double velocidadPromedio, int velocidadMinima, Rueda rueda) {
        super(velocidadPromedio, velocidadMinima, rueda);
    }

    public int getNumVeleas() {
        return numVeleas;
    }

    public void setNumVeleas(int numVeleas) {
        this.numVeleas = numVeleas;
    }

}
