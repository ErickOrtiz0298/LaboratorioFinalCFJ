
package com.gm.mundopc;
import com.gm.mundopc.*; 

public class Monitor {
    private final int idMonitor; //identificador unico por cada objeto monitor que creemos
    private String marca; 
    private double tamanio; 
    private static int contadorMonitores; 
    
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamanio) {
        this(); //mandando a llamar primero el constructor vacio y luego podemos inicializar la marca y el tamaño
        this.marca = marca; 
        this.tamanio = tamanio;   
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamanio=").append(tamanio);
        sb.append(", ").append(super.toString());//para imprimir el toString de la clase Dispositivo de Entrada
        sb.append('}');
        return sb.toString();
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamaño) {
        this.tamanio = tamaño;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setContadorMonitores(int contadorMonitores) {
        this.contadorMonitores = contadorMonitores;
    }

    
    
    
}
