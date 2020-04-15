package Ejercicio2;

/**
 *
 * @author SkylakeFrost
 */
public class Bicicleta extends Vehiculo {

    public Bicicleta(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public double precio() {
        return 400.0;
    }

    @Override
    public double velocidad_Maxima() {
        return 172.0;
    }

    @Override
    public int getRuedas() {
        return this.ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

}
