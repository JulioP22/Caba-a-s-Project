package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logical.Cabaña809;
import logical.Producto;

public class NuevoProducto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			NuevoProducto dialog = new NuevoProducto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public NuevoProducto() {
		setTitle("A\u00F1adir nuevo producto\r\n\r\n");
		setBounds(100, 100, 375, 223);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 45, 60, 14);
		contentPanel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(97, 42, 186, 21);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 105, 46, 14);
		contentPanel.add(lblPrecio);
		
		txtPrecio = new JTextField();
		/*try{
			MaskFormatter mascaral= new MaskFormatter("####");
			mascaral.setPlaceholderCharacter(' ');
			txtPrecio =new JFormattedTextField(mascaral);
			txtPrecio.setBackground(Color.WHITE);
			txtPrecio.setForeground(Color.BLACK);
		} catch(Exception e){}*/
		txtPrecio.setBounds(97, 102, 98, 21);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton addBtn = new JButton("A\u00F1adir");
				addBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!txtNombre.getText().equalsIgnoreCase("")&& !txtPrecio.getText().equalsIgnoreCase("")){
							
							Producto aux = null;
							String nombre = txtNombre.getText();
							float precio = new Float (txtPrecio.getText().toString());
							
							aux = new Producto(nombre, precio);
							Cabaña809.getInstance().agregarProduc(aux);
							JOptionPane.showMessageDialog(null, "El producto ''" + nombre+"'' se agregó sastifactoriamente.", null, JOptionPane.INFORMATION_MESSAGE, null);
							limpiar();
						}else{
							JOptionPane.showMessageDialog(null, "Verifique que todos los campos estén llenos", null, JOptionPane.WARNING_MESSAGE, null);

						}
					}

					private void limpiar() {
						txtNombre.setText("");
						txtPrecio.setText("");
						
					}
				});
				addBtn.setActionCommand("OK");
				buttonPane.add(addBtn);
				getRootPane().setDefaultButton(addBtn);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
