
package com.gm.mundopc;

public class DispositivoEntrada {
    private String tipoEntrada; 
    private String marca; 
    
    //Constructor
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada; 
        this.marca = marca; 
    
    }
    // metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{");
        sb.append("tipoEntrada=").append(tipoEntrada);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
    
    //get y set 

    public String gettipoEntrada() {
        return this.tipoEntrada;
    }

    public void settipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
