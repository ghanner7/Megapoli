/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoli;

/**
 *
 * @author gany_
 */
public class CajaComunidad extends Casilla{
    
    public CajaComunidad(int numero, String nombre){
        
        super(numero, nombre);
        
        String[] cartas = new String[40]; 
    }

    
    
    @Override
    public void mostrarInfo() {
        System.out.println("Has caído en una casilla de comunidad: " + getNombre());
    }
    
    
    
    
    @Override
    public void action(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   
    
    
}
