/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoli;

import java.util.ArrayList;
/**
 *
 * @author gany_
 */
public class Jugador {
    
    private String nombre;
    private int dinero; 
    private int posicion;  // POSICION DEL JUGADOR
    private final  ArrayList<Casilla> propiedades;  // LISTA DE PROPIEDADES
    private boolean turno;

    public Jugador(String nombre, int dinero, int propiedades, int posicion, boolean turno) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.propiedades = new ArrayList<Casilla>();
        this.posicion = posicion;
        this.turno = turno;
    }
    
  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    public void comprarPropiedad(Casilla casilla) {
        propiedades.add(casilla);
        
    }
    
    public void mostrarPropiedades() {
        System.out.println(nombre + " tiene las siguientes propiedades:");
        for ( Casilla propiedad : propiedades) {
            System.out.println("- " + propiedad.getNombre());
        }
    }

    public int getPosicion() {
        return posicion;
    }
    

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    

    public boolean isTurno() {
        return turno;
    }
    

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    
    public void cobrar(int cantidad) {
        if (cantidad > 0) {
            dinero += cantidad;
        }
    }

    public boolean pagar(int cantidad) {
         if (puedePagar(cantidad)) {
            dinero -= cantidad;
            return true;
        } else {
            System.out.println(nombre + " no tiene suficiente dinero para pagar " + cantidad + "€.");
            return false;
        }
    }
    
    
        public boolean puedePagar(int cantidad) {
        return dinero >= cantidad;
    }
        
        

   
       
    

    @Override
     public String toString() {
        return "Jugador {" +
               " \n nombre ->" + "   ===" + nombre + "===" +
               ", \n dinero ->" + dinero +
               ", \n propiedades ->" + propiedades +
               ", \n posicion ->" + posicion +
               ", \n turno ->" + turno +
               '}';
     
    }
}
