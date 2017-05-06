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
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class BorrarLog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9085346579474493397L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUser;
	private JPasswordField txtPassword;
	private JButton btnCancelar;

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
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 155, 383, 33);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("Acceder");
				okButton.setIcon(new ImageIcon(BorrarLog.class.getResource("/icons/accessGrantedIcon_opt.png")));
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
			
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setIcon(new ImageIcon(BorrarLog.class.getResource("/icons/cancelar_opt.png")));
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			buttonPane.add(btnCancelar);
		}
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Administraci\u00F3n", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 363, 139);
		contentPanel.add(panel);
		panel.setLayout(null);
		{
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setBounds(22, 35, 76, 14);
			panel.add(lblUsuario);
		}
		{
			JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
			lblContrasea.setBounds(22, 87, 76, 14);
			panel.add(lblContrasea);
		}
		{
			txtUser = new JTextField();
			txtUser.setBackground(new Color(211, 211, 211));
			txtUser.setBounds(107, 31, 211, 23);
			panel.add(txtUser);
			txtUser.setColumns(10);
		}
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(new Color(211, 211, 211));
		txtPassword.setBounds(107, 83, 117, 23);
		panel.add(txtPassword);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(BorrarLog.class.getResource("/icons/admin_opt.png")));
		label.setBounds(261, 66, 76, 67);
		panel.add(label);
	}
}
