package Ejercicio1;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {
        //Saco La fecha Actual De SO, la instacio aca para pasar siempre la misma
        //pero se puede hacer una fecha nueva para cada objeto instanciado.
        Date fecha = Date.from(Instant.now());

        //Se Crea Un Proveedor
        Proveedor prov = new Proveedor("Musimundo");

        //Se Crea Una Factura               //Monto o Importe
        Factura f1 = new Factura(23131, fecha, 53000);

        f1.getClie().setCuit(2212313);
        f1.getClie().setNombre("Josefina");
        f1.getClie().setApellido("Vargas");
        f1.getClie().setDni(12331323);
        //Varias tarjetas del cliente
        f1.getClie().addTarjetas(new Tarjeta_de_Credito(fecha, 4000));  //0
        f1.getClie().addTarjetas(new Tarjeta_de_Credito(fecha, 40000)); //1
        f1.getClie().addTarjetas(new Tarjeta_de_Credito(fecha, 400000)); //2

        f1.getEmp().setNombre("Ismael");
        f1.getEmp().setApellido("Lopez");
        f1.getEmp().setCuit(12313);
        f1.getEmp().setNro_Legajo(12);
        f1.getEmp().setDni(21312313);
        f1.getEmp().setFecha_ingreso(fecha);
        
        f1.getEmp().setNombre("Juan");
        f1.getEmp().setApellido("Lobos");
        f1.getEmp().setCuit(12313);
        f1.getEmp().setNro_Legajo(12);
        f1.getEmp().setDni(21312313);
        f1.getEmp().setFecha_ingreso(fecha);

        System.out.println("-----------EMPLEADO------------");
        System.out.println("Fecha De Ingreso : " + f1.getEmp().getFecha_ingreso());
        System.out.println("Nombre : " + f1.getEmp().getNombre());
        System.out.println("Apellido : " + f1.getEmp().getApellido());
        System.out.println("CUIT : " + f1.getEmp().getCuit());
        System.out.println("Numero De Legajo : " + f1.getEmp().getNro_Legajo());
        System.out.println("DNI : " + f1.getEmp().getDni());

        System.out.println("--------CLIENTE---------");
        System.out.println("Nombre : " + f1.getClie().getNombre());
        System.out.println("Apellido : " + f1.getClie().getApellido());
        System.out.println("DNI : " + f1.getClie().getDni());
        System.out.println("Tarjeta De Credito Asociada >>> ");
        System.out.println("Fecha : " + f1.getClie().getTarjetas().get(0).getFecha_Ingreso());
        System.out.println("Limite : " + f1.getClie().getTarjetas().get(0).getLimite());

        System.out.println("----------FACTURA----------");
        System.out.println("Proveedor : " + prov.getNombre_Comercial());
        System.out.println("A Nombre Del Cliente > " + f1.getClie().getNombre() + " " + f1.getClie().getApellido());
        System.out.println("Emitida Por (Empleado) > " + f1.getEmp().getNombre() + " " + f1.getEmp().getApellido());
        System.out.println("Fecha De Emision > " + f1.getFecha());
        System.out.println("Total A Pagar : > " + f1.getMonto());
        System.out.println(f1.getClie().getNombre() + " Dispone de " + f1.getClie().getTarjetas().get(0).getLimite() + " Como Limite de Credito");
        System.out.println("Estado De Pago : " + pagoProcesado(f1.getClie(), f1.getClie().getTarjetas().get(0), f1));
    }

    public static String pagoProcesado(Cliente cliente, Tarjeta_de_Credito tarjeta, Factura factura) {
        if (cliente.problemaVerazCodeme(tarjeta, factura) == true) {
            return "Pago Aceptado, Gracias Por Su Compra!";
        } else {
            return "Rechazado - Ud No Posee Fondos Suficientes!";
        }

    }
}
