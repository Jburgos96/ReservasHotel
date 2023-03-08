/**
 * 
 */
package reservasHotel;

/**
 * Clase que representa un cliente que va a realizar una reserva en el hotel
 * 
 * @author Juan Diego Motta, Jorge Burgos
 * @version 1.0
 */
public class Cliente {

	private int idCliente;
	private String nombre;
	private int telefono;
	
	/**
	 * Constructor de la clase Cliente con parametros
	 * 
	 * @param idCliente identificador unico del cliente
	 * @param nombre nombre del cliente
	 * @param telefono telefono del cliente
	 */
	public Cliente(int idCliente, String nombre, int telefono) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	/**
	 * Metodo que reserva una habitacion de tipo doble
	 * 
	 * @param habitacion Tipo de habitacion que reserva
	 */
	public void reservarDoble(Habitacion habitacion) {
		
	}
	
	/**
	 * Metodo que reserva una habitacion de tipo suite
	 * 
	 * @param habitacion Tipo de habitacion que reserva
	 */
	public void reservarSuite(Habitacion habitacion) {
		
	}
}
