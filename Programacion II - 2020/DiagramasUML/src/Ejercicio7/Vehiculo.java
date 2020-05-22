package Ejercicio7;

/**
 *
 * @author SkylakeFrost
 */
public class Vehiculo implements Desplazable {

    protected double velocidadPromedio;
    protected int velocidadMinima;
    protected Rueda rueda;

    public Vehiculo(double velocidadPromedio, int velocidadMinima, Rueda rueda) {
        this.velocidadPromedio = velocidadPromedio;
        this.velocidadMinima = velocidadMinima;
        this.rueda = rueda;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public int getVelocidadMinima() {
        return velocidadMinima;
    }

    public void setVelocidadMinima(int velocidadMinima) {
        this.velocidadMinima = velocidadMinima;
    }

    public Rueda getRueda() {
        return rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }

    public void romperInercia() {
        System.out.println("Rompiendo Inercia...");
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Esquivandoooo!!!!");
    }

}
