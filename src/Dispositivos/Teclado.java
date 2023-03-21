package Dispositivos;

public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;

//    public Teclado() {
//        super("tipoEntrada", "marca");
//        idTeclado = ++Teclado.contadorTeclados;
//    }

    public Teclado(String tipoEntrada, String marca) {
        super("tipoEntrada", "marca");
        this.idTeclado = ++Teclado.contadorTeclados;
        
//        this.idTeclado = idTeclado;
//        this.contadorTeclados = contadorTeclados;

    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado= " + idTeclado + ",  =" + super.toString() + '}';
    }

}
