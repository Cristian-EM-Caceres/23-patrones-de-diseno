package Comportamiento.Command;

class ComandoApagarLuz implements Comando {
    private Luz luz;

    public ComandoApagarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.apagar();
    }

    @Override
    public void deshacer() {
        luz.encender(); // Lo contrario de apagar
    }
}
