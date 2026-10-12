package Comportamiento.Mediator;

public class ClienteSoporte extends Usuario {

    public ClienteSoporte(SalaChatMediador mediador, String nombre) {
        super(mediador, nombre);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(this.nombre + " (Cliente) envía: " + mensaje);
        // Aquí no conoce a los destinatarios, solo le tira la pelota al mediador
        mediador.enviarMensaje(mensaje, this); 
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println(this.nombre + " recibe: " + mensaje);
    }
}
