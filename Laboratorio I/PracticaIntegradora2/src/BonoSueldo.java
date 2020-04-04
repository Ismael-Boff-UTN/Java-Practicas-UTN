
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class BonoSueldo {

    private String nombreEmpleado;
    private long cuil;
    private int anioIngreso;
    private double sueldoBasico;
    private int mesLiquidacion;
    private int anioLiquidacion;
    private double montoAntiguedad;

    String[][] haberes = {{"100", "Presentismo", "9"}, {"101", " Titulo Profesional", "9"},
    {"102", "Horas Extraordinarias", "M"}, {"103", "Horas Nocturnas", "M"}, {"104", " Otros Haberes", "M"}};

    String[][] deducciones = {{"200", " Obra Social", "3"}, {"201", "Jubilacion", "11"},
    {"202", "Sindicato", "2"}, {"203", " Seguro", "1.5"}, {"204", "Otros", "M"}};

    List<Integer> codigosIngresados = new ArrayList<>();

    public BonoSueldo() {
    }

    public BonoSueldo(String nombreEmpleado, long cuil, int anioIngreso, double sueldoBasico, int mesLiquidacion, int anioLiquidacion, double montoAntiguedad) {
        this.nombreEmpleado = nombreEmpleado;
        this.cuil = cuil;
        this.anioIngreso = anioIngreso;
        this.sueldoBasico = sueldoBasico;
        this.mesLiquidacion = mesLiquidacion;
        this.anioLiquidacion = anioLiquidacion;
        this.montoAntiguedad = montoAntiguedad;
    }
    
    

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getMesLiquidacion() {
        return mesLiquidacion;
    }

    public void setMesLiquidacion(int mesLiquidacion) {
        this.mesLiquidacion = mesLiquidacion;
    }

    public int getAnioLiquidacion() {
        return anioLiquidacion;
    }

    public void setAnioLiquidacion(int anioLiquidacion) {
        this.anioLiquidacion = anioLiquidacion;
    }

    public double getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public void setMontoAntiguedad(double montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
    }

    public String[][] getHaberes() {
        return haberes;
    }

    public void setHaberes(String[][] haberes) {
        this.haberes = haberes;
    }

    public String[][] getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(String[][] deducciones) {
        this.deducciones = deducciones;
    }

    public List<Integer> getCodigosIngresados() {
        return codigosIngresados;
    }

    public void setCodigosIngresados(List<Integer> codigosIngresados) {
        this.codigosIngresados = codigosIngresados;

    }

    public static int buscarHaberPorCodigo(String codigo, String haberes[][]) {
        /*con esta funcion determinamos si el codigo ingresado es un codigo valido, entonces lo comparamos con el array de haberes
        Como los codigos solo estan solo en la primer columna siempre la busqueda va ser en [i][0] 
         */

        int encontrado = -111; // este sera nuestro valor por si el codigo que ingresamos no se encuentra retornara -111 dandonos a entender que el codigo es incorrecto
        for (int i = 0; i < haberes.length; i++) {
            if (codigo.equals(haberes[i][0])) {
                encontrado = i;
                break;
            }
        }
        return encontrado;//si retorna un numero correcto nos retornara la posicion de la fila del array de haberes para luego trabajarla
    }

    public static int buscarDeduccionPorCodigo(String codigo, String deducciones[][]) {
        /*con esta funcion determinamos si el codigo ingresado es un codigo valido, entonces lo comparamos con el array de deducciones
         Como los codigos solo estan solo en la primer columna siempre la busqueda va ser en [i][0] 
         */

        int encontrado = -111; // este sera nuestro valor por si el codigo que ingresamos no se encuentra retornara -111 dandonos a entender que el codigo es incorrecto
        for (int i = 0; i < deducciones.length; i++) {
            if (codigo.equals(deducciones[i][0])) {
                encontrado = i;
                break;
            }
        }
        return encontrado;//si retorna un numero correcto nos retornara la posicion de la fila del array de haberes para luego trabajarla
    }

}
