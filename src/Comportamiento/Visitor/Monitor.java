package Comportamiento.Visitor;

public class Monitor implements ComponenteHardware {
    public int getPulgadas() { return 27; }
    public double getPesoKg() { return 6.5; }

    @Override
    public void accept(Visitor visitante) {
        visitante.visit(this);
    }
}