package DAO;

import Config.Conexion;
import Model.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author SkylakeFrost
 */
public class PersonaDAOImpl extends Conexion implements IPersonaDAO {

    @Override
    public boolean create(Persona persona) {

        PreparedStatement ps;
        Connection con = connect();

        String sql = "INSERT INTO personas (nombre,apellido,dni,cuit) VALUES (?,?,?,?)";

        System.out.println("" + sql);

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setInt(3, persona.getDni());
            ps.setLong(4, persona.getCuit());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error : " + e);
            return false;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }

        }

    }

    @Override
    public List<Persona> read() {
        List<Persona> listaPersonas = new ArrayList<>();
        String sql = "SELECT * from personas";
        try {
            Connection con = connect();
            PreparedStatement ps = null;
            ResultSet rs;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId_persona(rs.getInt(1));
                persona.setNombre(rs.getString(2));
                persona.setApellido(rs.getString(3));
                persona.setDni(rs.getInt(4));
                persona.setCuit(rs.getLong(5));
                listaPersonas.add(persona);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return listaPersonas;
    }

    @Override
    public boolean update(Persona persona) {
        PreparedStatement ps;
        Connection con = connect();

        String sql = "UPDATE personas SET nombre=?, apellido=?, dni=?, cuit=? WHERE id_persona=?";

        System.out.println("" + sql);

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setInt(3, persona.getDni());
            ps.setLong(4, persona.getCuit());
            ps.setInt(5, persona.getId_persona());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error : " + e);
            return false;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }

        }
    }

    @Override
    public boolean delete(int idPersona) {
        PreparedStatement ps;
        Connection con = connect();

        String sql = "DELETE FROM personas WHERE id_persona=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPersona);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println("Error : " + e);
            return false;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }

        }
    }

}
