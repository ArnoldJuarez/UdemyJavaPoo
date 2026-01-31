package animales;

public class Animal {
    protected void comer(){ //protected acceso solo a clases hija
        System.out.println("Comiendo");
    }

    protected void dormir(){
        System.out.println("Durmiendo");
    }
}

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Ladrar");
    }

}

class PruebaAnimal{
    public static void main() {
        System.out.println(" *** Ejemplo de Herencia ***");
        System.out.println("Clase Padre, soy un Animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacerSonido(), nmetood no existe en clase padre solo hija
        System.out.println("\nClase Hija, soy un Perro");
        var perro1 = new Perro();
        perro1.hacerSonido();
        perro1.comer();
        perro1.dormir();


    }
}
