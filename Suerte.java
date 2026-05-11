/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoli;

/**
 *
 * @author gany_
 */
public class Suerte extends Casilla {
   
     public Suerte(int numero, String nombre){
        
         super(numero, nombre);
      
         
        String[] cartas = new String[20];        
         /*  for (int i=0; i<40; i++){
               cartas[i] = " ";
           }*/
           
     }

    @Override
    public void action(Jugador jugador) {
        System.out.println(jugador.getNombre() + " coje una carta de Suerte (por implementar)");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Has caído en una casilla de Suerte: " + getNombre());
    }
}
