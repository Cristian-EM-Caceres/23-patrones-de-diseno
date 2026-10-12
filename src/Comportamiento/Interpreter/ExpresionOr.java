package Comportamiento.Interpreter;

class ExpresionOr implements Expresion {
    private Expresion expresion1;
    private Expresion expresion2;

    public ExpresionOr(Expresion expresion1, Expresion expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    @Override
    public boolean interpretar(String contexto) {
        // Se cumple si al menos una de las ramas se cumple
        return expresion1.interpretar(contexto) || expresion2.interpretar(contexto);
    }
}
