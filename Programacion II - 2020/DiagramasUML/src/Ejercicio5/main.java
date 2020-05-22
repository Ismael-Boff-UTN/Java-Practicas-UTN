package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {
        //Monto, Cliente, Producto, Tipo Factura, Codigo, Fecha
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "Yogurt", 60));
        productos.add(new Producto(2, "Cereal", 80));
        productos.add(new Producto(3, "Cafe", 230));
        productos.add(new Producto(3, "Chocolate", 300));

        Factura factura = new Factura(231, new Cliente(1, "morfar"), productos, 'a', 0, new Fecha(1, 0, 3450));

        System.out.println("----------------------------------------------");

        System.out.println("Factura Tipo : " + factura.getTipo());
        System.out.println("Razon Social : " + factura.getCliente().getRazonSocial());
        System.out.println("Codigo : " + factura.getNumero());
        System.out.println("Fecha : " + factura.getFecha().getDia() + "/" + factura.getFecha().getMes() + "/" + factura.getFecha().getAnio());
        System.out.println("----------------------------------------------");
        int total = 0;
        System.out.println("Lista De Productos");
        for (int i = 0; i < factura.getProductos().size(); i++) {

            System.out.println("Nombre : " + factura.getProductos().get(i).getDescripcion() + " | Precio : "
                    + factura.getProductos().get(i).getPrecio() + " AR$");
            total += factura.getProductos().get(i).getPrecio();

        }
        System.out.println("-----------------------------------------------");
        System.out.println("TOTAL : " + total);
        System.out.println("-----------------------------------------------");
    }

}
