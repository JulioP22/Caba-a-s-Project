package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import logical.Producto;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductAmount extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8821747844894991087L;
	private final JPanel contentPanel = new JPanel();
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public ProductAmount(final Producto product) {
		setTitle("Cantidad de productos");
		setBounds(100, 100, 396, 209);
		setModal(true);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Seleccione la cantidad", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 360, 115);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCantidad = new JLabel("Cantidad:  ");
				lblCantidad.setFont(new Font("Century Schoolbook", Font.PLAIN, 15));
				lblCantidad.setBounds(23, 53, 89, 14);
				panel.add(lblCantidad);
			}
			
			spinner = new JSpinner();
			spinner.setBounds(122, 52, 149, 20);
			panel.add(spinner);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (Integer.valueOf(spinner.getValue().toString())>0) {
							product.setCantidad(Integer.valueOf(spinner.getValue().toString()));
							RentRoom.addSelected(product);
							RentRoom.loadSelected();
							dispose();
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
