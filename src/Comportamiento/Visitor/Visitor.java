package Comportamiento.Visitor;

public interface Visitor {
    // Un método sobrecargado por cada tipo de elemento que existe
    void visit(Procesador procesador);
    void visit(Monitor monitor);
}
