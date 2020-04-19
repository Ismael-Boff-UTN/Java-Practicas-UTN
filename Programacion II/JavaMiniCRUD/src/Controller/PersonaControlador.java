package Controller;

import DAO.PersonaDAOImpl;
import Model.Persona;
import View.ListaPersonas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SkylakeFrost
 */
public class PersonaControlador implements ActionListener {

    private Persona persona;
    private PersonaDAOImpl crud;
    private ListaPersonas vista;
    DefaultTableModel modelo;

    public PersonaControlador(Persona persona, PersonaDAOImpl crud, ListaPersonas vista) {
        this.persona = persona;
        this.crud = crud;
        this.vista = vista;
        this.vista.getBtnAgregar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBtnAgregar()) {
            agregar();

        }

        if (e.getSource() == vista.getBtnEliminar()) {
            eliminar();

        }
    }

    public void limpiarCampos() {
        vista.getTxtNombre().setText(null);
        vista.getTxtApellido().setText(null);
        vista.getTxtDni().setText(null);
        vista.getTxtCuil().setText(null);
    }

    public boolean validarCampos() {
        if (((vista.getTxtNombre().getText().isEmpty() || vista.getTxtApellido().getText().isEmpty()) || vista.getTxtDni().getText().isEmpty())
                || vista.getTxtCuil().getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void iniciarVista() {
        listInTable(vista.getTblPersonas());
        vista.setTitle("Lista De Personas");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.setResizable(false);

    }

    public void agregar() {
        if (validarCampos() == true) {
            JOptionPane.showMessageDialog(null, "Todos Los Campos Deben Estar Completos!");
        } else {
            persona = new Persona(vista.getTxtNombre().getText(), vista.getTxtApellido().getText(),
                    Integer.valueOf(vista.getTxtDni().getText()), Long.valueOf(vista.getTxtCuil().getText()));
            if (crud.create(persona) == true) {

                clearTable();//Limpia la tabla
                listInTable(vista.getTblPersonas());//Vuelve a Listar los datos luego de agregar uno nuevo para dar un efecto de refresh
                JOptionPane.showMessageDialog(null, "Guardado Con Exito!");
                //limpiarCampos();

            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
    }

    public void eliminar() {
        int fila = vista.getTblPersonas().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            int id = Integer.parseInt((String) vista.getTblPersonas().getValueAt(fila, 0).toString());
            crud.delete(id);
            clearTable();
            listInTable(vista.getTblPersonas());
            JOptionPane.showMessageDialog(null, "Eliminado!");
        }
    }

    public void listInTable(JTable table) {
        modelo = (DefaultTableModel) vista.getTblPersonas().getModel();
        List<Persona> lista = crud.read();
        Object[] persona = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            persona[0] = lista.get(i).getId_persona();
            persona[1] = lista.get(i).getNombre();
            persona[2] = lista.get(i).getApellido();
            persona[3] = lista.get(i).getDni();
            persona[4] = lista.get(i).getCuit();
            modelo.addRow(persona);
        }
        vista.getTblPersonas().setModel(modelo);

    }

    public void clearTable() {
        for (int i = 0; i < vista.getTblPersonas().getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

}
