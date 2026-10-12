package Comportamiento.Template_Method;

public class MainTemplate {
    public static void main(String[] args) {
        System.out.println("--- Preparando Café ---");
        BebidaCaliente miCafe = new Cafe();
        miCafe.prepararReceta(); // Llama al esqueleto base

        System.out.println("\n--- Preparando Té ---");
        BebidaCaliente miTe = new Te();
        miTe.prepararReceta(); // Llama al esqueleto base
    }
}
