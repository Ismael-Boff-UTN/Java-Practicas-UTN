package Ejercicio5;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {

        Factura factura = new Factura(112, 'A', 4346546, new Fecha(13, 3, 2020));

        factura.setCliente(new Cliente(1, "Comercial"));
        factura.setProducto(new Producto(12, "Cereal", 145));

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
