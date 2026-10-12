package creacionales.prototype;

public class Enemigo implements Prototipo {
    private String tipo;
    private int vida;
    private int danio;

    public Enemigo(String tipo, int vida, int danio) {
        this.tipo = tipo;
        this.vida = vida;
        this.danio = danio;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    @Override
    public Prototipo clonar() {
        return new Enemigo(this.tipo, this.vida, this.danio);
    }
    public void mostrarInfo() {
        System.out.println("Enemigo [" + tipo + "] - Vida: " + vida + " - Daño: " + danio);
    }
}