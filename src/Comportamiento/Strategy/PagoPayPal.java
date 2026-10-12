package Comportamiento.Strategy;

class PagoPayPal implements EstrategiaPago {
    private String email;

    public PagoPayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $" + monto + " a la cuenta PayPal: " + email);
    }
}
