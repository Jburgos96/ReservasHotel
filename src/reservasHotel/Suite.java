/**
 * 
 */
package reservasHotel;

/**
 * @author Juan Diego Motta, Jorge Burgos
 *
 */
public class Suite extends Habitacion {

	private double metros;
	private String servicios;
	
	/**
	 * Getter de los metros cuadrados de la habitacion
	 * @return devuelve los metros cuadrados de la habitacion
	 */
	public double getMetros() {
		return metros;
	}
	/**
	 * Setter de los metros cuadrados de la habitacion
	 * @param metros metros cuadrados de la habitacion
	 */
	public void setMetros(double metros) {
		this.metros = metros;
	}
	/**
	 * Getter de los servicios de la habitacion
	 * @return servicios de la habitacion
	 */
	public String getServicios() {
		return servicios;
	}
	/**
	 * Setter de los servicios de la habitacion
	 * @param servicios servicios de la habitacion
	 */
	public void setServicios(String servicios) {
		this.servicios = servicios;
	}
	
	/**
	 * Constructor con parametros del tipo de habitacion suite
	 * @param numHabitacion numero de la habitacion 
	 * @param estado estado de la habitacion (reservado o no)
	 * @param numCamas numero de camas de la habitacion
	 * @param metros metros cuadrados de la habitacion
	 * @param servicios servicios de la habitacion
	 */
	public Suite(int numHabitacion, String estado, int numCamas, double metros, string servicios) {
		super(numHabitacion, estado, numCamas);
		this.metros = metros;
		this.servicios = servicios;
	}
	/**
	 * Metodo que calcula los gastos de la habitacion
	 */
	public void calculoGastos() {
		
	}
}
