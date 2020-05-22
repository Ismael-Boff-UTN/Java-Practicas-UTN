package Fracciones;

/**
 *
 * @author SkylakeFrost
 */
public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion() {

    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {
        this.denominador = (f1.getDenominador() * f2.getDenominador());
        this.numerador = (f1.getNumerador() * f2.getDenominador()) + (f1.getNumerador() * f2.getDenominador());
        Fraccion Suma = new Fraccion(numerador, denominador);

        return Suma;
    }

    public Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
        this.denominador = (f1.getDenominador() * f2.getDenominador());
        this.numerador = (f1.getNumerador() * f2.getDenominador()) - (f1.getNumerador() * f2.getDenominador());
        Fraccion Resta = new Fraccion(numerador, denominador);

        return Resta;
    }

    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2) {
        this.denominador = (f1.getDenominador() * f2.getDenominador());
        this.numerador = (f1.getNumerador() * f2.getNumerador());
        Fraccion Multiplicacion = new Fraccion(numerador, denominador);

        return Multiplicacion;
    }

    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2) {
        this.denominador = (f1.getDenominador() * f2.getNumerador());
        this.numerador = (f1.getNumerador() * f2.getDenominador());
        Fraccion Divicion = new Fraccion(numerador, denominador);

        return Divicion;
    }

    public String mostrarFracciones(Fraccion frac) {

        String mostrar = frac.getNumerador() + "/" + frac.getDenominador();
        System.out.println("" + mostrar);

        return mostrar;

    }
}
