package Ejercicio1;

/**
 *
 * @author SkylakeFrost
 */
public class Proveedor extends Persona implements Estado_Cuenta {

    private String nombre_Comercial;

    public Proveedor(String nombre_Comercial, int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        this.nombre_Comercial = nombre_Comercial;
    }

    public Proveedor(String nombre_Comercial) {
        this.nombre_Comercial = nombre_Comercial;
    }

    public String getNombre_Comercial() {
        return nombre_Comercial;
    }

    public void setNombre_Comercial(String nombre_Comercial) {
        this.nombre_Comercial = nombre_Comercial;
    }

    @Override
    public long getCuit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCuit(long cuit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean problemaVerazCodeme(Tarjeta_de_Credito tarjeta, Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
