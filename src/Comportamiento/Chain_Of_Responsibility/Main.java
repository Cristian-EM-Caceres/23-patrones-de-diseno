package Comportamiento.Chain_Of_Responsibility;

public class Main {
    public static void main(String[] args) {
        Aprobador gerente = new Gerente();
        Aprobador director = new Director();

        gerente.setSiguiente(director);

        gerente.procesar(250); 
        gerente.procesar(1200); 
    }
}