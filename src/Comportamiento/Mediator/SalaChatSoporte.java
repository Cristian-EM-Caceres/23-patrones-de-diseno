package Comportamiento.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SalaChatSoporte implements SalaChatMediador {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario remitente) {
        // La lógica centralizada: enviar el mensaje a todos MENOS al que lo envió
        for (Usuario usuario : usuarios) {
            if (usuario != remitente) {
                usuario.recibir(mensaje);
            }
        }
    }
}
