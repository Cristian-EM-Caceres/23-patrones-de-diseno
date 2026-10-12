package Comportamiento.State;
interface EstadoDocumento {
    void publicar(Documento doc);
    void cancelar(Documento doc);
}