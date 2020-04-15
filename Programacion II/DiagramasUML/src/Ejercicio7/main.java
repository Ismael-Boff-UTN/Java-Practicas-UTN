package Ejercicio7;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {

        Auto auto = new Auto(120, 0, new Rueda("Todo Terreno", "Mejor Agarre"));

        System.out.println("-----------AUTO----------");
        System.out.println("Velocidad Promedio : " + auto.getVelocidadPromedio());
        System.out.println("Velocidad Minima : " + auto.getVelocidadMinima());
        System.out.println("Cantidad Ruedas : " + auto.getNumeroRuedas());
        System.out.println("Tipo Rueda : " + auto.getRueda().getTipo() + "/ Ventajas : " + auto.getRueda().getVentajas());

        FordFalcon auto2 = new FordFalcon("ABC123", 300, 0, new Rueda("Deportiva", "Mayor Velocidad"));

        System.out.println("-----------AUTO Falcon----------");

        System.out.println("Patente : " + auto2.getPatente());
        System.out.println("Velocidad Promedio : " + auto2.getVelocidadPromedio());
        System.out.println("Velocidad Minima : " + auto2.getVelocidadMinima());
        System.out.println("Cantidad Ruedas : " + auto2.getNumeroRuedas());
        System.out.println("Tipo Rueda : " + auto2.getRueda().getTipo() + "/ Ventajas : " + auto.getRueda().getVentajas());
    }
}
