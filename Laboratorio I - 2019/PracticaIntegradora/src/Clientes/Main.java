package Clientes;

/**
 *
 * @author SkylakeFrost
 */
public class Main {

    public static void main(String[] args) {
        //seteando mediante el constructor sobrecargado
        Cliente cliente1 = new Cliente("Alonso", "Eugenia", 27456987, 2698.85, 13654);
        Cliente cliente2 = new Cliente();
        
        
        //seteando los valores
        cliente2.setNombre("juan");
        cliente2.setApellido("perez");
        cliente2.setDni(21231231);
        cliente2.setSueldo(23423.43);
        cliente2.setNroCliente(12321);

        mostrarDatos(cliente1, cliente2);
    }

    public static void mostrarDatos(Cliente cliente1, Cliente cliente2) {

        System.out.println("----------------------------------------------");
        System.out.println("Nombre : " + cliente1.getNombre());
        System.out.println("Apellido : " + cliente1.getApellido());
        System.out.println("DNI : " + cliente1.getDni());
        System.out.println("Sueldo : " + cliente1.getSueldo());
        System.out.println("Numero Cliente : " + cliente1.getNroCliente());
        System.out.println("----------------------------------------------");
        System.out.println("Nombre : " + cliente2.getNombre());
        System.out.println("Apellido : " + cliente2.getApellido());
        System.out.println("DNI : " + cliente2.getDni());
        System.out.println("Sueldo : " + cliente2.getSueldo());
        System.out.println("Numero Cliente : " + cliente2.getNroCliente());
        System.out.println("-----------------------------------------------");

    }
}
