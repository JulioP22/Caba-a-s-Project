package logical;

import java.io.Serializable;

public class Habitacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5225446842337806664L;
	private String tipo;
	private float precio;
	
	
	public Habitacion(String tipo, float precio) {
		super();
		this.tipo = tipo;
		this.precio = precio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	} 
	
	

}
