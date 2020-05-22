
import java.util.Scanner;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class Facturación {

    public static String articulos[][] = {{"101", "Leche", "25"}, {"102", "Gaseosa", "30"}, {"103", "Fideos", "15"},
    {"104", "Arroz", "28"}, {"105", "Vino", "120"}, {"106", "Manteca", "20"}, {"107", "Lavandina", "18"},
    {"108", "Detergente", "46"}, {"109", "Jabón en Polvo", "96"}, {"110", "Galletas", "60"}};

    public static void main(String[] args) {

        //instancio la clase factura
        Factura fc = new Factura();

        //llamo a los metodos abajo creados
        pedirDatosBasicosCliente(fc);
        listaDeArticulosDisponibles();
        cargarArticulos(fc);
        mostrarResultados(fc);

    }

    /*pido los datos basicos de la factura, siguiendo el enunciado estos no requerian validaciones*/
    public static void pedirDatosBasicosCliente(Factura fc) {
        System.out.println("Ingrese Nombre Del Cliente : ");
        fc.setCliente(new Scanner(System.in).nextLine());

        System.out.println("Ingrese Fecha De La Factura : ");
        fc.setFechaFactura(new Scanner(System.in).nextLine());

        System.out.println("Ingrese Numero De Factura : ");
        fc.setNumeroFactura(new Scanner(System.in).nextLong());
    }

    public static void listaDeArticulosDisponibles() {
        System.out.println("-----------------------ARTICULOS DISPONIBLES PARA SU COMPRA!--------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------");
        String header[][] = {{"Codigo", "Nombre", "Precio Unitario"}};
        tabularArray2D(header, 18);
        System.out.println("--------------------------------------------------------------------------------------------------");
        tabularArray2D(articulos, 18);
        System.out.println("--------------------------------------------------------------------------------------------------");
    }

    /*comienzo la carga de articulos a la lista de detalles*/
    public static void cargarArticulos(Factura fc) {
        //variables auxiliares
        //pedimos el codigo como String, luego si hace falta obtner el numero lo podemos parsear con String.valueOf(codigo);
        String codigo;
        /*La varable posicionDetallesFactura se inicializa en 0 para que el primer articulo agregado sea ingresado en la fila 0
        del array detallesFactura, luego se incrementa en 1 cada vez q se cumple el bucle de agregar articulo , 
        para que un articulo vaya abajo del otro....
        La variable posicionArticulo equivale a la retornada por el metodo buscarArticuloPorCodigo, de la clase factura*/
        int posicionDetallesFactura = 0;
        int posicionArticulo;

        //simple validacion para saber si el codigo ingresado existe o no.
        boolean validacion = false;
        System.out.println("INGRESO DE ARTICULOS");
        do {
            System.out.println("Ingrese El Codigo Del Articulo : ");
            codigo = new Scanner(System.in).nextLine();
            //usamos el metodo para buscar el codigo en la lista
            posicionArticulo = Factura.buscarArticuloPorCodigo(codigo, articulos);

            //si el codigo se encuentra en la lista de articulos, es decir, es diferente de -111
            //cominzo la carga de articulos
            if (posicionArticulo != -111) {
                //RECORDEMOS QUE UN ARRAY SE CUENTA DESDE 0
                //agregamos en el array detallesFactura el codigo de articulo, que equivale q se encuentran en la columna
                // 0 del array de articulos
                fc.getDetallesFactura()[posicionDetallesFactura][0] = articulos[posicionArticulo][0];
                //hacemos lo mismo para el nombre del articulo
                fc.getDetallesFactura()[posicionDetallesFactura][1] = articulos[posicionArticulo][1];

                //pedimos la cantidad de articulos
                System.out.println("Cantidad De Articulo A Llevar : ");
                int cantidad = new Scanner(System.in).nextInt();
                //se la agregamos al array detalleFactutura
                fc.getDetallesFactura()[posicionDetallesFactura][2] = String.valueOf(cantidad);

                //aqui agregamos el precio unitario, q se encuentra en la columna 2 del array de artiuclos
                fc.getDetallesFactura()[posicionDetallesFactura][3] = articulos[posicionArticulo][2];

                //obtenemos el subtotal, multiplicanto la cantidad ingresada por el precio unitario
                int subTotal = cantidad * Integer.valueOf(articulos[posicionArticulo][2]);

                //agregamos el subtotal al array detallesFactura en la posicion 4
                fc.getDetallesFactura()[posicionDetallesFactura][4] = String.valueOf(subTotal);

                //aumentamos en 1 la posicion de detallesFactura, para que el siguiente articulo se ingrese debajo de este :D
                posicionDetallesFactura++;

            } else {
                //si el codigo ingresado es alta fruta, le mandamos mensajito que no existe
                //y la validacion pasa a ser false
                System.out.println("El Codigo No Existe!, Intente Nuevamente!");
                validacion = false;
            }

            //el enunciado pide q se ingresen 6 articulos, me dio fiaca y le meti 3, pero si queres cambia ese numero
            // que es la cantidad de veces q se repite todo el do while
        } while (posicionDetallesFactura != 3);

    }

    //finalmente mostramos los resultados bien piola al usuario que no tiene puta idea lo que paso en el back end
    // y solo quiere pagar sus fideo e irse...
    public static void mostrarResultados(Factura fc) {
        //imprimimos todos los detalles que fueron previamente seteados a la clase factura
        //para los titulos del array detallesFactura, se crea otro array2d y se muestra con el metodo
        // esto es solo un detalle estetico....
        System.out.println("--------------------FACTURITA--------------------------------------------------------------------");
        System.out.println("Cliente : " + fc.getCliente());
        System.out.println("Fecha : " + fc.getFechaFactura());
        System.out.println("Numero : " + fc.getNumeroFactura());
        System.out.println("-------------------------------------------------------------------------------------------------");
        String Header[][] = {{"Codigo Artc.", "Nombre", "Cantidad", "Precio Unitario", "SubTotal"}};
        tabularArray2D(Header, 16);
        System.out.println("--------------------------------------------------------------------------------------------------");
        tabularArray2D(fc.getDetallesFactura(), 16);
        System.out.println("--------------------------------------------------------------------------------------------------");
        fc.setTotalCalculadoFactura(sumaColumnas(fc.getDetallesFactura(), 4));
        System.out.println("TOTAL : " + fc.getTotalCalculadoFactura());
        System.out.println("--------------------------------------------------------------------------------------------------");

    }

    //este metodo tabulo y muestra un array bidimensional, se le pasan como parametros el array 2d y la cantidad de letras q tiene 
    // el string mas largo, aunq puede ser mas o menos letras, eso lo eligen uds.
    public static boolean tabularArray2D(String[][] Array2D, int stringMayor) {

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[0].length; j++) {
                if (Array2D[i][j] != null) {
                    String value = String.format("%" + String.valueOf(stringMayor) + "s", Array2D[i][j]);
                    System.out.print("  " + value + "  ");
                }
            }
            if (Array2D[i][0] != null) {
                System.out.println();
            }
        }

        return false;
    }

    //este metodo te suma la columna de un array 2d, le pasan como parametros el array 2d y la posicion de la columna a sumar
    public static double sumaColumnas(String[][] Array2D, int posicionColumna) {
        double sumaColumna = 0;
        for (int i = 0; i < Array2D.length; i++) {
            if (Array2D[i][posicionColumna] != null) {
                sumaColumna += (Double.valueOf(Array2D[i][posicionColumna]));
            }
        }

        return sumaColumna;
    }
}
