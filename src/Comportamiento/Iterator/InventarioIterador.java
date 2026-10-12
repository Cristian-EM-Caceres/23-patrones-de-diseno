package Comportamiento.Iterator;

class InventarioIterador implements Iterador {
    private String[] items;
    private int posicionActual;

    public InventarioIterador(String[] items) {
        this.items = items;
        this.posicionActual = 0;
    }

    @Override
    public boolean tieneSiguiente() {
        // Verifica si no nos salimos del límite y si hay un elemento real
        if (posicionActual >= items.length || items[posicionActual] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object siguiente() {
        String producto = items[posicionActual];
        posicionActual++; // Avanzamos el cursor
        return producto;
    }
}
