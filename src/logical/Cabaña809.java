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
	public static int simpleFastRoomPrice = 500;
	public static int ejecutiveFastRoomPrice = 500;
	public static int simpleCompleteRoomPrice = 500;
	public static int ejecutiveCompleteRoomPrice = 500;
	public static String nombre;

	
	
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

	public void agregarProduc(Producto a){
		misProduc.add(a);
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
	
	
	
	public Producto buscarProductoporNombre(String nombre) {
		Producto aux = null;
		boolean buscar = false;
		int i = 0;
		while(i<misProduc.size() && !buscar){
			if(misProduc.get(i).getNombre().equalsIgnoreCase(nombre)){
				aux = misProduc.get(i);
				buscar = true;
			}i++;

		}
		return aux;
	}
	
public void borrarProducto(String nombre){
		
		int  i = 0;
		boolean found = false;
		
		while(i<misProduc.size() && !found)
		{
			if (misProduc.get(i).getNombre().equalsIgnoreCase(nombre))
			{
				misProduc.remove(misProduc.get(i));
				found = true;
				
			}
			else {
				i++;
			}
		}
	}
	

	
	
	
}
