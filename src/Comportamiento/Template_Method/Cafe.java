package Comportamiento.Template_Method;

public class Cafe extends BebidaCaliente {
    
    @Override
    protected void prepararIngrediente() {
        System.out.println("Filtrando el café molido...");
    }

    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche...");
    }
}
