package Ejercicio2;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {

        Moto moto = new Moto(2, "Juan");
        Auto auto = new Auto(4, "Ismael", 4);
        Bicicleta bicicleta = new Bicicleta(2, "Maria");

        System.out.println("--------------MOTO-----------------");
        System.out.println("Cantidad De Ruedas : " + moto.getRuedas());
        System.out.println("Pertenece A : " + moto.getDuenio());
        System.out.println("Motor : " + moto.tipo());
        System.out.println("Velocidad Maxima : " + moto.velocidad_Maxima() + " Km/h");
        System.out.println("Precio : " + moto.precio());

        System.out.println("--------------AUTO-----------------");
        System.out.println("Cantidad De Ruedas : " + auto.getRuedas());
        System.out.println("Pertenece A : " + auto.getDuenio());
        System.out.println("Motor : " + auto.tipo());
        System.out.println("Velocidad Maxima : " + auto.velocidad_Maxima() + " Km/h");
        System.out.println("Precio : " + auto.precio());

        System.out.println("--------------BICICLETA----------------");
        System.out.println("Cantidad De Ruedas : " + bicicleta.getRuedas());
        System.out.println("Pertenece A : " + bicicleta.getDuenio());
        System.out.println("Velocidad Maxima : " + bicicleta.velocidad_Maxima() + " Km/h");
        System.out.println("Precio : " + bicicleta.precio());

    }
}
