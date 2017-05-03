package logical;

import java.io.Serializable;
import java.util.ArrayList;

public class Cabaña809 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7043704671778315958L;
	
	private static Cabaña809 cab = null;
	private ArrayList<Habitacion>misHabs;
	private ArrayList<Producto>misProduc;
	private static int simpleRoomPrice = 500;
	private static int ejecutiveRoomPrice = 500;

	
	
	public Cabaña809() {
		super();
		
		misHabs= new ArrayList<>();
		misProduc= new ArrayList<>();
	}

	
	public static Cabaña809 getInstance(){
		if (cab == null){
			cab = new Cabaña809();}
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
