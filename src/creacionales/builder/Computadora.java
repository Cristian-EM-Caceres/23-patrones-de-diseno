package creacionales.builder;

public class Computadora {
    private String procesador;
    private int ram;
    private int almacenamiento;
    private String tarjetaGrafica;
    Computadora(String procesador, int ram, int almacenamiento, String tarjetaGrafica) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tarjetaGrafica = tarjetaGrafica;
    }
    @Override
    public String toString() {
        return "Computadora [" +
                "CPU='" + procesador + '\'' +
                ", RAM=" + ram + "GB" +
                ", Disco=" + almacenamiento + "GB" +
                ", GPU='" + (tarjetaGrafica != null ? tarjetaGrafica : "Integrada") + '\'' +
                ']';
    }
}