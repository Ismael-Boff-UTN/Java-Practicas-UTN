package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SkylakeFrost
 */
public class Cliente extends Persona implements Estado_Cuenta {

    private List<Tarjeta_de_Credito> listaTarjetas = new ArrayList<>();

    /*Aca como es agregacion, si puede ir el atributo, tajeta de credito, en el constructor*/
    public Cliente(int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);

    }

    public Cliente() {
    }

    public List<Tarjeta_de_Credito> getTarjetas() {
        return listaTarjetas;
    }

    public void addTarjetas(Tarjeta_de_Credito tarjeta) {
       listaTarjetas.add(tarjeta);
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
