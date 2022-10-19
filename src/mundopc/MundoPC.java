
package mundopc;
import com.gm.mundopc.*; //Se importa cuando no esta en el mismo paquete

public class MundoPC {
    public static void main(String[] args) {
        
        //Lo primero es crear objetos de tipo ratón, teclado, monitor y luego objetos de tipo computadora
        //Una vez creados los objetos de tipo computadora los podemos agregar a un objeto de tipo ORDEN 
        //Los objetos de tipo orden son arreglos de objetos de tipo computadora :) 
        
        //Creando el objeto de tipo monitor
        Monitor monitorHP = new Monitor("HP", 13);
        //Creando el objeto de tipo teclado
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        //Creando el objeto de tipo raton
        Raton ratonHP = new Raton("bluetooth", "HP");
        
        //Con los objetos anteriores ya podemos crear objetos de tipo Computadora
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP); //Aqui se pone en uso la RELACION DE AGREGACION!!!
        
        //Creando un segundo objeto computadora. 
        
                //Creando el objeto de tipo monitor
        Monitor monitorGamer = new Monitor("Gamer", 34);
        //Creando el objeto de tipo teclado
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        //Creando el objeto de tipo raton
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        
        //Con los objetos anteriores ya podemos crear objetos de tipo Computadora
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoHP, ratonGamer); //Aqui se pone en uso la RELACION DE AGREGACION!!!
        
        //Creando al final un objeto de tipo Orden
        
        Orden orden1 = new Orden(); 
        orden1.agregarComputadora(computadoraHP);//Aquí usamos el metodo para agregar nuestras computadoras al arreglo de orden
        orden1.agregarComputadora(computadoraGamer);
        
        //Mostramos la orden
        orden1.mostrarOrden();
        
    }
    
}
