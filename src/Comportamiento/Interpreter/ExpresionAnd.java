package Comportamiento.Interpreter;

class ExpresionAnd implements Expresion {
    private Expresion expresion1;
    private Expresion expresion2;

    public ExpresionAnd(Expresion expresion1, Expresion expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    @Override
    public boolean interpretar(String contexto) {
        // Se cumple solo si AMBAS ramas se cumplen
        return expresion1.interpretar(contexto) && expresion2.interpretar(contexto);
    }
}
