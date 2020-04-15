package Ejercicio5;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {
        //Monto, Cliente, Producto, Tipo Factura, Codigo, Fecha
        Factura factura = new Factura(232, new Cliente(1, "Comercial"), 
        new Producto(12, "Cereal", 145), 'A', 2323, new Fecha(12, 10, 2020));

        System.out.println("----------------------------------------------");

        System.out.println("Factura Tipo : " + factura.getTipo());
        System.out.println("Razon Social : " + factura.getCliente().getRazonSocial());
        System.out.println("Codigo : " + factura.getNumero());
        System.out.println("Fecha : " + factura.getFecha().getDia() + "/" + factura.getFecha().getMes() + "/" + factura.getFecha().getAnio());
        System.out.println("----------------------------------------------");
        System.out.println("Producto : " + factura.getProducto().getDescripcion());
        System.out.println("Precio : " + factura.getProducto().getPrecio() + " AR$");

        factura.setTotal(factura.getProducto().getPrecio());
        System.out.println("TOTAL : " + factura.getTotal() + " AR$");
    }

}
