package Constructor;

public class Main {
    public static void main(String[] args) {

        Persona persona=new Persona("Carlos", "Talin", 30 );
        persona.MostrarDatos();

        System.out.println("Nombre:"+persona.getNombre());
        System.out.println("Nombre:"+persona.nombre);
    }
}
