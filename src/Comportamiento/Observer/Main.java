package Comportamiento.Observer;

public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal();

        Observador ana = new Usuario("Ana");
        Observador carlos = new Usuario("Carlos");

        canal.suscribir(ana);
        canal.suscribir(carlos);

        canal.publicarNuevoVideo("Curso de Java en 10 minutos");
    }
}