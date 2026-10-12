package Comportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

public class Canal {
    private final List<Observador> subscriptores = new ArrayList<>();

    public void suscribir(Observador o) {
        subscriptores.add(o);
    }

    public void desuscribir(Observador o) {
        subscriptores.remove(o);
    }

    public void publicarNuevoVideo(String titulo) {
        System.out.println("Canal publicó: " + titulo);
        for (Observador o : subscriptores) {
            o.actualizar(titulo);
        }
    }
}