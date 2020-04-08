package Ejercicio3;

/**
 *
 * @author SkylakeFrost
 */
public class main {
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.agregarPerfil(new Perfil(2, "Mafioso"));
        persona.agregarPerfil(new Perfil(2, "Detective"));
        persona.agregarPerfil(new Perfil(2, "Civil"));
        persona.getComunicacion().add(new MedioDeComunicacion("lo que usa para comunicarse", new TipoMedio("Telefono")));
        persona.getComunicacion().add(new MedioDeComunicacion("lo que usa para comunicarse", new TipoMedio("Internet")));
        //Creamos Un Detective
        Detective det = new Detective("Sherlock", "Holmes", new Foto("c:/image.jpg", "sherlock.jpg", 123), "23123123");

        //Creamos un mafioso
        Mafioso maf = new Mafioso("Tony El Gordo", "Desconocido", new Foto("c:/mafioso.jpg", "tonyelgordo.jpg", 123));
        
        System.out.println("Nombre : " + maf.getNombre());
        System.out.println("Apellido : " + maf.getApellido());
        System.out.println("-----------FOTO-----------");
        System.out.println("Ruta : " + maf.getFoto().getPathToFile());
        System.out.println("Nombre Del Archivo : " + maf.getFoto().getNombre());
        System.out.println("Tamaño : " + maf.getFoto().getTamanio() + " kb");
        System.out.println("Perfil - Tipo " + persona.getPerfiles().get(0).getTipoPerfil());
        System.out.println("Perfil - Comunicacion : " + persona.getComunicacion().get(0).getTipoMedio().getTipo());
        System.out.println("Estado > " + investigado(maf));
        
        maf.agregarLugar(new Lugar("planta nuclear", new Direccion("springfield", "1992")));
        maf.agregarLugar(new Lugar("limonero", new Direccion("shelbyville", "4423")));
        System.out.println("-------------------------------------");
        System.out.println("Lugares Frecuentados Por " + maf.getNombre());
        for (int i = 0; i < maf.getLugaresFrecuentes().size(); i++) {
            System.out.println("-------------------------");
            System.out.println("Nombre : " + maf.getLugaresFrecuentes().get(i).getNombre());
            System.out.println("Direccion - Ubicacion : " + maf.getLugaresFrecuentes().get(i).getDireccion().getUbicacion());
            System.out.println("Direccion - Calle : " + maf.getLugaresFrecuentes().get(i).getDireccion().getCalle());
        }
        
    }
    
    public static String investigado(Mafioso mafioso) {
        if (mafioso.investigar() == true) {
            return "Esta Bajo Investicacion";
        } else {
            return "No Esta Bajo Investigacion";
        }
    }
    
}
