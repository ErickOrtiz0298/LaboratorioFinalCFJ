
package com.gm.mundopc;
//import com.gm.mundopc.*;  No es necesario pues están en el mismo paquete
public class Computadora {
    private  final int idComputadora; 
    private String nombre; 
    private Monitor monitor; //Relacion de agregación cuando usamos otras clases en nuestra clase actual
    private Teclado teclado; //Relacion de agregación 
    private Raton raton; //Relacion de agregación 
    private static int contadorComputadoras;
    //Directamente la clase computaddora no va a interactuar con la clase Dispositivo de Entrada
    private Computadora () {
        this.idComputadora =++Computadora.contadorComputadoras;
    
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) { //Recibiendo el nombre y cada uno de los objetos
       this(); //inicializando el id computadora
       this.nombre = nombre; 
       this.monitor = monitor; 
       this.teclado = teclado; 
       this.raton = raton; 
       
    }

    @Override
    public String toString() { //cuando mandamos a imprimir cada objeto de tipo computadora cada uno (en verde) manda a llamar su propio metodo toString para imprimir su propia información
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", nombre=").append(nombre);
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append('}');
        return sb.toString();
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

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    
    
}
