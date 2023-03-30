package test;

import Dispositivos.*;

public class TestPcs {
    public static void main(String[] args) {
        
        Monitor Hp = new Monitor("Hp", 20);
        Mouse ratonHp = new Mouse("Bluetooth","Hp");
        Teclado tecladoHp = new Teclado("Bluetooth", "Hp");
        Computadora NeetHp = new Computadora("NeetHp 1.0", Hp, tecladoHp, ratonHp);
       
        Monitor moniGamer = new Monitor("Gamer", 50);
        Mouse ratGamer = new Mouse("cable","Gamer");
        Teclado teclGamer = new Teclado("Bluetooth", "grassd");
        Computadora gameer = new Computadora("GamerStack", moniGamer, teclGamer, ratGamer);

        Monitor samsungMonitor = new Monitor("Samsung", 20);
        Mouse samsungRaton = new Mouse("Bluetooth","Logitech");
        Teclado samsungTeclado = new Teclado("Cable", "Logitech");
        Computadora samsung = new Computadora("Samsun 1.5", samsungMonitor, samsungTeclado, samsungRaton);
       
        Monitor sonyMonitor = new Monitor("Sony", 80);
        Mouse sonyRaton = new Mouse("cable","Sony");
        Teclado sonyTeclado = new Teclado("Cable", "Sony");
        Computadora sony = new Computadora("Sony 2.0", sonyMonitor, sonyTeclado, sonyRaton);
        
        Monitor lenovoMonitor = new Monitor("lenovo", 30);
        Mouse lenovoRaton = new Mouse("cable","lenovo");
        Teclado lenovoTeclado = new Teclado("Cable", "lenovo");
        Computadora lenovo = new Computadora("lenovo 2.0", lenovoMonitor, lenovoTeclado, lenovoRaton);
        
        OrdenPedido orden1 = new OrdenPedido();
        orden1.agregarComputadora(NeetHp);
        orden1.agregarComputadora(gameer);
        orden1.agregarComputadora(samsung);
        orden1.agregarComputadora(sony);
        orden1.agregarComputadora(lenovo);

        orden1.mostrarOrden();
    }
    
    
}
