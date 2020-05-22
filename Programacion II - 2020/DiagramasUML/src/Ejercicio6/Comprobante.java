package Ejercicio6;

/**
 *
 * @author SkylakeFrost
 */
public class Comprobante {

    protected char tipo;
    protected int numero;
    protected Fecha fecha = new Fecha();

    public Comprobante(char tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;

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
