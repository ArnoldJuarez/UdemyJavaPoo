package gymnasio;

import java.util.Arrays;

public class ClaseGym {

    private final int idClase;
    private String nombreClase;
    private Socio[] socios;
    private int contadorInscritos;
    private static final int MAX_SOCIOS = 5;
    private static int contadorClases;

    public ClaseGym(String nombreClase) {
        this.idClase = ++ClaseGym.contadorClases; //le da un id a la clase
        this.nombreClase = nombreClase;     //le da un nombre de clase
        this.socios = new Socio[ClaseGym.MAX_SOCIOS]; //crea un arreglo
    }

    public void agregarSocio(Socio socio){
        if (this.contadorInscritos < ClaseGym.MAX_SOCIOS) {
            this.socios[this.contadorInscritos++] = socio;
        }else {
            System.out.println("Maximo de inscritos");
        }

    }

    /*

    public void mostrarOrden(){
        System.out.println("Id Clase: " + this.idClase);
        System.out.println("Cantidad de Inscritos: " + this.contadorInscritos);
        System.out.println("Socios: ");
        for (int i = 0; i < this.contadorInscritos; i++) {
            System.out.println("\t\t"+this.socios[i]);

        }
    }*/



    @Override
    public String toString() {
        var resultado = "Id Orden: "+this.idClase +"\n";
        resultado += "\tCantidad de Inscritos: "+this.contadorInscritos+"\n";
        resultado += "\tSocios: \n";

        for (int i = 0; i < this.contadorInscritos; i++) {
            resultado+="\t\t"+this.socios[i]+"\n";
        }

        return resultado;
    }
}
