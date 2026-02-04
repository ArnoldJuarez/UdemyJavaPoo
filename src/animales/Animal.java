package animales;

public class Animal {
    /*protected void comer(){ //protected acceso solo a clases hija
        System.out.println("Comiendo");
    }
    protected void dormir(){

        System.out.println("Durmiendo");
    }*/
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

}

class Perro extends Animal{

    @Override
    protected void hacerSonido(){
        System.out.println("El perro dice : guaf");
    }


}

class Gato extends Animal{

    @Override
    protected void hacerSonido(){
        System.out.println("El gato dice: miau");
    }
}



class PruebaAnimal{

    //Metodo polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();

    }

    static void main(String[] args) {

        //Objeto de la clase padre (Animal)
        //var animal = new Animal();
        //var animal = new Perro();
        var animal = new Gato();
        imprimirSonido(animal);
    }
}
