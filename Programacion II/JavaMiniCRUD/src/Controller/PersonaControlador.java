package Controller;

import DAO.PersonaDAO;
import Model.Persona;
import View.EditarPersona;
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
    private PersonaDAO crud;
    private ListaPersonas vista;
    private EditarPersona vistaEditar;
    DefaultTableModel modelo;

    @SuppressWarnings("LeakingThisInConstructor")
    public PersonaControlador(Persona persona, PersonaDAO crud, ListaPersonas vista, EditarPersona vistaEditarPersona) {
        this.persona = persona;
        this.crud = crud;
        this.vista = vista;
        this.vistaEditar = vistaEditarPersona;
        this.vista.getBtnAgregar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);
        this.vista.getBtnEditar().addActionListener(this);
        this.vistaEditar.getBtnCancelar().addActionListener(this);
        this.vistaEditar.getBtnGuardarCambios().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBtnAgregar()) {
            agregar();

        }

        if (e.getSource() == vista.getBtnEliminar()) {
            eliminar();

        }

        if (e.getSource() == vista.getBtnEditar()) {
            cargarVistaEditar();
        }

        if (e.getSource() == vistaEditar.getBtnCancelar()) {
            vistaEditar.setVisible(false);
        }
        if (e.getSource() == vistaEditar.getBtnGuardarCambios()) {
            editar();
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
        vistaEditar.setLocationRelativeTo(null);

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
            if (JOptionPane.showConfirmDialog(null, "Desea Elimnar?", "Seleccione Una Opc.", JOptionPane.YES_NO_OPTION) == 0) {
                int id = Integer.parseInt((String) vista.getTblPersonas().getValueAt(fila, 0).toString());
                crud.delete(id);
                clearTable();
                listInTable(vista.getTblPersonas());
                JOptionPane.showMessageDialog(null, "Eliminado!");
            }

        }
    }

    public void cargarVistaEditar() {
        int fila = vista.getTblPersonas().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            vistaEditar.getTxtID().setText(String.valueOf(vista.getTblPersonas().getValueAt(fila, 0).toString()));
            vistaEditar.getTxtNombre().setText(vista.getTblPersonas().getValueAt(fila, 1).toString());
            vistaEditar.getTxtApellido().setText(vista.getTblPersonas().getValueAt(fila, 2).toString());
            vistaEditar.getTxtDNI().setText(String.valueOf(vista.getTblPersonas().getValueAt(fila, 3).toString()));
            vistaEditar.getTxtCUIT().setText(String.valueOf(vista.getTblPersonas().getValueAt(fila, 4).toString()));
            vistaEditar.setVisible(true);

        }
    }

    public void editar() {
        int id = Integer.valueOf(vistaEditar.getTxtID().getText());
        String nombre = vistaEditar.getTxtNombre().getText();
        String apellido = vistaEditar.getTxtApellido().getText();
        int dni = Integer.valueOf(vistaEditar.getTxtDNI().getText());
        long cuit = Long.valueOf(vistaEditar.getTxtCUIT().getText());
        persona = new Persona(id, nombre, apellido, dni, cuit);
        crud.update(persona);
        if (crud.update(persona) == true) {
            clearTable();
            listInTable(vista.getTblPersonas());
            JOptionPane.showMessageDialog(null, "Editado Con Exito");
            vistaEditar.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "ha Ocurrido Un Error!");
        }

    }

    public void listInTable(JTable table) {
        modelo = (DefaultTableModel) vista.getTblPersonas().getModel();
        List<Persona> lista = crud.read();
        Object[] per = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            per[0] = lista.get(i).getId_persona();
            per[1] = lista.get(i).getNombre();
            per[2] = lista.get(i).getApellido();
            per[3] = lista.get(i).getDni();
            per[4] = lista.get(i).getCuit();
            modelo.addRow(per);
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
