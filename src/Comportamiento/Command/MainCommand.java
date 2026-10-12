package Comportamiento.Command;

public class MainCommand {
    public static void main(String[] args) {
        // 1. Creamos el receptor
        Luz miLuz = new Luz();

        // 2. Creamos los comandos y les pasamos el receptor
        Comando encender = new ComandoEncenderLuz(miLuz);
        Comando apagar = new ComandoApagarLuz(miLuz);

        // 3. Creamos el invocador
        ControlRemoto control = new ControlRemoto();

        // --- Simulamos el uso ---
        
        // Configuramos el botón para encender y lo presionamos
        control.setComando(encender);
        control.presionarBoton(); // Lámpara: Encendida 💡

        // Configuramos el botón para apagar y lo presionamos
        control.setComando(apagar);
        control.presionarBoton(); // Lámpara: Apagada 🌑

        // ¡Magia del patrón Command: Deshacer!
        control.presionarDeshacer(); // Deshaciendo acción... Lámpara: Encendida 💡
    }
}
