package Dispositivos;

import Dispositivos.*;

public class Computadora{
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse raton;
    private static int contadorComputadora;

    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadora;
    }
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }
        
     @Override
    public String toString() {
        return "Computadora{" + "nombre= " + nombre + ", monitor= " +
                monitor + ", teclado= " + teclado + ", raton= " + raton + '}';
    }
    

    
}
