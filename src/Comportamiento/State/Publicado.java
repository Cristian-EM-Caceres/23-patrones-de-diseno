package Comportamiento.State;

class Publicado implements EstadoDocumento {
    @Override
    public void publicar(Documento doc) {
        System.out.println("El documento ya está publicado. No se hace nada.");
    }

    @Override
    public void cancelar(Documento doc) {
        System.out.println("Documento retirado del público. Vuelve a borrador.");
        doc.setEstado(new Borrador()); // Transición de estado
    }
}
