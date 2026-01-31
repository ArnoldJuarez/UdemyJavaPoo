package persona;

public class PruebaPersona {
    public static void main(String[] args) {

        var persona1 = new Persona("Arnold","Juarez");
        System.out.println("Persona 1: " + persona1.getNombre());
        persona1.mostrarPersona();

        System.out.println("====================================");
        var persona2 = new Persona("Erick","Jimenez");
        System.out.println("Persona 2: " + persona2.getNombre());
        persona2.mostrarPersona();

    }


}
