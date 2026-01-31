package aritmetica;

public class Aritmetica {

    //Atributos
    private int operando1;
    private int operando2;

    //Creando Constructor
    //se llama = clase
    public Aritmetica(int operando1, int operando2) {
        this.operando1 = operando1;  //usando this definios que etamos usando los atributos de la clase
        this.operando2 = operando2;
    }
    //SI TENEMOS 2 O MAS CONSTRUCTORES ES UNA SOBRECARGA DE CONSTRUCTORES,
    public Aritmetica(){ //constructor vacio, podemos crear un objeto sin valores

    }



    //Metodos
    public void sumar() {
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado Suma: " + resultado);
    }
    public void restar() {
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado Resta: " + resultado);
    }

    //GET Y SETT
    public int getOperando1(){
        return this.operando1;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }



}
