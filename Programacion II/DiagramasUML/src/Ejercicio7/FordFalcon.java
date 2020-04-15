/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author SkylakeFrost
 */
public class FordFalcon extends Auto {

    private String patente;

    public FordFalcon(String patente, double velocidadPromedio, int velocidadMinima, Rueda rueda) {
        super(velocidadPromedio, velocidadMinima, rueda);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

}
