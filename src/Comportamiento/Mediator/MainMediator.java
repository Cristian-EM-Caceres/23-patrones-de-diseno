package Comportamiento.Mediator;

public class MainMediator {
    public static void main(String[] args) {
        // 1. Creamos la torre de control
        SalaChatSoporte sala = new SalaChatSoporte();

        // 2. Creamos los colegas pasándoles su mediador
        Usuario Martin = new ClienteSoporte(sala, "Martin");
        Usuario tecnico1 = new ClienteSoporte(sala, "Técnico Juan");
        Usuario tecnico2 = new ClienteSoporte(sala, "Técnico Ana");

        // 3. Registramos las partes en el mediador
        sala.registrarUsuario(Martin);
        sala.registrarUsuario(tecnico1);
        sala.registrarUsuario(tecnico2);

        // 4. Comienza la interacción
        // Esteban no sabe quiénes son Juan ni Ana. El mediador hace la ruta.
        Martin.enviar("Hola, no puedo levantar el contenedor de Docker.");
    }
}
