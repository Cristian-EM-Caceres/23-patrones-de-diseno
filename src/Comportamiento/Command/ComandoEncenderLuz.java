package Comportamiento.Command;

class ComandoEncenderLuz implements Comando {
    private Luz luz;

    public ComandoEncenderLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }

    @Override
    public void deshacer() {
        luz.apagar(); // Lo contrario de encender
    }
}
