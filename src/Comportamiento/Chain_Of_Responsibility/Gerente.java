package Comportamiento.Chain_Of_Responsibility;

public class Gerente extends Aprobador {
    @Override
    public void procesar(int monto) {
        if (monto <= 500) {
            System.out.println("Gerente aprueba $" + monto);
        } else if (siguiente != null) {
            siguiente.procesar(monto);
        }
    }
}