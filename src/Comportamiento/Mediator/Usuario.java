package Comportamiento.Mediator;

public abstract class Usuario {
    protected SalaChatMediador mediador;
    protected String nombre;

    public Usuario(SalaChatMediador mediador, String nombre) {
        this.mediador = mediador;
        this.nombre = nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
}
