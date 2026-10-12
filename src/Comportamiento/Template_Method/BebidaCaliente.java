package Comportamiento.Template_Method;

public abstract class BebidaCaliente {

    // ESTE ES EL TEMPLATE METHOD (Método Plantilla)
    // Es 'final' para que las subclases no puedan alterar el orden de los pasos.
    public final void prepararReceta() {
        hervirAgua();
        prepararIngrediente(); // Paso abstracto
        servirEnTaza();
        agregarCondimentos();  // Paso abstracto
    }

    // Pasos comunes que ya están resueltos (Código reutilizado)
    private void hervirAgua() {
        System.out.println("Hirviendo agua...");
    }

    private void servirEnTaza() {
        System.out.println("Sirviendo la bebida en la taza...");
    }

    // Pasos abstractos que cada bebida debe definir por sí misma
    protected abstract void prepararIngrediente();
    protected abstract void agregarCondimentos();
}