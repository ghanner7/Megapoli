package megapoli;

/**
 *
 * La clase calle hereda todos los métodos de propiedad a los que quedan por añadir :
 * -  Construcción de casas y hoteles cuando se posean las 3 calles del mismo color
 */
public abstract class Calle extends Propiedad {

    public Calle(int numero, String nombre, int pCompra, int alquiler) {
        super( numero, nombre, pCompra, alquiler );    
    }

}
   
