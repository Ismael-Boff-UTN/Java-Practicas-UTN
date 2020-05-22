package Ejercicio5;

import java.util.List;

/**
 *
 * @author SkylakeFrost
 */
public class Factura extends Comprobante {

    private float total;
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(float total, Cliente cliente, List<Producto> productos, char tipo, int numero, Fecha fecha) {
        super(tipo, numero, fecha);
        this.total = total;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Factura(float total, Cliente cliente, List<Producto> productos) {
        this.total = total;
        this.cliente = cliente;
        this.productos = productos;
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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
