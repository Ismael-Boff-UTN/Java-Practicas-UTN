package TemaB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class EstadoAcademico {

    private long legajo;
    private int anio;
    private String turno;
    private String nombreCompleto;
    private double promedioGeneral;
    private String estado;

    String[][] catedras = {{"1000", "Matematica"}, {"1001", "Historia"}, {"1002", "Geografia"},
    {"1003", "Lengua"}, {"1004", "Cs Sociales"}, {"1005", "Cs Naturales"}, {"1006", "Fisica"},
    {"1007", "Quimica"}, {"1008", "Ingles"}, {"1009", "Dibujo Técnico"}};

    List<Double> notas = new ArrayList<>();
    List<Integer> codigosIngresados = new ArrayList<>();

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(double promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String[][] getCatedras() {
        return catedras;
    }

    public void setCatedras(String[][] catedras) {
        this.catedras = catedras;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public List<Integer> getCodigosIngresados() {
        return codigosIngresados;
    }

    public void setCodigosIngresados(List<Integer> codigosIngresados) {
        this.codigosIngresados = codigosIngresados;
    }

    public static int buscarCatedraPorCodigo(String codigo, String catedras[][]) {

        int encontrado = -111; // este sera nuestro valor por si el codigo que ingresamos no se encuentra retornara -111 dandonos a entender que el codigo es incorrecto
        for (int i = 0; i < catedras.length; i++) {
            if (codigo.equals(catedras[i][0])) {
                encontrado = i;
                break;
            }
        }
        return encontrado;//si retorna un numero correcto nos retornara la posicion de la fila del array  para luego trabajarla.
    }
}
