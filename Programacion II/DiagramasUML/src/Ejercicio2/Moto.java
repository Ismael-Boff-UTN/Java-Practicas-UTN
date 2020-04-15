package Ejercicio2;

/**
 *
 * @author SkylakeFrost
 */
public class Moto extends Vehiculo implements Motor {

    public Moto(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public double precio() {
        return 10000.0;
    }

    @Override
    public double velocidad_Maxima() {
        return 200;
    }

    @Override
    public int getRuedas() {
        return this.ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String tipo() {
        return "Esta Moto Tiene Motor A Gasolina...";
    }

}
