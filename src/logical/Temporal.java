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
	private String entryDate;
	private String finalDate;
	
		
	public Temporal(ArrayList<Producto> productos, String roomType, int orderNumber, String entryDate, String finalDate) {
		super();
		this.productos = productos;
		this.roomType = roomType;
		this.orderNumber = orderNumber;
		this.entryDate = entryDate;
		this.finalDate = finalDate;
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

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}
	
	
	

}
