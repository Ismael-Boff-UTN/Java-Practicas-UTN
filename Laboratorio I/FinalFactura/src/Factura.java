
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class Factura {

    private String fecha, tipoPago, cliente;
    private long numeroFactura;
    private double montoTotal, montoFinal, recargo;
    int porcentajeRecargo;
    //codigo item, denominacion,precio unitario,cantidad,subtotal
    private String itemFactura[][] = new String[11][5];
    //para guardar los codigos y realizar las validaciones de si la lista esta vacio o ya fue ingresado el codigo
    private List<String> codigosIngresados = new ArrayList<>();

    public List<String> getCodigosIngresados() {
        return codigosIngresados;
    }

    public void setCodigosIngresados(List<String> codigosIngresados) {
        this.codigosIngresados = codigosIngresados;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public String[][] getItemFactura() {
        return itemFactura;
    }

    public void setItemFactura(String[][] itemFactura) {
        this.itemFactura = itemFactura;
    }

    public int getPorcentajeRecargo() {
        return porcentajeRecargo;
    }

    public void setPorcentajeRecargo(int porcentajeRecargo) {
        this.porcentajeRecargo = porcentajeRecargo;
    }

}
