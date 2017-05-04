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
import logical.Producto;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseMotionAdapter;

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
	private Thread t;
	private String roomName;

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
					if (!isAdded(Caba�a809.getInstance().getMisProduc().get(index).getNombre())) {
				    	Producto product = Caba�a809.getInstance().getMisProduc().get(index);
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
						}
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
						
						t.start();
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
	   	for (Producto pr: Caba�a809.getInstance().getMisProduc()) {
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
    private void setTotalAmount() {
    	float aux = 0f;
    	if (ejecutiva.isSelected() && dePaso.isSelected())
    		aux += Caba�a809.ejecutiveFastRoomPrice;
    	else if (ejecutiva.isSelected() && amanecida.isSelected())
    		aux += Caba�a809.ejecutiveCompleteRoomPrice;
    	else if (sencilla.isSelected() && dePaso.isSelected())
    		aux += Caba�a809.simpleFastRoomPrice;
    	else
    		aux += Caba�a809.simpleFastRoomPrice;
    	
    	for (Producto i: selected) {
    		aux += i.getPrecio()*i.getCantidad();
    	}
    	priceLabel.setText(String.valueOf(aux));
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
		long seconds = 3605;
		Color red = Color.red;
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
				break;
			}
		}
		
	}

    
}