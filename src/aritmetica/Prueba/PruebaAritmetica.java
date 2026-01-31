package aritmetica.Prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        System.out.println(" *** Ejemplo Aritmetica ***");
        //Creamos objeto 1
        var aritmetica1 = new Aritmetica(5,7);
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(10);
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        System.out.println("Atributo operando2: " + aritmetica1.getOperando2());

        aritmetica1.sumar();
        aritmetica1.restar();


        System.out.println();
        //Creamos segundo objeto

        var aritmetica2 = new Aritmetica(12,5);
        System.out.println("Atributo operando2: " + aritmetica2.getOperando2());

        aritmetica2.sumar();
        aritmetica2.restar();

    }

}
