package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import logical.Caba�a809;
import logical.Habitacion;
import logical.Producto;
import logical.Temporal;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RentRoom extends JDialog implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -308321698661773949L;
	private final JPanel contentPanel = new JPanel();
	private JRadioButton sencilla;
	private JRadioButton ejecutiva;
	private JPanel panel;
	private JPanel panel_1;
	private JRadioButton dePaso;
	private JRadioButton amanecida;
	private JPanel panel_2;
	private JPanel panel_3;
	private JScrollPane scrollPane_1;
	
	private JTable table;
	private static DefaultTableModel tableModel;
    private static Object[] row;
    
	private static JTable table_1;
	private static DefaultTableModel tableModel1;
    private static Object[] row1;
    
	public static ArrayList<Producto> selected;
	private JScrollPane scrollPane;
	private JButton addButton;
	private JButton deleteButton;
	private JLabel lblMontoTotal;
	private JLabel priceLabel;
	private JLabel lblNewLabel;
	private JButton okButton;
	private JButton cancelButton;
	
	private JLabel label;
	private JLabel label1;
	private JLabel label2;
	private Thread t;
	private String roomName;
	private FileWriter writer;
	private ObjectOutputStream objWriter;
	private static ObjectInputStream objReader;
	private BufferedReader reader;
	public static int code = 1;

	private JTextArea txtAreaRecipe = new JTextArea();
	private Habitacion room;
	private JButton btnDescuento;
	private int option;
	private Temporal temp = null;
	private JButton btnProductosAnteriores;
	private long ownCode;
	private JTextField finder;
	private int roomIndex;
	private JButton btnExtenderTiempo;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public RentRoom(final String roomName, Habitacion habitacion, int option) {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Caba�a809.getInstance().totalAmount = setTotalAmount();
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					Caba�a809.getInstance().discount = 0f;
					Caba�a809.getInstance().totalAmount = 0f;
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Se ha producido inesperado", "Error", JOptionPane.ERROR_MESSAGE, null);
				}
			}
		});
		this.roomName = roomName;
		this.room = habitacion;
		this.option = option;
		setTitle("Alquiler de caba\u00F1a");
		setBounds(100, 100, 883, 648);
		setModal(true);
		setLocationRelativeTo(null);
		setResizable(false);
		
		this.roomIndex = getRoomIndex(this.roomName);
		
		t = new Thread(this);
		
		if (this.option == 2) {
			String path = System.getProperty("user.home")+File.separator+"Files/Temporal/"+getRoomName(roomName)+".dat";
			try {
				objReader = new ObjectInputStream(new FileInputStream(path));
				temp = (Temporal) objReader.readObject();
				objReader.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		selected = new ArrayList<>();
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Productos disponibles", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 81, 453, 453);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 79, 431, 325);
		panel_2.add(scrollPane);
		
		{
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Tipo de caba\u00F1a", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 11, 453, 59);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			ejecutiva = new JRadioButton("Ejecutiva");
			ejecutiva.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sencilla.setSelected(false);
					ejecutiva.setSelected(true);
				}
			});
			ejecutiva.setBounds(69, 23, 91, 23);
			panel.add(ejecutiva);
			
			sencilla = new JRadioButton("Sencilla");
			sencilla.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sencilla.setSelected(true);
					ejecutiva.setSelected(false);
				}
			});
			sencilla.setBounds(295, 23, 86, 23);
			panel.add(sencilla);
		}
		ejecutiva.setSelected(true);
		sencilla.setSelected(false);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Seleccionado", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(475, 81, 390, 453);
		contentPanel.add(panel_3);
		panel_3.setLayout(null);
		
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 22, 368, 382);
		panel_3.add(scrollPane_1);
		///////////////////////////////////////Lo que se debe copiar para hacer las tablas/////////////////////////////////////////////////
		String[] columnsHeaders = {"Nombre","Precio"};
		tableModel = new DefaultTableModel(){
		    /**
		     * 
		     */
		    private static final long serialVersionUID = 1L;

		    @Override
		    public boolean isCellEditable(int row, int column) {
			
			return false;
		    }
		 
		};
		tableModel.setColumnIdentifiers(columnsHeaders);
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
			    if(table.getSelectedRow()>=0){
				    addButton.setEnabled(true);
			    }
			    else {
			    	addButton.setEnabled(false);
			    }
			}
		});
		scrollPane.setColumnHeaderView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
		////////////////////////////////////////////////Lo que se debe copiar para hacer las tablas/////////////////////////////////////////
		
		///////////////////////////////////////Lo que se debe copiar para hacer las tablas/////////////////////////////////////////////////
		String[] columnsHeaders1 = {"Nombre","Cantidad"};
		tableModel1 = new DefaultTableModel(){
		    /**
		     * 
		     */
		    private static final long serialVersionUID = 1L;

		    @Override
		    public boolean isCellEditable(int row, int column) {
			
			return false;
		    }
		 
		};
		tableModel1.setColumnIdentifiers(columnsHeaders1);
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
			    if(table_1.getSelectedRow()>=0){
			    	deleteButton.setEnabled(true);
			    }
			}
		});
		scrollPane_1.setColumnHeaderView(table_1);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setModel(tableModel1);
		scrollPane_1.setViewportView(table_1);
		////////////////////////////////////////////////Lo que se debe copiar para hacer las tablas/////////////////////////////////////////
		{
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Servicio", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(475, 11, 390, 59);
			contentPanel.add(panel_1);
			panel_1.setLayout(null);
			{
				dePaso = new JRadioButton("De paso");
				dePaso.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dePaso.setSelected(true);
						amanecida.setSelected(false);
					}
				});
				dePaso.setBounds(58, 23, 90, 23);
				panel_1.add(dePaso);
			}
			
			amanecida = new JRadioButton("Amanecida");
			amanecida.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dePaso.setSelected(false);
					amanecida.setSelected(true);
				}
			});
			amanecida.setBounds(249, 23, 106, 23);
			panel_1.add(amanecida);
		}
		if (room == null)
			dePaso.setSelected(true);
		amanecida.setSelected(false);
		
		addButton = new JButton("A\u00F1adir");
		addButton.setIcon(new ImageIcon(RentRoom.class.getResource("/icons/add_opt.png")));
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow()>=0) {
					int index = getIndexFromName(tableModel.getValueAt(table.getSelectedRow(), 0).toString());
					if (index != -1) {
						if (!isAdded(Caba�a809.getInstance().getMisProduc().get(index).getNombre())) {
					    	Producto product = Caba�a809.getInstance().getMisProduc().get(index);
						    ProductAmount amount = new ProductAmount(product);
						    amount.setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(null, "Este producto ya ha sido agregado");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Ha ocurrido un error al agregar este producto");
					}
				}
			}
		});
		addButton.setBounds(352, 417, 89, 23);
		panel_2.add(addButton);
		
		addButton.setEnabled(false);
		
		finder = new JTextField();
		finder.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				loadProducts();
			}
		});
		finder.setBounds(113, 34, 274, 23);
		panel_2.add(finder);
		finder.setColumns(10);
		
		JLabel lblBsqueda = new JLabel("B\u00FAsqueda: ");
		lblBsqueda.setBounds(24, 37, 77, 16);
		panel_2.add(lblBsqueda);
		
		deleteButton = new JButton("Eliminar");
		deleteButton.setIcon(new ImageIcon(RentRoom.class.getResource("/icons/deleteIcon_opt.png")));
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table_1.getSelectedRow()>=0) {
					selected.remove(table_1.getSelectedRow());
					loadSelected();
				}
			}
		});
		deleteButton.setBounds(290, 417, 88, 23);
		deleteButton.setEnabled(false);
		
		panel_3.add(deleteButton);
		
		lblMontoTotal = new JLabel("Monto total: ");
		lblMontoTotal.setFont(new Font("Century Schoolbook", Font.ITALIC, 14));
		lblMontoTotal.setBounds(649, 551, 93, 14);
		contentPanel.add(lblMontoTotal);
		
		priceLabel = new JLabel("0.00");
		priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		priceLabel.setFont(new Font("Century Schoolbook", Font.ITALIC, 14));
		priceLabel.setBounds(754, 551, 68, 14);
		contentPanel.add(priceLabel);
		
		lblNewLabel = new JLabel("RD$");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.ITALIC, 14));
		lblNewLabel.setBounds(834, 547, 31, 22);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Reservar");
				okButton.setIcon(new ImageIcon(RentRoom.class.getResource("/icons/nuevo_opt.png")));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (dePaso.isSelected()) {
							int resp = JOptionPane.showConfirmDialog(null, "�Est� seguro que desea hacer la reserva?", "Confirmaci�n", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
							if (resp == JOptionPane.YES_OPTION) {
								String aux = null;
								
								if (sencilla.isSelected()) aux = "fastRoom";
								else aux = "fastEjecutive";
								
								try {
									writeTicket(getRoomName(roomName), getEntryDate(), getFinalDate(), aux);
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								try {
									readTicket();
								} catch (IOException e1) {
									e1.printStackTrace();
								}
								try {
									printComponent();
									Caba�a809.getInstance().discount = 0f;
									Caba�a809.getInstance().totalAmount = 0f;
								} catch (PrinterException e1) {
									e1.printStackTrace();
								}
								
								if (option == 1) {
									setAllCancelFalse();
									VisualMain.getPanel(roomName).setBackground(Color.GREEN);
									for (int i =0;i<VisualMain.getPanel(roomName).getComponentCount();i++) {
										VisualMain.getPanel(roomName).getComponent(i).setVisible(false);
									}
									label = new JLabel(getRoomName(roomName) +" En uso");
									label.setName("enUso");
									label.setHorizontalAlignment(SwingConstants.CENTER);
									label.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
									label.setBounds(3, 20, 93, 14);
									VisualMain.getPanel(roomName).add(label);
									
									label1 = new JLabel(giveTime(14400));
									label1.setName("time");
									label1.setHorizontalAlignment(SwingConstants.CENTER);
									label1.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
									label1.setBounds(3, 55, 93, 14);
									VisualMain.getPanel(roomName).add(label1);
									
									t.start();
								}
								dispose();
							}
						}else if (amanecida.isSelected()) {
							int resp = JOptionPane.showConfirmDialog(null, "�Est� seguro que desea hacer la reserva?", "Confirmaci�n", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
							if (resp == JOptionPane.YES_OPTION) {
								String aux = null;
								
								if (sencilla.isSelected()) aux = "simpleComplete";
								else aux = "ejecutiveComplete";
								
								try {
									writeTicket(getRoomName(roomName), getEntryDate(), getDate()+" 10:00:00 AM", aux);
								} catch (Exception e1) {
									JOptionPane.showMessageDialog(null, "Se ha producido un error al tratar de crear el archivo ''ticket.txt''","Error", JOptionPane.ERROR_MESSAGE, null);
								}
								
								try {
									readTicket();
								} catch (IOException e1) {
									JOptionPane.showMessageDialog(null, "Se ha producido un error al tratar de leer ''ticket.txt''","Error", JOptionPane.ERROR_MESSAGE, null);
								}
								try {
									printComponent();
									Caba�a809.getInstance().discount = 0f;
									Caba�a809.getInstance().totalAmount = 0f;
								} catch (PrinterException e1) {
									JOptionPane.showMessageDialog(null, "Se ha producido un error al tratar de usar la impresora","Error", JOptionPane.ERROR_MESSAGE, null);
								}
								if (option == 1) {
									setAllCancelFalse();
									VisualMain.getPanel(roomName).setBackground(Color.GREEN);
									for (int i =0;i<VisualMain.getPanel(roomName).getComponentCount();i++) {
										VisualMain.getPanel(roomName).getComponent(i).setVisible(false);
									}
									label = new JLabel(getRoomName(roomName)+" En uso");
									label.setName("enUso");
									label.setHorizontalAlignment(SwingConstants.CENTER);
									label.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
									label.setBounds(3, 10, 93, 14);
									VisualMain.getPanel(roomName).add(label);
									
									label1 = new JLabel(getDate());
									label1.setName("time");
									label1.setHorizontalAlignment(SwingConstants.CENTER);
									label1.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
									label1.setBounds(0, 35, 100, 14);
									VisualMain.getPanel(roomName).add(label1);
									
									label2 = new JLabel("10:00 AM");
									label2.setName("time2");
									label2.setHorizontalAlignment(SwingConstants.CENTER);
									label2.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
									label2.setBounds(-2, 60, 100, 14);
									VisualMain.getPanel(roomName).add(label2);
									
									t.start();
								}
								dispose();
							}
						}
					}
				});
				
				btnDescuento = new JButton("Descuento");
				btnDescuento.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Discount dis = new Discount("Descuento");
						dis.setVisible(true);
					}
				});
				
				JButton btnAumento = new JButton("Aumento");
				btnAumento.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Discount dis = new Discount("Aumento");
						dis.setVisible(true);
					}
				});
				btnAumento.setIcon(new ImageIcon(RentRoom.class.getResource("/icons/login_opt.png")));
				buttonPane.add(btnAumento);
				btnDescuento.setIcon(new ImageIcon(RentRoom.class.getResource("/icons/login_opt.png")));
				buttonPane.add(btnDescuento);
				
				btnProductosAnteriores = new JButton("Productos anteriores");
				btnProductosAnteriores.setIcon(new ImageIcon(RentRoom.class.getResource("/icons/buscar_opt.png")));
				btnProductosAnteriores.setVisible(this.option == 2);
				btnProductosAnteriores.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for(Producto i : temp.getProductos()) {
							if (!issAdded(i.getNombre())) {
								selected.add(i);
							}
						}
						loadSelected();
					}
				});
				
				btnExtenderTiempo = new JButton("Extender tiempo");
				btnExtenderTiempo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						RoomExtension ext = new RoomExtension();
						ext.setVisible(true);
					}
				});
				btnExtenderTiempo.setVisible(this.option == 2);
				btnExtenderTiempo.setIcon(new ImageIcon(RentRoom.class.getResource("/icons/add_opt.png")));
				buttonPane.add(btnExtenderTiempo);
				buttonPane.add(btnProductosAnteriores);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancelar");
				cancelButton.setIcon(new ImageIcon(RentRoom.class.getResource("/icons/cancelar_opt.png")));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						Caba�a809.getInstance().discount = 0f;
						Caba�a809.getInstance().totalAmount = 0f;
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		loadProducts();
		if (room != null)
			resumeReservation();
	}
	private boolean issAdded(String prodName) {
		boolean result = false;
		for(Producto i: selected) {
			if (i.getNombre().equalsIgnoreCase(prodName)) {
				result = true;
				break;
			}
		}
		return result;
	}
	private void loadProducts() {
	   	tableModel.setRowCount(0);
	   	DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
	   	tcr.setHorizontalAlignment(SwingConstants.CENTER);
	   	table.getColumnModel().getColumn(0).setCellRenderer(tcr);
	   	table.getColumnModel().getColumn(1).setCellRenderer(tcr);
	   	row = new Object[tableModel.getColumnCount()];
	   	for (Producto pr: Caba�a809.getInstance().getMisProduc()) {
	   		if (finder.getText().equals("") || pr.getNombre().toLowerCase().indexOf(finder.getText().toLowerCase()) != -1) {
	   			row[0]=pr.getNombre();
		   	    row[1]=pr.getPrecio();
		   	    tableModel.addRow(row);
	   		}
	   	}
	}
	
	private int getIndexFromName(String name) {
		int index = -1;
		for(int i = 0;i<Caba�a809.getInstance().getMisProduc().size();i++) {
			if (Caba�a809.getInstance().getMisProduc().get(i).getNombre().equalsIgnoreCase(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
    public static void loadSelected() {
       	tableModel1.setRowCount(0);
	   	DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
	   	tcr.setHorizontalAlignment(SwingConstants.CENTER);
	   	table_1.getColumnModel().getColumn(0).setCellRenderer(tcr);
	   	table_1.getColumnModel().getColumn(1).setCellRenderer(tcr);
	   	row1 = new Object[tableModel1.getColumnCount()];
	   	for (Producto pr : selected) {
   			row1[0]=pr.getNombre();
   			row1[1]=pr.getCantidad();
   			tableModel1.addRow(row1);
	   	}
    }
    public static void addSelected(Producto product) {
    	selected.add(product);
    }
    private float setTotalAmount() {
    	float aux = 0f;
    	if (this.option != 2) {
    		if (ejecutiva.isSelected() && dePaso.isSelected())
        		aux += Caba�a809.ejecutiveFastRoomPrice;
        	else if (ejecutiva.isSelected() && amanecida.isSelected())
        		aux += Caba�a809.ejecutiveCompleteRoomPrice;
        	else if (sencilla.isSelected() && dePaso.isSelected())
        		aux += Caba�a809.simpleFastRoomPrice;
        	else
        		aux += Caba�a809.simpleCompleteRoomPrice;
    	}
    	
    	for (Producto i: selected) {
    		aux += i.getPrecio()*i.getCantidad();
    	}
    	priceLabel.setText(String.valueOf(aux - Caba�a809.getInstance().discount));
    	return aux;
    }
    private boolean isAdded(String name) {
    	boolean aux = false;
    	for(Producto i: selected) {
    		if (i.getNombre().equals(name))
    			aux = true;
    	}
    	return aux;
    }
    public static String giveTime(long seconds) {
        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        return String.format("%d:%02d:%02d", h,m,s);
    }
    
    public static void deleteTempFile(String roomName, int options, int keepNumber) {
    	if (roomName == null || roomName == "") return;
    	String path = System.getProperty("user.home")+File.separator+"Files/Temporal";
    	File file = new File(path);
    	if (!file.exists()) return;
    	File newFile = new File(System.getProperty("user.home")+File.separator+"Files/Temporal/"+roomName.trim()+".dat");
    	if (!newFile.exists()) return;
    	if (options == 1) {
    		try {
				objReader = new ObjectInputStream(new FileInputStream(System.getProperty("user.home")+File.separator+"Files/Temporal/"+roomName.trim()+".dat"));
				Temporal temp = (Temporal) objReader.readObject();
				if (keepNumber == 1) Caba�a809.canceled.add(temp.getOrderNumber());
				objReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	newFile.delete();
    }
    
    private int getRoomIndex(String roomName) {
    	int index = -1;
    	for(Habitacion i: Caba�a809.getInstance().getMisHabs()) {
    		if (i.getRoomName().equalsIgnoreCase(roomName)) {
    			index = Caba�a809.getInstance().getMisHabs().indexOf(i);
    			break;
    		}
    	}
    	return index;
    }
    
	@Override
	public void run() {
		Date date = new Date();
		long seconds = 0;
		Calendar calendar = new GregorianCalendar();
		long timer = 0;
		calendar.setTime(date);
		int fast = -1;
		int index = -1;
		String aux_1 = null;
		boolean completeNight = false;
		if (room == null) {
			aux_1 = roomName;
			completeNight = amanecida.isSelected();
			for (Habitacion i: Caba�a809.getInstance().getMisHabs()) {
				if (i.getRoomName().equals(aux_1)) {
					index = Caba�a809.getInstance().getMisHabs().indexOf(i);
					if (amanecida.isSelected()) {
						i.setTipo("amanecida");
						i.setFinalDate(getRealFinalDate());
					}
					else {
						i.setTipo("dePaso");
						i.setFinalDate(calendar.getTimeInMillis()+14400000);
					}
					i.setNumeroOrden(ownCode);
					i.setOnUse(true);
					break;
				}
			}
		}
		else {
			if (room.getTipo().equals("amanecida")) {
				resumeForComplete();
				completeNight = true;
				fast = 2;
			}
			else {
				resumeForFast();
				completeNight = false;
				fast = 1;
			}
			aux_1 = room.getRoomName();
			index = Caba�a809.getInstance().getMisHabs().indexOf(room);
		}
		
		Color red = Color.red;
		if (dePaso.isSelected() || fast == 1) {
			while(true) {
				Date date1 = new Date();
				calendar.setTime(date1);
				timer = calendar.getTimeInMillis();
				seconds = Caba�a809.getInstance().getMisHabs().get(index).getFinalDate() - timer;
				String aux = RentRoom.giveTime(seconds/1000);
				label1.setText(aux);
				Caba�a809.getInstance().getMisHabs().get(index).setSeconds(seconds);
				if ((seconds/1000)<3600)
					VisualMain.getPanel(aux_1).setBackground(red);
				else
					VisualMain.getPanel(aux_1).setBackground(Color.GREEN);
				seconds--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (aux_1.equals("panel_1")) {
					if (VisualMain.cancel) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_2")) {
					if (VisualMain.cancel1) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_3")) {
					if (VisualMain.cancel2) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_4")) {
					if (VisualMain.cancel3) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_5")) {
					if (VisualMain.cancel4) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_6")) {
					if (VisualMain.cancel5) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_7")) {
					if (VisualMain.cancel6) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_8")) {
					if (VisualMain.cancel7) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_9")) {
					if (VisualMain.cancel8) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_10")) {
					if (VisualMain.cancel9) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_11")) {
					if (VisualMain.cancel10) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_12")) {
					if (VisualMain.cancel11) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_13")) {
					if (VisualMain.cancel12) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_14")) {
					if (VisualMain.cancel13) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_15")) {
					if (VisualMain.cancel14) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_16")) {
					if (VisualMain.cancel15) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_17")) {
					if (VisualMain.cancel16) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_18")) {
					if (VisualMain.cancel17) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_19")) {
					if (VisualMain.cancel18) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_20")) {
					if (VisualMain.cancel19) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_21")) {
					if (VisualMain.cancel20) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_22")) {
					if (VisualMain.cancel21) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_23")) {
					if (VisualMain.cancel22) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_24")) {
					if (VisualMain.cancel23) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_25")) {
					if (VisualMain.cancel24) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_26")) {
					if (VisualMain.cancel25) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_27")) {
					if (VisualMain.cancel26) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_28")) {
					if (VisualMain.cancel27) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_29")) {
					if (VisualMain.cancel28) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_30")) {
					if (VisualMain.cancel29) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_31")) {
					if (VisualMain.cancel30) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_32")) {
					if (VisualMain.cancel31) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_33")) {
					if (VisualMain.cancel32) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_34")) {
					if (VisualMain.cancel33) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_35")) {
					if (VisualMain.cancel34) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}
			}
		}else {
			while (true) {
				long time = getTime();
				
				if (time<3600000)
					VisualMain.getPanel(aux_1).setBackground(red);
				else
					VisualMain.getPanel(aux_1).setBackground(Color.GREEN);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (time<=1000) {
//					label1.setVisible(false);
//					label.setVisible(false);
//					if (completeNight)
//						label2.setVisible(false);
//					
//					Habitacion room = Caba�a809.getInstance().getMisHabs().get(index);
//					calendar.setTimeInMillis(room.getFinalDate());
//					SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
//					String aux = formatter.format(calendar.getTime());
//					String[] separator = aux.split(" ");
//					JOptionPane.showMessageDialog(null, "La reservaci�n de la habitaci�n "+getRoomName(aux_1)+" ha finalizado a las "+separator[0]+" el "+separator[1], null, JOptionPane.INFORMATION_MESSAGE, null);
//					deleteTempFile(getRoomName(aux_1),2);
//					break;
				}
				if (aux_1.equals("panel_1")) {
					if (VisualMain.cancel) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_2")) {
					if (VisualMain.cancel1) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_3")) {
					if (VisualMain.cancel2) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_4")) {
					if (VisualMain.cancel3) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_5")) {
					if (VisualMain.cancel4) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_6")) {
					if (VisualMain.cancel5) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_7")) {
					if (VisualMain.cancel6) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_8")) {
					if (VisualMain.cancel7) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_9")) {
					if (VisualMain.cancel8) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_10")) {
					if (VisualMain.cancel9) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_11")) {
					if (VisualMain.cancel10) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_12")) {
					if (VisualMain.cancel11) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_13")) {
					if (VisualMain.cancel12) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_14")) {
					if (VisualMain.cancel13) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_15")) {
					if (VisualMain.cancel14) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_16")) {
					if (VisualMain.cancel15) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_17")) {
					if (VisualMain.cancel16) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_18")) {
					if (VisualMain.cancel17) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_19")) {
					if (VisualMain.cancel18) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_20")) {
					if (VisualMain.cancel19) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_21")) {
					if (VisualMain.cancel20) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_22")) {
					if (VisualMain.cancel21) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_23")) {
					if (VisualMain.cancel22) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_24")) {
					if (VisualMain.cancel23) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_25")) {
					if (VisualMain.cancel24) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_26")) {
					if (VisualMain.cancel25) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_27")) {
					if (VisualMain.cancel26) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_28")) {
					if (VisualMain.cancel27) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_29")) {
					if (VisualMain.cancel28) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_30")) {
					if (VisualMain.cancel29) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_31")) {
					if (VisualMain.cancel30) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_32")) {
					if (VisualMain.cancel31) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_33")) {
					if (VisualMain.cancel32) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_34")) {
					if (VisualMain.cancel33) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}else if (aux_1.equals("panel_35")) {
					if (VisualMain.cancel34) {
						label1.setVisible(false);
						label.setVisible(false);
						if (completeNight)
							label2.setVisible(false);
						break;
					}
				}
			}
		}
		enableRoom(aux_1);
		VisualMain.getPanel(aux_1).setBackground(new Color (240,240,240));
		if (aux_1.equals("panel_1")) {
			VisualMain.getLabel1().setVisible(true);
			VisualMain.getLblC().setVisible(true);
		}
		else if (aux_1.equals("panel_2")) {
			VisualMain.getLabel2().setVisible(true);
			VisualMain.getLblC_1().setVisible(true);
		}
		else if (aux_1.equals("panel_3")) {
			VisualMain.getLabel3().setVisible(true);
			VisualMain.getLblC_2().setVisible(true);
		}
		else if (aux_1.equals("panel_4")) {
			VisualMain.getLabel4().setVisible(true);
			VisualMain.getLblC_3().setVisible(true);
		}
		else if (aux_1.equals("panel_5")) {
			VisualMain.getLabel5().setVisible(true);
			VisualMain.getLblC_4().setVisible(true);
		}
		else if (aux_1.equals("panel_6")) {
			VisualMain.getLabel6().setVisible(true);
			VisualMain.getLblC_5().setVisible(true);
		}
		else if (aux_1.equals("panel_7")) {
			VisualMain.getLabel7().setVisible(true);
			VisualMain.getLblC_6().setVisible(true);
		}
		else if (aux_1.equals("panel_8")) {
			VisualMain.getLabel8().setVisible(true);
			VisualMain.getLblC_7().setVisible(true);
		}
		else if (aux_1.equals("panel_9")) {
			VisualMain.getLabel9().setVisible(true);
			VisualMain.getLblC_8().setVisible(true);
		}
		else if (aux_1.equals("panel_10")) {
			VisualMain.getLabel10().setVisible(true);
			VisualMain.getLblC_9().setVisible(true);
		}
		else if (aux_1.equals("panel_11")) {
			VisualMain.getLabel11().setVisible(true);
			VisualMain.getLblC_10().setVisible(true);
		}
		else if (aux_1.equals("panel_12")) {
			VisualMain.getLabel12().setVisible(true);
			VisualMain.getLblC_11().setVisible(true);
		}
		else if (aux_1.equals("panel_13")) {
			VisualMain.getLabel13().setVisible(true);
			VisualMain.getLblC_12().setVisible(true);
		}
		else if (aux_1.equals("panel_14")) {
			VisualMain.getLabel14().setVisible(true);
			VisualMain.getLblC_13().setVisible(true);
		}
		else if (aux_1.equals("panel_15")) {
			VisualMain.getLabel15().setVisible(true);
			VisualMain.getLblC_14().setVisible(true);
		}
		else if (aux_1.equals("panel_16")) {
			VisualMain.getLabel16().setVisible(true);
			VisualMain.getLblC_15().setVisible(true);
		}
		else if (aux_1.equals("panel_17")) {
			VisualMain.getLabel17().setVisible(true);
			VisualMain.getLblC_16().setVisible(true);
		}
		else if (aux_1.equals("panel_18")) {
			VisualMain.getLabel18().setVisible(true);
			VisualMain.getLblC_17().setVisible(true);
		}
		else if (aux_1.equals("panel_19")) {
			VisualMain.getLabel19().setVisible(true);
			VisualMain.getLblC_18().setVisible(true);
		}
		else if (aux_1.equals("panel_20")) {
			VisualMain.getLabel20().setVisible(true);
			VisualMain.getLblC_19().setVisible(true);
		}
		else if (aux_1.equals("panel_21")) {
			VisualMain.getLabel21().setVisible(true);
			VisualMain.getLblC_20().setVisible(true);
		}
		else if (aux_1.equals("panel_22")) {
			VisualMain.getLabel22().setVisible(true);
			VisualMain.getLblC_21().setVisible(true);
		}
		else if (aux_1.equals("panel_23")) {
			VisualMain.getLabel23().setVisible(true);
			VisualMain.getLblC_22().setVisible(true);
		}
		else if (aux_1.equals("panel_24")) {
			VisualMain.getLabel24().setVisible(true);
			VisualMain.getLblC_23().setVisible(true);
		}
		else if (aux_1.equals("panel_25")) {
			VisualMain.getLabel25().setVisible(true);
			VisualMain.getLblC_24().setVisible(true);
		}
		else if (aux_1.equals("panel_26")) {
			VisualMain.getLabel26().setVisible(true);
			VisualMain.getLblC_25().setVisible(true);
		}
		else if (aux_1.equals("panel_27")) {
			VisualMain.getLabel27().setVisible(true);
			VisualMain.getLblC_26().setVisible(true);
		}
		else if (aux_1.equals("panel_28")) {
			VisualMain.getLabel28().setVisible(true);
			VisualMain.getLblC_27().setVisible(true);
		}
		else if (aux_1.equals("panel_29")) {
			VisualMain.getLabel29().setVisible(true);
			VisualMain.getLblC_28().setVisible(true);
		}
		else if (aux_1.equals("panel_30")) {
			VisualMain.getLabel30().setVisible(true);
			VisualMain.getLblC_29().setVisible(true);
		}
		else if (aux_1.equals("panel_31")) {
			VisualMain.getLabel31().setVisible(true);
			VisualMain.getLblC_30().setVisible(true);
		}
		else if (aux_1.equals("panel_32")) {
			VisualMain.getLabel32().setVisible(true);
			VisualMain.getLblC_31().setVisible(true);
		}
		else if (aux_1.equals("panel_33")) {
			VisualMain.getLabel33().setVisible(true);
			VisualMain.getLblC_32().setVisible(true);
		}
		else if (aux_1.equals("panel_34")) {
			VisualMain.getLabel34().setVisible(true);
			VisualMain.getLblC_33().setVisible(true);
		}
		else if (aux_1.equals("panel_35")) {
			VisualMain.getLabel35().setVisible(true);
			VisualMain.getLblC_34().setVisible(true);
		}
	}
	
	private int getCode() {
		if (Caba�a809.canceled.size() == 0) {
			code++;
			return code - 1;
		}
		else {
			int code = Caba�a809.canceled.get(0);
			Caba�a809.canceled.remove(0);
			return code;
		}
	}
	
	private boolean hasExtension() {
		boolean result = false;
		for(Producto i: selected) {
			if (i.getNombre().equals("EXTENSI�N DE TIEMPO")) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	public void writeTicket(String room, String entryDate, String finalDate, String roomType) throws IOException, ClassNotFoundException {
		Producto hab = new Producto();
		writer = new FileWriter(new File(System.getProperty("user.home")+File.separator+"Files/ticket.txt"));
		writer.write("CABANA 809...\n");
		writer.write("RNC-05800189218 TU MEJOR ELECCION \n");
		writer.write("C / MILAGRO SANCHEZ, COTUI, R.D.\n");
		writer.write("809-240-0768\n");
		writer.write("----------------------------------\n");
		writer.write("    ***PARA CONSUMIDOR FINAL***   \n\n");
		writer.write("ATENDIO: CABANA 809\n\n");
		writer.write("HAB.: "+room+"\n\n");
		int cod = -1;
		String aux = "ORDEN NO: "+String.valueOf(this.option != 2 ? cod = getCode() : temp.getOrderNumber());
		ownCode = cod;
		int value = aux.length();
		for (int i=0;i<(34-value);i++)
			aux = " "+aux;
		writer.write(aux+"\n");
		writer.write("ENTRADA: "+(this.option == 1 ? entryDate.toUpperCase() : temp.getEntryDate())+"\n");
		writer.write("SALIDA: "+(this.option == 1 ? finalDate.toUpperCase() : temp.getFinalDate())+"\n");
		writer.write("----------------------------------\n");
		
		if (this.option != 2) {
			if (roomType.equals("fastRoom"))               {
				writer.write("1.00 HABITACION PASO        "+String.format("%.2f", Caba�a809.simpleFastRoomPrice+(Caba�a809.getInstance().discount < 0 ? Caba�a809.getInstance().discount*-1 : 0))+"\n");
				hab.setNombre("HABITACION PASO");
				hab.setPrecio(Caba�a809.simpleFastRoomPrice+(Caba�a809.getInstance().discount < 0 ? Caba�a809.getInstance().discount*-1 : 0));
				hab.setCantidad(1);
			}
			else if (roomType.equals("fastEjecutive"))     {
				writer.write("1.00 EJECUTIVA PASO        "+String.format("%.2f", Caba�a809.ejecutiveFastRoomPrice+(Caba�a809.getInstance().discount < 0 ? Caba�a809.getInstance().discount*-1 : 0))+"\n");
				hab.setNombre("EJECUTIVA PASO");
				hab.setPrecio(Caba�a809.ejecutiveFastRoomPrice+(Caba�a809.getInstance().discount < 0 ? Caba�a809.getInstance().discount*-1 : 0));
				hab.setCantidad(1);
			}
			else if (roomType.equals("simpleComplete"))    {
				writer.write("1.00 SIMPLE AMANECIDA       "+String.format("%.2f", Caba�a809.simpleCompleteRoomPrice+(Caba�a809.getInstance().discount < 0 ? Caba�a809.getInstance().discount*-1 : 0))+"\n");
				hab.setNombre("SIMPLE AMANECIDA");
				hab.setPrecio(Caba�a809.simpleCompleteRoomPrice+(Caba�a809.getInstance().discount < 0 ? Caba�a809.getInstance().discount*-1 : 0));
				hab.setCantidad(1);
			}
			else if (roomType.equals("ejecutiveComplete")) {
				writer.write("1.00 EJECUTIVA COMPLETA    "+String.format("%.2f", Caba�a809.ejecutiveCompleteRoomPrice+(Caba�a809.getInstance().discount < 0 ? Caba�a809.getInstance().discount*-1 : 0))+"\n");
				hab.setNombre("EJECUTIVA COMPLETA");
				hab.setPrecio(Caba�a809.ejecutiveCompleteRoomPrice+(Caba�a809.getInstance().discount < 0 ? Caba�a809.getInstance().discount*-1 : 0));
				hab.setCantidad(1);
			}
		}
		
		for (Producto i: selected) {
			String aux1 = String.format("%.2f",(float)i.getCantidad())+" "+i.getNombre();
			int value2 = aux1.length();
			aux = String.format("%.2f", i.getPrecio()*i.getCantidad());
			value = aux.length();
			for (int j=0;j<(34-value-value2);j++)
				aux = " "+aux;
			writer.write(aux1+aux+"\n");
		}
		writer.write("----------------------------------\n");
		aux = String.format("%.2f", setTotalAmount()- Caba�a809.getInstance().discount);
		value = aux.length();
		for (int i=0;i<(26-value);i++)
			aux = " "+aux;
		writer.write("IMPORTE:"+aux+"\n");
		writer.write("DESCUENTO:                  "+String.format("%.2f", Caba�a809.getInstance().discount < 0 ? 0 : Caba�a809.getInstance().discount)+"\n");
		writer.write("                       -----------\n");
		aux = String.format("%.2f", (setTotalAmount()- Caba�a809.getInstance().discount)*0.8475);
		value = aux.length();
		for (int i =0;i<(24-value);i++)
			aux = " "+aux;
		writer.write("SUB TOTAL:"+aux+"\n");
		writer.write("10 % LEGAL:                   0.00\n");
		aux = String.format("%.2f", (setTotalAmount()- Caba�a809.getInstance().discount)*0.1525);
		value = aux.length();
		for (int i =0;i<(28-value);i++)
			aux = " "+aux;
		writer.write("ITBIS:"+aux+"\n");
		writer.write("                       -----------\n");
		aux = String.format("%.2f", setTotalAmount()- Caba�a809.getInstance().discount);
		value = aux.length();
		for (int i =0;i<(28-value);i++)
			aux = " "+aux;
		writer.write("TOTAL:"+aux+"\n");
		writer.write("                  ================\n\n");
		writer.write("**********************************\n");
		writer.write("******GRACIAS POR PREFERIRNOS*****\n");
		writer.write("**********************************\n");
		writer.close();
		createTempFile(room, cod, hab, entryDate, finalDate);
		if (this.option == 2 && hasExtension()) {
			addExtension();
		}
	}
	
	private long calculateTime() {
		long base = 3600000;
		base *= Integer.parseInt(RoomExtension.time);
		if (RoomExtension.comboIndex == 2) {
			base /= 60;
		}
		return base;
	}
	
	private void addExtension(){
		Caba�a809.getInstance().getMisHabs().get(roomIndex).setFinalDate(Caba�a809.getInstance().getMisHabs().get(roomIndex).getFinalDate()+calculateTime());
	}
	
	private void createTemp(Temporal temp, String roomName) throws FileNotFoundException, IOException {
		String path = System.getProperty("user.home")+File.separator+"Files/Temporal";
		File file = new File(path);
		if (!file.exists()) file.mkdirs();
		objWriter = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.home")+File.separator+"Files/Temporal/"+roomName+".dat"));
		objWriter.writeObject(temp);
		objWriter.close();
	}
	
	private void createTempFile(String roomName, int orderNumber, Producto prod, String entryDate, String finalDate) throws IOException, ClassNotFoundException {
		String path1 = System.getProperty("user.home")+File.separator+"Files/Temporal/"+roomName+".dat";
		File fil = new File(path1);
		if (!fil.exists()) {
			selected.add(prod);
			Temporal temp = new Temporal(selected, roomName, orderNumber, entryDate, finalDate);
			createTemp(temp, roomName);
		}
		else {
			objReader = new ObjectInputStream(new FileInputStream(path1));
			Temporal temp = (Temporal) objReader.readObject();
			objReader.close();
			mergeProducts(temp.getProductos());
			temp.setProductos(selected);
			createTemp(temp, roomName);
		}
	}
	
	private void mergeProducts(ArrayList<Producto> list) {
		for(Producto i: list) {
			if (!issAdded(i.getNombre())) selected.add(i);
		}
	}
	
	private String getDate() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		calendar.setTime(date);
		String meridian = calendar.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";
		String year = null;
		String day = null;
		String aux = null;
		if (meridian.equals("PM")||calendar.get(Calendar.HOUR_OF_DAY)>=10) {
			calendar.setTimeInMillis(calendar.getTimeInMillis()+86400000);
			int m = calendar.get(Calendar.MONTH);
			year = String.valueOf(calendar.get(Calendar.YEAR));
			day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
			aux = day+"/"+String.valueOf(m+1)+"/"+year;
		}
		else {
			int m = calendar.get(Calendar.MONTH);
			year = String.valueOf(calendar.get(Calendar.YEAR));
			day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
			aux = day+"/"+String.valueOf(m+1)+"/"+year;
		}
		return aux;
	}
	@SuppressWarnings("deprecation")
	private long getTime() {
		String date = getDate1();
		long aux = 0l;
		Date date1 = new Date();
		String[] separate = date.split("/");
		String realDate = separate[3]+", "+separate[0]+" "+separate[1]+" "+separate[2]+" 10:00:00 GMT";
		aux = Date.parse(realDate)-date1.getTime()+14400000;
		return aux;
	}
	@SuppressWarnings("deprecation")
	private long getRealFinalDate() {
		long aux = 0;
		String date = getDate1();
		String[] separate = date.split("/");
		String realDate = separate[3]+", "+separate[0]+" "+separate[1]+" "+separate[2]+" 10:00:00 GMT";
		aux = Date.parse(realDate) + 14400000;
		return aux;
	}
	private String getDate1() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		calendar.setTime(date);
		String meridian = calendar.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";
		String year = null;
		String day = null;
		String aux = null;
		String weekDay = null;
		String month = null;
		if (meridian.equals("PM")||calendar.get(Calendar.HOUR_OF_DAY)>=10) {
			calendar.setTimeInMillis(calendar.getTimeInMillis()+86400000);
			int m = calendar.get(Calendar.MONTH);
			year = String.valueOf(calendar.get(Calendar.YEAR));
			day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
			month = getMonth(m);
			int wDay = calendar.get(Calendar.DAY_OF_WEEK);
			weekDay = getWeekDay(wDay);
			aux = day+"/"+month+"/"+year+"/"+weekDay;
		}
		else {
			int m = calendar.get(Calendar.MONTH);
			year = String.valueOf(calendar.get(Calendar.YEAR));
			day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
			month = getMonth(m);
			int wDay = calendar.get(Calendar.DAY_OF_WEEK);
			weekDay = getWeekDay(wDay);
			aux = day+"/"+month+"/"+year+"/"+weekDay;
		}
		return aux;
	}
	private String getWeekDay(int d) {
		String weekDay = null;
		if(d == 1)
        	weekDay = "Sun";
        else if(d == 2)
        	weekDay = "Mon";
        else if(d == 3)
        	weekDay = "Tue";
        else if(d == 4)
        	weekDay = "Wed";
        else if(d == 5)
        	weekDay = "Thu";
        else if(d == 6)
        	weekDay = "Fri";
        else if(d == 7)
        	weekDay = "Sat";
		
		return weekDay;
	}
	private String getMonth(int m) {
		String month= null;
		if(m == 0)
        	month = "Jan";
        else if(m == 1)
        	month = "Feb";
        else if(m == 2)
        	month = "Mar";
        else if(m == 3)
        	month = "Apr";
        else if(m == 4)
        	month = "May";
        else if(m == 5)
        	month = "Jun";
        else if(m == 6)
        	month = "Jul";
        else if(m == 7)
        	month = "Aug";
        else if(m == 8)
        	month = "Sep";
        else if(m == 9)
        	month = "Oct";
        else if(m == 10)
        	month = "Nov";
        else if(m == 11)
        	month = "Dec";
		
		return month;
	}
	public static String getRoomName(String panelName) {
		String aux = null;
		if (panelName.equals("panel_1"))
			aux = "C-1";
		else if (panelName.equals("panel_2"))
			aux = "C-2";
		else if (panelName.equals("panel_3"))
			aux = "C-3";
		else if (panelName.equals("panel_4"))
			aux = "C-4";
		else if (panelName.equals("panel_5"))
			aux = "C-5";
		else if (panelName.equals("panel_6"))
			aux = "C-6";
		else if (panelName.equals("panel_7"))
			aux = "C-7";
		else if (panelName.equals("panel_8"))
			aux = "C-8";
		else if (panelName.equals("panel_9"))
			aux = "C-9";
		else if (panelName.equals("panel_10"))
			aux = "C-10";
		else if (panelName.equals("panel_11"))
			aux = "C-11";
		else if (panelName.equals("panel_12"))
			aux = "C-12";
		else if (panelName.equals("panel_13"))
			aux = "C-13";
		else if (panelName.equals("panel_14"))
			aux = "C-14";
		else if (panelName.equals("panel_15"))
			aux = "C-15";
		else if (panelName.equals("panel_16"))
			aux = "C-16";
		else if (panelName.equals("panel_17"))
			aux = "C-17";
		else if (panelName.equals("panel_18"))
			aux = "C-18";
		else if (panelName.equals("panel_19"))
			aux = "C-19";
		else if (panelName.equals("panel_20"))
			aux = "C-20";
		else if (panelName.equals("panel_21"))
			aux = "C-21";
		else if (panelName.equals("panel_22"))
			aux = "C-22";
		else if (panelName.equals("panel_23"))
			aux = "C-23";
		else if (panelName.equals("panel_24"))
			aux = "C-24";
		else if (panelName.equals("panel_25"))
			aux = "C-25";
		else if (panelName.equals("panel_26"))
			aux = "C-26";
		else if (panelName.equals("panel_27"))
			aux = "C-27";
		else if (panelName.equals("panel_28"))
			aux = "C-28";
		else if (panelName.equals("panel_29"))
			aux = "C-29";
		else if (panelName.equals("panel_30"))
			aux = "C-30";
		else if (panelName.equals("panel_31"))
			aux = "C-31";
		else if (panelName.equals("panel_32"))
			aux = "C-32";
		else if (panelName.equals("panel_33"))
			aux = "C-33";
		else if (panelName.equals("panel_34"))
			aux = "C-34";
		else if (panelName.equals("panel_35"))
			aux = "C-35";
		
		
		return aux;
	}
	private String getEntryDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String aux = formatter.format(date);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		String meridian = calendar.get(Calendar.AM_PM) == Calendar.AM?"AM": "PM";
		aux = aux +" "+meridian;
		return aux;
	}
	private String getFinalDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.setTimeInMillis(calendar.getTimeInMillis()+14400000);
		Date date1 = calendar.getTime();
		String aux = formatter.format(date1);
		String meridian = calendar.get(Calendar.AM_PM) == Calendar.AM?"AM": "PM";
		aux = aux +" "+meridian;
		return aux;
	}
	public void printComponent() throws PrinterException{
		String content = txtAreaRecipe.getText();
		content += "\n\n\n\n\n\n\n\n\n\n";
		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
	    PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
	    PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);
	    PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();
	    PrintService service = ServiceUI.printDialog(null, 700, 200, printService, defaultService, flavor, pras);
	      
	    byte[] bytes = content.getBytes();
	    Doc doc = new SimpleDoc(bytes,flavor,null);
	    DocPrintJob job = null;
	    if (service != null) {
	    	job = service.createPrintJob();
	    	try {
	  	      job.print(doc, null);
	  	    } catch (Exception er) {
	  	      JOptionPane.showMessageDialog(null,"Error al imprimir: " + er.getMessage());
	  	    }
	    }
	}
	private void readTicket() throws IOException {
		reader = new BufferedReader(new FileReader(new File(System.getProperty("user.home")+File.separator+"Files/ticket.txt")));
		String aux = new String();
		String line=null;
		while((line = reader.readLine())!=null) {
			aux += line;
			aux += "\n";
		}
		txtAreaRecipe.setText(aux);
		reader.close();
	}
	private void setAllCancelFalse() {
		VisualMain.cancel = false;
		VisualMain.cancel1 = false;
		VisualMain.cancel2 = false;
		VisualMain.cancel3 = false;
		VisualMain.cancel4 = false;
		VisualMain.cancel5 = false;
		VisualMain.cancel6 = false;
		VisualMain.cancel7 = false;
		VisualMain.cancel8 = false;
		VisualMain.cancel9 = false;
		VisualMain.cancel10 = false;
		VisualMain.cancel11 = false;
		VisualMain.cancel12 = false;
		VisualMain.cancel13 = false;
		VisualMain.cancel14 = false;
		VisualMain.cancel15 = false;
		VisualMain.cancel16 = false;
		VisualMain.cancel17 = false;
		VisualMain.cancel18 = false;
		VisualMain.cancel19 = false;
		VisualMain.cancel20 = false;
		VisualMain.cancel21 = false;
		VisualMain.cancel22 = false;
		VisualMain.cancel23 = false;
		VisualMain.cancel24 = false;
		VisualMain.cancel25 = false;
		VisualMain.cancel26 = false;
		VisualMain.cancel27 = false;
		VisualMain.cancel28 = false;
		VisualMain.cancel29 = false;
		VisualMain.cancel30 = false;
		VisualMain.cancel31 = false;
		VisualMain.cancel32 = false;
		VisualMain.cancel33 = false;
		VisualMain.cancel34 = false;
		
	}
	public void resumeReservation() {
		t.start();		
	}
	public void enableRoom(String roomName) {
		for (Habitacion i: Caba�a809.getInstance().getMisHabs()) {
			if (i.getRoomName().equals(roomName)) {
				i.setTipo(null);
				i.setOnUse(false);
				i.setNumeroOrden(-1);
				break;
			}
		}
	}
	private void resumeForFast() {
		setAllCancelFalse();
		VisualMain.getPanel(roomName).setBackground(Color.GREEN);
		for (int i =0;i<VisualMain.getPanel(roomName).getComponentCount();i++) {
			VisualMain.getPanel(roomName).getComponent(i).setVisible(false);
		}
		label = new JLabel(getRoomName(roomName)+" En uso");
		label.setName("enUso");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
		label.setBounds(3, 20, 93, 14);
		VisualMain.getPanel(roomName).add(label);
		
		label1 = new JLabel(giveTime(14400));
		label1.setName("time");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
		label1.setBounds(3, 55, 93, 14);
		VisualMain.getPanel(roomName).add(label1);
	}
	private void resumeForComplete() {
		setAllCancelFalse();
		VisualMain.getPanel(roomName).setBackground(Color.GREEN);
		for (int i =0;i<VisualMain.getPanel(roomName).getComponentCount();i++) {
			VisualMain.getPanel(roomName).getComponent(i).setVisible(false);
		}
		label = new JLabel(getRoomName(roomName)+" En uso");
		label.setName("enUso");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
		label.setBounds(3, 10, 93, 14);
		VisualMain.getPanel(roomName).add(label);
		
		label1 = new JLabel(getDate());
		label1.setName("time");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
		label1.setBounds(0, 35, 100, 14);
		VisualMain.getPanel(roomName).add(label1);
		
		label2 = new JLabel("10:00 AM");
		label2.setName("time2");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
		label2.setBounds(-2, 60, 100, 14);
		VisualMain.getPanel(roomName).add(label2);
	}
}
