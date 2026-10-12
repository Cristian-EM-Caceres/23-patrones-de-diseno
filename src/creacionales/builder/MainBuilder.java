package creacionales.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Computadora pcOficina = new ComputadoraBuilder()
                .setProcesador("Intel i3")
                .setRam(8)
                .setAlmacenamiento(256)
                .build();

        Computadora pcGamer = new ComputadoraBuilder()
                .setProcesador("Ryzen 7")
                .setRam(32)
                .setAlmacenamiento(1000)
                .setTarjetaGrafica("RTX 4070")
                .build();

        System.out.println(pcOficina);
        System.out.println(pcGamer);
    }
}