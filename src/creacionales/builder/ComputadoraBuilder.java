package creacionales.builder;

public class ComputadoraBuilder {
    private String procesador;
    private int ram;
    private int almacenamiento;
    private String tarjetaGrafica;

    public ComputadoraBuilder setProcesador(String procesador) {
        this.procesador = procesador;
        return this; 
    }

    public ComputadoraBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputadoraBuilder setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
        return this;
    }

    public ComputadoraBuilder setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }

    public Computadora build() {
        return new Computadora(procesador, ram, almacenamiento, tarjetaGrafica);
    }
}
