package gymnasio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        var socio1 = new Socio("Arnold","Basica");
        var socio2 = new Socio("Erick","Basica");
        var socio3 = new Socio("Eduardo","Basica");
        var socio4 = new Socio("Chile","Basica");
        var socio5 = new Socio("Bryan","Basica");


        var clase1 = new ClaseGym("Yoga");
        clase1.agregarSocio(socio1);
        clase1.agregarSocio(socio2);
        clase1.agregarSocio(socio3);
        clase1.agregarSocio(socio4);
        clase1.agregarSocio(socio5);
        System.out.println(clase1);
    }


}
