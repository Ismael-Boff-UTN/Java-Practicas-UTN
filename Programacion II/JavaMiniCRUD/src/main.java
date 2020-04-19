
import Controller.PersonaControlador;
import DAO.PersonaDAOImpl;
import Model.Persona;
import View.ListaPersonas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        PersonaDAOImpl crud = new PersonaDAOImpl();
        ListaPersonas vista = new ListaPersonas();

        PersonaControlador controlador = new PersonaControlador(persona, crud, vista);
        controlador.iniciarVista();

    }
}
