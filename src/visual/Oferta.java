package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;






import javax.swing.table.TableColumnModel;




import logical.Cabaña809;
import logical.Producto;

import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;


public class Oferta extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = -616154394206540662L;
	private final JPanel contentPanel = new JPanel();
	private static JTable table;
	private static Object[] fila;
	private static DefaultTableModel tableModel;
	public static int code;
	private JButton btnEliminar;
	private JButton btnModificar;
	public static ArrayList<Producto>producsAux;
	

	
	public Oferta() {
		setType(Type.POPUP);
		setTitle("Listado de Productos\r\n");
		setBounds(100, 100, 462, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		producsAux = new ArrayList<>();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Lista", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 436, 306);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 416, 274);
		panel.add(scrollPane);
		
		
		table = new JTable();
		
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			/*String country;
				int delivery;*/
				if(table.getSelectedRow()>=0){
					btnModificar.setEnabled(true);
					btnEliminar.setEnabled(true);
					int index = table.getSelectedRow();
					Cabaña809.nombre = (String)table.getModel().getValueAt(index, 0);
					
					/*country = (String)tableSupply.getModel().getValueAt(index, 1);
					delivery = (Integer)tableSupply.getModel().getValueAt(index, 2);
					textFldSupplyName.setText(name);
					spnDelivery.getModel().setValue(Integer.valueOf(delivery));
					cbCountry.getModel().setSelectedItem(new String(country));*/
				}
			}
		});
		
		tableModel = new DefaultTableModel();
		String[] columnNames = {"Nombre","Precio"};
		tableModel.setColumnIdentifiers(columnNames);
		loadProductList();
		scrollPane.setViewportView(table);
		
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 328, 446, 33);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				btnEliminar = new JButton("Eliminar");
				btnEliminar.setIcon(new ImageIcon(Oferta.class.getResource("/icons/deleteIcon_opt.png")));
				btnEliminar.setEnabled(false);
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						BorrarLog o = new BorrarLog();
						o.setModal(true);
						o.setLocationRelativeTo(null);
						o.setResizable(false);
						o.setVisible(true);
						btnEliminar.setEnabled(false);
						btnModificar.setEnabled(false);
					}
				});
				
				btnModificar = new JButton("Modificar");
				btnModificar.setIcon(new ImageIcon(Oferta.class.getResource("/icons/modifyIcon_opt.png")));
				btnModificar.setEnabled(false);
				btnModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						LoginMod o = new LoginMod(false);
						o.setVisible(true);
						
						/*if (table.getSelectedRow()>=0) {
							NuevoProducto modify = new NuevoProducto(true, table.getSelectedRow());
							modify.setVisible(true);
						}*/
					}
				});
				
				buttonPane.add(btnModificar);
				btnEliminar.setActionCommand("OK");
				buttonPane.add(btnEliminar);
				getRootPane().setDefaultButton(btnEliminar);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setIcon(new ImageIcon(Oferta.class.getResource("/icons/cancelar_opt.png")));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}}
		}
		

		
		public static void loadProductList() {
			
			Collections.sort(Cabaña809.getInstance().getMisProduc(), new Comparator<Producto>() {
				@Override
				public int compare(Producto p1, Producto p2) {

					return new String( p1.getNombre()).compareTo(new String( p2.getNombre()));
				}
			});
			
			tableModel.setRowCount(0);
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		   	tcr.setHorizontalAlignment(SwingConstants.CENTER);
			fila = new Object[tableModel.getColumnCount()];
			for (Producto aux : Cabaña809.getInstance().getMisProduc()) 	
			{
				fila[0] = aux.getNombre();
				fila[1] = aux.getPrecio();
				tableModel.addRow(fila);
			}	
		
	
			table.setModel(tableModel);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.getTableHeader().setReorderingAllowed(false);
			
			TableColumnModel columnModel = table.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(250);
			columnModel.getColumn(1).setPreferredWidth(163);
		   	table.getColumnModel().getColumn(0).setCellRenderer(tcr);
		   	table.getColumnModel().getColumn(1).setCellRenderer(tcr);
			
		}
}
