/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoli;

/**
 *
 * @author gany_
 */
public abstract class Casilla {  //NO HAY MOTIVO PARA INSTANCIAR
    
    protected int numero;
    protected String nombre;
   

    public Casilla( int numero,String nombre) {
        this.numero = numero;
        this.nombre = nombre;
        
    }
    
    public abstract void action(Jugador jugador);

    public int getNumero() {
        return numero;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void mostrarInfo() {
        System.out.println("Estás en la casilla nº " + numero + 
                "\n " + nombre);
    }
   
}
