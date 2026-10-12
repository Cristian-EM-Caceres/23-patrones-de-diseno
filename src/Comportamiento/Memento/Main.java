package Comportamiento.Memento;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Stack<Memento> historial = new Stack<>();

        editor.setTexto("Hola");
        historial.push(editor.guardar());

        editor.setTexto("Hola Mundo");
        historial.push(editor.guardar());

        editor.setTexto("Hola Mundo!!!");
        System.out.println("Texto actual: " + editor.getTexto());

        // Deshacer cambios
        editor.restaurar(historial.pop());
        System.out.println("Deshacer 1: " + editor.getTexto());

        editor.restaurar(historial.pop());
        System.out.println("Deshacer 2: " + editor.getTexto());
    }
}
