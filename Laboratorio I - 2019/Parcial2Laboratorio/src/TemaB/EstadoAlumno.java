package TemaB;

import java.util.Scanner;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class EstadoAlumno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstadoAcademico ea = new EstadoAcademico();
        String detalleCatedras[][] = new String[10][4];
        datosBasicosAlumno(ea);
        cargarCatedraAlArray(ea, detalleCatedras);
        mostarArrayDetalleCatedra(ea, detalleCatedras);
    }

    public static void datosBasicosAlumno(EstadoAcademico ea) {
        int anio;
        long legajo;

        /*Solicite al usuario y asigne en la instancia de EstadoAcademico los correspondientes atributos
legajo, anio, turno y nombre completo. Valide que el legajo posea 6 dígitos y que el año sea
mayor o igual a 1 y menor o igual que 5.*/
        System.out.println("-----------Datos Basicos Alumno-----------");

        do {
            System.out.println("Ingrese Numero De Legajo Del Alumno : ");
            legajo = new Scanner(System.in).nextLong();
            if (String.valueOf(legajo).length() != 6) {
                System.out.println("El Legajo Debe Poseer 6 Digitos!");
            } else {
                ea.setLegajo(legajo);
            }
        } while (String.valueOf(legajo).length() != 6);

        do {
            System.out.println("Ingrese Año : ");
            anio = new Scanner(System.in).nextInt();
            if (anio < 1 || anio >= 6) {
                System.out.println("El Año Debe Ser Un Valor Entero Entre 1 y 5");

            } else {
                ea.setAnio(anio);

            }
        } while (anio < 1 || anio >= 6);

        System.out.println("Ingrese Turno - M - T - N : ");
        ea.setTurno(new Scanner(System.in).nextLine());

        System.out.println("Ingrese Nombre Completo : ");
        ea.setNombreCompleto(new Scanner(System.in).nextLine());
    }

    public static void cargarCatedraAlArray(EstadoAcademico ea, String detallesCatedra[][]) {
        String codigo;
        String nota;
        int posicionCatedra;
        int posicionDetalles = 0;

        do {
            System.out.println("Ingrese El Codigo De La Cátedra");
            System.out.println("Ingrese 000 Para Finalizar");
            codigo = new Scanner(System.in).nextLine();

            do {
                if (ea.getCodigosIngresados().contains(Integer.valueOf(codigo))) {
                    System.out.println("----------------------------------------");
                    System.out.println(setColor("rojo", "Esta Cátedra Ya Fue Ingresada A La Lista"));
                    System.out.println("----------------------------------------");
                } else {

                    posicionCatedra = EstadoAcademico.buscarCatedraPorCodigo(codigo, ea.getCatedras());

                    if (posicionCatedra != -111) {
                        //asigno codigo y nombre de catedra al array detallescatedra
                        detallesCatedra[posicionDetalles][0] = ea.getCatedras()[posicionCatedra][0];
                        detallesCatedra[posicionDetalles][1] = ea.getCatedras()[posicionCatedra][1];

                        //pido notas para la catedra hasta que se ingrese la letra q
                        do {

                            System.out.println("Ingrese Nota Para La Catedra : " + ea.getCatedras()[posicionCatedra][1]);
                            nota = new Scanner(System.in).nextLine();

                            if (nota.equals("q")) {
                                break;
                            } else {
                                ea.getNotas().add(Double.valueOf(nota));
                            }

                        } while (!nota.equals("q"));

                        //suma las notas de la catedra y obtengo el promedio
                        double sumaNotas = 0;
                        int cantidadNotas = ea.getNotas().size();
                        for (int i = 0; i < ea.getNotas().size(); i++) {
                            sumaNotas += ea.getNotas().get(i);
                        }
                        double promedio = sumaNotas / cantidadNotas;
                        detallesCatedra[posicionDetalles][2] = String.valueOf(redondearDecimalesDouble(promedio, 2));

                        //dependiendo el promedio de las notas de la catedra defino el estado del alumno
                        if (promedio < 4) {
                            detallesCatedra[posicionDetalles][3] = "Debe Recursar";
                        }
                        if (promedio > 4 && promedio < 6) {
                            detallesCatedra[posicionDetalles][3] = "Estado Regular";
                        }
                        if (promedio >= 6) {
                            detallesCatedra[posicionDetalles][3] = "Promocionado";
                        }
                        //aumenos la posicion del array detallescatedra, para que la siguiente catedra ingresada
                        //sea colocado debajo de la anterior, inicialemnte la posicion comienza en 0 y se incrementa en
                        // uno para cada catedra ingresada,
                        posicionDetalles++;
                        //agrego el codigo de catedra aun array list para luego trabajarlo
                        ea.getCodigosIngresados().add(Integer.valueOf(codigo));
                        //limpio el arraylist de notas
                        ea.getNotas().clear();
                    } else {
                        System.out.println("--------------------------------------");
                        System.out.println(setColor("rojo", "Codigo Invalido Ó De Finalización 000!"));
                        System.out.println("--------------------------------------");
                        break;
                    }

                }
            } while (!ea.getCodigosIngresados().contains(Integer.valueOf(codigo)) && !codigo.equals("000"));

            if (ea.getCodigosIngresados().isEmpty()) {
                System.out.println("------------------------------------------");
                System.out.println(setColor("rojo", "Debe Ingresar Minimo 1 Cátedra A La Lista!"));
                System.out.println("------------------------------------------");

            }
        } while (!codigo.equals("000") || ea.getCodigosIngresados().isEmpty());

    }

    public static void mostarArrayDetalleCatedra(EstadoAcademico ea, String detallesCatedra[][]) {
        System.out.println("----------------------------El Estado Academico Del Alumno Es : -------------------------------------");
        System.out.println("Nombre Completo : " + ea.getNombreCompleto());
        System.out.println("Legajo : " + ea.getLegajo());
        System.out.println("Año : " + ea.getAnio());
        System.out.println("Turno : " + ea.getTurno());
        System.out.println("-----------------------------------------------------------------------------------------------------");
        String[][] Header = {{"Código Cátedra", "Denominación Cátedra", "Promedio Notas", "Estado"}};
        tabularArray2D(Header, 22);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        tabularArray2D(detallesCatedra, 22);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        ea.setPromedioGeneral(sumaColumnasYPromedio(detallesCatedra, 2));

        System.out.println("Promedio General : " + redondearDecimalesDouble(ea.getPromedioGeneral(), 2));
        System.out.println("-------------------------------------------");

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

    public static double sumaColumnasYPromedio(String[][] Array2D, int posicionColumna) {
        double sumaColumna = 0;
        int cantidadColLlenas = 0;

        for (int i = 0; i < Array2D.length; i++) {
            if (Array2D[i][posicionColumna] != null) {
                sumaColumna += (Double.valueOf(Array2D[i][posicionColumna]));
                cantidadColLlenas++;
            }

        }
        double promedioGeneral = sumaColumna / cantidadColLlenas;
        return promedioGeneral;

    }

    public static Double redondearDecimalesDouble(Double numero, int numeroMaxDecimales) {
        return Math.round(numero * Math.pow(10, numeroMaxDecimales)) / Math.pow(10, numeroMaxDecimales);
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
            case "greenBold":
                colorCode = "\033[1;32m";
                break;
            default:
                colorCode = "\033[30m";
                break;
        }
        return colorCode + msg;
    }
}
