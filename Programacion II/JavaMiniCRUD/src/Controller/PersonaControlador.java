package Controller;

import DAO.PersonaDAO;
import Model.Persona;
import View.AgregarPersona;
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
    private ListaPersonas vistaListaPersonas;
    private EditarPersona vistaEditarPersona;
    private AgregarPersona vistaAgregarPersona;
    private DefaultTableModel modelo;

    @SuppressWarnings("LeakingThisInConstructor")
    public PersonaControlador(Persona persona, PersonaDAO crud, ListaPersonas vistaListaPersonas, EditarPersona vistaEditarPersona, AgregarPersona vistaAgregarPersona) {
        this.persona = persona;
        this.crud = crud;
        this.vistaListaPersonas = vistaListaPersonas;
        this.vistaEditarPersona = vistaEditarPersona;
        this.vistaAgregarPersona = vistaAgregarPersona;
        //Vista Principal (Lista)
        this.vistaListaPersonas.getBtnAgregar().addActionListener(this);
        this.vistaListaPersonas.getBtnEliminar().addActionListener(this);
        this.vistaListaPersonas.getBtnEditar().addActionListener(this);
        //Vista De Edicion
        this.vistaEditarPersona.getBtnCancelar().addActionListener(this);
        this.vistaEditarPersona.getBtnGuardarCambios().addActionListener(this);
        //Vista De Agregar
        this.vistaAgregarPersona.getBtnAgregar().addActionListener(this);
        this.vistaAgregarPersona.getBtnCancelar().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaListaPersonas.getBtnAgregar()) {
            vistaAgregarPersona.setVisible(true);

        }

        if (e.getSource() == vistaListaPersonas.getBtnEliminar()) {
            eliminar();

        }

        if (e.getSource() == vistaListaPersonas.getBtnEditar()) {
            cargarVistaEditar();
        }

        if (e.getSource() == vistaEditarPersona.getBtnCancelar()) {
            vistaEditarPersona.setVisible(false);
        }
        if (e.getSource() == vistaEditarPersona.getBtnGuardarCambios()) {
            editar();
        }
        if(e.getSource() == vistaAgregarPersona.getBtnAgregar()){
            agregar();
        }
        if(e.getSource() == vistaAgregarPersona.getBtnCancelar()){
            limpiarCampos();
            vistaAgregarPersona.setVisible(false);
        }
    }

    public void limpiarCampos() {
        vistaAgregarPersona.getTxtNombre().setText(null);
        vistaAgregarPersona.getTxtApellido().setText(null);
        vistaAgregarPersona.getTxtDni().setText(null);
        vistaAgregarPersona.getTxtCuil().setText(null);
    }

    public boolean validarCampos() {
        if (((vistaAgregarPersona.getTxtNombre().getText().isEmpty() || vistaAgregarPersona.getTxtApellido().getText().isEmpty()) || vistaAgregarPersona.getTxtDni().getText().isEmpty())
                || vistaAgregarPersona.getTxtCuil().getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void iniciarVista() {

        listInTable(vistaListaPersonas.getTblPersonas());
        vistaListaPersonas.setTitle("Lista De Personas");
        vistaListaPersonas.setLocationRelativeTo(null);
        vistaListaPersonas.setVisible(true);
        vistaListaPersonas.setResizable(false);
        vistaEditarPersona.setLocationRelativeTo(null);
        vistaAgregarPersona.setLocationRelativeTo(null);

    }

    public void agregar() {
        if (validarCampos() == true) {
            JOptionPane.showMessageDialog(null, "Todos Los Campos Deben Estar Completos!");
        } else {
            persona = new Persona(vistaAgregarPersona.getTxtNombre().getText(), vistaAgregarPersona.getTxtApellido().getText(),
                    Integer.valueOf(vistaAgregarPersona.getTxtDni().getText()), Long.valueOf(vistaAgregarPersona.getTxtCuil().getText()));
            if (crud.create(persona) == true) {

                clearTable();//Limpia la tabla
                listInTable(vistaListaPersonas.getTblPersonas());//Vuelve a Listar los datos luego de agregar uno nuevo para dar un efecto de refresh
                JOptionPane.showMessageDialog(null, "Guardado Con Exito!");
                //limpiarCampos();
                vistaAgregarPersona.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
    }

    public void eliminar() {
        int fila = vistaListaPersonas.getTblPersonas().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Desea Elimnar?", "Seleccione Una Opc.", JOptionPane.YES_NO_OPTION) == 0) {
                int id = Integer.parseInt((String) vistaListaPersonas.getTblPersonas().getValueAt(fila, 0).toString());
                crud.delete(id);
                clearTable();
                listInTable(vistaListaPersonas.getTblPersonas());
                JOptionPane.showMessageDialog(null, "Eliminado!");
            }

        }
    }

    public void cargarVistaEditar() {
        int fila = vistaListaPersonas.getTblPersonas().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe Seleccione Una Fila!");
        } else {
            vistaEditarPersona.getTxtID().setText(String.valueOf(vistaListaPersonas.getTblPersonas().getValueAt(fila, 0).toString()));
            vistaEditarPersona.getTxtNombre().setText(vistaListaPersonas.getTblPersonas().getValueAt(fila, 1).toString());
            vistaEditarPersona.getTxtApellido().setText(vistaListaPersonas.getTblPersonas().getValueAt(fila, 2).toString());
            vistaEditarPersona.getTxtDNI().setText(String.valueOf(vistaListaPersonas.getTblPersonas().getValueAt(fila, 3).toString()));
            vistaEditarPersona.getTxtCUIT().setText(String.valueOf(vistaListaPersonas.getTblPersonas().getValueAt(fila, 4).toString()));
            vistaEditarPersona.setVisible(true);

        }
    }

    public void editar() {
        int id = Integer.valueOf(vistaEditarPersona.getTxtID().getText());
        String nombre = vistaEditarPersona.getTxtNombre().getText();
        String apellido = vistaEditarPersona.getTxtApellido().getText();
        int dni = Integer.valueOf(vistaEditarPersona.getTxtDNI().getText());
        long cuit = Long.valueOf(vistaEditarPersona.getTxtCUIT().getText());
        persona = new Persona(id, nombre, apellido, dni, cuit);
        crud.update(persona);
        if (crud.update(persona) == true) {
            clearTable();
            listInTable(vistaListaPersonas.getTblPersonas());
            JOptionPane.showMessageDialog(null, "Editado Con Exito");
            vistaEditarPersona.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "ha Ocurrido Un Error!");
        }

    }

    public void listInTable(JTable table) {
        modelo = (DefaultTableModel) vistaListaPersonas.getTblPersonas().getModel();
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
        vistaListaPersonas.getTblPersonas().setModel(modelo);

    }

    public void clearTable() {
        for (int i = 0; i < vistaListaPersonas.getTblPersonas().getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

}
