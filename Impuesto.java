/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoli;

/**
 *
 * @author gany_
 */
public class Impuesto extends Casilla {
    
    public Impuesto (int numero, String nombre){
        
        super( numero, nombre);
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Te toca pagar impuesto: " + getNombre());
    }
    @Override
    public void action(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
