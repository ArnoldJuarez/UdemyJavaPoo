package gymnasio;

public class Socio {

    private final int idSocio;
    private String nombre;
    private String tipoMembrecia;
    static int contadorSocio;

    public Socio(String nombre, String tipoMembrecia) {

        this.nombre = nombre;
        this.tipoMembrecia = tipoMembrecia;
        this.idSocio = ++Socio.contadorSocio;
    }

    public int getIdSocio() {
        return this.idSocio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMembrecia() {
        return this.tipoMembrecia;
    }

    public void setTipoMembrecia(String tipoMembrecia) {
        this.tipoMembrecia = tipoMembrecia;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "idSocio=" + idSocio +
                ", nombre='" + nombre + '\'' +
                ", tipoMembrecia='" + tipoMembrecia + '\'' +
                '}';
    }
}
