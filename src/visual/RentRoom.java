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

import logical.Cabaña809;
import logical.Producto;

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
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

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
    
	private static ArrayList<Producto> selected;
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
	public static int code;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public RentRoom(final String roomName) {
		this.roomName = roomName;
		setTitle("Alquiler de caba\u00F1a");
		setBounds(100, 100, 530, 378);
		setModal(true);
		setLocationRelativeTo(null);
		setResizable(false);
		
		t = new Thread(this);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setTotalAmount();
			}
		});
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		selected = new ArrayList<>();
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Productos disponibles", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 81, 253, 193);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 233, 125);
		panel_2.add(scrollPane);
		
		{
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Tipo de caba\u00F1a", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 11, 253, 59);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			ejecutiva = new JRadioButton("Ejecutiva");
			ejecutiva.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sencilla.setSelected(false);
					ejecutiva.setSelected(true);
				}
			});
			ejecutiva.setBounds(19, 23, 91, 23);
			panel.add(ejecutiva);
			
			sencilla = new JRadioButton("Sencilla");
			sencilla.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sencilla.setSelected(true);
					ejecutiva.setSelected(false);
				}
			});
			sencilla.setBounds(162, 23, 73, 23);
			panel.add(sencilla);
		}
		ejecutiva.setSelected(true);
		sencilla.setSelected(false);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Seleccionado", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_3.setBounds(273, 81, 241, 193);
		contentPanel.add(panel_3);
		panel_3.setLayout(null);
		
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 22, 221, 125);
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
			panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Servicio", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel_1.setBounds(273, 11, 241, 59);
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
				dePaso.setBounds(25, 23, 90, 23);
				panel_1.add(dePaso);
			}
			
			amanecida = new JRadioButton("Amanecida");
			amanecida.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dePaso.setSelected(false);
					amanecida.setSelected(true);
				}
			});
			amanecida.setBounds(145, 23, 90, 23);
			panel_1.add(amanecida);
		}
		dePaso.setSelected(true);
		amanecida.setSelected(false);
		
		addButton = new JButton("A\u00F1adir");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow()>=0) {
					int index = table.getSelectedRow();
					if (!isAdded(Cabaña809.getInstance().getMisProduc().get(index).getNombre())) {
				    	Producto product = Cabaña809.getInstance().getMisProduc().get(index);
					    ProductAmount amount = new ProductAmount(product);
					    amount.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Este producto ya ha sido agregado");
					}
				}
			}
		});
		addButton.setBounds(154, 159, 89, 23);
		panel_2.add(addButton);
		
		addButton.setEnabled(false);
		
		deleteButton = new JButton("Eliminar");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table_1.getSelectedRow()>=0) {
					selected.remove(table_1.getSelectedRow());
					loadSelected();
				}
			}
		});
		deleteButton.setBounds(143, 159, 88, 23);
		deleteButton.setEnabled(false);
		
		panel_3.add(deleteButton);
		
		lblMontoTotal = new JLabel("Monto total: ");
		lblMontoTotal.setFont(new Font("Century Schoolbook", Font.ITALIC, 14));
		lblMontoTotal.setBounds(306, 289, 93, 14);
		contentPanel.add(lblMontoTotal);
		
		priceLabel = new JLabel("0.00");
		priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		priceLabel.setFont(new Font("Century Schoolbook", Font.ITALIC, 14));
		priceLabel.setBounds(395, 289, 68, 14);
		contentPanel.add(priceLabel);
		
		lblNewLabel = new JLabel("RD$");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.ITALIC, 14));
		lblNewLabel.setBounds(473, 285, 31, 22);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Reservar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						VisualMain.getPanel(roomName).setBackground(Color.GREEN);
						for (int i =0;i<VisualMain.getPanel(roomName).getComponentCount();i++) {
							VisualMain.getPanel(roomName).getComponent(i).setVisible(false);
						}if (dePaso.isSelected()) {
							label = new JLabel("En uso");
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
							String aux = null;
							if (sencilla.isSelected())
								aux = "fastRoom";
							else
								aux="fastEjecutive";
							
							try {
								writeTicket(getRoomName(roomName), getEntryDate(), getFinalDate(), aux);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							t.start();
							dispose();
						}else if (amanecida.isSelected()) {
							label = new JLabel("En uso");
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
							String aux = null;
							if (sencilla.isSelected())
								aux = "simpleComplete";
							else
								aux="ejecutiveComplete";
							
							try {
								writeTicket(getRoomName(roomName), getEntryDate(), getDate()+" 10:00:00", aux);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							t.start();
							dispose();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		loadProducts();
	}
	private void loadProducts() {
	   	tableModel.setRowCount(0);
	   	DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
	   	tcr.setHorizontalAlignment(SwingConstants.CENTER);
	   	table.getColumnModel().getColumn(0).setCellRenderer(tcr);
	   	table.getColumnModel().getColumn(1).setCellRenderer(tcr);
	   	row = new Object[tableModel.getColumnCount()];
	   	for (Producto pr: Cabaña809.getInstance().getMisProduc()) {
	   	    row[0]=pr.getNombre();
	   	    row[1]=pr.getPrecio();
	   	    tableModel.addRow(row);
	   	}
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
    	if (ejecutiva.isSelected() && dePaso.isSelected())
    		aux += Cabaña809.ejecutiveFastRoomPrice;
    	else if (ejecutiva.isSelected() && amanecida.isSelected())
    		aux += Cabaña809.ejecutiveCompleteRoomPrice;
    	else if (sencilla.isSelected() && dePaso.isSelected())
    		aux += Cabaña809.simpleFastRoomPrice;
    	else
    		aux += Cabaña809.simpleCompleteRoomPrice;
    	
    	for (Producto i: selected) {
    		aux += i.getPrecio()*i.getCantidad();
    	}
    	priceLabel.setText(String.valueOf(aux));
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
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String aux_1 = roomName;
		boolean completeNight = amanecida.isSelected();
		Color red = Color.red;
		if (dePaso.isSelected()) {
			long seconds = 14400;
			while(currentThread == t) {
				String aux = RentRoom.giveTime(seconds);
				label1.setText(aux);
				if (seconds<3600)
					VisualMain.getPanel(aux_1).setBackground(red);
				seconds--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (seconds==0) {
					label1.setVisible(false);
					label.setVisible(false);
					if (completeNight)
						label2.setVisible(false);
					break;
				}
			}
		}else {
			while (true) {
				long time = getTime();
				if (time<3600000)
					VisualMain.getPanel(aux_1).setBackground(red);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(time);
				if (time<=1000) {
					label1.setVisible(false);
					label.setVisible(false);
					if (completeNight)
						label2.setVisible(false);
					break;
				}
			}
		}
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
	public void writeTicket(String room, String entryDate, String finalDate, String roomType) throws IOException {
		writer = new FileWriter(new File("ticket.txt"));
		writer.write("CABAÑA 809...\n");
		writer.write("RNC-05800189218 TU MEJOR ELECCION \n");
		writer.write("C / Milagro Sánchez, Cotuí, R.D.\n");
		writer.write("809-240-0768\n");
		writer.write("----------------------------------\n");
		writer.write("Atendió: CABAÑA 809\n\n");
		writer.write("Hab.: "+room+"\n\n");
		writer.write("                       Orden No: "+String.valueOf(code++)+"\n");
		writer.write("Entrada: "+entryDate+"\n");
		writer.write("Salida: "+finalDate+"\n");
		writer.write("----------------------------------\n");
		if (roomType.equals("fastRoom"))
			writer.write("1.00 HABITACION PASO        "+String.format("%.2f", Cabaña809.simpleFastRoomPrice)+"\n");
		else if (roomType.equals("fastEjecutive"))
			writer.write("1.00 EJECUTIVA PASO        "+String.format("%.2f", Cabaña809.ejecutiveFastRoomPrice)+"\n");
		else if (roomType.equals("simpleComplete"))
			writer.write("1.00 SIMPLE AMANECIDA       "+String.format("%.2f", Cabaña809.simpleCompleteRoomPrice)+"\n");
		else if (roomType.equals("ejecutiveComplete"))
			writer.write("1.00 EJECUTIVA COMPLETA    "+String.format("%.2f", Cabaña809.ejecutiveCompleteRoomPrice)+"\n");
		for (Producto i: selected) {
			writer.write(String.format("%.2f",(float)i.getCantidad())+" "+i.getNombre()+"             "+String.format("%.2f", i.getPrecio()*i.getCantidad())+"\n");
		}
		writer.write("----------------------------------\n");
		writer.write("IMPORTE:                   "+String.format("%.2f", setTotalAmount())+"\n");
		writer.write("DESCUENTO:                    0.00\n");
		writer.write("                       -----------\n");
		writer.write("SUB TOTAL:                 "+String.format("%.2f", setTotalAmount())+"\n");
		writer.write("10 % LEGAL:                   0.00\n");
		writer.write("ITBIS:                      "+String.format("%.2f", setTotalAmount()*0.1525)+"\n");
		writer.write("                       -----------\n");
		writer.write("TOTAL:                     "+String.format("%.2f", setTotalAmount())+"\n");
		writer.write("                  ================\n\n");
		writer.write("**********************************\n");
		writer.write("******GRACIAS POR PREFERIRNOS*****\n");
		writer.write("**********************************\n");
		writer.close();
		
		
	}
	private String getDate() {
		Calendar calendar = new GregorianCalendar();
		Date date = new Date();
		calendar.setTime(date);
		String meridian = calendar.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";
		String year = null;
		String day = null;
		String aux = null;
		if (meridian.equals("PM")) {
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
	private String getRoomName(String panelName) {
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
		return aux;
	}
    
}
