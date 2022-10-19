
package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private final int idRaton ; //pertenece a objetos tipo ratón No puede estar en teclados
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca) { //la clase padre tiene un constructor de dos argumetnos por lo cual debemos mandar a llamar ese construtor igual.
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
