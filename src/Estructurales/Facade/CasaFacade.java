package Estructurales.Facade;

public class CasaFacade {
    private Luces luces;
    private AireAcondicionado aire;

    public CasaFacade() {
        this.luces = new Luces();
        this.aire = new AireAcondicionado();
    }
    public void activarModoNoche() {
        System.out.println("Iniciando Modo Noche...");
        luces.encender();
        aire.prenderFrio();
    }
}
