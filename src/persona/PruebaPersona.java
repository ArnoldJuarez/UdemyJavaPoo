package persona;

public class PruebaPersona {
    public static void main(String[] args) {

        System.out.println("Creacion de clases y objetos");
        System.out.println("Variable esatica: " + Persona.getContadorPersonas());
        var persona1 = new Persona("Arnold","Juarez");
        System.out.println(persona1); //lama a tostring automaticamente

        System.out.println("Variable esatica: " + Persona.getContadorPersonas());

        var persona2 = new Persona("Solanch","Diaz");
        System.out.println(persona2);
        System.out.println("Variable esatica: " + Persona.getContadorPersonas());

    }


}
