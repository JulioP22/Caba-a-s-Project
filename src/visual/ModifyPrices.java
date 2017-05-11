package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import logical.Cabaña809;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ModifyPrices extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8648121498601446682L;
	private final JPanel contentPanel = new JPanel();
	private JTextField fastRoom;
	private JTextField fastExecutive;
	private JTextField simpleComplete;
	private JTextField executiveComplete;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public ModifyPrices() {
		setTitle("Modificar precios");
		setBounds(100, 100, 450, 300);
		setModal(true);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Precios", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 414, 206);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblHabitacinPaso = new JLabel("Habitaci\u00F3n Paso:");
				lblHabitacinPaso.setBounds(20, 30, 128, 14);
				panel.add(lblHabitacinPaso);
			}
			{
				JLabel lblEjecutivaPaso = new JLabel("Ejecutiva Paso: ");
				lblEjecutivaPaso.setBounds(20, 75, 128, 14);
				panel.add(lblEjecutivaPaso);
			}
			{
				JLabel lblHabitacinAmanecida = new JLabel("Habitaci\u00F3n amanecida: ");
				lblHabitacinAmanecida.setBounds(20, 120, 148, 14);
				panel.add(lblHabitacinAmanecida);
			}
			{
				JLabel lblEjecutivaAmanecida = new JLabel("Ejecutiva amanecida: ");
				lblEjecutivaAmanecida.setBounds(20, 165, 128, 14);
				panel.add(lblEjecutivaAmanecida);
			}
			
			fastRoom = new JTextField();
			fastRoom.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c =  e.getKeyChar();
					if((c < '0' || c > '9') && c != '.')
						e.consume();
					if (dotAmount(fastRoom) && c=='.')
						e.consume();
					if (c=='.' &&fastRoom.getText().length()==0)
						e.consume();
				}
			});
			fastRoom.setBackground(new Color(211, 211, 211));
			fastRoom.setBounds(178, 26, 196, 23);
			panel.add(fastRoom);
			fastRoom.setColumns(10);
			
			fastExecutive = new JTextField();
			fastExecutive.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c =  e.getKeyChar();
					if((c < '0' || c > '9') && c != '.')
						e.consume();
					if (dotAmount(fastExecutive) && c=='.')
						e.consume();
					if (c=='.' &&fastExecutive.getText().length()==0)
						e.consume();
				}
			});
			fastExecutive.setBackground(new Color(211, 211, 211));
			fastExecutive.setColumns(10);
			fastExecutive.setBounds(178, 71, 196, 23);
			panel.add(fastExecutive);
			
			simpleComplete = new JTextField();
			simpleComplete.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c =  e.getKeyChar();
					if((c < '0' || c > '9') && c != '.')
						e.consume();
					if (dotAmount(simpleComplete) && c=='.')
						e.consume();
					if (c=='.' &&simpleComplete.getText().length()==0)
						e.consume();
				}
			});
			simpleComplete.setBackground(new Color(211, 211, 211));
			simpleComplete.setColumns(10);
			simpleComplete.setBounds(178, 116, 115, 23);
			panel.add(simpleComplete);
			
			executiveComplete = new JTextField();
			executiveComplete.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c =  e.getKeyChar();
					if((c < '0' || c > '9') && c != '.')
						e.consume();
					if (dotAmount(executiveComplete) && c=='.')
						e.consume();
					if (c=='.' &&executiveComplete.getText().length()==0)
						e.consume();
				}
			});
			executiveComplete.setBackground(new Color(211, 211, 211));
			executiveComplete.setColumns(10);
			executiveComplete.setBounds(178, 161, 115, 23);
			panel.add(executiveComplete);
			{
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(ModifyPrices.class.getResource("/icons/moneda.png")));
				lblNewLabel.setBounds(317, 112, 64, 67);
				panel.add(lblNewLabel);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Modificar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (fastRoom.getText().equals("")||executiveComplete.getText().equals("")||simpleComplete.getText().equals("")||fastExecutive.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Verifique todos los campos", "Campos vacios", JOptionPane.WARNING_MESSAGE, null);
						}else {
							Cabaña809.simpleFastRoomPrice = Float.parseFloat(fastRoom.getText());
							Cabaña809.ejecutiveFastRoomPrice = Float.parseFloat(fastExecutive.getText());
							Cabaña809.simpleCompleteRoomPrice = Float.parseFloat(simpleComplete.getText());
							Cabaña809.ejecutiveCompleteRoomPrice = Float.parseFloat(executiveComplete.getText());
							JOptionPane.showMessageDialog(null, "Los precios han sido modificados", "Precios modificados", JOptionPane.INFORMATION_MESSAGE, null);
							dispose();
						}
					}
				});
				okButton.setIcon(new ImageIcon(ModifyPrices.class.getResource("/icons/modifyIcon_opt.png")));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setIcon(new ImageIcon(ModifyPrices.class.getResource("/icons/cancelar_opt.png")));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		load();
	}
	private void load() {
		fastRoom.setText(String.valueOf(Cabaña809.simpleFastRoomPrice));
		fastExecutive.setText(String.valueOf(Cabaña809.ejecutiveFastRoomPrice));
		simpleComplete.setText(String.valueOf(Cabaña809.simpleCompleteRoomPrice));
		executiveComplete.setText(String.valueOf(Cabaña809.ejecutiveCompleteRoomPrice));
	}
	private boolean dotAmount(JTextField text) {
		   boolean aux = false;
		   String aux1 = text.getText();
		   char[] aux2 = aux1.toCharArray();
		   for (int i =0;i<aux2.length;i++) {
			   if (aux2[i]=='.')
				   aux = true;
		   }
		   return aux;
	   }
}
