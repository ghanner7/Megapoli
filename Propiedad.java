package megapoli;

import java.util.Scanner;

/**
 * CLASE DE LA QUE HEREDAN TODAS LAS CASILLAS QUE SE PUEDEN COMPRAR
 */
public abstract class Propiedad extends Casilla {

    private final int pCompra;
    private int alquiler;
    private Jugador propietario;   // <-- mejor privado, con getter/setter

    public Propiedad(int numero, String nombre, int pCompra, int alquiler) {
        super(numero, nombre);
        this.pCompra = pCompra;
        this.alquiler = alquiler;
        this.propietario = null;
    }

    //  Getters & Setters 
    public int getpCompra() {
        return pCompra;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }
   

    /**
     * Cumple con la firma abstracta de Casilla.
     * Simplemente delega a la versión que recibe un Scanner.
     * @param jugador
     */
    @Override
    public void action(Jugador jugador) {
        // En la práctica, el Scanner debería venir del main.
        // Aquí lo creamos solo para que el proyecto compile.
        try (Scanner sc = new Scanner(System.in)) {
            action(jugador, sc);
        }
    }

    /**
     * Lógica completa de compra/alquiler.
     * Se llama desde {@link #action(Jugador)} o directamente desde el juego
     * si ya dispones de un Scanner reutilizable.
     */
    public void action(Jugador jugador, Scanner sc) {
        if (propietario == null) {                     // si no tiene propietario
            System.out.println(jugador.getNombre()
                    + " ha caído en " + getNombre()
                    + ". Está en venta por " + pCompra + " monedas.");
            System.out.print("¿Quieres comprarla? (s/n): ");
            String respuesta = sc.nextLine().trim().toLowerCase();

            if ("s".equals(respuesta) && jugador.pagar(pCompra)) {
                setPropietario(jugador);
                System.out.println(jugador.getNombre()
                        + " ha comprado " + getNombre() + ".");
            } else {
                System.out.println("No tienes suficiente dinero para comprar "
                        + getNombre() + ".");
            }
        } else if (!propietario.equals(jugador)) {     // si el propietario es distinto a jugador
            System.out.println(jugador.getNombre()
                    + " ha caído en la casilla de " + propietario.getNombre()
                    + " y debe pagar un alquiler de " + alquiler + " €.");
            if (jugador.pagar(alquiler)) {
                propietario.cobrar(alquiler);
                System.out.println(jugador.getNombre()
                        + " ha pagado el alquiler.");
            } else {
                System.out.println(jugador.getNombre()
                        + " no tiene suficiente dinero para pagar el alquiler.");
            }
        } else {                                        // es su propia propiedad
            System.out.println(jugador.getNombre()
                    + " Esta casilla es tuya.");
        }
    }
}