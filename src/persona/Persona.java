package persona;

public class Persona {
    //Creamos atributos
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    //Constructor
    public Persona(String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        //Incrementar el atributo estatico
        //Asignamos el id unico con ayuida de la variable estatica
        this.idPersona = ++Persona.contadorPersonas;
    }

    public Persona(){}

    //Metodos get y set, mostrar y obtener
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdPersona() {
        return this.idPersona;
    }



    //Metodos
    /*public void mostrarPersona(){
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }*/

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }

    //metodo tostring

    @Override
    public String toString() {
        return "Id: "+this.idPersona + " ,"+
                "Nombre: " + this.nombre +
                ", Apellido: " + this.apellido
                + " ";
    }
}
