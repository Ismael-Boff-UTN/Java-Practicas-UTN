package Ejercicio2;

/**
 *
 * @author SkylakeFrost
 */
public class Auto extends Vehiculo implements Motor {

    private int puertas;

    public Auto(int ruedas, String duenio, int puertas) {
        super(ruedas, duenio);
        this.puertas = puertas;
    }

    @Override
    public double precio() {
        return 60000;
    }

    @Override
    public double velocidad_Maxima() {
        return 500;
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
        return "Este Auto Posee Motor Electrico";
    }

}
