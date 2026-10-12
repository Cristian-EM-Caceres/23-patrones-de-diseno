package Comportamiento.Chain_Of_Responsibility;

public abstract class Aprobador {
    protected Aprobador siguiente;

    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void procesar(int monto);
}