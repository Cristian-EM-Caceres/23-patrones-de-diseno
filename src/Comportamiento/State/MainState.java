package Comportamiento.State;

public class MainState {
    public static void main(String[] args) {
        Documento doc = new Documento();
        
        doc.publicar(); 
        doc.publicar(); 
        doc.publicar(); 
        doc.cancelar();
    }
}