package Comportamiento.Visitor;

import java.util.ArrayList;
import java.util.List;

public class MainVisitor {
    public static void main(String[] args) {
        List<ComponenteHardware> carrito = new ArrayList<>();
        carrito.add(new Procesador());
        carrito.add(new Monitor());

        // Llamamos al experto en logística
        CostoEnvioVisitor calculadorEnvio = new CostoEnvioVisitor();

        // El experto visita todos los elementos del carrito
        for (ComponenteHardware item : carrito) {
            item.accept(calculadorEnvio);
        }

        System.out.println("Costo total de envío: $" + calculadorEnvio.getCostoTotal());
    }
}
