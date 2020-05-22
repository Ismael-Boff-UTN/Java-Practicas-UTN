
/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class Factura {

    private String fechaFactura;
    private long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;

    //correspondiente a Código Articulo - Nombre Articulo - Cantidad - Precio Unitario - Subtotal
    private String detallesFactura[][] = new String[6][5];

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String[][] getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(String[][] detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    /* este metodo busca el articulo en su array de articulos, ya que el codigo de articulo simepre estara en la columna 0
    esa es la unica que se va recorrer, si se encuentra el codigo el metodo retorna la posicion del artiuclo, sino retorna un
    -111, dandonos a entender que no fue encontrado.
     */
    public static int buscarArticuloPorCodigo(String codigo, String array2D[][]) {

        int encontrado = -111;
        for (int i = 0; i < array2D.length; i++) {
            if (array2D[i][0].equals(codigo)) {//ahi se recorre la columna 0 de todas las filas del array
                encontrado = i;//si se encuentra da la posicion del elemento/articulo
                break;
            }
        }

        return encontrado;// lo devuelve

    }

}
