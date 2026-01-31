package persona;

public class Persona {
    //Creamos atributos
    private String nombre;
    private String apellido;

    //Constructor
    public Persona(String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    //Metodos
    public void mostrarPersona(){
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }



}
