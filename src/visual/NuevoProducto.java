package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logical.Cabaña809;
import logical.Producto;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NuevoProducto extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8877128066341451280L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JButton addBtn;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public NuevoProducto(final boolean modify, final int index) {
		setTitle("A\u00F1adir nuevo producto\r\n\r\n");
		setBounds(100, 100, 340, 239);
		setModal(true);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Producto", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 304, 156);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 40, 61, 14);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(91, 37, 185, 21);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(20, 98, 61, 14);
		panel.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c =  e.getKeyChar();
				if((c < '0' || c > '9') && c != '.')
					e.consume();
				if (dotAmount() && c=='.')
					e.consume();
				if (c=='.' &&txtPrecio.getText().length()==0)
					e.consume();
			}
		});
		txtPrecio.setBounds(91, 95, 86, 21);
		panel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(NuevoProducto.class.getResource("/icons/store-add-on_opt.png")));
		lblNewLabel.setBounds(220, 69, 56, 61);
		panel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				if (!modify)
					addBtn = new JButton("A\u00F1adir");
				else
					addBtn = new JButton("Modificar");
				addBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!modify) {
							
							
							if(!txtNombre.getText().equalsIgnoreCase("")&& !txtPrecio.getText().equalsIgnoreCase("")){
								if (!existingProduct(txtNombre.getText())) {
									Producto aux = null;
									String nombre = txtNombre.getText();
									float precio = new Float (txtPrecio.getText().toString());
									
									aux = new Producto(nombre, precio);
									Cabaña809.getInstance().agregarProduc(aux);
									JOptionPane.showMessageDialog(null, "El producto ''" + nombre+"'' se agregó sastifactoriamente.", null, JOptionPane.INFORMATION_MESSAGE, null);
									limpiar();
								}
								else {
									JOptionPane.showMessageDialog(null, "Producto existente", null, JOptionPane.WARNING_MESSAGE, null);
								}
							}else{
								JOptionPane.showMessageDialog(null, "Verifique que todos los campos estén llenos", null, JOptionPane.WARNING_MESSAGE, null);
	
							}
					}
						else {
							if (!txtPrecio.getText().equalsIgnoreCase("")) {
								Cabaña809.getInstance().getMisProduc().get(index).setPrecio(Float.parseFloat(txtPrecio.getText()));
								JOptionPane.showMessageDialog(null, "Producto modificado", null, JOptionPane.INFORMATION_MESSAGE, null);
								Oferta.loadProductList();
								dispose();
							}
							else {
								JOptionPane.showMessageDialog(null, "Verifique que todos los campos estén llenos", null, JOptionPane.WARNING_MESSAGE, null);
							}
						}
					}

					
				});
				addBtn.setActionCommand("OK");
				buttonPane.add(addBtn);
				getRootPane().setDefaultButton(addBtn);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		if (modify) {
			load(index);
			txtNombre.setEditable(false);
		}
		
	}
	   private boolean dotAmount() {
		   boolean aux = false;
		   String aux1 = txtPrecio.getText();
		   char[] aux2 = aux1.toCharArray();
		   for (int i =0;i<aux2.length;i++) {
			   if (aux2[i]=='.')
				   aux = true;
		   }
		   return aux;
	   }
	   private void limpiar() {
			txtNombre.setText("");
			txtPrecio.setText("");	
	  }
	   private boolean existingProduct(String name) {
		   boolean aux = false;
	    	for(Producto i: Cabaña809.getInstance().getMisProduc()) {
	    		if (i.getNombre().equals(name))
	    			aux = true;
	    	}
	    	return aux;
	   }
	   private void load(int index) {
		   Producto product = Cabaña809.getInstance().getMisProduc().get(index);
		   txtNombre.setText(product.getNombre());
		   txtPrecio.setText(String.valueOf(product.getPrecio()));
	   }
	   
}
