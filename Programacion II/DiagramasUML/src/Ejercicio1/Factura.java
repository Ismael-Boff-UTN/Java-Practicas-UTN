package Ejercicio1;

import java.util.Date;

/**
 *
 * @author SkylakeFrost
 */
public class Factura {

    private Empleado emp = new Empleado();
    private Cliente clie = new Cliente();
    private int nro_Factura;
    private Date fecha;
    private double monto;

    public Factura(Empleado emp, Cliente clie, int nro_Factura, Date fecha, double monto) {
        this.emp = emp;
        this.clie = clie;
        this.nro_Factura = nro_Factura;
        this.fecha = fecha;
        this.monto = monto;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public Cliente getClie() {
        return clie;
    }

    public void setClie(Cliente clie) {
        this.clie = clie;
    }

    public int getNro_Factura() {
        return nro_Factura;
    }

    public void setNro_Factura(int nro_Factura) {
        this.nro_Factura = nro_Factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Factura{" + "emp=" + emp + ", clie=" + clie + ", nro_Factura=" + nro_Factura + ", fecha=" + fecha + ", monto=" + monto + '}';
    }

}
