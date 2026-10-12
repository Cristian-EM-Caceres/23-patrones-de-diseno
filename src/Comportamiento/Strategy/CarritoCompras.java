package Comportamiento.Strategy;

class CarritoCompras {
    private EstrategiaPago estrategia;

    public void setEstrategia(EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }

    public void hacerCheckout(double total) {
        if (estrategia == null) {
            System.out.println("Por favor, seleccione un método de pago.");
            return;
        }
        estrategia.procesarPago(total);
    }
}
