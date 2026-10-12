package Estructurales.Decorator;

public class Main {
    public static void main(String[] args) {
        Notificacion alerta = new Email();
        alerta = new DecoradorSMS(alerta); 
        alerta.enviar(); 
    }
}
