package ventas;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var producto1 = new Producto("Blusa",30);
        //System.out.println(producto1);

        var producto2 = new Producto("Zapato",50);
        //System.out.println(producto2);

        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);
        //orden1.mostrarOrden();


        //Segundo orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera",15));
        orden2.agregarProducto(producto1);
        System.out.println(orden2);
        //orden2.mostrarOrden();

    }
}
