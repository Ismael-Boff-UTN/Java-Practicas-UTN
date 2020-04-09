package Ejercicio5;

/**
 *
 * @author SkylakeFrost
 */
public class Factura extends Comprobante {

    private float total;
    private Cliente cliente;
    private Producto producto;

    public Factura(float total, char tipo, int numero, Fecha fecha) {
        super(tipo, numero, fecha);
        this.total = total;
    }

    public Factura(float total) {
        this.total = total;
    }

    public Factura() {
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
