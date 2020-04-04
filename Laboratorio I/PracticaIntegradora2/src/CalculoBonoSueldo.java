
import java.util.Scanner;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class CalculoBonoSueldo {

//Declaro El Scanner Como Atributo De La Clase CalculoBonoSueldo Para Luego Llamarlo Desde Todos Los Metodos De La Misma.
    //en lineas siguientes decidi llamar al scanner de forma completa, es decir ,new Scanner(System.in).tipovalor, 
    //ya que me presento algunos errores, como que se auto ingresaba un string vacio....
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//Instancio La Clase BonoSueldo
        BonoSueldo bono = new BonoSueldo();
//Creo El Array Bidimensional bonoCalculado
        String[][] bonoCalculado = new String[10][4];

//Llamo A Los Metodos
        cargarDatosBasicosEmpleado(bono);
        mostrarArrayDeHabers(bono);
        cargaDeHaberesYDeducciones(bono, bonoCalculado);

        mostrarArrayFinalBonoCalculado(bono, bonoCalculado);
    }

    public static void cargarDatosBasicosEmpleado(BonoSueldo bono) {

        /*Solicite al usuario y asigne a los correspondientes atributos nombre completo del empleado,
el cuil, el año de ingreso, mes y año de liquidación y el sueldo básico. Valide que el año de
ingreso y liquidación no superen el año actual 2019, si el valor supera el año mostrar un
mensaje y solicitar el ingreso nuevamente. */
        System.out.println("-----------------Datos Basicos Del Empelado------------------");
        System.out.println("Ingrese Nombre Completo Del Empleado : ");
        bono.setNombreEmpleado(new Scanner(System.in).nextLine());

        System.out.println("Ingrese CUIL Del Empleado : ");
        bono.setCuil(new Scanner(System.in).nextInt());

        do {
            System.out.println("Ingrese Año De Ingreso A La Empresa : ");
            int anio = new Scanner(System.in).nextInt();
            if (anio > 2019) {
                System.out.println("El Año De Ingreso Es Mayor Al Año Actual, Intente Nuevamente : ");
            } else {
                bono.setAnioIngreso(anio);
            }
        } while (bono.getAnioIngreso() > 2019);

        System.out.println("Ingrese Mes De Liquidacion : ");
        bono.setMesLiquidacion(sc.nextInt());

        do {
            System.out.println("Ingrese Anõ De Liquidacion : ");
            int anioLiq = new Scanner(System.in).nextInt();
            if (anioLiq > 2019) {
                System.out.println("El Año De Liquidacion Es Mayor Al Año Actual, Intente Nuevamente : ");
            } else {
                bono.setAnioLiquidacion(anioLiq);
            }
        } while (bono.getAnioLiquidacion() > 2019);

        System.out.println("Ingrese El Sueldo Basico A Cobrar Del Empleado : ");
        bono.setSueldoBasico(sc.nextDouble());

        /*El atributo montoAntiguedad será un monto calculado equivalente al 2% por año de
antigüedad. Por ejemplo si el empleado tiene 10 años de antigüedad le corresponde un 20%
del sueldo básico. */
        int cantidadAniosTrabajados = 2019 - bono.getAnioIngreso();
        int porcentajeEquivalente = cantidadAniosTrabajados * 2;
        double bonusPorAntiguedad = (porcentajeEquivalente * bono.getSueldoBasico()) / 100;
        bono.setMontoAntiguedad(bonusPorAntiguedad);

    }

    public static void mostrarArrayDeHabers(BonoSueldo bono) {
        System.out.println("----------------------------Tabla De Haberes---------------------------------");
        String[][] header = {{"Codigo Haber", "Denominacion Haber", "Haber"}};

        tabularArray2D(header, 22);
        System.out.println("-----------------------------------------------------------------------------");
        tabularArray2D(bono.getHaberes(), 22);
    }

    public static void cargaDeHaberesYDeducciones(BonoSueldo bono, String bonoCalculado[][]) {
        //variables auxiliares
        String codigo;
        int posicionBono = 0;
        int posicionHaber;
        int posicionDeduccion;
        /*Si el código ingresado ya fue ingresado y asignado anteriormente, es decir el código existe
en la variable codigosIngresados muestro el mensaje “El código ya ha sido cargado” ingrese
otro código y vuelvo a solicitar el ingreso del código.*/
        System.out.println("------------------------------------------------");
        System.out.println("         ESTAPA DE CARGAR DE HABERES            ");
        System.out.println("------------------------------------------------");
        do {

            System.out.println("Ingrese El Codigo Del Haber Que Desea Agregar : ");
            System.out.println("Ingrese 000 Para Finalizar La Carga!");
            codigo = new Scanner(System.in).nextLine();

            //aca reviso si el codigo ya fue ingresado antes
            do {
                if (bono.getCodigosIngresados().contains(Integer.valueOf(codigo))) {
                    System.out.println("---------------------------------------");
                    System.out.println("Este Haber Ya Fue Ingresado A La Lista!");
                    System.out.println("Intente Con Otro Codigo :D ");
                    System.out.println("---------------------------------------");

                } else {

                    //busco el haber en su array haciendo uso del metodo buscarHaberesPorCodigo
                    //si este devuelve -111 es xq se encontro el haber sino no...
                    posicionHaber = BonoSueldo.buscarHaberPorCodigo(codigo, bono.getHaberes());
                    //si se encuantra el haber en la lista entra al if y comienzo la carga de datos
                    if (posicionHaber != -111) {

                        bonoCalculado[posicionBono][0] = bono.getHaberes()[posicionHaber][0];
                        bonoCalculado[posicionBono][1] = bono.getHaberes()[posicionHaber][1];

                        //ahora se ingresa el porcentaje del haber dependiendo si en el array tenemos el porcentaje ya definido
                        //o si debe ingresarlo el usuario si se detecta la letra M
                        if (bono.getHaberes()[posicionHaber][2].equals("M")) {
                            System.out.println("---------------------------------------");
                            System.out.println("Ingrese El Valor Del Haber % : ");
                            System.out.println("---------------------------------------");
                            double valorM = new Scanner(System.in).nextDouble();
                            double sueldoExtra = (valorM * bono.getSueldoBasico()) / 100;
                            bonoCalculado[posicionBono][2] = String.valueOf(sueldoExtra);
                        } else {
                            double sueldoExtra = (Double.valueOf(bono.getHaberes()[posicionHaber][2]) * bono.getSueldoBasico()) / 100;
                            bonoCalculado[posicionBono][2] = String.valueOf(sueldoExtra);
                        }

                        //por ultimo agrego el codigo del haber a la lista de codigosIngresados para saber si ya fue agregado
                        bono.getCodigosIngresados().add(Integer.valueOf(codigo));
                        //aumento la posicion de las filas del bono para que al agregar un nuevo haber se agregue debajo del anterior xD
                        posicionBono++;
                    } else {
                        //sino existe el codigo entra al else
                        if (!codigo.equals("000")) {
                            System.out.println("---------------------------------------");
                            System.out.println("El Codigo Ingresado No Existe!");
                            System.out.println("---------------------------------------");

                        }
                    }
                }

            } while (!bono.getCodigosIngresados().contains(Integer.valueOf(codigo)) && !codigo.equals("000"));
            if (bono.getCodigosIngresados().isEmpty()) {
                System.out.println("---------------------------------------");
                System.out.println("Debe Ingresar Minimo 1 Haber A La Lista!");
                System.out.println("---------------------------------------");

            }
        } while (!codigo.equals("000"));

        System.out.println("----------------------------Tabla De Deducciones---------------------------------");
        String[][] header = {{"Codigo", "Denominacion", "Deducción"}};

        tabularArray2D(header, 22);
        System.out.println("-----------------------------------------------------------------------------");
        tabularArray2D(bono.getDeducciones(), 22);
        System.out.println("------------------------------------------------");
        System.out.println("         ESTAPA DE CARGAR DEDUCCIONES            ");
        System.out.println("------------------------------------------------");
        /*Si el código ingresado ya fue ingresado y asignado anteriormente, es decir el código existe
en la variable codigosIngresados muestro el mensaje “El código ya ha sido cargado” ingrese
otro código y vuelvo a solicitar el ingreso del código.*/
        do {

            System.out.println("Ingrese El Codigo De La Deduccion Que Desea Agregar : ");
            System.out.println("Ingrese 000 Para Finalizar La Carga!");
            codigo = new Scanner(System.in).nextLine();
            for (int i = 0; i < 10; i++) {
                
            }

            //aca reviso si el codigo ya fue ingresado antes
            do {
                if (bono.getCodigosIngresados().contains(Integer.valueOf(codigo))) {
                    System.out.println("---------------------------------------");
                    System.out.println("Esta Deduccion Ya Fue Ingresada A La Lista!");
                    System.out.println("Intente Con Otro Codigo :D ");
                    System.out.println("---------------------------------------");

                } else {

                    //busco la deduccion en su array haciendo uso del metodo buscarDeduccionesPorCodigo
                    //si este devuelve -111 es xq se encontro la deduccion sino no...
                    posicionDeduccion = BonoSueldo.buscarDeduccionPorCodigo(codigo, bono.getDeducciones());
                    //si se encuantra la deduccion en la lista entra al if y comienzo la carga de datos
                    if (posicionDeduccion != -111) {

                        bonoCalculado[posicionBono][0] = bono.getDeducciones()[posicionDeduccion][0];
                        bonoCalculado[posicionBono][1] = bono.getDeducciones()[posicionDeduccion][1];
                        bonoCalculado[posicionBono][2] = "0";
                        //ahora se ingresa el porcentaje de la deduccion dependiendo si en el array tenemos el porcentaje ya definido
                        //o si debe ingresarlo el usuario si se detecta la letra M
                        if (bono.getDeducciones()[posicionDeduccion][2].equals("M")) {
                            System.out.println("---------------------------------------");
                            System.out.println("Ingrese El Valor De La Deduccion % : ");
                            System.out.println("---------------------------------------");
                            double valorM = new Scanner(System.in).nextDouble();
                            double sueldoExtra = (valorM * bono.getSueldoBasico()) / 100;
                            bonoCalculado[posicionBono][3] = String.valueOf(sueldoExtra);
                        } else {
                            double sueldoExtra = (Double.valueOf(bono.getDeducciones()[posicionDeduccion][2]) * bono.getSueldoBasico()) / 100;
                            bonoCalculado[posicionBono][3] = String.valueOf(sueldoExtra);
                        }

                        //por ultimo agrego el codigo de la deduccion a la lista de codigosIngresados para saber si ya fue agregado
                        bono.getCodigosIngresados().add(Integer.valueOf(codigo));
                        //aumento la posicion de las filas del bono para que al agregar una nueva deduccion se agregue debajo del anterior xD
                        posicionBono++;
                    } else {
                        //sino existe el codigo entra al else
                        System.out.println("---------------------------------------");
                        System.out.println("El Codigo Ingresado No Existe O Es 000");
                        System.out.println("---------------------------------------");

                        break;
                    }
                }

            } while (!bono.getCodigosIngresados().contains(Integer.valueOf(codigo)) && !codigo.equals("000"));
            if (bono.getCodigosIngresados().isEmpty()) {
                System.out.println("---------------------------------------");
                System.out.println("Debe Ingresar Minimo 1 Deduccion A La Lista!");
                System.out.println("---------------------------------------");

            }
        } while (!codigo.equals("000"));
    }

    public static void mostrarArrayFinalBonoCalculado(BonoSueldo bono, String bonoCalculado[][]) {
        System.out.println("----------------El Bono De Sueldo A Liquidar Es : --------------------------");

        System.out.println("Nombre Del Empleado : " + bono.getNombreEmpleado());
        System.out.println("CUIL : " + bono.getCuil());
        System.out.println("Mes De Liquidacion : " + bono.getMesLiquidacion() + "  Año De Liquidacion : " + bono.getAnioLiquidacion());
        System.out.println("Sueldo Basico : " + bono.getSueldoBasico() + "     Año De Ingreso A La Empresa : " + bono.getAnioIngreso());
        System.out.println("Monto Antiguedad : " + bono.getMontoAntiguedad());

        System.out.println("----------------------------------------------------------------------------");
        String[][] Header = {{"Codigo Item", "Denominacion", "Haberes", "Deducciones"}};
        tabularArray2D(Header, 22);
        System.out.println("----------------------------------------------------------------------------");
        tabularArray2D(bonoCalculado, 22);
        System.out.println("-----------------------------------------------------------------------------");

//sumo la columna de habers y la de deducciones
        double sumaHaberes = 0;
        double sumaDeducciones = 0;
        for (int i = 0; i < bonoCalculado.length; i++) {

            if (bonoCalculado[i][2] != null) {
                sumaHaberes += Double.valueOf(bonoCalculado[i][2]);
            }
            if (bonoCalculado[i][3] != null) {
                sumaDeducciones += Double.valueOf(bonoCalculado[i][3]);
            }

        }

        double totalHaberes = sumaHaberes + bono.getSueldoBasico() + bono.getMontoAntiguedad();
        double totalDeducciones = sumaDeducciones;
        double neto = totalHaberes - totalDeducciones;

        System.out.println("Total Haberes : " + totalHaberes);
        System.out.println("Total Deducciones : " + totalDeducciones);
        System.out.println("TOTAL NETO : " + neto);
        System.out.println("-----------------------------------------------------------------------------");
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
}
