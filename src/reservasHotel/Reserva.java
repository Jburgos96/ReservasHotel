/**
 * 
 */
package reservasHotel;
import java.util.*;
/**
 * Clase que representa una reserva
 * @author Juan Diego Motta, Jorge Burgos
 *
 */
public class Reserva {
	private int idReserva;
	private Date fechaEntrada;
	private Date fechaSalida;
	private int numPersonas;
	private Habitacion tipoHabitacion;
	private Cliente cliente;
	
	/**
	 * Getter de cliente 
	 * @return devuelve el cliente que ha hecho la reserva
	 */
	public Cliente getCliente() {
		return cliente;
	}


	/**
	 * Setter de cliente
	 * @param cliente cliente que realiza la reserva
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	/**
	 * Constructor de reserva con parametros
	 * @param idReserva identificador unico de la reserva
	 * @param fechaEntrada fecha de la entrada
	 * @param fechaSalida fecha de la salida
	 * @param numPersonas numero de personas en la reserva
	 * @param tipoHabitacion tipo de habitacion reservada (suite o doble)
	 */
	public Reserva(int idReserva, Date fechaEntrada, Date fechaSalida, int numPersonas, Habitacion tipoHabitacion) {
		this.idReserva = idReserva;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numPersonas = numPersonas;
		this.tipoHabitacion = tipoHabitacion;
	}
	
	
	/**
	 * Getter del identificador de la reserva
	 * @return devuelve el identificador de la reserva
	 */
	public int getIdReserva() {
		return idReserva;
	}

	/**
	 * Setter del id de la reserva
	 * @param idReserva identificador de la reserva
	 */
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	/**
	 * Getter de la fecha de entrada
	 * @return devuelve la fecha de entrada
	 */
	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * Setter de la fecha de entrada
	 * @param fechaEntrada fecha de entrada
	 */
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * Getter de la fecha de salida
	 * @return devuelve la fecha de salida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * Setter de la fecha de salida
	 * @param fechaSalida fecha de salida
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * Getter del numero de personas
	 * @return devuelve el numero de personas
	 */
	public int getNumPersonas() {
		return numPersonas;
	}

	/**
	 * Setter del numero de personas
	 * @param numPersonas numero de personas
	 */
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	/**
	 * Getter del tipo de habitacion
	 * @return devuelve el tipo de habitacion (doble o suite)
	 */
	public Habitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	/**
	 * Setter del tipo de habitacion
	 * @param tipoHabitacion tipo de habitacion (doble o suite)
	 */
	public void setTipoHabitacion(Habitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
}
