package logical;

import java.io.Serializable;

public class Habitacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5225446842337806664L;
	private String tipo;
	private long seconds;
	private String roomName;
	private boolean onUse = false;
	private long finalDate;
	private long numeroOrden;
	
	
	public Habitacion(String roomName) {
		super();
		this.roomName = roomName;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public long getSeconds() {
		return seconds;
	}


	public void setSeconds(long seconds) {
		this.seconds = seconds;
	}


	public String getRoomName() {
		return roomName;
	}


	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}


	public boolean isOnUse() {
		return onUse;
	}


	public void setOnUse(boolean onUse) {
		this.onUse = onUse;
	}


	public long getFinalDate() {
		return finalDate;
	}


	public void setFinalDate(long finalDate) {
		this.finalDate = finalDate;
	}


	public long getNumeroOrden() {
		return numeroOrden;
	}


	public void setNumeroOrden(long numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	
	
	

}
