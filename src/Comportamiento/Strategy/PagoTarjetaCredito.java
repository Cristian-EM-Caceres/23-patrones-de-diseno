package Comportamiento.Strategy;

class PagoTarjetaCredito implements EstrategiaPago {
    private String numeroTarjeta;

    public PagoTarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $" + monto + " a la tarjeta terminada en " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
}
