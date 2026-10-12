package Comportamiento.Iterator;

public class MainIterator {
    public static void main(String[] args) {
        // Llenamos la colección
        InventarioHardware inventario = new InventarioHardware(5);
        inventario.agregarProducto("Teclado Mecánico");
        inventario.agregarProducto("Mouse Gamer");
        inventario.agregarProducto("Monitor 144Hz");

        // Obtenemos el iterador
        Iterador iterador = inventario.crearIterador();

        // Recorremos la colección a ciegas de su estructura
        System.out.println("=== Catálogo de Productos ===");
        while (iterador.tieneSiguiente()) {
            String item = (String) iterador.siguiente();
            System.out.println("- " + item);
        }
    }
}