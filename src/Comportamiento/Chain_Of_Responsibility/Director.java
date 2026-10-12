package Comportamiento.Chain_Of_Responsibility;

public class Director extends Aprobador {
    @Override
    public void procesar(int monto) {
        System.out.println("Director aprueba $" + monto);
    }
}