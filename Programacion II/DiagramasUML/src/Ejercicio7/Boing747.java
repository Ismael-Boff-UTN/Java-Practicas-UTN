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
public class Boing747 extends Vehiculo {

    private int viajes;

    public Boing747(double velocidadPromedio, int velocidadMinima, Rueda rueda) {
        super(velocidadPromedio, velocidadMinima, rueda);
    }

    public int getViajes() {
        return viajes;
    }

    public void setViajes(int viajes) {
        this.viajes = viajes;
    }

    public void despegar() {
        System.out.println("Despegando...");
    }

    public void aterrizar() {
        System.out.println("Aterrizando...");
    }

    public void agregarViaje() {
        System.out.println("Viaje +1");
    }
}
