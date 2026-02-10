package gymnasio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        var socio1 = new Socio("Arnold","Basica");
        var socio2 = new Socio("Arnold","Basica");
        var socio3 = new Socio("Arnold","Basica");
        var socio4 = new Socio("Arnold","Basica");
        var socio5 = new Socio("Arnold","Basica");


        var clase1 = new ClaseGym("Yoga");
        clase1.agregarSocio(socio1);
        clase1.agregarSocio(socio2);
        clase1.agregarSocio(socio3);
        clase1.agregarSocio(socio4);
        clase1.agregarSocio(socio5);
        System.out.println(clase1);
    }


}
