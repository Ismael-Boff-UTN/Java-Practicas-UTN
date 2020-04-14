package Ejercicio4;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {
        
        Usuario user = new Usuario(1, "usu66", "arroz8", "Juancito", "Lobos", 33);

        user.agregarContacto(new Contacto(new ContactoTipo(1, "personal"), "Ismael", "Boff", 23));
        user.getContactos().get(0).addDomicilios(new ContactoDomicilio(1, "Mendoza"));
        user.getContactos().get(0).addTelefonos(new ContactoTelefono(1, "261", "33243123"));

        user.agregarContacto(new Contacto(new ContactoTipo(2, "escolar"), "Jose", "Luis", 22));
        user.getContactos().get(1).addDomicilios(new ContactoDomicilio(1, "SJ"));
        user.getContactos().get(1).addTelefonos(new ContactoTelefono(1, "261", "3322343123"));

        user.agregarContacto(new Contacto(new ContactoTipo(3, "negocios"), "Homero", "Simpson", 21));
        user.getContactos().get(2).addDomicilios(new ContactoDomicilio(1, "Neuquen"));
        user.getContactos().get(2).addTelefonos(new ContactoTelefono(1, "261", "33323243123"));

        System.out.println("--------Contactos De " + user.getNombre() + " --------");
        for (int i = 0; i < user.getContactos().size(); i++) {
            System.out.println("------------Contacto Num. " + (i + 1) + " -----------");
            System.out.println("Nombre : " + user.getContactos().get(i).getNombre());
            System.out.println("Apellido :" + user.getContactos().get(i).getApellido());
            System.out.println("ID Persona : " + user.getContactos().get(i).getIdPersona());
            System.out.println("Tipo Contacto : " + user.getContactos().get(i).getTipo().getDescripcion());
            System.out.println("Domicilio : " + user.getContactos().get(i).getDomicilios().get(0).getDescripcion());
            System.out.println("Numero : " + user.getContactos().get(i).getTelefonos().get(0).getCodigo() + " "
                    + user.getContactos().get(i).getTelefonos().get(0).getNumero());

        }

    }

}
