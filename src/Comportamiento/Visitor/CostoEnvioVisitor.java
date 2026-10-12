package Comportamiento.Visitor;

public class CostoEnvioVisitor implements Visitor {
    private double costoTotal = 0;

    @Override
    public void visit(Procesador procesador) {
        System.out.println("Calculando envío del procesador " + procesador.getModelo());
        // El procesador es pequeño, tarifa plana barata
        costoTotal += 500.0; 
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Calculando envío del monitor de " + monitor.getPulgadas() + "\"");
        // El monitor pesa, calculamos por kilo
        costoTotal += monitor.getPesoKg() * 150.0;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
}
