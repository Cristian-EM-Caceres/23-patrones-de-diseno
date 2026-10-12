package Estructurales.Adapter;

public class ClienteAdapter {
    public static void main(String[] args) {
        EnchufeAmericano americano = new EnchufeAmericano();
        EnchufeEuropeo adaptador = new Adaptador(americano);       
        System.out.println(adaptador.conectar()); 
    }
}
