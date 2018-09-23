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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RoomExtension extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7612482596828191920L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tiempo;
	private JTextField precio;
	private JComboBox<String> tipoTiempo;
	
	public static int comboIndex;
	public static String time;
	public static String price;

	public RoomExtension() {
		setTitle("Extensi\u00F3n");
		setBounds(100, 100, 358, 290);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		setModal(true);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Seleccione", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 13, 316, 179);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblTiempo = new JLabel("Tiempo: ");
		lblTiempo.setBounds(24, 55, 80, 16);
		panel.add(lblTiempo);
		
		tiempo = new JTextField();
		tiempo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c =  e.getKeyChar();
				if((c < '0' || c > '9'))
					e.consume();
			}
		});
		tiempo.setBounds(116, 52, 56, 23);
		panel.add(tiempo);
		tiempo.setColumns(10);
				
		tipoTiempo = new JComboBox<String>();
		tipoTiempo.setModel(new DefaultComboBoxModel<String>(new String[] {"<Seleccione>", "Horas", "Minutos"}));
		tipoTiempo.setBounds(184, 52, 120, 23);
		panel.add(tipoTiempo);
		
		JLabel lblPrecio = new JLabel("Precio: ");
		lblPrecio.setBounds(24, 113, 56, 16);
		panel.add(lblPrecio);
		
		precio = new JTextField();
		precio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c =  e.getKeyChar();
				if((c < '0' || c > '9'))
					e.consume();
			}
		});
		precio.setBounds(116, 110, 188, 23);
		panel.add(precio);
		precio.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String reason = "Elementos faltantes: \n";
						if (precio.getText().equals("")) reason += "- Precio\n";
						if (tipoTiempo.getSelectedIndex() == 0) reason += "- Tipo de tiempo\n";
						if (tiempo.getText().equals("")) reason += "- Tiempo\n";
						if (reason.equalsIgnoreCase("Elementos faltantes: \n")) {
							price = precio.getText();
							comboIndex = tipoTiempo.getSelectedIndex();
							time = tiempo.getText();
							RentRoom.selected.add(new Producto("EXTENSIÓN DE TIEMPO",Float.parseFloat(price),1));
							RentRoom.loadSelected();
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, reason, "Error", JOptionPane.ERROR_MESSAGE, null);
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
