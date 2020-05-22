package TemaA;

import java.util.Scanner;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class CargaDDJJStockInicial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DDJJStockAgroquimico quimico = new DDJJStockAgroquimico();
        String detalleDDJJ[][] = new String[10][6];

        cargarDatosBasicosEmpresa(sc, quimico);
        cargarAgroquimicos(sc, quimico, detalleDDJJ);
        mostrarArrayDetalleDDJJ(quimico, detalleDDJJ);
    }

    public static void cargarDatosBasicosEmpresa(Scanner sc, DDJJStockAgroquimico quimico) {
        /*Solicite al usuario y asigne a los correspondientes atributos razón social de la empresa, el
cuit, el año y mes de la declaración. Valide que el cuit posea 11 dígitos y que el mes y año
de la declaración no supere el mes y año actual y que no pueda ser anterior a 6 meses atrás,
si los datos no cumplen esta condición mostrar un mensaje y solicitar el ingreso
nuevamente*/

        System.out.println("-----------------Datos Basicos Empresa--------------------");
        System.out.println("Razón Social De Empresa : ");
        quimico.setEmpresa(new Scanner(System.in).nextLine());

        long cuit;
        int anioDeclaracion;
        int mesDeclaracion;
        do {
            System.out.println("CUIT : ");
            cuit = new Scanner(System.in).nextLong();
            if (String.valueOf(cuit).length() != 11) {
                System.out.println("El CUIT Debe Poseer 11 Digitos !");
            } else {
                quimico.setCuit(cuit);
            }
        } while (String.valueOf(cuit).length() != 11);

        do {
            System.out.println("Ingrese Año De Declaracion");
            anioDeclaracion = new Scanner(System.in).nextInt();
            if (anioDeclaracion > 2019) {
                System.out.println("El Año De Declaracion No Puede Ser Mayor Al Actual!");
            } else {
                quimico.setAnioDeclaracion(anioDeclaracion);
            }
        } while (anioDeclaracion > 2019);

        do {
            System.out.println("Ingrese Mes De Declaracion - Numero Mes Entre 1 y 12");
            mesDeclaracion = new Scanner(System.in).nextInt();

            if (mesDeclaracion > 11 && mesDeclaracion < 5) {//falta lo de 6 meses atras!!
                System.out.println("El Mes De Declaracion No Puede Ser Mayor Al Actual!");
            } else {
                quimico.setMesDeclaracion(mesDeclaracion);
            }
        } while (mesDeclaracion > 7);

    }

    public static void cargarAgroquimicos(Scanner sc, DDJJStockAgroquimico quimico, String detaleDDJJ[][]) {

        String codigo;
        int posicionDetalles = 0;//la posicion desde donde se comenzará a cargar el array detallDDJJ
        int posicionQuimicos;//posicion del quimico q es igual a lo q nos retorne el metodo de busqueda
        double capacidadEnvase;
        int cantidadEnvases;
        double subtotal;
        String numeroLote;
        String numeroParcela;

        do {

            System.out.println("Ingrese El Codigo Del Agroquimico");
            System.out.println("O Escriba 000 Para Finalizar La Carga");
            codigo = new Scanner(System.in).nextLine();

            do {
                //validamos que la lista no este llena (max 10 elementos) y que no se puedan repetir el agroquimico
                if (quimico.getCodigosIngresados().size() >= 10 || quimico.getCodigosIngresados().contains(Integer.valueOf(codigo))) {
                    System.out.println("----------------------------------------");
                    System.out.println("Lista De Quimicos LLena!");
                    System.out.println("----------------------------------------");
                    codigo = "000";

                } else {
                    //aca le asignamos la posicion al quimico usando el metodo de busqueda
                    posicionQuimicos = DDJJStockAgroquimico.buscarQuimicoPorCodigo(codigo, quimico.getAgroquimicos());

                    //si el codigo coincide con alguno del array agroquimicos se procede a añadirlo al array detalleDDJJ
                    if (posicionQuimicos != -1) {

                        //agrego el codigo del quimico al array detalleDDJJ
                        detaleDDJJ[posicionDetalles][0] = quimico.getAgroquimicos()[posicionQuimicos][0];
                        //agrego la denominacion/nombre del quimico al array de detalleDDJJ
                        detaleDDJJ[posicionDetalles][1] = quimico.getAgroquimicos()[posicionQuimicos][1];

                        //agrego la capacidad del envase y valido que sea mayor a 0
                        do {
                            System.out.println("Ingrese la capacidad del envase en Kg/Lt para el agroquímico : ");
                            capacidadEnvase = new Scanner(System.in).nextDouble();
                            if (capacidadEnvase > 0) {
                                //si es mayor a 0 agrego la capacidad a su respectiva columna
                                detaleDDJJ[posicionDetalles][2] = String.valueOf(capacidadEnvase) + " Kg/Lt";
                            } else {
                                System.out.println(setColor("rojo", "La Capacidad Del Envase No Puede Ser Menor A 0"));
                            }
                        } while (capacidadEnvase <= 0);

                        //agrego cantidad de envases y valido q sean mas de 0
                        do {
                            System.out.println("Ingrese La Cantidad De Envases : ");
                            cantidadEnvases = new Scanner(System.in).nextInt();
                            if (cantidadEnvases > 0) {
                                //si es mayor a 0 agrego la cantidad a su respectiva columna
                                detaleDDJJ[posicionDetalles][3] = String.valueOf(cantidadEnvases);
                            } else {
                                System.out.println(setColor("rojo", "La Cantidad De Envases No Puede Ser 0!"));
                            }
                        } while (cantidadEnvases <= 0);

                        //calculo el subtotal
                        subtotal = capacidadEnvase * cantidadEnvases;
                        // y lo agrego a su respectiva columna
                        detaleDDJJ[posicionDetalles][4] = String.valueOf(subtotal);

                        //agrego numero de lote
                        System.out.println("Ingrese Numero De Lote :");
                        numeroLote = new Scanner(System.in).nextLine();
                        // y lo agrego a su respectiva columna
                        detaleDDJJ[posicionDetalles][5] = numeroLote;

                        //si el agroquimico es rojo "R" pido las parcelas donde lo gua tirar
                        //debe tener minimo 6 digitos
                        //x para terminar el ingreso
                        if (quimico.getAgroquimicos()[posicionQuimicos][2].equals("R")) {
                            do {
                                System.out.println("Ingrese el número de la parcela donde se aplicara el Agroquímico. Ingrese X para terminar");
                                numeroParcela = sc.nextLine().toUpperCase();//usamos touppercase por si metemos la x en minuscula..
                                if (numeroParcela.equals("X")) {
                                    if (quimico.getParcelasAplicacion().isEmpty()) {
                                        System.out.println(setColor("rojo", "Al menos debe cargarse una parcela"));
                                        quimico.getParcelasAplicacion().isEmpty();
                                    } else {
                                        System.out.println(setColor("verde", "Carga De Parcelas Finalizada!"));
                                    }
                                } else if (numeroParcela.length() != 6) {
                                    System.out.println(setColor("rojo", "El numero debe tener 6 digitos para ser válido"));
                                } else {
                                    //añado el numero de parcela a su lista
                                    quimico.getParcelasAplicacion().add(Long.parseLong(numeroParcela));

                                }
                            } while (numeroParcela.equals("X") == false);

                        }

                        posicionDetalles++;//aumento la posicion del array detalleDDJJ en 1 para que el proximo quimico sea ingresado debajo del anterior
                        //es decir, si el quimico anterior se ingreso en la fila de pos 0, el siguiente se ingresara en la fila pos 1 y asi sucesivamente
                        quimico.getCodigosIngresados().add(Integer.valueOf(codigo));//añado el codigo usado a la lista de codigos
                        System.out.println(setColor("verde", "El Agroquimico Fue Agregado Correctamente !"));
                        System.out.println("-------------------------------------------");
                        break;

                    } else {
                        if (!codigo.equals("000")) {
                            System.out.println("-----------------------------");
                            System.out.println(setColor("rojo", "El Codigo No Existe"));
                            System.out.println("-----------------------------");
                            break;
                        }
                    }

                }
            } while (!codigo.equals("000"));

            if (quimico.getCodigosIngresados().isEmpty()) {
                System.out.println("----------------------------------------------");
                System.out.println(setColor("rojo", "Debe Ingresar Minimo 1 Agroquimico A La Lista!"));
                System.out.println("----------------------------------------------");

            }

        } while (!codigo.equals("000") || quimico.getCodigosIngresados().isEmpty());
    }

    public static void mostrarArrayDetalleDDJJ(DDJJStockAgroquimico quimico, String detaleDDJJ[][]) {
        //finalmente mostramos todo
        System.out.println("---------------------------------La DDJJ De Agroquimicos Realizada Es :-------------------------------------------");
        System.out.println("Razón Social : " + quimico.getEmpresa());
        System.out.println("CUIT : " + quimico.getCuit());
        System.out.println("Año Declaracion : " + quimico.getAnioDeclaracion());
        System.out.println("Mes Declaracion : " + quimico.getMesDeclaracion());
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        String[][] Header = {{"Codigo AQ", "Denominacion AQ", "Cap. Envase", "Cantidad Envase", "SubTotal", "Numero De Lote"}};
        tabularArray2D(Header, 17);
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        //mostramos array detalleDDJJ
        tabularArray2D(detaleDDJJ, 17);

        quimico.setTotal(sumaColumnas(detaleDDJJ, 4));

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("TOTAL : " + quimico.getTotal());
        System.out.println("-------------------------------------------------");
        MostrarParcelasAplicadas(quimico);
        System.out.println("-------------------------------------------------");

    }

    public static boolean tabularArray2D(String[][] Array2D, int stringMayor) {
        //se imprimen solo las filas que poseen datos, las que estan vacias o null, no.
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

    public static double sumaColumnas(String[][] Array2D, int posicionColumna) {
        double sumaColumna = 0;
        for (int i = 0; i < Array2D.length; i++) {
            if (Array2D[i][posicionColumna] != null) {
                sumaColumna += (Double.valueOf(Array2D[i][posicionColumna]));
            }
        }

        return sumaColumna;
    }

    public static void MostrarParcelasAplicadas(DDJJStockAgroquimico quimico) {
        //pequeño metodo para mostrar las parcelas aplicadas.
        //si hay parcelas muestro los codigos sino, no
        if (quimico.getParcelasAplicacion().isEmpty()) {
            System.out.println("No Hay Parcelas Aplicadas");
        } else {
            System.out.println("Parcelas Aplicadas : " + quimico.getParcelasAplicacion());
        }
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
}
