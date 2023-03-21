package Dispositivos;

public class Mouse extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

        public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Mouse.contadorRatones;
        
//        this.idRaton = idRaton;
//         this.contadorRatones = contadorRatones;
    }

    @Override
    public String toString() {
        return "Mouse{" + "idRaton= " + idRaton + ", " + super.toString() + '}';
    }

}
