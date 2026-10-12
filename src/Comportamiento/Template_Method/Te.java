package Comportamiento.Template_Method;

public class Te extends BebidaCaliente {

    @Override
    protected void prepararIngrediente() {
        System.out.println("Remojando la bolsa de té en el agua...");
    }

    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregando una rodaja de limón...");
    }
}
