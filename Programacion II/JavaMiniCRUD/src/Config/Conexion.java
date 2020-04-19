package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SkylakeFrost
 */
public class Conexion {

    /*Clase Estandar Para Conectar a Base De Datos MySQL
    Se Requiere La Libreria/Conector MySQL Importado.
     */
    private static final String DATA_BASE = "registros";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "1234";

    public static Connection connect() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL + DATA_BASE, USER_NAME, PASSWORD);
            if (conexion != null) {
                System.out.println("Conexión Exitosa!");
                System.out.println("Conectado a : " + URL + DATA_BASE);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error De Conexión! :  " + e);

        }

        return conexion;

    }

}
