package Comportamiento.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        
        carrito.setEstrategia(new PagoTarjetaCredito("1234567890123456"));
        carrito.hacerCheckout(150.75);
        
        carrito.setEstrategia(new PagoPayPal("usuario@correo.com"));
        carrito.hacerCheckout(89.99);
    }
}
