package Comportamiento.Command;

class ControlRemoto {
    private Comando comandoAsignado;
    private Comando ultimoComando; // Para la función deshacer

    public void setComando(Comando comando) {
        this.comandoAsignado = comando;
    }

    public void presionarBoton() {
        if (comandoAsignado != null) {
            comandoAsignado.ejecutar();
            ultimoComando = comandoAsignado; // Guardamos el historial
        }
    }

    public void presionarDeshacer() {
        if (ultimoComando != null) {
            System.out.print("Deshaciendo acción... ");
            ultimoComando.deshacer();
        }
    }
}
