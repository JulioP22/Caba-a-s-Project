package logical;

import java.io.Serializable;

public class Producto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2276496245925411897L;
	private String nombre;
	private float precio;
	private int cantidad;
	
	
	public Producto(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
