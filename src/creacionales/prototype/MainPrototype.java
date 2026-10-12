package creacionales.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        
        Enemigo orcoBase = new Enemigo("Orco Guerrero", 100, 25);

        Enemigo orco1 = (Enemigo) orcoBase.clonar();
        Enemigo orco2 = (Enemigo) orcoBase.clonar();
        orco2.setVida(50); 
        System.out.println("--- Prototipo Base ---");
        orcoBase.mostrarInfo();

        System.out.println("--- Clones en el juego ---");
        orco1.mostrarInfo();
        orco2.mostrarInfo();
    }
}