package Comportamiento.Interpreter;

class ExpresionTerminal implements Expresion {
    private String dato;

    public ExpresionTerminal(String dato) {
        this.dato = dato;
    }

    @Override
    public boolean interpretar(String contexto) {
        // Retorna true si la palabra existe en el currículum
        return contexto.contains(dato);
    }
}
