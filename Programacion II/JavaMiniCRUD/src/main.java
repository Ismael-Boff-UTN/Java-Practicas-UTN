
import Controller.PersonaControlador;
import DAO.PersonaDAO;
import Model.Persona;
import View.AgregarPersona;
import View.EditarPersona;
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
        PersonaDAO crud = new PersonaDAO();
        ListaPersonas vista = new ListaPersonas();
        EditarPersona editarPer = new EditarPersona();
        AgregarPersona agregar = new AgregarPersona();

        PersonaControlador controlador = new PersonaControlador(persona, crud, vista, editarPer,agregar);
        controlador.iniciarVista();

    }
}
