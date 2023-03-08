/**
 * 
 */
package reservasHotel;

/**
 * Clase que representa el tipo de habitacion doble
 * @author Juan Diego Motta, Jorge Burgos
 *
 */
public class Doble extends Habitacion {
	
	private boolean minibar;
	
	/**
	 * Constructor con parametros del tipo de habitacion Doble
	 * @param numHabitacion numero de habitacion
	 * @param estado estado de la habitacion (alquilado o no)
	 * @param numCamas numero de camas
	 * @param minibar si tiene minibar o no
	 */
	public Doble(int numHabitacion, String estado, int numCamas, boolean minibar) {
		super(numHabitacion, estado, numCamas);
		this.minibar = minibar;
	}
	/**
	 * Getter de si la habitacion Doble tiene minibar o no
	 * @return devuelve true o false en función de si tiene minibar o no
	 */
	public boolean isMinibar() {
		return minibar;
	}
	/**
	 * Setter de si la habitacion tiene minibar o no
	 * @param minibar boolean que devuelve si tiene minibar o no
	 */
	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}
	/**
	 * Metodo que calcula los descuentos
	 */
	public void calculoDescuentos() {
		
		
	}
}
