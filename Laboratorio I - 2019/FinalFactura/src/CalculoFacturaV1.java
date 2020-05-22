
import java.util.Scanner;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class CalculoFacturaV1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factura fc = new Factura();
        String[][] articulos = {{"100", "Azucar", "20", "U"}, {"101", "Leche", "30", "U"}, {"102", "Aceite", "50",
            "U"}, {"103", "Sal", "45", "U"}, {"104", "Fideos", "15", "U"}, {"105", "Arroz", "28", "U"},
        {"106", "Galletas", "26", "U"}, {"107", "Carne Molida", "220", "Kg"}, {"108", "Shampoo", "42", "U"},
        {"109", "Queso Mantecoso", "178", "Kg"}, {"110", "Jamon Cocido", "320", "Kg"}, {"111", "Naranjas", "80", "Kg"}};

        //PedirDatosBasicos(fc, sc);
        MostrarListaDeArticulos(articulos);
        LlenarItemsFactura(fc, sc, articulos);
        CalcularTotal(fc, sc, articulos);
        MostrarTicket(fc, sc, articulos);
    }

    public static void PedirDatosBasicos(Factura fc, Scanner sc) {
        System.out.println("Ingrese Nombre Del Cliente : ");
        fc.setCliente(sc.nextLine());

        System.out.println("Ingrese Fecha De Factura : ");
        fc.setFecha(sc.nextLine());

        System.out.println("Ingrese Numero De Factura : ");
        fc.setNumeroFactura(sc.nextLong());
    }

    public static void MostrarListaDeArticulos(String articulos[][]) {
        System.out.println("----------------------------------------------------------------------------------------------");
        String[][] Header = {{"Código Articulo", "Denominación", "Precio Unitario", "Cantidad"}};
        tabularArray2D(Header, 17);
        System.out.println("-----------------------------------------------------------------------------------------------");
        tabularArray2D(articulos, 17);
        System.out.println("En La Lista Superior Se Puede Apreciar El Codigo Con Su Producto >>");
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public static void LlenarItemsFactura(Factura fc, Scanner sc, String articulos[][]) {
        int posicionItemFactura = 0;
        int posicionArticulo;
        String codigo;
        int cantidadUnidades;
        double cantidadKilos;
        int articulosComprados = 0;
        String codigosIngresados = "";

        do {

            System.out.println("Ingrese Codigo Del Articulo : ");
            codigo = new Scanner(System.in).nextLine();
            //codigo item, denominacion,precio unitario,cantidad,subtotal
            posicionArticulo = buscarCodigo(codigo, articulos);

            if (posicionArticulo != -1) {
                //le seteo el codigo
                fc.getItemFactura()[posicionItemFactura][0] = articulos[posicionArticulo][0];
                //le seteo la denominacion
                fc.getItemFactura()[posicionItemFactura][1] = articulos[posicionArticulo][1];
                //le seteo el precio unitario
                fc.getItemFactura()[posicionItemFactura][2] = articulos[posicionArticulo][2];

                if (articulos[posicionArticulo][3].equals("U")) {

                    System.out.println("Ingrese La Cantidad De Unidades Que Desea Llevar De << " + articulos[posicionArticulo][1] + ">>");
                    cantidadUnidades = new Scanner(System.in).nextInt();
                    fc.getItemFactura()[posicionItemFactura][3] = String.valueOf(cantidadUnidades);
                    double subTotal = Integer.valueOf(articulos[posicionArticulo][2]) * cantidadUnidades;
                    fc.getItemFactura()[posicionItemFactura][4] = String.valueOf(subTotal);

                }
                if (articulos[posicionArticulo][3].equals("Kg")) {
                    System.out.println("Ingrese Los KILOS De <<" + articulos[posicionArticulo][1] + ">> Que Desea Llevar : ");
                    cantidadKilos = new Scanner(System.in).nextDouble();
                    fc.getItemFactura()[posicionItemFactura][3] = String.valueOf(cantidadKilos) + " Kg";
                    double subTotal = Integer.valueOf(articulos[posicionArticulo][2]) * cantidadKilos;
                    fc.getItemFactura()[posicionItemFactura][4] = String.valueOf(subTotal);

                }

                posicionItemFactura++;
                fc.getCodigosIngresados().add(codigo);
                System.out.println("Gracias!, Si Desea Agregar Otro Articulo Escriba Su Código o digite 000 Para Terminar!");
            } else {
                if (!codigo.equals("000")) {
                    System.out.println("-------------------------------------");
                    System.out.println(setColor("rojo", "El Código No Existe"));
                    System.out.println(setColor("rojo", "Intente Nuevamente"));
                    System.out.println("-------------------------------------");
                }
            }
            if (fc.getCodigosIngresados().isEmpty()) {
                System.out.println("----------------------------------------------------");
                System.out.println(setColor("rojo", "Debe Ingresar Almenos Un Articulo!"));
                System.out.println(setColor("rojo", "Intente Nuevamente!"));
                System.out.println("----------------------------------------------------");
            }

        } while (!codigo.equals("000") || fc.getCodigosIngresados().isEmpty());

    }

    public static void CalcularTotal(Factura fc, Scanner sc, String articulos[][]) {
        double total = sumaColumnas(fc.getItemFactura(), 4);
        fc.setMontoTotal(total);
        String tipoPago;
        double totalFinal;
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese Tipo De Pago : ");
        System.out.println("Debe Ser C, TC ó TD");
        tipoPago = new Scanner(System.in).nextLine().toUpperCase();
        if (tipoPago.equals("C")) {
            //no hay recargo xD
            fc.setRecargo(0);
            fc.setTipoPago(tipoPago);
            fc.setPorcentajeRecargo(0);

        }
        if (tipoPago.equals("TC")) {
            //recargo de 5%
            fc.setRecargo(total * 0.05);
            fc.setTipoPago(tipoPago);
            fc.setPorcentajeRecargo(5);
        }
        if (tipoPago.equals("TD")) {
            //recargo de 10%
            fc.setRecargo(total * 0.1);
            fc.setTipoPago(tipoPago);
            fc.setPorcentajeRecargo(10);
        }

        totalFinal = total + fc.getRecargo();
        fc.setMontoFinal(totalFinal);

    }

    public static void MostrarTicket(Factura fc, Scanner sc, String articulos[][]) {
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Nombre Cliente : " + fc.getCliente());
        System.out.println("Fecha : " + fc.getFecha());
        System.out.println("Numero De Factura : " + fc.getNumeroFactura());
        System.out.println("-----------------------------------------------------------------------------------------------");
        String[][] Header = {{"Código Articulo", "Denominación", "Precio Unitario", "Cantidad", "SubTotal"}};
        tabularArray2D(Header, 17);
        System.out.println("-----------------------------------------------------------------------------------------------");
        tabularArray2D(fc.getItemFactura(), 17);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Total : " + fc.getMontoTotal() + "  ARS");
        System.out.println("Tipo De Pago : " + fc.getTipoPago());
        System.out.println("El Recargo Es De  " + fc.getPorcentajeRecargo() + " % : " + redondearDecimalesDouble(fc.getRecargo(), 2) + "  ARS");

        System.out.println(setColor("rojo", "Total Con Recargo : " + fc.getMontoFinal() + "  ARS"));

        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public static boolean tabularArray2D(String[][] Array2D, int stringMayor) {
        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[0].length; j++) {
                if (Array2D[i][j] != null) {
                    String value = String.format("%" + String.valueOf(stringMayor) + "s", Array2D[i][j]);
                    System.out.print(" " + value + " ");
                }
            }
            if (Array2D[i][0] != null) {
                System.out.println();
            }
        }
        return false;
    }

    public static int buscarCodigo(String codigo, String articulos[][]) {

        int encontrado = -1; // este sera nuestro valor por si el codigo que ingresamos no se encuentra retornara -1 dandonos a entender que el codigo es incorrecto
        for (int i = 0; i < articulos.length; i++) {
            if (codigo.equals(articulos[i][0])) {
                System.out.println();
                System.out.println(setColor("azul", "Se Encontro El Código Correspondiente a : <<" + articulos[i][1] + ">>"));
                encontrado = i;
                break;
            }
        }

        return encontrado;//si retorna un numero correcto nos retornara la posicion de la fila del array  para luego trabajarla.
    }

    public static String setColor(String color, String msg) {
        //uso : haces un sout y dentro le creas este metodo,
        //por ej. System.out.println(setColor("rojo", " tu mensaje "); 

        color = color.toLowerCase(); //para que de igual si escribis rojo ó ROJO
        String colorCode;
        switch (color) {
            case "negro":
                colorCode = "\033[30m";
                break;
            case "rojo":
                colorCode = "\033[31m";
                break;
            case "verde":
                colorCode = "\033[32m";
                break;
            case "amarillo":
                colorCode = "\033[33m";
                break;
            case "azul":
                colorCode = "\033[34m";
                break;
            case "magenta":
                colorCode = "\033[35m";
                break;
            case "cyan":
                colorCode = "\033[36m";
                break;
            case "blanco":
                colorCode = "\033[37m";
                break;
            case "purpura":
                colorCode = "\u001B[35m";
                break;
            case "verde2":
                colorCode = "\033[1;32m";
                break;
            default:
                colorCode = "\033[30m";
                break;
        }
        return colorCode + msg;
    }

    public static double sumaColumnas(String[][] Array2D, int posicionColumna) {
        /*este metodo como su nombre indica, realiza la suma de una columna de un array2D
        le pasamos por parametro el array2D y la columna a sumar, luego, haciendo uso de sout
        mostramos la suma*/

        double sumaColumna = 0;
        for (int i = 0; i < Array2D.length; i++) {
            if (Array2D[i][posicionColumna] != null) {
                sumaColumna += (Double.valueOf(Array2D[i][posicionColumna]));
            }
        }

        return sumaColumna;
    }

    public static Double redondearDecimalesDouble(Double numero, int numeroMaxDecimales) {
        return Math.round(numero * Math.pow(10, numeroMaxDecimales)) / Math.pow(10, numeroMaxDecimales);
    }
}
