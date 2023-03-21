package Dispositivos;

import Dispositivos.*;

public class OrdenPedido {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUS = 3;

    public OrdenPedido() {
        this.idOrden = ++OrdenPedido.contadorOrdenes;
        this.computadoras = new Computadora[OrdenPedido.MAX_COMPUS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < OrdenPedido.MAX_COMPUS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Has superado el limite = " + OrdenPedido.MAX_COMPUS);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden # = " + this.idOrden);
        System.out.println("Computadoras de la orden # = " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
