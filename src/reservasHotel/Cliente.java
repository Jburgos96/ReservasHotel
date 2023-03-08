/**
 * 
 */
package reservasHotel;

/**
 * Clase que representa un cliente que va a realizar una reserva en el hotel
 * 
 * @author Juan Diego Motta, Jorge Burgos
 * @version 1.1
 */
public class Cliente {

	private int idCliente;
	private String nombre;
	private int telefono;
	
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * Setter de idCliente que permitira asignar el id a un objeto de clase Cliente
	 * @param idCliente identificador unico de Cliente
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * Getter del nombre del cliente
	 * @return devuelve la String del nombre del Cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre del cliente
	 * @param nombre nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del telefono del cliente
	 * @return devuelve un int que es telefono del cliente
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Setter de telefono
	 * @param telefono int que es el telefono del cliente
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

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
