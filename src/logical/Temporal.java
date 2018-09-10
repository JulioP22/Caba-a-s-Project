package logical;

import java.io.Serializable;
import java.util.ArrayList;

public class Temporal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5810312186479173451L;
	private ArrayList<Producto> productos;
	private String roomType;
	private int orderNumber;
	
		
	public Temporal(ArrayList<Producto> productos, String roomType, int orderNumber) {
		super();
		this.productos = productos;
		this.roomType = roomType;
		this.orderNumber = orderNumber;
	}
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	

}
