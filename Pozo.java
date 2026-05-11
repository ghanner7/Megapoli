/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoli;

/**
 *
 * @author gany_
 */
public class Pozo extends Casilla{
    
    public Pozo(int numero, String nombre){
        super(numero, nombre);
        
        String descripcion = "Te has caído en el pozo!! \n"
                + "Encuentra las escaleras o reza por tu vida";
    }

  
    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*public String getDescripcion();
    return descripcion;*/

    
    
    @Override
    public void mostrarInfo() {
        System.out.println("Te has caido en el pozo... " + getNombre());
    }
    
    
    
    @Override
    public void action(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
