package Comportamiento.Visitor;

public interface ComponenteHardware {
    // La única puerta de entrada genérica para cualquier visitante futuro
    void accept(Visitor visitante);
}
