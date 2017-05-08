package logical;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import visual.RentRoom;



public class Cabaña809 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7043704671778315958L;
	
	private static Cabaña809 cab = null;
	private ArrayList<Habitacion>misHabs;
	private ArrayList<Producto>misProduc;
	public static float simpleFastRoomPrice = 500;
	public static float ejecutiveFastRoomPrice = 1500;
	public static float simpleCompleteRoomPrice = 950;
	public static float ejecutiveCompleteRoomPrice = 3000;
	public static String nombre;
	private static ObjectOutputStream writer;
	private static ObjectInputStream reader;
	private static ObjectOutputStream orderNo;
	private static ObjectOutputStream fastRoom;
	private static ObjectOutputStream fastExecutive;
	private static ObjectOutputStream simpleComplete;
	private static ObjectOutputStream executiveComplete;
	
	private static ObjectInputStream orderNoReader;
	private static ObjectInputStream fastRoomReader;
	private static ObjectInputStream fastExecutiveReader;
	private static ObjectInputStream simpleCompleteReader;
	private static ObjectInputStream executiveCompleteReader;

	
	
	public Cabaña809() {
		super();
		misHabs= new ArrayList<>();
		misProduc= new ArrayList<>();
	}

	
	public static Cabaña809 getInstance(){
		if (cab == null)
			cab = new Cabaña809();
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
		while(i<misProduc.size() && !found){
			if (misProduc.get(i).getNombre().equalsIgnoreCase(nombre)){
				misProduc.remove(misProduc.get(i));
				found = true;	
			}
			else
				i++;
	    }
	}
	public static void writeAdmin() throws FileNotFoundException, IOException {
		File file = new File("Files");
		if (!file.exists())
			file.mkdirs();
		writer = new ObjectOutputStream(new FileOutputStream("Files/datos.dat"));
		writer.writeObject(Cabaña809.getInstance().getMisProduc());
		writer.close();
		orderNo = new ObjectOutputStream(new FileOutputStream("Files/numeroDeOrden.dat"));
		orderNo.writeInt(RentRoom.code);
		orderNo.close();
		fastRoom = new ObjectOutputStream(new FileOutputStream("Files/precioHabitacionPaso.dat"));
		fastRoom.writeFloat(simpleFastRoomPrice);
		fastRoom.close();
		fastExecutive = new ObjectOutputStream(new FileOutputStream("Files/precioHabitacionEjecutiva.dat"));
		fastExecutive.writeFloat(ejecutiveFastRoomPrice);
		fastExecutive.close();
		simpleComplete = new ObjectOutputStream(new FileOutputStream("Files/habitacionSimpleAmanecida.dat"));
		simpleComplete.writeFloat(simpleCompleteRoomPrice);
		simpleComplete.close();
		executiveComplete = new ObjectOutputStream(new FileOutputStream("Files/HabEjecutivaAmanecida.dat"));
		executiveComplete.writeFloat(ejecutiveCompleteRoomPrice);
		executiveComplete.close();
	}
	@SuppressWarnings("unchecked")
	public static void readAdmin() throws FileNotFoundException, IOException, ClassNotFoundException {
		reader = new ObjectInputStream(new FileInputStream("Files/datos.dat"));
		Cabaña809.getInstance().setMisProduc((ArrayList<Producto>)reader.readObject());
		reader.close();
		
		orderNoReader = new ObjectInputStream(new FileInputStream("Files/numeroDeOrden.dat"));
		RentRoom.code = orderNoReader.readInt();
		orderNoReader.close();
		
		fastRoomReader = new ObjectInputStream(new FileInputStream("Files/precioHabitacionPaso.dat"));
		simpleFastRoomPrice = fastRoomReader.readFloat();
		fastRoomReader.close();
		
		fastExecutiveReader = new ObjectInputStream(new FileInputStream("Files/precioHabitacionEjecutiva.dat"));
		ejecutiveFastRoomPrice = fastExecutiveReader.readFloat();
		fastExecutiveReader.close();
		
		simpleCompleteReader = new ObjectInputStream(new FileInputStream("Files/habitacionSimpleAmanecida.dat"));
		simpleCompleteRoomPrice = simpleCompleteReader.readFloat();
		simpleCompleteReader.close();
		
		executiveCompleteReader = new ObjectInputStream(new FileInputStream("Files/HabEjecutivaAmanecida.dat"));
		ejecutiveCompleteRoomPrice = executiveCompleteReader.readFloat();
		executiveCompleteReader.close();
	}
	public static void setCab(Cabaña809 cab) {
		Cabaña809.cab = cab;
	}
	
	

	
	
	
}
