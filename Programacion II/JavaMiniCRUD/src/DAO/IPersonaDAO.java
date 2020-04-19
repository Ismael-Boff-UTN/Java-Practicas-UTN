package DAO;

import Model.Persona;
import java.util.List;


/**
 *
 * @author SkylakeFrost
 */
public interface IPersonaDAO {

    public boolean create(Persona persona);

    public List<Persona> read();

    public boolean update(Persona persona);

    public boolean delete(int idPersona);
    
    

}
