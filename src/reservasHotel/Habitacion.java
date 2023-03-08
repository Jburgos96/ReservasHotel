/**
 * 
 */
package reservasHotel;

/**
 * Clase padre que representa la habitacion a reservar
 * 
 * @author Juan Diego Motta, Jorge Burgos
 * @version 1.1
 */

public class Habitacion {

	private int numHabitacion;
	private String estado;
	private int numCamas;
	
	/**
	 * Getter del numero de habitacion
	 * @return devuelve el numero de habitacion
	 */
	public int getNumHabitacion() {
		return numHabitacion;
	}

	/**
	 * Setter del numero de la habitacion
	 * @param numHabitacion numero de la habitacion
	 */
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	/**
	 * Getter del estado de la habitacion
	 * @return devuelve el estado de la habitacion (reservado o no)
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Setter del estado de la habitacion (si esta reservada o no)
	 * @param estado estado de la habitacion (reservada o no)
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Getter numero de camas de la habitacion
	 * @return devuelve el numero de camas de la habitacion
	 */
	public int getNumCamas() {
		return numCamas;
	}

	/**
	 * Setter del numero de camas de la habitacion
	 * @param numCamas el numero de camas de la habitacion
	 */
	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}

	
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
