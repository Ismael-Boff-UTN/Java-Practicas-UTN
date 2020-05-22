package Ejercicio1;

import java.util.Date;

/**
 *
 * @author SkylakeFrost
 */
public class Empleado extends Persona {

    private Date fecha_ingreso;
    private int nro_Legajo;

    public Empleado(Date fecha_ingreso, int nro_Legajo, int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        this.fecha_ingreso = fecha_ingreso;
        this.nro_Legajo = nro_Legajo;
    }

    public Empleado(Date fecha_ingreso, int nro_Legajo) {
        this.fecha_ingreso = fecha_ingreso;
        this.nro_Legajo = nro_Legajo;
    }

    public Empleado() {
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getNro_Legajo() {
        return nro_Legajo;
    }

    public void setNro_Legajo(int nro_Legajo) {
        this.nro_Legajo = nro_Legajo;
    }

    @Override
    public long getCuit() {

        return cuit;
    }

    @Override
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

}
