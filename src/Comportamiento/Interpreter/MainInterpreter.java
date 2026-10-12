package Comportamiento.Interpreter;

public class MainInterpreter {
    
    // Método auxiliar para armar la regla: "Java AND Spring"
    public static Expresion obtenerReglaBackend() {
        Expresion java = new ExpresionTerminal("Java");
        Expresion spring = new ExpresionTerminal("Spring");
        return new ExpresionAnd(java, spring); // Árbol: AND(Java, Spring)
    }

    // Método auxiliar para armar la regla: "Python OR C"
    public static Expresion obtenerReglaScripts() {
        Expresion python = new ExpresionTerminal("Python");
        Expresion c = new ExpresionTerminal("C");
        return new ExpresionOr(python, c); // Árbol: OR(Python, C)
    }

    public static void main(String[] args) {
        Expresion reglaBackend = obtenerReglaBackend();
        Expresion reglaScripts = obtenerReglaScripts();

        // Los currículums que vamos a evaluar (El Contexto)
        String candidato1 = "Desarrollador con experiencia en Java y Spring Boot.";
        String candidato2 = "Programador de sistemas en C y Rust.";
        String candidato3 = "Conozco Java pero uso Node.js.";

        // Evaluando al Candidato 1
        System.out.println("¿Candidato 1 es Backend? " + reglaBackend.interpretar(candidato1)); 
        // true (Tiene Java Y Spring)

        // Evaluando al Candidato 2
        System.out.println("¿Candidato 2 hace Scripts? " + reglaScripts.interpretar(candidato2)); 
        // true (Tiene C, cumple el OR)

        // Evaluando al Candidato 3
        System.out.println("¿Candidato 3 es Backend? " + reglaBackend.interpretar(candidato3)); 
        // false (Tiene Java, pero le falta Spring)
    }
}
