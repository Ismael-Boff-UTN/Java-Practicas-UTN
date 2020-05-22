package TemaA;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ismael Boff Lopez (Skylake)
 */
public class DDJJStockAgroquimico {

    private int anioDeclaracion;
    private int mesDeclaracion;
    private String empresa;
    private long cuit;
    private double total;

    String[][] agroquimicos = {{"1000", "2EC JEBAGRO", "A"},
    {"1001", " D 60 GREEN CROPS", "V"},
    {"1002", " ESTER 97", "A"},
    {"1003", " AMINA ICONA SL", "A"}, {"1004", " ABAMECTINA AGRO",
        "A"}, {"1005", " FURACARB 31 TS", "R"}, {"1006", " FURAFARM 48 F", "R"}, {"1007", "ACETOCLORASSA", "A"},
    {"1008", " ACTIVE SIL", "V"}, {"1009", " ABRIGO PLUS", "V"}};

    List<Long> parcelasAplicacion = new ArrayList<>();
    List<Integer> codigosIngresados = new ArrayList<>();

    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }

    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String[][] getAgroquimicos() {
        return agroquimicos;
    }

    public void setAgroquimicos(String[][] agroquimicos) {
        this.agroquimicos = agroquimicos;
    }

    public List<Long> getParcelasAplicacion() {
        return parcelasAplicacion;
    }

    public void setParcelasAplicacion(List<Long> parcelasAplicacion) {
        this.parcelasAplicacion = parcelasAplicacion;
    }

    public List<Integer> getCodigosIngresados() {
        return codigosIngresados;
    }

    public void setCodigosIngresados(List<Integer> codigosIngresados) {
        this.codigosIngresados = codigosIngresados;
    }

    public static int buscarQuimicoPorCodigo(String codigo, String agroquimicos[][]) {

        int encontrado = -1;//si el codigo NO se encuentra retornara -1 dandonos a entender que el codigo es incorrecto o no existe
        for (int i = 0; i < agroquimicos.length; i++) {
            if (agroquimicos[i][0].equals(codigo)) {
                //este sout es solo decorativo
                System.out.println(CargaDDJJStockInicial.setColor("verde", "Se Encontro El Codigo Para : <<" + agroquimicos[i][1] + ">>"));
                encontrado = i;
                break;
            }
        }

        return encontrado;//si el codigo existe retornara la POSICION en este caso del agroquimico.
        //osea para el agroquimico con codigo 1000 seria la pos 0

    }

}
