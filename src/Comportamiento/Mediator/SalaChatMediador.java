package Comportamiento.Mediator;

public interface SalaChatMediador {
    // El método por el cual los colegas se comunican con el mediador
    void enviarMensaje(String mensaje, Usuario remitente);
    void registrarUsuario(Usuario usuario);
}