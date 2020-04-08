package Ejercicio4;

/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {

        Contacto contacto1 = new Contacto(new ContactoTipo(1, "personal"), "Ismael", "Boff", 23);
        contacto1.addDomicilios(new ContactoDomicilio(1, "Mendoza"));
        contacto1.addTelefonos(new ContactoTelefono(1, "261", "33243123"));
        Contacto contacto2 = new Contacto(new ContactoTipo(2, "escolar"), "Jose", "L", 22);
        contacto2.addDomicilios(new ContactoDomicilio(1, "SJ"));
        contacto2.addTelefonos(new ContactoTelefono(1, "261", "3322343123"));
        Contacto contacto3 = new Contacto(new ContactoTipo(3, "negocios"), "Homero", "A", 21);
        contacto3.addDomicilios(new ContactoDomicilio(1, "Neuquen"));
        contacto3.addTelefonos(new ContactoTelefono(1, "261", "33323243123"));

        Usuario user = new Usuario(1, "usu66", "arroz8", "Juancito", "Lobos", 33);
        user.agregarContacto(contacto1);
        user.agregarContacto(contacto2);
        user.agregarContacto(contacto3);

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
