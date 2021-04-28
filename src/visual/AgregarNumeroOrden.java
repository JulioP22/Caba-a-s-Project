package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logical.Cabaña809;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

public class AgregarNumeroOrden extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JSpinner numeroOrden;

	/**
	 * Launch the application.
	 */
	/**
	 * 
	 * public static void main(String[] args) {
		try {
			AgregarNumeroOrden dialog = new AgregarNumeroOrden();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	/**
	 * Create the dialog.
	 */
	public AgregarNumeroOrden() {
		setTitle("Agregar n\u00FAmero de orden");
		setBounds(100, 100, 374, 132);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("N\u00FAmero de orden");
			lblNewLabel.setBounds(12, 22, 115, 16);
			contentPanel.add(lblNewLabel);
		}
		
		numeroOrden = new JSpinner();
		numeroOrden.setBounds(139, 19, 205, 22);
		contentPanel.add(numeroOrden);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int number = (int) numeroOrden.getValue();
						if (number > 0) {
							Cabaña809.canceled.add(0, number);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "El número de orden debe ser mayor a 0", "", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
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
	}
}
