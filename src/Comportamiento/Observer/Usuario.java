package Comportamiento.Observer;

public class Usuario implements Observador {
    private final String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió notificación: " + mensaje);
    }
}