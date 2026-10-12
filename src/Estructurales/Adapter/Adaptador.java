package Estructurales.Adapter;

public class Adaptador implements EnchufeEuropeo {
    private EnchufeAmericano enchufeForaneo;

    public Adaptador(EnchufeAmericano enchufeForaneo) {
        this.enchufeForaneo = enchufeForaneo;
    }

    @Override
    public String conectar() {
        return enchufeForaneo.conectar110v() + ", adaptado para 220V";
    }
}