package Comportamiento.Iterator;

class InventarioHardware implements Coleccion {
    private String[] productos;
    private int contador;

    public InventarioHardware(int capacidad) {
        this.productos = new String[capacidad];
        this.contador = 0;
    }

    public void agregarProducto(String producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
        }
    }

    // Cumplimos el contrato: entregamos un guía que conoce este arreglo
    @Override
    public Iterador crearIterador() {
        return new InventarioIterador(this.productos);
    }
}