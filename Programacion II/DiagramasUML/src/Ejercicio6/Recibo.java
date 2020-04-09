package Ejercicio6;

/**
 *
 * @author SkylakeFrost
 */
public class Recibo extends Comprobante {

    private Proveedor proveedor;
    private float total;
    private String detalle;

    public Recibo(Proveedor proveedor, float total, String detalle, char tipo, int numero, Fecha fecha) {
        super(tipo, numero, fecha);
        this.proveedor = proveedor;
        this.total = total;
        this.detalle = detalle;
    }

    public Recibo(Proveedor proveedor, float total, String detalle) {
        this.proveedor = proveedor;
        this.total = total;
        this.detalle = detalle;
    }

    public Recibo() {
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

}
