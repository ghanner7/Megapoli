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
public abstract class Tablero {
    
     private ArrayList<Casilla> casillas;
     
     public Tablero(){
         
    casillas = new ArrayList<>();
    inicializarCasillas();
     }
     
     
 private void inicializarCasillas() {
       casillas.add(new Calle( 1, "Salida", 100, 50) {
           @Override
           public void action(Jugador jugador) {
               System.out.println("Has caido en Salida!!!");
           }
       });       
       casillas.add(new Calle(2,"Ronda de Valencia",60, 30) {
           @Override
           public void action(Jugador jugador) {
        // Usa la lógica heredada de Propiedad
        super.action(jugador);   // <-- llama a Propiedad.action(Jugador)
    }
       });
       casillas.add(new CajaComunidad(3, "Caja de comunidad"));
       casillas.add(new Calle(4, "Lavapies", 60, 30) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Impuesto(5, "impuesto de la iglesia"));
       casillas.add(new Fuente(6, "pilon de villafranca",200,30) {
           @Override
          public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Calle(7, "Glorieta Cuatro Caminos",100,30) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Suerte(8, "Suerte"));
       casillas.add(new Calle(9, "Avenida Reina Victoria",100, 50) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Calle(10, "Bravo Murillo",120 ,50) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Pozo(11, "calle x"));
       casillas.add(new Calle(12, "Glorieta de Bilbao", 140, 50) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Impuesto(13, "iglesia"));
       casillas.add(new Calle(14, "calle x", 140, 50) {
           @Override
          public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Calle(15, "Suerte", 160, 50) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Fuente(16, "pilon de piedrahita", 200, 50) {
           @Override
          public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Calle(17, "calle x", 180, 50) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new CajaComunidad(18, "calle x"));
       casillas.add(new Calle(19, "calle x", 180, 50) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Calle(20, "calle x",200, 50) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Parking(21, "calle x"));
       casillas.add(new Calle(22, "calle x", 220, 70) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Suerte(23, "calle x"));
       casillas.add(new Calle(24, "calle x", 220, 70) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Calle(25, "calle x", 240, 70) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Fuente(26, "mirona", 200, 50) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Calle(27, "calle x", 260, 70) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Calle(28, "calle x", 260, 70) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Impuesto(29, "calle x"));
       casillas.add(new Calle(30, "calle x", 200, 70) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Pozo (31, "Pozo"));
       casillas.add(new Calle(32, "calle x", 300, 100) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Calle(33, "calle x", 300, 100) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new CajaComunidad(34, "Caja de comunidad"));
       casillas.add(new Calle(35, "calle x", 320, 100) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Fuente(36, "de la mora", 200, 50) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Suerte(37, "Suerteeeee"));
       casillas.add(new Calle(38, "calle x", 350, 100) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
       casillas.add(new Impuesto(39, "castillo"));
       casillas.add(new Calle(40, "calle x", 400, 100) {
           @Override
           public void action(Jugador jugador) {
        super.action(jugador);   
    }
       });
    }




        
    public Casilla getCasilla(int numero, String nombre){
        if (numero >= 0 && numero < casillas.size()) {
            return casillas.get(numero) ;
        }
        return null;
    }
    
    public void mostrarTablero() {
        for (Casilla casilla : casillas) {
            System.out.println("Casilla " + casilla.getNumero() + " - " + casilla.getNombre());
        }
   
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    /**
     *
     * @param casillas
     */
    public void setCasillas(ArrayList<Casilla> casillas) {
        this.casillas = casillas;
    }
    
}