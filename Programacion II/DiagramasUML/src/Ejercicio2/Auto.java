package Ejercicio2;

/**
 *
 * @author SkylakeFrost
 */
public class Auto extends Vehiculo implements Motor {

    private int puertas;

    public Auto(int ruedas, String duenio, int puertas) {
        super(ruedas, duenio);
        this.puertas = puertas;
    }

   

    @Override
    public double precio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double velocidad_Maxima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRuedas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRuedas(int ruedas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
