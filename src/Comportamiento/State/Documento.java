package Comportamiento.State;

class Documento {
    private EstadoDocumento estadoActual;

    public Documento() {
        this.estadoActual = new Borrador();
    }

    public void setEstado(EstadoDocumento estado) {
        this.estadoActual = estado;
    }

    public void publicar() {
        estadoActual.publicar(this);
    }

    public void cancelar() {
        estadoActual.cancelar(this);
    }
}
