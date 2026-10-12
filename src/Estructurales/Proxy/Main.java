package Estructurales.Proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("foto_alta_resolucion.jpg");

        System.out.println("Imagen creada, pero aún no cargada...");
        
        // La carga real ocurre aquí por primera vez
        image.display();
        
        System.out.println("---");
        
        // Segunda llamada usa la imagen ya cargada
        image.display();
    }
}
