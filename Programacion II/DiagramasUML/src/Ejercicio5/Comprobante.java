package Ejercicio5;

/**
 *
 * @author SkylakeFrost
 */
public class Comprobante {

    protected char tipo;
    protected int numero;
    protected Fecha fecha;

    public Comprobante(char tipo, int numero, Fecha fecha) {
        this.tipo = tipo;
        this.numero = numero;
        this.fecha = fecha;
    }

    public Comprobante() {
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

}
