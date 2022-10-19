
package com.gm.mundopc;
//import com.gm.mundopc.*; No es necesario
public class Orden {
    private final int idOrden; 
    private Computadora computadoras[] ; //objeto uwu y arreglo
    private static int contadorOrdenes;    
    private static final int MAX_COMPUTADORAS = 10 ; 
    //NECESITAMOS UNA VARIABLE PARA SABER CUANTOS OBJETOS DE TIPO COMPUTADORA SE HAN AGREGADO A NUESTRO ARREGLO
    //NECSITAMOS SABER CUANTOS OBJETOS SE HAN AGREGADO AL ARREGLO
    private int contadorComputadoras; 
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras =  new Computadora[Orden.MAX_COMPUTADORAS];
           
    
    }
    //metodo 
    //para agregar una nueva computadora al arreglo
    public void agregarComputadora(Computadora computadoras) {
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadoras;//se asigna el valor y luego se aumenta. IMPORTANTE para el INDICE en el arreglo
            
        }
        else {
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }
        
    
    }
    
    public void mostrarOrden() {
        
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Computadoras de la orden #: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) { //Esto intera cuantos objetos hemos agregado a nuestro arreglo por eso no usamos el max
            System.out.println(this.computadoras[i]);         
        }
        
    } 
    
}
