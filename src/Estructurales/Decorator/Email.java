package Estructurales.Decorator;

public class Email implements Notificacion {
    @Override
    public void enviar() { 
        System.out.print("Enviando Email"); 
    }
}