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

public class LoginMod extends JDialog {

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
	public LoginMod() {
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
					public void actionPerformed(ActionEvent e) {
						if(txtUser.getText().equalsIgnoreCase("Diego") && txtPassword.getText().equalsIgnoreCase("flamenco"))
						{
							NuevoProducto modify = new NuevoProducto(true, 0);
							modify.setVisible(true);
							dispose();
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
