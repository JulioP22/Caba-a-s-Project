package logical;

import java.io.Serializable;
import java.util.ArrayList;

public class Caba�a809 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7043704671778315958L;
	
	private static Caba�a809 cab = null;
	private ArrayList<Habitacion>misHabs;
	private ArrayList<Producto>misProduc;
	private static int simpleRoomPrice = 500;
	private static int ejecutiveRoomPrice = 500;

	
	
	public Caba�a809() {
		super();
		
		misHabs= new ArrayList<>();
		misProduc= new ArrayList<>();
	}

	
	public static Caba�a809 getInstance(){
		if (cab == null){
			cab = new Caba�a809();}
		return cab;
	}

	

	public ArrayList<Habitacion> getMisHabs() {
		return misHabs;
	}


	public void setMisHabs(ArrayList<Habitacion> misHabs) {
		this.misHabs = misHabs;
	}


	public ArrayList<Producto> getMisProduc() {
		return misProduc;
	}


	public void setMisProduc(ArrayList<Producto> misProduc) {
		this.misProduc = misProduc;
	}
	
	
	
	
	

	
	
	
}
