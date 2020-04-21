package Ejercicio6;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {

        Recibo recibo = new Recibo(5000, "venta de articulos", 'B', 1231, new Fecha(10, 11, 2077));
        recibo.getProveedor().setCodigo(23112);
        recibo.getProveedor().setRazonSocial("Nose");
        System.out.println("--------------------------------------");
        System.out.println("Fecha : " + recibo.getFecha().getDia() + "/" + recibo.getFecha().getMes() + "/" + recibo.getFecha().getAnio());
        System.out.println("Proveedor Cod. > " + recibo.getProveedor().getCodigo());

        System.out.println("Proveedor > " + recibo.getProveedor().getRazonSocial());
        System.out.println("Total A Pagar De : " + recibo.getTotal() + " AR$ En Razón De : " + recibo.getDetalle());
        System.out.println("Tipo De Recibo : " + recibo.getTipo());
        System.out.println("Codigo Recibo : " + recibo.getNumero());
        System.out.println("--------------------------------------");

    }
}
