package Comportamiento.State;

class Borrador implements EstadoDocumento {
    @Override
    public void publicar(Documento doc) {
        System.out.println("Documento enviado a revisión.");
        doc.setEstado(new EnRevision());
    }

    @Override
    public void cancelar(Documento doc) {
        System.out.println("El borrador ha sido descartado.");
    }
}