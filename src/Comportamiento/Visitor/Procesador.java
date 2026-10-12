package Comportamiento.Visitor;

public class Procesador implements ComponenteHardware {
    public double getFrecuencia() { return 4.5; }
    public String getModelo() { return "Intel i7"; }

    @Override
    public void accept(Visitor visitante) {
        // "Me paso a mí mismo al visitante para que sepa qué soy"
        visitante.visit(this);
    }
}