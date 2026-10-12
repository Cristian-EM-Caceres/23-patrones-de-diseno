package Estructurales.Decorator;

public class DecoradorSMS implements Notificacion {
    private Notificacion objetoEnvuelto;
    
    public DecoradorSMS(Notificacion objeto) { 
        this.objetoEnvuelto = objeto; 
    }
    
    @Override
    public void enviar() {
        objetoEnvuelto.enviar();        
        System.out.print(" + Envío SMS");  
    }
}
