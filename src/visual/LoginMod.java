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
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class LoginMod extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5020634074989123153L;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginMod.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		setTitle("Iniciar Sesi\u00F3n\r\n");
		setBounds(100, 100, 399, 226);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 155, 383, 33);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("Acceder");
				okButton.setIcon(new ImageIcon(LoginMod.class.getResource("/icons/accessGrantedIcon_opt.png")));
				okButton.addActionListener(new ActionListener() {
					@SuppressWarnings("deprecation")
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
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setIcon(new ImageIcon(LoginMod.class.getResource("/icons/cancelar_opt.png")));
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			buttonPane.add(btnCancelar);
		}
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Administrador", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 363, 139);
		contentPanel.add(panel);
		panel.setLayout(null);
		{
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setBounds(22, 35, 75, 14);
			panel.add(lblUsuario);
		}
		{
			txtUser = new JTextField();
			txtUser.setBackground(new Color(211, 211, 211));
			txtUser.setBounds(107, 31, 211, 23);
			panel.add(txtUser);
			txtUser.setColumns(10);
		}
		{
			JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
			lblContrasea.setBounds(22, 87, 76, 14);
			panel.add(lblContrasea);
		}
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(new Color(211, 211, 211));
		txtPassword.setBounds(107, 83, 117, 23);
		panel.add(txtPassword);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginMod.class.getResource("/icons/admin_opt.png")));
		lblNewLabel.setBounds(261, 66, 76, 67);
		panel.add(lblNewLabel);
	}
}
