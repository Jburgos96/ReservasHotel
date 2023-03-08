/**
 * 
 */
package reservasHotel;

/**
 * Clase padre que representa la habitacion a reservar
 * 
 * @author Juan Diego Motta, Jorge Burgos
 * @version 1.0
 */

public class Habitacion {

	private int numHabitacion;
	private String estado;
	private int numCamas;
	
	/**
	 * Constructor de la clase Habitacion con parametros
	 * 
	 * @param numHabitacion numero unico de la habitacion
	 * @param estado refleja si la habitacion esta reservada o no
	 * @param numCamas numero de camas de la habitacion
	 */
	public Habitacion(int numHabitacion, String estado, int numCamas) {
		this.numHabitacion = numHabitacion;
		this.estado = estado;
		this.numCamas = numCamas;
	}
	
	
}
