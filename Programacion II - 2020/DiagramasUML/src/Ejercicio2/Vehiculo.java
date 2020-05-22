package Ejercicio2;

/**
 *
 * @author SkylakeFrost
 */
public abstract class Vehiculo {

    protected int ruedas;
    protected String duenio;

    public Vehiculo(int ruedas, String duenio) {
        this.ruedas = ruedas;
        this.duenio = duenio;
    }

    public abstract double precio();

    public abstract double velocidad_Maxima();

    public abstract int getRuedas();

    public abstract void setRuedas(int ruedas);

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

}
