package visual;

import java.awt.BorderLayout;
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

import javax.swing.JPasswordField;

import logical.Cabaña809;
import logical.Producto;
import java.awt.Font;
import java.awt.Toolkit;

public class BorrarLog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9085346579474493397L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUser;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			LoginMod dialog = new LoginMod();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public BorrarLog() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BorrarLog.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		setFont(new Font("Elephant", Font.PLAIN, 12));
		setTitle("Iniciar Sesi\u00F3n\r\n");
		setBounds(100, 100, 399, 226);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setBounds(10, 45, 76, 14);
			contentPanel.add(lblUsuario);
		}
		{
			JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
			lblContrasea.setBounds(10, 108, 76, 14);
			contentPanel.add(lblContrasea);
		}
		{
			txtUser = new JTextField();
			txtUser.setBounds(135, 42, 126, 20);
			contentPanel.add(txtUser);
			txtUser.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 155, 383, 33);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("Acceder");
				okButton.addActionListener(new ActionListener() {
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e) {
						if(txtUser.getText().equalsIgnoreCase("Diego") && txtPassword.getText().equalsIgnoreCase("flamenco"))
						{
							Producto aux = Cabaña809.getInstance().buscarProductoporNombre(Cabaña809.nombre);
							  int delete = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar el producto: " + aux.getNombre(), null, JOptionPane.YES_NO_OPTION);
								    if (delete == JOptionPane.YES_OPTION)
								    {
								    	Cabaña809.getInstance().borrarProducto(Cabaña809.nombre);
								    	
								    }dispose();
						}else{JOptionPane.showMessageDialog(null, "Contraseña incorrecta", null, JOptionPane.ERROR_MESSAGE, null);}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(135, 105, 157, 20);
		contentPanel.add(txtPassword);
	}
}
