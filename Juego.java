
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package megapoli;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author gany_
 */
public class Juego {

    //Constantes
    
    private static final int minJugadores = 2;
    private static final int maxJugadores = 6;
    
    

    //Método para número de jugadores

           private static int pedirNumJugadores(Scanner sc){
            int n;
            do{
                System.out.println(" ¿Cuantos jugadores sois? (" + minJugadores + "-" + maxJugadores + "): ");

            //Seguimos pidiendo hasta que nos den un entero
                while (!sc.hasNextInt()){
                    System.out.println(" ESO NO ES UN NÚMERO!!! \n Inténtalo de nuevo");
                    sc.next();  //descartamos la respuesta inválida
                }
                
                n = sc.nextInt();
                sc.nextLine();

            //Si está fuera de rango , avisamos y repetimos.
            if (n < minJugadores || n > maxJugadores){
                System.out.println(" El juego está hecho para que jueguen entre 2 y 6 jugadores");

            }
        }while(n < minJugadores || n > maxJugadores);

        return n;
    } 

        // Método para tirar dados 

         private static int tirarDados() {
        Random r = new Random();
        while (true) {
            int d1 = r.nextInt(6) + 1;
            int d2 = r.nextInt(6) + 1;
            System.out.println("Lanzamiento 1: " + d1);
            System.out.println("Lanzamiento 2: " + d2);
            if (d1 != d2) {
                return d1 + d2;             
            }
            //Devolvemos la suma
            System.out.println("¡Dobles! Tira otra vez");
        }
    }
    public static void main(String[] args) {
      
        try (Scanner sc = new Scanner(System.in)) {
                   Tablero tablero = new Tablero() {};                
                   ArrayList<Jugador> jugadores = new ArrayList<>();

                   
                   // Se pide el número de jugadores 
                   int numJugadores = pedirNumJugadores(sc);

                   
                   // Se pregunta el nombre y se crea el jugador
                   for (int i = 0; i < numJugadores; i++) {
                       System.out.print("------ ¿Cómo te llamas? ------: ");
                       String nombre = sc.nextLine();
                       Jugador j = new Jugador(nombre, 1500, 0, 0, true);
                       jugadores.add(j);
                   }

                   
                        // Se muestra la lista de jugadores 
                   System.out.println("\nLos jugadores de esta partida son:\n");
                   for (int i = 0; i < jugadores.size(); i++) {
                       System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
                   }

                   
                        // Se elige quién empieza aleatoriamente
                   Random rnd = new Random();
                   int empieza = rnd.nextInt(numJugadores);
                   for (Jugador jugador : jugadores) {
                       jugador.setTurno(false);
                   }
                   jugadores.get(empieza).setTurno(true);
                   Jugador jActual = jugadores.get(empieza);
                   System.out.println(jActual.getNombre() + " es el primero en jugar!");

                   
                   
                   // <<<<<<<<<<<<<<<<<<<< ---  BUCLE DEL JUEGO --- >>>>>>>>>>>>>>>>>>>>>>>
                   
                   System.out.println("\n¡COMIENZA EL JUEGO!");
                   boolean juegoActivo = true;
                   int turno = empieza;

                   
                   while (juegoActivo) {
                       // Se comprueba a cada turno si el jugador actual está en Bancarrota
                       if (jActual.getDinero() <= 0) {
                           System.out.println("\n" + jActual.getNombre() + " está en bancarrota.");
                           turno = (turno + 1) % jugadores.size();
                           jActual = jugadores.get(turno);
                           continue;
                       }

                       System.out.println("\nTurno de " + jActual);
                       int dados = tirarDados();

                       
                       // Movimiento del jugador
                       int nuevaPosicion = jActual.getPosicion() + dados;
                       if (nuevaPosicion >= 39) {
                           nuevaPosicion -= 39;
                           jActual.setDinero(jActual.getDinero() + 200);
                           System.out.println("¡Pasaste por la salida! Cobras " + 200 + " Megamonedas");
                       }
                       jActual.setPosicion(nuevaPosicion);
                       Casilla casillaActual = tablero.getCasillas().get(nuevaPosicion);
                       casillaActual.mostrarInfo();
                       casillaActual.action(jActual);

                       
                       // Se comprueba que haya suficientes jugadores para continuar
                       int activos = 0;
                       for (Jugador j : jugadores) {
                           if (j.getDinero() > 0) activos++;
                       }
                       if (activos <= 1) {
                           juegoActivo = false;
                           System.out.println("¡El juego ha terminado!");
                           break;
                       }

                       
                       // Se pasa el turno al siguiente jugador 
                       jActual.setTurno(false);
                       turno = (turno + 1) % jugadores.size();
                       jActual = jugadores.get(turno);
                       jActual.setTurno(true);
                   }
               } // el Scanner se cierra automáticamente
           }
       }