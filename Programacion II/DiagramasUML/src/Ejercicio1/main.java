/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {
        //Saco La fecha Actual De SO
        Date d1 = Date.from(Instant.now());

        //Se Crea Un Proveedor
        Proveedor prov = new Proveedor("Musimundo");

        //Se Crea El Empleado 1
        Empleado emp1 = new Empleado(d1, 234322, 234233, "Jose", "Gomez", 1);

        System.out.println("-----------EMPLEADO------------");
        System.out.println("Fecha De Ingreso : " + emp1.getFecha_ingreso());
        System.out.println("Nombre : " + emp1.getNombre());
        System.out.println("Apellido : " + emp1.getApellido());
        System.out.println("CUIT : " + emp1.getCuit());
        System.out.println("Numero De Legajo : " + emp1.getNro_Legajo());
        System.out.println("DNI : " + emp1.getDni());

        //Se Crea El Cliente 1                            //Limite de Credito
        Tarjeta_de_Credito t1 = new Tarjeta_de_Credito(d1, 10000);
        Cliente cli1 = new Cliente(23432323, "Camila", "Gonzales", 3221232, t1);

        System.out.println("--------CLIENTE---------");
        System.out.println("Nombre : " + cli1.getNombre());
        System.out.println("Apellido : " + cli1.getApellido());
        System.out.println("DNI : " + cli1.getDni());
        System.out.println("Tarjeta De Credito Asociada >>> ");
        System.out.println("Fecha : " + cli1.getCredit_Car().getFecha_Ingreso());
        System.out.println("Limite : " + cli1.getCredit_Car().getLimite());

        //Se Crea Una Factura                           //Monto o Importe
        Factura f1 = new Factura(emp1, cli1, 23131, d1, 53000);
        System.out.println("----------FACTURA----------");
        System.out.println("Proveedor : " + prov.getNombre_Comercial());
        System.out.println("A Nombre Del Cliente > " + f1.getClie().getNombre() + " " + f1.getClie().getApellido());
        System.out.println("Emitida Por (Empleado) > " + f1.getEmp().getNombre() + " " + f1.getEmp().getApellido());
        System.out.println("Fecha De Emision > " + f1.getFecha());
        System.out.println("Total A Pagar : > " + f1.getMonto());
        System.out.println(f1.getClie().getNombre() + " Dispone de " + f1.getClie().getCredit_Car().getLimite() + " Como Limite de Credito");
        System.out.println("Estado De Pago : " + pagoProcesado(cli1, t1, f1));
    }

    public static String pagoProcesado(Cliente cliente, Tarjeta_de_Credito tarjeta, Factura factura) {
        if (cliente.problemaVerazCodeme(tarjeta, factura) == true) {
            return "Pago Aceptado, Gracias Por Su Compra!";
        } else {
            return "Rechazado - Ud No Posee Fondos Suficientes!";
        }

    }
}
