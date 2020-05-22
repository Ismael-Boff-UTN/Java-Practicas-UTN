package Ejercicio1;

import java.util.Date;

/**
 *
 * @author SkylakeFrost
 */
public class Factura {

    
    private int nro_Factura;
    private Date fecha;
    private double monto;
    private Empleado emp = new Empleado();
    private Cliente clie = new Cliente();

    /*Los Atributos que tienen una composicion, por ej. Cliente, no se agregan al constructor
    Ya que se crean al tener su "new"*/
    public Factura(int nro_Factura, Date fecha, double monto) {

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
