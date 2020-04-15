package Ejercicio1;

/**
 *
 * @author SkylakeFrost
 */
public class Cliente extends Persona implements Estado_Cuenta {

    public Tarjeta_de_Credito credit_Car;

    /*Aca como es agregacion, si puede ir el atributo, tajeta de credito, en el constructor*/
    public Cliente(int dni, String nombre, String apellido, long cuit, Tarjeta_de_Credito credit_Car) {
        super(dni, nombre, apellido, cuit);
        this.credit_Car = credit_Car;

    }

    public Cliente() {
    }

    public Tarjeta_de_Credito getCredit_Car() {
        return credit_Car;
    }

    public void setCredit_Car(Tarjeta_de_Credito credit_Car) {
        this.credit_Car = credit_Car;
    }

    @Override
    public long getCuit() {
        return cuit;
    }

    @Override
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    @Override
    public boolean problemaVerazCodeme(Tarjeta_de_Credito tarjeta, Factura factura) {
        if (tarjeta.getLimite() < factura.getMonto()) {
            return false;
        } else {
            return true;
        }
    }

}
