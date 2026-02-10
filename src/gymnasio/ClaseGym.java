package gymnasio;

import java.util.Arrays;

public class ClaseGym {

    private final int idClase;
    private String nombreClase;
    private Socio[] socios;
    private int contadorInscritos;
    private static final int MAX_SOCIOS = 5;
    private static int contadorClases=0;

    public ClaseGym(String nombreClase) {
        this.idClase = ++ClaseGym.contadorClases; //le da un id a la clase
        this.nombreClase = nombreClase;     //le da un nombre de clase
        this.socios = new Socio[ClaseGym.MAX_SOCIOS]; //crea un arreglo
    }

    public void agregarSocio(Socio socio){
        if (this.contadorInscritos < MAX_SOCIOS) {
            this.socios[this.contadorInscritos++] = socio;
        }else {
            System.out.println("Maximo de inscritos");
        }

    }

    @Override
    public String toString() {
        return "ClaseGym{" +
                "idClase=" + idClase +
                ", nombreClase='" + nombreClase + '\'' +
                ", socios=" + Arrays.toString(socios) +
                ", contadorInscritos=" + contadorInscritos +
                '}';
    }
}
