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
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

import logical.Caba�a809;
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
	private JLabel showPassLabel;
	private JTextField showPass;

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
							  Producto aux = Caba�a809.getInstance().buscarProductoporNombre(Caba�a809.nombre);
							  if (aux != null) {
								  int delete = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar el producto: " + aux.getNombre()+"?", null, JOptionPane.YES_NO_OPTION);
									    if (delete == JOptionPane.YES_OPTION){
									    	Caba�a809.getInstance().borrarProducto(Caba�a809.nombre);	
									    }
									    Oferta.loadProductList();
									    dispose();
							  }
							  else {
								  JOptionPane.showMessageDialog(null, "No hay ning�n producto seleccionado", "Error", JOptionPane.ERROR_MESSAGE, null);
							  }
						}
						else{
							JOptionPane.showMessageDialog(null, "Contrase�a incorrecta", null, JOptionPane.ERROR_MESSAGE, null);
						}
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
		
		showPassLabel = new JLabel("");
		showPassLabel.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					showPassLabel.setIcon(new ImageIcon(LoginMod.class.getResource("/icons/backTransition.png")));
					if (txtPassword.getPassword().length!=0) {
						txtPassword.setVisible(false);
						showPass.setVisible(true);
						showPass.setText(txtPassword.getText());
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					showPassLabel.setIcon(new ImageIcon(LoginMod.class.getResource("/icons/modificar_opt.png")));
					txtPassword.setVisible(true);
					showPass.setVisible(false);
				}
			}
		});
		showPassLabel.setIcon(new ImageIcon(BorrarLog.class.getResource("/icons/modificar_opt.png")));
		showPassLabel.setBounds(228, 83, 23, 23);
		panel.add(showPassLabel);
		
		showPass = new JTextField();
		showPass.setBackground(new Color(211, 211, 211));
		showPass.setBounds(107, 83, 117, 23);
		panel.add(showPass);
		showPass.setColumns(10);
	}
}
