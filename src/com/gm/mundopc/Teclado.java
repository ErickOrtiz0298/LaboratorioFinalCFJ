
package com.gm.mundopc;


public class Teclado extends DispositivoEntrada {
    //atributos 
    private int idTeclado; 
    private static int contadorTeclados; 
    
    public Teclado(String Entrada, String marca) {
        super(Entrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(", ").append(super.toString()); //para imprimir el toString de la clase Dispositivo de Entrada
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
