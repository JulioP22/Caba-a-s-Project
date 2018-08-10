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
	private static ArrayList<Habitacion> misHabs;
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
	private static ObjectOutputStream roomWriter;
	
	private static ObjectInputStream orderNoReader;
	private static ObjectInputStream fastRoomReader;
	private static ObjectInputStream fastExecutiveReader;
	private static ObjectInputStream simpleCompleteReader;
	private static ObjectInputStream executiveCompleteReader;
	private static ObjectInputStream roomReader;

	
	
	public Cabaña809() {
		super();
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
		Cabaña809.misHabs = misHabs;
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
		String path = System.getProperty("user.home");
		path = path+File.separator+"Files";
		File file = new File(path);
		if (!file.exists())
			file.mkdirs();
		writer = new ObjectOutputStream(new FileOutputStream(path+File.separator+"datos.dat"));
		writer.writeObject(Cabaña809.getInstance().getMisProduc());
		writer.close();
		if (misHabs == null) {
			misHabs = new ArrayList<>();
			createRooms();
		}
		roomWriter = new ObjectOutputStream(new FileOutputStream(path+File.separator+"Habitaciones.dat"));
		roomWriter.writeObject(misHabs);
		roomWriter.close();
		orderNo = new ObjectOutputStream(new FileOutputStream(path+File.separator+"numeroDeOrden.dat"));
		orderNo.writeInt(RentRoom.code);
		orderNo.close();
		fastRoom = new ObjectOutputStream(new FileOutputStream(path+File.separator+"precioHabitacionPaso.dat"));
		fastRoom.writeFloat(simpleFastRoomPrice);
		fastRoom.close();
		fastExecutive = new ObjectOutputStream(new FileOutputStream(path+File.separator+"precioHabitacionEjecutiva.dat"));
		fastExecutive.writeFloat(ejecutiveFastRoomPrice);
		fastExecutive.close();
		simpleComplete = new ObjectOutputStream(new FileOutputStream(path+File.separator+"habitacionSimpleAmanecida.dat"));
		simpleComplete.writeFloat(simpleCompleteRoomPrice);
		simpleComplete.close();
		executiveComplete = new ObjectOutputStream(new FileOutputStream(path+File.separator+"HabEjecutivaAmanecida.dat"));
		executiveComplete.writeFloat(ejecutiveCompleteRoomPrice);
		executiveComplete.close();
	}
	@SuppressWarnings("unchecked")
	public static void readAdmin() throws FileNotFoundException, IOException, ClassNotFoundException {
		String path = System.getProperty("user.home");
		path = path+File.separator+"Files";
		reader = new ObjectInputStream(new FileInputStream(path+File.separator+"datos.dat"));
		Cabaña809.getInstance().setMisProduc((ArrayList<Producto>)reader.readObject());
		reader.close();
		
		roomReader = new ObjectInputStream(new FileInputStream(path+File.separator+"Habitaciones.dat"));
		Cabaña809.getInstance().setMisHabs((ArrayList<Habitacion>)roomReader.readObject());
		roomReader.close();
		
		orderNoReader = new ObjectInputStream(new FileInputStream(path+File.separator+"numeroDeOrden.dat"));
		RentRoom.code = orderNoReader.readInt();
		orderNoReader.close();
		
		fastRoomReader = new ObjectInputStream(new FileInputStream(path+File.separator+"precioHabitacionPaso.dat"));
		simpleFastRoomPrice = fastRoomReader.readFloat();
		fastRoomReader.close();
		
		fastExecutiveReader = new ObjectInputStream(new FileInputStream(path+File.separator+"precioHabitacionEjecutiva.dat"));
		ejecutiveFastRoomPrice = fastExecutiveReader.readFloat();
		fastExecutiveReader.close();
		
		simpleCompleteReader = new ObjectInputStream(new FileInputStream(path+File.separator+"habitacionSimpleAmanecida.dat"));
		simpleCompleteRoomPrice = simpleCompleteReader.readFloat();
		simpleCompleteReader.close();
		
		executiveCompleteReader = new ObjectInputStream(new FileInputStream(path+File.separator+"HabEjecutivaAmanecida.dat"));
		ejecutiveCompleteRoomPrice = executiveCompleteReader.readFloat();
		executiveCompleteReader.close();
	}
	public static void setCab(Cabaña809 cab) {
		Cabaña809.cab = cab;
	}
	public static void createRooms() {
		Habitacion room1 = new Habitacion("panel_1");
		Habitacion room2 = new Habitacion("panel_2");
		Habitacion room3 = new Habitacion("panel_3");
		Habitacion room4 = new Habitacion("panel_4");
		Habitacion room5 = new Habitacion("panel_5");
		Habitacion room6 = new Habitacion("panel_6");
		Habitacion room7 = new Habitacion("panel_7");
		Habitacion room8 = new Habitacion("panel_8");
		Habitacion room9 = new Habitacion("panel_9");
		Habitacion room10 = new Habitacion("panel_10");
		Habitacion room11 = new Habitacion("panel_11");
		Habitacion room12 = new Habitacion("panel_12");
		Habitacion room13 = new Habitacion("panel_13");
		Habitacion room14 = new Habitacion("panel_14");
		Habitacion room15 = new Habitacion("panel_15");
		Habitacion room16 = new Habitacion("panel_16");
		Habitacion room17 = new Habitacion("panel_17");
		Habitacion room18 = new Habitacion("panel_18");
		Habitacion room19 = new Habitacion("panel_19");
		Habitacion room20 = new Habitacion("panel_20");
		Habitacion room21 = new Habitacion("panel_21");
		Habitacion room22 = new Habitacion("panel_22");
		Habitacion room23 = new Habitacion("panel_23");
		Habitacion room24 = new Habitacion("panel_24");
		Habitacion room25 = new Habitacion("panel_25");
		Habitacion room26 = new Habitacion("panel_26");
		Habitacion room27 = new Habitacion("panel_27");
		Habitacion room28 = new Habitacion("panel_28");
		Habitacion room29 = new Habitacion("panel_29");
		Habitacion room30 = new Habitacion("panel_30");
		Habitacion room31 = new Habitacion("panel_31");
		Habitacion room32 = new Habitacion("panel_32");
		Habitacion room33 = new Habitacion("panel_33");
		Habitacion room34 = new Habitacion("panel_34");
		Habitacion room35 = new Habitacion("panel_35");
		misHabs.add(room1);
		misHabs.add(room2);
		misHabs.add(room3);
		misHabs.add(room4);
		misHabs.add(room5);
		misHabs.add(room6);
		misHabs.add(room7);
		misHabs.add(room8);
		misHabs.add(room9);
		misHabs.add(room10);
		misHabs.add(room11);
		misHabs.add(room12);
		misHabs.add(room13);
		misHabs.add(room14);
		misHabs.add(room15);
		misHabs.add(room16);
		misHabs.add(room17);
		misHabs.add(room18);
		misHabs.add(room19);
		misHabs.add(room20);
		misHabs.add(room21);
		misHabs.add(room22);
		misHabs.add(room23);
		misHabs.add(room24);
		misHabs.add(room25);
		misHabs.add(room26);
		misHabs.add(room27);
		misHabs.add(room28);
		misHabs.add(room29);
		misHabs.add(room30);
		misHabs.add(room31);
		misHabs.add(room32);
		misHabs.add(room33);
		misHabs.add(room34);
		misHabs.add(room35);	
	}
	
	

	
	
	
}
