package ReturnDate;


import java.text.SimpleDateFormat;

import java.util.Date;

/**
 *
 * @author SkylakeFrost
 */
public class FuncionesPrograma {

    Date date = new Date();

    public static String getFechaString(Date fechita) {

        SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");

        return fechaFormato.format(fechita);
    }

    public static Date getFechaDate(int dia, int mes, int anio) {
        Date date = new Date();
        dia = date.getDay();
        mes = date.getMonth();
        anio = date.getYear();

        return date;

    }

}
