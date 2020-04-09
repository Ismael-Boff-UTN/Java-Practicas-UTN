package Ejercicio6;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {

        Recibo r = new Recibo(new Proveedor(234, "Hyper Mayorista Lujan"), 5000, "venta de articulos", 'B', 1231, new Fecha(10, 11, 2077));

        System.out.println("--------------------------------------");
        System.out.println("Fecha : " + r.getFecha().getDia() + "/" + r.getFecha().getMes() + "/" + r.getFecha().getAnio());
        System.out.println("Proveedor Cod. > " + r.getProveedor().getCodigo());
        System.out.println("Proveedor > " + r.getProveedor().getRazonSocial());
        System.out.println("Total A Pagar De : " + r.getTotal() + " AR$ En Razón De : " + r.getDetalle());
        System.out.println("Tipo De Recibo : " + r.getTipo());
        System.out.println("Codigo Recibo : " + r.getNumero());
        System.out.println("--------------------------------------");
    }
}
