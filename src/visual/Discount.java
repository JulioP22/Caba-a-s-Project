package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import logical.Cabaña809;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Discount extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2204537697058904578L;
	private final JPanel contentPanel = new JPanel();
	private JTextField monto;
	private String action;


	public Discount(String action) {
		this.action = action;
		setTitle(action);
		setBounds(100, 100, 450, 221);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		setModal(true);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), action, TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 13, 408, 113);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblMonto = new JLabel("Monto: ");
		lblMonto.setBounds(35, 50, 85, 16);
		panel.add(lblMonto);
		
		monto = new JTextField();
		monto.setBounds(132, 46, 246, 25);
		panel.add(monto);
		monto.setColumns(10);
		monto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c =  e.getKeyChar();
				if((c < '0' || c > '9') && c != '.')
					e.consume();
				if (dotAmount() && c=='.')
					e.consume();
				if (c=='.' &&monto.getText().length()==0)
					e.consume();
			}
		});
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aplicar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (validateValue()) {
							Cabaña809.getInstance().discount = Float.parseFloat(monto.getText());
							if (action.equals("Aumento")) Cabaña809.getInstance().discount *= -1;
							JOptionPane.showMessageDialog(null, action+" aplicado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE, null);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "El valor digitado no es válido (puede que sea este sea mayor que el total de la factura), intente con otro valor", "Error", JOptionPane.ERROR_MESSAGE, null);
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
	
	public boolean validateValue() {
		boolean revision = false;
		if (!monto.getText().equals("")) {
			float value = Float.parseFloat(monto.getText());
			if (value <= Cabaña809.getInstance().totalAmount || action.equals("Aumento")) revision = true;
		}
		return revision;
		
	}
	
	 private boolean dotAmount() {
		 boolean aux = false;
		 String aux1 = monto.getText();
		 char[] aux2 = aux1.toCharArray();
		 for (int i =0;i<aux2.length;i++) {
			 if (aux2[i]=='.')
				 aux = true;
		 }
		 return aux;
	 }
	
}
