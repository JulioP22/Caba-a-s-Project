package visual;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

//import org.jvnet.substance.SubstanceLookAndFeel;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import org.jvnet.substance.SubstanceLookAndFeel;
import visual.ClosingDialog;
import logical.Cabaña809;

import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Component;


public class VisualMain extends JFrame implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8500506145820882329L;
	private JPanel contentPane;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JPanel panel_15;
	private JPanel panel_16;
	private JPanel panel_17;
	private JPanel panel_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JPanel panel_21;
	private JPanel panel_22;
	private JPanel panel_23;
	private JPanel panel_24;
	private JPanel panel_25;
	private JPanel panel_26;
	private JPanel panel_27;
	private JPanel panel_28;
	private JPanel panel_29;
	private JPanel panel_30;
	private JPanel panel_31;
	private JPanel panel_32;
	private JPanel panel_35;
	private JPanel panel_34;
	private JPanel panel_33;
	private static JPanel panel;
	private static JLabel label1;
	private static JLabel lblC;
	private static JLabel label2;
	private static JLabel lblC_1;
	private static JLabel label3;
	private static JLabel lblC_2;
	private static JLabel label4;
	private static JLabel lblC_3;
	private static JLabel label5;
	private static JLabel lblC_4;
	private static JLabel label6;
	private static JLabel lblC_5;
	private static JLabel label7;
	private static JLabel lblC_6;
	private static JLabel label8;
	private static JLabel lblC_7;
	private static JLabel label9;
	private static JLabel lblC_8;
	private static JLabel label10;
	private static JLabel lblC_9;
	private static JLabel label11;
	private static JLabel lblC_10;
	private static JLabel label12;
	private static JLabel lblC_11;
	private static JLabel label13;
	private static JLabel lblC_12;
	private static JLabel label14;
	private static JLabel lblC_13;
	private static JLabel label15;
	private static JLabel lblC_14;
	private static JLabel label16;
	private static JLabel lblC_15;
	private static JLabel label17;
	private static JLabel lblC_16;
	private static JLabel label18;
	private static JLabel lblC_17;
	private static JLabel label19;
	private static JLabel lblC_18;
	private static JLabel label20;
	private static JLabel lblC_19;
	private static JLabel label21;
	private static JLabel label22;
	private static JLabel lblC_21;
	private static JLabel label23;
	private static JLabel lblC_22;
	private static JLabel label24;
	private static JLabel lblC_23;
	private static JLabel label25;
	private static JLabel lblC_24;
	private static JLabel label26;
	private static JLabel lblC_25;
	private static JLabel label27;
	private static JLabel lblC_26;
	private static JLabel label28;
	private static JLabel lblC_27;
	private static JLabel label29;
	private static JLabel lblC_28;
	private static JLabel label30;
	private static JLabel lblC_29;
	private static JLabel label31;
	private static JLabel lblC_30;
	private static JLabel label32;
	private static JLabel lblC_31;
	private static JLabel label33;
	private static JLabel lblC_32;
	private static JLabel label34;
	private static JLabel lblC_33;
	private static JLabel label35;
	private static JLabel lblC_34;
	private static JLabel lblC_20;
	private Color c2 = Color.GREEN;
	private Color c3 = Color.red;
	private JMenu mnProductos;
	private JMenuItem mntmAgregarProducto;
	private JMenuItem mntmListaDeProductos;
	private JPopupMenu popupMenu;
	private JMenuItem cancelarReserva;
	public static boolean cancel = false;
	public static boolean cancel1 = false;
	public static boolean cancel2 = false;
	public static boolean cancel3 = false;
	public static boolean cancel4 = false;
	public static boolean cancel5 = false;
	public static boolean cancel6 = false;
	public static boolean cancel7 = false;
	public static boolean cancel8 = false;
	public static boolean cancel9 = false;
	public static boolean cancel10 = false;
	public static boolean cancel11 = false;
	public static boolean cancel12 = false;
	public static boolean cancel13 = false;
	public static boolean cancel14 = false;
	public static boolean cancel15 = false;
	public static boolean cancel16 = false;
	public static boolean cancel17 = false;
	public static boolean cancel18 = false;
	public static boolean cancel19 = false;
	public static boolean cancel20 = false;
	public static boolean cancel21 = false;
	public static boolean cancel22 = false;
	public static boolean cancel23 = false;
	public static boolean cancel24 = false;
	public static boolean cancel25 = false;
	public static boolean cancel26 = false;
	public static boolean cancel27 = false;
	public static boolean cancel28 = false;
	public static boolean cancel29 = false;
	public static boolean cancel30 = false;
	public static boolean cancel31 = false;
	public static boolean cancel32 = false;
	public static boolean cancel33 = false;
	public static boolean cancel34 = false;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmCancelarReserva;
	private JMenuItem mntmCancelarReserva_1;
	private JMenuItem mntmCancelarReserva_2;
	private JMenuItem mntmCancelarReserva_3;
	private JMenuItem mntmCancelarReserva_4;
	private JMenuItem mntmCancelarReserva_5;
	private JMenuItem mntmCancelarReservacin;
	private JMenuItem mntmCancelarReservacin_1;
	private JMenuItem mntmCancelarReservacin_2;
	private JMenuItem mntmCancelarReservacin_3;
	private JMenuItem mntmCancelarReservacin_4;
	private JMenuItem mntmCancelarReservacin_5;
	private JMenuItem mntmCancelarReservacin_6;
	private JMenuItem mntmCancelarReservacin_7;
	private JMenuItem mntmCancelarReservacin_8;
	private JMenuItem mntmCancelarReservacin_9;
	private JMenuItem mntmCancelarReservacin_10;
	private JMenuItem mntmCancelarReservacin_11;
	private JMenuItem mntmCancelarReservacin_12;
	private JMenuItem mntmCancelarReservacin_13;
	private JMenuItem mntmCancelarReservacin_14;
	private JMenuItem mntmCancelarReservacin_15;
	private JMenuItem mntmCancelarReservacin_16;
	private JMenuItem mntmCancelarReservacin_17;
	private JMenuItem mntmCancelarReservacin_18;
	private JMenuItem mntmCancelarReservacin_19;
	private JMenuItem mntmCancelarReservacin_20;
	private JMenuItem mntmCancelarReservacin_21;
	private JMenuItem mntmCancelarReservacin_22;
	private JMenuItem mntmCancelarReservacin_23;
	private JMenuItem mntmCancelarReservacin_24;
	private JMenuItem mntmCancelarReservacin_26;
	private JMenuItem mntmCancelarReservacin_25;
	private JPopupMenu popupMenu_1;
	private JPopupMenu popupMenu_2;
	private JPopupMenu popupMenu_3;
	private JPopupMenu popupMenu_4;
	private JPopupMenu popupMenu_5;
	private JPopupMenu popupMenu_6;
	private JPopupMenu popupMenu_7;
	private JPopupMenu popupMenu_8;
	private JPopupMenu popupMenu_9;
	private JPopupMenu popupMenu_10;
	private JPopupMenu popupMenu_11;
	private JPopupMenu popupMenu_12;
	private JPopupMenu popupMenu_13;
	private JPopupMenu popupMenu_14;
	private JPopupMenu popupMenu_15;
	private JPopupMenu popupMenu_16;
	private JPopupMenu popupMenu_17;
	private JPopupMenu popupMenu_18;
	private JPopupMenu popupMenu_19;
	private JPopupMenu popupMenu_20;
	private JPopupMenu popupMenu_21;
	private JPopupMenu popupMenu_22;
	private JPopupMenu popupMenu_23;
	private JPopupMenu popupMenu_24;
	private JPopupMenu popupMenu_25;
	private JPopupMenu popupMenu_26;
	private JPopupMenu popupMenu_27;
	private JPopupMenu popupMenu_28;
	private JPopupMenu popupMenu_29;
	private JPopupMenu popupMenu_30;
	private JPopupMenu popupMenu_31;
	private JPopupMenu popupMenu_32;
	private JPopupMenu popupMenu_33;
	private JPopupMenu popupMenu_34;
	private ImageIcon frameIcon=new ImageIcon(VisualMain.class.getResource("/icons/frameIcon.png"));
	
	
	//private Thread t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame.setDefaultLookAndFeelDecorated(true);
					SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");
					SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSteelBlueTheme");
					//SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
					try{ 
						Cabaña809.readAdmin();
					}catch(IOException e) {
						JOptionPane.showMessageDialog(null, "Archivos no encontrados, generando nuevos archivos", "Archivos no encontrados", JOptionPane.WARNING_MESSAGE,null);
						Cabaña809.writeAdmin();
					}
					VisualMain frame = new VisualMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VisualMain() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					Cabaña809.writeAdmin();
					ClosingDialog closingDialog = new ClosingDialog();
					closingDialog.setVisible(true);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Se ha producido un error al guardar los datos", "Error", JOptionPane.ERROR_MESSAGE, null);
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Se ha producido un error desconocido", "Error", JOptionPane.ERROR_MESSAGE, null);
				}
			}
		});
		setTitle("Caba\u00F1a809");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 573);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Script MT Bold", Font.PLAIN, 14));
		menuBar.setForeground(Color.BLACK);
		setJMenuBar(menuBar);
		setIconImage(frameIcon.getImage());
		
		
		mnProductos = new JMenu("Productos");
		mnProductos.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/productIcon_opt (2).png")));
		mnProductos.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		menuBar.add(mnProductos);
		menuBar.setPreferredSize(new Dimension(100, 35));

		
		mntmAgregarProducto = new JMenuItem("A\u00F1adir producto");
		mntmAgregarProducto.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/add_opt.png")));
		mntmAgregarProducto.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		mntmAgregarProducto.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					NuevoProducto nu = new NuevoProducto(false, -1);
					nu.setModal(true);
					nu.setLocationRelativeTo(null);
					nu.setResizable(false);
					nu.setVisible(true);
				}
			}
		});
		mnProductos.add(mntmAgregarProducto);
		
		mntmListaDeProductos = new JMenuItem("Lista de productos");
		mntmListaDeProductos.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/list_opt.png")));
		mntmListaDeProductos.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		mntmListaDeProductos.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Oferta o = new Oferta();
					o.setModal(true);
					o.setLocationRelativeTo(null);
					o.setResizable(false);
					o.setVisible(true);
				}
			}
		});
		mnProductos.add(mntmListaDeProductos);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		mnConfiguracin.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/modificar_opt.png")));
		mnConfiguracin.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		menuBar.add(mnConfiguracin);
		
		JMenuItem mntmModificarPrecioDe = new JMenuItem("Modificar precio de habitaciones");
		mntmModificarPrecioDe.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					LoginMod mod = new LoginMod(true);
					mod.setVisible(true);
				}
			}
		});
		mntmModificarPrecioDe.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		mntmModificarPrecioDe.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/modifyIcon_opt.png")));
		mnConfiguracin.add(mntmModificarPrecioDe);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
					setOriginalColor();
			}
		});
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Control de Caba\u00F1as", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 759, 491);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setName("panel_1");
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_1.getBackground();
					if (c1.getRGB()!=c2.getRGB() && c1.getRGB()!=c3.getRGB())
						panel_1.setBackground(new Color (200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_1.getBackground();
					if (c1.getRGB()!=c2.getRGB() && c1.getRGB()!=c3.getRGB()) {
						panel_1.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_1");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_1.getBackground()==Color.GREEN || panel_1.getBackground()==Color.RED) {
					panel_1.setEnabled(true);
				}
				else {
					panel_1.setEnabled(false);
				}	
				Color c1 = panel_1.getBackground();
				if (c1.getRGB()!=c2.getRGB() && c1.getRGB()!=c3.getRGB()) {
					panel_1.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 23, 97, 82);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		popupMenu = new JPopupMenu();
		addPopup(panel_1, popupMenu);
		
		cancelarReserva = new JMenuItem("Cancelar reservaci\u00F3n");
		cancelarReserva.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel = true;
						panel_1.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_1.getComponentCount();i++) {
							panel_1.getComponent(i).setVisible(false);
						}
						label1.setVisible(true);
						lblC.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		cancelarReserva.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu.add(cancelarReserva);
		
		label1 = new JLabel("");
		label1.setBounds(14, 5, 79, 51);
		panel_1.add(label1);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		
		lblC = new JLabel("C-1");
		lblC.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC.setBounds(10, 56, 79, 20);
		panel_1.add(lblC);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_2 = new JPanel();
		panel_2.setName("panel_2");
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_2.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_2.setBackground(new Color (200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_2.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_2.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_2");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_2.getBackground()==Color.GREEN || panel_2.getBackground()==Color.RED) {
					panel_2.setEnabled(true);
				}
				else {
					panel_2.setEnabled(false);
				}
				Color c1 = panel_2.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_2.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setBounds(117, 23, 97, 82);
		panel.add(panel_2);
		
		popupMenu_1 = new JPopupMenu();
		addPopup(panel_2, popupMenu_1);
		
		mntmNewMenuItem = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel1 = true;
						panel_2.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_2.getComponentCount();i++) {
							panel_2.getComponent(i).setVisible(false);
						}
						label2.setVisible(true);
						lblC_1.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_1.add(mntmNewMenuItem);
		
		label2 = new JLabel("");
		label2.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(14, 5, 79, 51);
		panel_2.add(label2);
		
		lblC_1 = new JLabel("C-2");
		lblC_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_1.setBounds(10, 56, 79, 20);
		panel_2.add(lblC_1);
		
		panel_3 = new JPanel();
		panel_3.setName("panel_3");
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_3.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_3.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
				Color c1 = panel_3.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_3.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_3");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_3.getBackground()==Color.GREEN || panel_3.getBackground()==Color.RED) {
					panel_3.setEnabled(true);
				}
				else {
					panel_3.setEnabled(false);
				}
				Color c1 = panel_3.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_3.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setLayout(null);
		panel_3.setBounds(224, 23, 97, 82);
		panel.add(panel_3);
		
		popupMenu_2 = new JPopupMenu();
		addPopup(panel_3, popupMenu_2);
		
		mntmCancelarReserva = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReserva.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel2 = true;
						panel_3.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_3.getComponentCount();i++) {
							panel_3.getComponent(i).setVisible(false);
						}
						label3.setVisible(true);
						lblC_2.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReserva.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_2.add(mntmCancelarReserva);
		
		label3 = new JLabel("");
		label3.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(14, 5, 79, 51);
		panel_3.add(label3);
		
		lblC_2 = new JLabel("C-3");
		lblC_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_2.setBounds(10, 56, 79, 20);
		panel_3.add(lblC_2);
		
		panel_4= new JPanel();
		panel_4.setName("panel_4");
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_4.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_4.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_4.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_4.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_4");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_4.getBackground()==Color.GREEN || panel_4.getBackground()==Color.RED) {
					panel_4.setEnabled(true);
				}
				else {
					panel_4.setEnabled(false);
				}
				Color c1 = panel_4.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_4.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setLayout(null);
		panel_4.setBounds(331, 23, 97, 82);
		panel.add(panel_4);
		
		popupMenu_3 = new JPopupMenu();
		addPopup(panel_4, popupMenu_3);
		
		mntmCancelarReserva_1 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReserva_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel3 = true;
						panel_4.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_4.getComponentCount();i++) {
							panel_4.getComponent(i).setVisible(false);
						}
						label4.setVisible(true);
						lblC_3.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReserva_1.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_3.add(mntmCancelarReserva_1);
		
		label4 = new JLabel("");
		label4.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBounds(14, 5, 79, 51);
		panel_4.add(label4);
		
		lblC_3 = new JLabel("C-4");
		lblC_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_3.setBounds(10, 56, 79, 20);
		panel_4.add(lblC_3);
		
		panel_5 = new JPanel();
		panel_5.setName("panel_5");
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_5.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_5.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_5.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_5.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_5");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_5.getBackground()==Color.GREEN || panel_5.getBackground()==Color.RED) {
					panel_5.setEnabled(true);
				}
				else {
					panel_5.setEnabled(false);
				}
				Color c1 = panel_5.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_5.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setLayout(null);
		panel_5.setBounds(438, 23, 97, 82);
		panel.add(panel_5);
		
		popupMenu_4 = new JPopupMenu();
		addPopup(panel_5, popupMenu_4);
		
		mntmCancelarReserva_2 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReserva_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel4 = true;
						panel_5.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_5.getComponentCount();i++) {
							panel_5.getComponent(i).setVisible(false);
						}
						label5.setVisible(true);
						lblC_4.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReserva_2.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_4.add(mntmCancelarReserva_2);
		
		label5 = new JLabel("");
		label5.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setBounds(14, 5, 79, 51);
		panel_5.add(label5);
		
		lblC_4 = new JLabel("C-5");
		lblC_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_4.setBounds(10, 56, 79, 20);
		panel_5.add(lblC_4);
		
		panel_6 = new JPanel();
		panel_6.setName("panel_6");
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_6.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_6.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_6.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_6.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_6");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_6.getBackground()==Color.GREEN || panel_6.getBackground()==Color.RED) {
					panel_6.setEnabled(true);
				}
				else {
					panel_6.setEnabled(false);
				}
				Color c1 = panel_6.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_6.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setLayout(null);
		panel_6.setBounds(545, 23, 97, 82);
		panel.add(panel_6);
		
		popupMenu_5 = new JPopupMenu();
		addPopup(panel_6, popupMenu_5);
		
		mntmCancelarReserva_3 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReserva_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel5 = true;
						panel_6.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_6.getComponentCount();i++) {
							panel_6.getComponent(i).setVisible(false);
						}
						label6.setVisible(true);
						lblC_5.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReserva_3.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_5.add(mntmCancelarReserva_3);
		
		label6 = new JLabel("");
		label6.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setBounds(14, 5, 79, 51);
		panel_6.add(label6);
		
		lblC_5 = new JLabel("C-6");
		lblC_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_5.setBounds(10, 56, 79, 20);
		panel_6.add(lblC_5);
		
		panel_7 = new JPanel();
		panel_7.setName("panel_7");
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_7.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_7.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_7.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_7.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_7");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_7.getBackground()==Color.GREEN || panel_7.getBackground()==Color.RED) {
					panel_7.setEnabled(true);
				}
				else {
					panel_7.setEnabled(false);
				}
				Color c1 = panel_7.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_7.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setLayout(null);
		panel_7.setBounds(652, 23, 97, 82);
		panel.add(panel_7);
		
		popupMenu_6 = new JPopupMenu();
		addPopup(panel_7, popupMenu_6);
		
		mntmCancelarReserva_4 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReserva_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel6 = true;
						panel_7.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_7.getComponentCount();i++) {
							panel_7.getComponent(i).setVisible(false);
						}
						label7.setVisible(true);
						lblC_6.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReserva_4.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_6.add(mntmCancelarReserva_4);
		
		label7 = new JLabel("");
		label7.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setBounds(14, 5, 79, 51);
		panel_7.add(label7);
		
		lblC_6 = new JLabel("C-7");
		lblC_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_6.setBounds(10, 56, 79, 20);
		panel_7.add(lblC_6);
		
		panel_8 = new JPanel();
		panel_8.setName("panel_8");
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_8.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_8.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_8.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_8.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_8");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_8.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_8.getBackground()==Color.GREEN || panel_8.getBackground()==Color.RED) {
					panel_8.setEnabled(true);
				}
				else {
					panel_8.setEnabled(false);
				}
				Color c1 = panel_8.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_8.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setLayout(null);
		panel_8.setBounds(10, 116, 97, 82);
		panel.add(panel_8);
		
		popupMenu_7 = new JPopupMenu();
		addPopup(panel_8, popupMenu_7);
		
		mntmCancelarReserva_5 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReserva_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel7 = true;
						panel_8.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_8.getComponentCount();i++) {
							panel_8.getComponent(i).setVisible(false);
						}
						label8.setVisible(true);
						lblC_7.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReserva_5.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_7.add(mntmCancelarReserva_5);
		
		label8 = new JLabel("");
		label8.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setBounds(14, 5, 79, 51);
		panel_8.add(label8);
		
		lblC_7 = new JLabel("C-8");
		lblC_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_7.setBounds(10, 56, 79, 20);
		panel_8.add(lblC_7);
		
		panel_9 = new JPanel();
		panel_9.setName("panel_9");
		panel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_9.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_9.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_9.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_9.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_9");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_9.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_9.getBackground()==Color.GREEN || panel_9.getBackground()==Color.RED) {
					panel_9.setEnabled(true);
				}
				else {
					panel_9.setEnabled(false);
				}
				Color c1 = panel_9.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_9.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setLayout(null);
		panel_9.setBounds(117, 116, 97, 82);
		panel.add(panel_9);
		
		popupMenu_8 = new JPopupMenu();
		addPopup(panel_9, popupMenu_8);
		
		mntmCancelarReservacin = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel8 = true;
						panel_9.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_9.getComponentCount();i++) {
							panel_9.getComponent(i).setVisible(false);
						}
						label9.setVisible(true);
						lblC_8.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_8.add(mntmCancelarReservacin);
		
		label9 = new JLabel("");
		label9.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setBounds(14, 5, 79, 51);
		panel_9.add(label9);
		
		lblC_8 = new JLabel("C-9");
		lblC_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_8.setBounds(10, 56, 79, 20);
		panel_9.add(lblC_8);
		
		panel_10 = new JPanel();
		panel_10.setName("panel_10");
		panel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_10.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_10.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_10.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_10.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_10");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_10.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_10.getBackground()==Color.GREEN || panel_10.getBackground()==Color.RED) {
					panel_10.setEnabled(true);
				}
				else {
					panel_10.setEnabled(false);
				}
				Color c1 = panel_10.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_10.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setLayout(null);
		panel_10.setBounds(224, 116, 97, 82);
		panel.add(panel_10);
		
		popupMenu_9 = new JPopupMenu();
		addPopup(panel_10, popupMenu_9);
		
		mntmCancelarReservacin_1 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel9 = true;
						panel_10.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_10.getComponentCount();i++) {
							panel_10.getComponent(i).setVisible(false);
						}
						label10.setVisible(true);
						lblC_9.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_1.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_9.add(mntmCancelarReservacin_1);
		
		label10 = new JLabel("");
		label10.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		label10.setBounds(14, 5, 79, 51);
		panel_10.add(label10);
		
		lblC_9 = new JLabel("C-10");
		lblC_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_9.setBounds(10, 56, 79, 20);
		panel_10.add(lblC_9);
		
		panel_11 = new JPanel();
		panel_11.setName("panel_11");
		panel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_11.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_11.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_11.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_11.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_11");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_11.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_11.getBackground()==Color.GREEN || panel_11.getBackground()==Color.RED) {
					panel_11.setEnabled(true);
				}
				else {
					panel_11.setEnabled(false);
				}
				Color c1 = panel_11.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_11.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setLayout(null);
		panel_11.setBounds(331, 116, 97, 82);
		panel.add(panel_11);
		
		popupMenu_10 = new JPopupMenu();
		addPopup(panel_11, popupMenu_10);
		
		mntmCancelarReservacin_2 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel10 = true;
						panel_11.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_11.getComponentCount();i++) {
							panel_11.getComponent(i).setVisible(false);
						}
						label11.setVisible(true);
						lblC_10.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_2.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_10.add(mntmCancelarReservacin_2);
		
		label11 = new JLabel("");
		label11.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label11.setHorizontalAlignment(SwingConstants.CENTER);
		label11.setBounds(14, 5, 79, 51);
		panel_11.add(label11);
		
		lblC_10 = new JLabel("C-11");
		lblC_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_10.setBounds(10, 56, 79, 20);
		panel_11.add(lblC_10);
		
		panel_12 = new JPanel();
		panel_12.setName("panel_12");
		panel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_12.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_12.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_12.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_12.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_12");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_12.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_12.getBackground()==Color.GREEN || panel_12.getBackground()==Color.RED) {
					panel_12.setEnabled(true);
				}
				else {
					panel_12.setEnabled(false);
				}
				Color c1 = panel_12.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_12.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_12.setLayout(null);
		panel_12.setBounds(438, 116, 97, 82);
		panel.add(panel_12);
		
		popupMenu_11 = new JPopupMenu();
		addPopup(panel_12, popupMenu_11);
		
		mntmCancelarReservacin_3 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel11 = true;
						panel_12.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_12.getComponentCount();i++) {
							panel_12.getComponent(i).setVisible(false);
						}
						label12.setVisible(true);
						lblC_11.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_3.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_11.add(mntmCancelarReservacin_3);
		 
		label12 = new JLabel("");
		label12.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		label12.setBounds(14, 5, 79, 51);
		panel_12.add(label12);
		
		lblC_11 = new JLabel("C-12");
		lblC_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_11.setBounds(10, 56, 79, 20);
		panel_12.add(lblC_11);
		
		panel_13 = new JPanel();
		panel_13.setName("panel_13");
		panel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_13.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_13.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_13.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_13.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_13");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_13.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_13.getBackground()==Color.GREEN || panel_13.getBackground()==Color.RED) {
					panel_13.setEnabled(true);
				}
				else {
					panel_13.setEnabled(false);
				}
				Color c1 = panel_13.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_13.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_13.setLayout(null);
		panel_13.setBounds(545, 116, 97, 82);
		panel.add(panel_13);
		
		popupMenu_12 = new JPopupMenu();
		addPopup(panel_13, popupMenu_12);
		
		mntmCancelarReservacin_4 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel12 = true;
						panel_13.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_13.getComponentCount();i++) {
							panel_13.getComponent(i).setVisible(false);
						}
						label13.setVisible(true);
						lblC_12.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_4.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_12.add(mntmCancelarReservacin_4);
		
		label13 = new JLabel("");
		label13.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label13.setHorizontalAlignment(SwingConstants.CENTER);
		label13.setBounds(14, 5, 79, 51);
		panel_13.add(label13);
		
		lblC_12 = new JLabel("C-13");
		lblC_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_12.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_12.setBounds(10, 56, 79, 20);
		panel_13.add(lblC_12);
		
		panel_14 = new JPanel();
		panel_14.setName("panel_14");
		panel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_14.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_14.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_14.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_14.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_14");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_14.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_14.getBackground()==Color.GREEN || panel_14.getBackground()==Color.RED) {
					panel_14.setEnabled(true);
				}
				else {
					panel_14.setEnabled(false);
				}
				Color c1 = panel_14.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_14.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_14.setLayout(null);
		panel_14.setBounds(652, 116, 97, 82);
		panel.add(panel_14);
		
		popupMenu_13 = new JPopupMenu();
		addPopup(panel_14, popupMenu_13);
		
		mntmCancelarReservacin_5 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel13 = true;
						panel_14.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_14.getComponentCount();i++) {
							panel_14.getComponent(i).setVisible(false);
						}
						label14.setVisible(true);
						lblC_13.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_5.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_13.add(mntmCancelarReservacin_5);
		
		label14 = new JLabel("");
		label14.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label14.setHorizontalAlignment(SwingConstants.CENTER);
		label14.setBounds(14, 5, 79, 51);
		panel_14.add(label14);
		
		lblC_13 = new JLabel("C-14");
		lblC_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_13.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_13.setBounds(10, 56, 79, 20);
		panel_14.add(lblC_13);
		
		panel_15 = new JPanel();
		panel_15.setName("panel_15");
		panel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_15.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_15.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_15.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_15.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_15");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_15.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_15.getBackground()==Color.GREEN || panel_15.getBackground()==Color.RED) {
					panel_15.setEnabled(true);
				}
				else {
					panel_15.setEnabled(false);
				}
				Color c1 = panel_15.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_15.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_15.setLayout(null);
		panel_15.setBounds(10, 209, 97, 82);
		panel.add(panel_15);
		
		popupMenu_14 = new JPopupMenu();
		addPopup(panel_15, popupMenu_14);
		
		mntmCancelarReservacin_6 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel14 = true;
						panel_15.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_15.getComponentCount();i++) {
							panel_15.getComponent(i).setVisible(false);
						}
						label15.setVisible(true);
						lblC_14.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_6.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_14.add(mntmCancelarReservacin_6);
		
		label15 = new JLabel("");
		label15.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label15.setHorizontalAlignment(SwingConstants.CENTER);
		label15.setBounds(14, 5, 79, 51);
		panel_15.add(label15);
		
		lblC_14 = new JLabel("C-15");
		lblC_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_14.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_14.setBounds(10, 56, 79, 20);
		panel_15.add(lblC_14);
		
		panel_16 = new JPanel();
		panel_16.setName("panel_16");
		panel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_16.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_16.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
				Color c1 = panel_16.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_16.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_16");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_16.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_16.getBackground()==Color.GREEN || panel_16.getBackground()==Color.RED) {
					panel_16.setEnabled(true);
				}
				else {
					panel_16.setEnabled(false);
				}
				Color c1 = panel_16.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_16.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_16.setLayout(null);
		panel_16.setBounds(117, 209, 97, 82);
		panel.add(panel_16);
		
		popupMenu_15 = new JPopupMenu();
		addPopup(panel_16, popupMenu_15);
		
		mntmCancelarReservacin_7 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel15 = true;
						panel_16.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_16.getComponentCount();i++) {
							panel_16.getComponent(i).setVisible(false);
						}
						label16.setVisible(true);
						lblC_15.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_7.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_15.add(mntmCancelarReservacin_7);
		
		label16 = new JLabel("");
		label16.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label16.setHorizontalAlignment(SwingConstants.CENTER);
		label16.setBounds(14, 5, 79, 51);
		panel_16.add(label16);
		
		lblC_15 = new JLabel("C-16");
		lblC_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_15.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_15.setBounds(10, 56, 79, 20);
		panel_16.add(lblC_15);
		
		panel_17 = new JPanel();
		panel_17.setName("panel_17");
		panel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_17.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_17.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_17.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_17.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_17");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_17.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_17.getBackground()==Color.GREEN || panel_17.getBackground()==Color.RED) {
					panel_17.setEnabled(true);
				}
				else {
					panel_17.setEnabled(false);
				}
				Color c1 = panel_17.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_17.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_17.setLayout(null);
		panel_17.setBounds(224, 209, 97, 82);
		panel.add(panel_17);
		
		popupMenu_16 = new JPopupMenu();
		addPopup(panel_17, popupMenu_16);
		
		mntmCancelarReservacin_8 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel16 = true;
						panel_17.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_17.getComponentCount();i++) {
							panel_17.getComponent(i).setVisible(false);
						}
						label17.setVisible(true);
						lblC_16.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_8.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_16.add(mntmCancelarReservacin_8);
		
		label17 = new JLabel("");
		label17.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label17.setHorizontalAlignment(SwingConstants.CENTER);
		label17.setBounds(14, 5, 79, 51);
		panel_17.add(label17);
		
		lblC_16 = new JLabel("C-17");
		lblC_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_16.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_16.setBounds(10, 56, 79, 20);
		panel_17.add(lblC_16);
		
		panel_18 = new JPanel();
		panel_18.setName("panel_18");
		panel_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_18.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_18.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_18.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_18.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_18");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_18.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_18.getBackground()==Color.GREEN || panel_18.getBackground()==Color.RED) {
					panel_18.setEnabled(true);
				}
				else {
					panel_18.setEnabled(false);
				}
				Color c1 = panel_18.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_18.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_18.setLayout(null);
		panel_18.setBounds(331, 209, 97, 82);
		panel.add(panel_18);
		
		popupMenu_17 = new JPopupMenu();
		addPopup(panel_18, popupMenu_17);
		
		mntmCancelarReservacin_9 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel17 = true;
						panel_18.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_18.getComponentCount();i++) {
							panel_18.getComponent(i).setVisible(false);
						}
						label18.setVisible(true);
						lblC_17.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_9.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_17.add(mntmCancelarReservacin_9);
		
		label18 = new JLabel("");
		label18.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label18.setHorizontalAlignment(SwingConstants.CENTER);
		label18.setBounds(14, 5, 79, 51);
		panel_18.add(label18);
		
		lblC_17 = new JLabel("C-18");
		lblC_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_17.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_17.setBounds(10, 56, 79, 20);
		panel_18.add(lblC_17);
		
		panel_19 = new JPanel();
		panel_19.setName("panel_19");
		panel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_19.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_19.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_19.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_19.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_19");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_19.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_19.getBackground()==Color.GREEN || panel_19.getBackground()==Color.RED) {
					panel_19.setEnabled(true);
				}
				else {
					panel_19.setEnabled(false);
				}
				Color c1 = panel_19.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_19.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_19.setLayout(null);
		panel_19.setBounds(438, 209, 97, 82);
		panel.add(panel_19);
		
		popupMenu_18 = new JPopupMenu();
		addPopup(panel_19, popupMenu_18);
		
		mntmCancelarReservacin_10 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel18 = true;
						panel_19.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_19.getComponentCount();i++) {
							panel_19.getComponent(i).setVisible(false);
						}
						label19.setVisible(true);
						lblC_18.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_10.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_18.add(mntmCancelarReservacin_10);
		
		label19 = new JLabel("");
		label19.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label19.setHorizontalAlignment(SwingConstants.CENTER);
		label19.setBounds(14, 5, 79, 51);
		panel_19.add(label19);
		
		lblC_18 = new JLabel("C-19");
		lblC_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_18.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_18.setBounds(10, 56, 79, 20);
		panel_19.add(lblC_18);
		
		panel_20 = new JPanel();
		panel_20.setName("panel_20");
		panel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_20.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_20.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
				Color c1 = panel_20.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_20.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_20");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_20.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_20.getBackground()==Color.GREEN || panel_20.getBackground()==Color.RED) {
					panel_20.setEnabled(true);
				}
				else {
					panel_20.setEnabled(false);
				}
				Color c1 = panel_20.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_20.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_20.setLayout(null);
		panel_20.setBounds(545, 209, 97, 82);
		panel.add(panel_20);
		
		popupMenu_19 = new JPopupMenu();
		addPopup(panel_20, popupMenu_19);
		
		mntmCancelarReservacin_11 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel19 = true;
						panel_20.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_20.getComponentCount();i++) {
							panel_20.getComponent(i).setVisible(false);
						}
						label20.setVisible(true);
						lblC_19.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_11.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_19.add(mntmCancelarReservacin_11);
		
		label20 = new JLabel("");
		label20.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label20.setHorizontalAlignment(SwingConstants.CENTER);
		label20.setBounds(14, 5, 79, 51);
		panel_20.add(label20);
		
		lblC_19 = new JLabel("C-20");
		lblC_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_19.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_19.setBounds(10, 56, 79, 20);
		panel_20.add(lblC_19);
		
		panel_21 = new JPanel();
		panel_21.setName("panel_21");
		panel_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_21.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_21.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_21.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_21.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_21");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_21.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_21.getBackground()==Color.GREEN || panel_21.getBackground()==Color.RED) {
					panel_21.setEnabled(true);
				}
				else {
					panel_21.setEnabled(false);
				}
				Color c1 = panel_21.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_21.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_21.setLayout(null);
		panel_21.setBounds(652, 209, 97, 82);
		panel.add(panel_21);
		
		popupMenu_20 = new JPopupMenu();
		addPopup(panel_21, popupMenu_20);
		
		mntmCancelarReservacin_12 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel20 = true;
						panel_21.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_21.getComponentCount();i++) {
							panel_21.getComponent(i).setVisible(false);
						}
						label21.setVisible(true);
						lblC_20.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_12.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_20.add(mntmCancelarReservacin_12);
		
		label21 = new JLabel("");
		label21.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label21.setHorizontalAlignment(SwingConstants.CENTER);
		label21.setBounds(14, 5, 79, 51);
		panel_21.add(label21);
		
		lblC_20 = new JLabel("C-21");
		lblC_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_20.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_20.setBounds(10, 56, 79, 20);
		panel_21.add(lblC_20);
		
		panel_22 = new JPanel();
		panel_22.setName("panel_22");
		panel_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_22.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_22.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_22.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_22.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_22");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_22.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_22.getBackground()==Color.GREEN || panel_22.getBackground()==Color.RED) {
					panel_22.setEnabled(true);
				}
				else {
					panel_22.setEnabled(false);
				}
				Color c1 = panel_22.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_22.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_22.setLayout(null);
		panel_22.setBounds(10, 302, 97, 82);
		panel.add(panel_22);
		
		popupMenu_21 = new JPopupMenu();
		addPopup(panel_22, popupMenu_21);
		
		mntmCancelarReservacin_13 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel21 = true;
						panel_22.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_22.getComponentCount();i++) {
							panel_22.getComponent(i).setVisible(false);
						}
						label22.setVisible(true);
						lblC_21.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_13.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_21.add(mntmCancelarReservacin_13);
		
		label22 = new JLabel("");
		label22.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label22.setHorizontalAlignment(SwingConstants.CENTER);
		label22.setBounds(14, 5, 79, 51);
		panel_22.add(label22);
		
		lblC_21 = new JLabel("C-22");
		lblC_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_21.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_21.setBounds(10, 56, 79, 20);
		panel_22.add(lblC_21);
		
		panel_23 = new JPanel();
		panel_23.setName("panel_23");
		panel_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_23.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_23.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_23.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_23.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_23");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_23.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_23.getBackground()==Color.GREEN || panel_23.getBackground()==Color.RED) {
					panel_23.setEnabled(true);
				}
				else {
					panel_23.setEnabled(false);
				}
				Color c1 = panel_23.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_23.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_23.setLayout(null);
		panel_23.setBounds(117, 302, 97, 82);
		panel.add(panel_23);
		
		popupMenu_22 = new JPopupMenu();
		addPopup(panel_23, popupMenu_22);
		
		mntmCancelarReservacin_14 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel22 = true;
						panel_23.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_23.getComponentCount();i++) {
							panel_23.getComponent(i).setVisible(false);
						}
						label23.setVisible(true);
						lblC_22.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_14.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_22.add(mntmCancelarReservacin_14);
		
		label23 = new JLabel("");
		label23.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label23.setHorizontalAlignment(SwingConstants.CENTER);
		label23.setBounds(14, 5, 79, 51);
		panel_23.add(label23);
		
		lblC_22 = new JLabel("C-23");
		lblC_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_22.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_22.setBounds(10, 56, 79, 20);
		panel_23.add(lblC_22);
		
		panel_24 = new JPanel();
		panel_24.setName("panel_24");
		panel_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_24.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_24.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_24.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_24.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_24");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_24.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_24.getBackground()==Color.GREEN || panel_24.getBackground()==Color.RED) {
					panel_24.setEnabled(true);
				}
				else {
					panel_24.setEnabled(false);
				}
				Color c1 = panel_24.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_24.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_24.setLayout(null);
		panel_24.setBounds(224, 302, 97, 82);
		panel.add(panel_24);
		
		popupMenu_23 = new JPopupMenu();
		addPopup(panel_24, popupMenu_23);
		
		mntmCancelarReservacin_15 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel23 = true;
						panel_24.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_24.getComponentCount();i++) {
							panel_24.getComponent(i).setVisible(false);
						}
						label24.setVisible(true);
						lblC_23.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_15.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_23.add(mntmCancelarReservacin_15);
		
		label24 = new JLabel("");
		label24.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label24.setHorizontalAlignment(SwingConstants.CENTER);
		label24.setBounds(14, 5, 79, 51);
		panel_24.add(label24);
		
		lblC_23 = new JLabel("C-24");
		lblC_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_23.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_23.setBounds(10, 56, 79, 20);
		panel_24.add(lblC_23);
		
		panel_25 = new JPanel();
		panel_25.setName("panel_25");
		panel_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_25.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_25.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_25.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_25.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_25");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_25.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_25.getBackground()==Color.GREEN || panel_25.getBackground()==Color.RED) {
					panel_25.setEnabled(true);
				}
				else {
					panel_25.setEnabled(false);
				}
				Color c1 = panel_25.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_25.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_25.setLayout(null);
		panel_25.setBounds(331, 302, 97, 82);
		panel.add(panel_25);
		
		popupMenu_24 = new JPopupMenu();
		addPopup(panel_25, popupMenu_24);
		
		mntmCancelarReservacin_16 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel24 = true;
						panel_25.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_25.getComponentCount();i++) {
							panel_25.getComponent(i).setVisible(false);
						}
						label25.setVisible(true);
						lblC_24.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_16.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_24.add(mntmCancelarReservacin_16);
		
		label25 = new JLabel("");
		label25.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label25.setHorizontalAlignment(SwingConstants.CENTER);
		label25.setBounds(14, 5, 79, 51);
		panel_25.add(label25);
		
		lblC_24 = new JLabel("C-25");
		lblC_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_24.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_24.setBounds(10, 56, 79, 20);
		panel_25.add(lblC_24);
		
		panel_26 = new JPanel();
		panel_26.setName("panel_26");
		panel_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_26.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_26.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_26.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_26.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_26");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_26.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_26.getBackground()==Color.GREEN || panel_26.getBackground()==Color.RED) {
					panel_26.setEnabled(true);
				}
				else {
					panel_26.setEnabled(false);
				}
				Color c1 = panel_26.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_26.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_26.setLayout(null);
		panel_26.setBounds(438, 302, 97, 82);
		panel.add(panel_26);
		
		popupMenu_25 = new JPopupMenu();
		addPopup(panel_26, popupMenu_25);
		
		mntmCancelarReservacin_17 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel25 = true;
						panel_26.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_26.getComponentCount();i++) {
							panel_26.getComponent(i).setVisible(false);
						}
						label26.setVisible(true);
						lblC_25.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_17.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_25.add(mntmCancelarReservacin_17);
		
		label26 = new JLabel("");
		label26.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label26.setHorizontalAlignment(SwingConstants.CENTER);
		label26.setBounds(14, 5, 79, 51);
		panel_26.add(label26);
		
		lblC_25 = new JLabel("C-26");
		lblC_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_25.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_25.setBounds(10, 56, 79, 20);
		panel_26.add(lblC_25);
		
		panel_27 = new JPanel();
		panel_27.setName("panel_27");
		panel_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_27.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_27.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_27.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_27.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_27");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_27.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_27.getBackground()==Color.GREEN || panel_27.getBackground()==Color.RED) {
					panel_27.setEnabled(true);
				}
				else {
					panel_27.setEnabled(false);
				}
				Color c1 = panel_27.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_27.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_27.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_27.setLayout(null);
		panel_27.setBounds(545, 302, 97, 82);
		panel.add(panel_27);
		
		popupMenu_26 = new JPopupMenu();
		addPopup(panel_27, popupMenu_26);
		
		mntmCancelarReservacin_18 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel26 = true;
						panel_27.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_27.getComponentCount();i++) {
							panel_27.getComponent(i).setVisible(false);
						}
						label27.setVisible(true);
						lblC_26.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_18.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_26.add(mntmCancelarReservacin_18);
		
		label27 = new JLabel("");
		label27.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label27.setHorizontalAlignment(SwingConstants.CENTER);
		label27.setBounds(14, 5, 79, 51);
		panel_27.add(label27);
		
		lblC_26 = new JLabel("C-27");
		lblC_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_26.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_26.setBounds(10, 56, 79, 20);
		panel_27.add(lblC_26);
		
		panel_28 = new JPanel();
		panel_28.setName("panel_28");
		panel_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_28.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_28.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_28.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_28.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_28");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_28.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_28.getBackground()==Color.GREEN || panel_28.getBackground()==Color.RED) {
					panel_28.setEnabled(true);
				}
				else {
					panel_28.setEnabled(false);
				}
				Color c1 = panel_28.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_28.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_28.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_28.setLayout(null);
		panel_28.setBounds(652, 302, 97, 82);
		panel.add(panel_28);
		
		popupMenu_27 = new JPopupMenu();
		addPopup(panel_28, popupMenu_27);
		
		mntmCancelarReservacin_19 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel27 = true;
						panel_28.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_28.getComponentCount();i++) {
							panel_28.getComponent(i).setVisible(false);
						}
						label28.setVisible(true);
						lblC_27.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_19.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_27.add(mntmCancelarReservacin_19);
		
		label28 = new JLabel("");
		label28.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label28.setHorizontalAlignment(SwingConstants.CENTER);
		label28.setBounds(14, 5, 79, 51);
		panel_28.add(label28);
		
		lblC_27 = new JLabel("C-28");
		lblC_27.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_27.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_27.setBounds(10, 56, 79, 20);
		panel_28.add(lblC_27);
		
		panel_29 = new JPanel();
		panel_29.setName("panel_29");
		panel_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_29.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_29.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_29.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_29.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_29");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_29.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_29.getBackground()==Color.GREEN || panel_29.getBackground()==Color.RED) {
					panel_29.setEnabled(true);
				}
				else {
					panel_29.setEnabled(false);
				}
				Color c1 = panel_29.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_29.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_29.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_29.setLayout(null);
		panel_29.setBounds(10, 395, 97, 82);
		panel.add(panel_29);
		
		popupMenu_28 = new JPopupMenu();
		addPopup(panel_29, popupMenu_28);
		
		mntmCancelarReservacin_20 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel28 = true;
						panel_29.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_29.getComponentCount();i++) {
							panel_29.getComponent(i).setVisible(false);
						}
						label29.setVisible(true);
						lblC_28.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_20.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_28.add(mntmCancelarReservacin_20);
		
		label29 = new JLabel("");
		label29.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label29.setHorizontalAlignment(SwingConstants.CENTER);
		label29.setBounds(14, 5, 79, 51);
		panel_29.add(label29);
		
		lblC_28 = new JLabel("C-29");
		lblC_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_28.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_28.setBounds(10, 56, 79, 20);
		panel_29.add(lblC_28);
		
		panel_30 = new JPanel();
		panel_30.setName("panel_30");
		panel_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_30.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_30.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_30.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_30.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_30");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_30.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_30.getBackground()==Color.GREEN || panel_30.getBackground()==Color.RED) {
					panel_30.setEnabled(true);
				}
				else {
					panel_30.setEnabled(false);
				}
				Color c1 = panel_30.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_30.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_30.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_30.setLayout(null);
		panel_30.setBounds(117, 395, 97, 82);
		panel.add(panel_30);
		
		popupMenu_29 = new JPopupMenu();
		addPopup(panel_30, popupMenu_29);
		
		mntmCancelarReservacin_21 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel29 = true;
						panel_30.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_30.getComponentCount();i++) {
							panel_30.getComponent(i).setVisible(false);
						}
						label30.setVisible(true);
						lblC_29.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_21.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_29.add(mntmCancelarReservacin_21);
		
		label30 = new JLabel("");
		label30.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label30.setHorizontalAlignment(SwingConstants.CENTER);
		label30.setBounds(14, 5, 79, 51);
		panel_30.add(label30);
		
		lblC_29 = new JLabel("C-30");
		lblC_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_29.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_29.setBounds(10, 56, 79, 20);
		panel_30.add(lblC_29);
		
		panel_31 = new JPanel();
		panel_31.setName("panel_31");
		panel_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_31.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_31.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_31.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_31.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_31");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_31.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_31.getBackground()==Color.GREEN || panel_31.getBackground()==Color.RED) {
					panel_31.setEnabled(true);
				}
				else {
					panel_31.setEnabled(false);
				}
				Color c1 = panel_31.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_31.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_31.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_31.setLayout(null);
		panel_31.setBounds(224, 395, 97, 82);
		panel.add(panel_31);
		
		popupMenu_30 = new JPopupMenu();
		addPopup(panel_31, popupMenu_30);
		
		mntmCancelarReservacin_22 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel30 = true;
						panel_31.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_31.getComponentCount();i++) {
							panel_31.getComponent(i).setVisible(false);
						}
						label31.setVisible(true);
						lblC_30.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_22.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_30.add(mntmCancelarReservacin_22);
		
		label31 = new JLabel("");
		label31.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label31.setHorizontalAlignment(SwingConstants.CENTER);
		label31.setBounds(14, 5, 79, 51);
		panel_31.add(label31);
		
		lblC_30 = new JLabel("C-31");
		lblC_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_30.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_30.setBounds(10, 56, 79, 20);
		panel_31.add(lblC_30);
		
		panel_32 = new JPanel();
		panel_32.setName("panel_32");
		panel_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_32.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_32.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_32.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_32.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_32");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_32.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_32.getBackground()==Color.GREEN || panel_32.getBackground()==Color.RED) {
					panel_32.setEnabled(true);
				}
				else {
					panel_32.setEnabled(false);
				}
				Color c1 = panel_32.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_32.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_32.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_32.setLayout(null);
		panel_32.setBounds(331, 395, 97, 82);
		panel.add(panel_32);
		
		popupMenu_31 = new JPopupMenu();
		addPopup(panel_32, popupMenu_31);
		
		mntmCancelarReservacin_23 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel31 = true;
						panel_32.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_32.getComponentCount();i++) {
							panel_32.getComponent(i).setVisible(false);
						}
						label32.setVisible(true);
						lblC_31.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_23.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_31.add(mntmCancelarReservacin_23);
		
		label32 = new JLabel("");
		label32.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label32.setHorizontalAlignment(SwingConstants.CENTER);
		label32.setBounds(14, 5, 79, 51);
		panel_32.add(label32);
		
		lblC_31 = new JLabel("C-32");
		lblC_31.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_31.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_31.setBounds(10, 56, 79, 20);
		panel_32.add(lblC_31);
		
		panel_33 = new JPanel();
		panel_33.setName("panel_33");
		panel_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_33.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_33.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_33.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_33.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_33");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_33.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_33.getBackground()==Color.GREEN || panel_33.getBackground()==Color.RED) {
					panel_33.setEnabled(true);
				}
				else {
					panel_33.setEnabled(false);
				}
				Color c1 = panel_33.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_33.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_33.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_33.setLayout(null);
		panel_33.setBounds(438, 395, 97, 82);
		panel.add(panel_33);
		
		popupMenu_32 = new JPopupMenu();
		addPopup(panel_33, popupMenu_32);
		
		mntmCancelarReservacin_24 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel32 = true;
						panel_33.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_33.getComponentCount();i++) {
							panel_33.getComponent(i).setVisible(false);
						}
						label33.setVisible(true);
						lblC_32.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_24.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_32.add(mntmCancelarReservacin_24);
		
		
		label33 = new JLabel("");
		label33.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label33.setHorizontalAlignment(SwingConstants.CENTER);
		label33.setBounds(14, 5, 79, 51);
		panel_33.add(label33);
		
		lblC_32 = new JLabel("C-33");
		lblC_32.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_32.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_32.setBounds(10, 56, 79, 20);
		panel_33.add(lblC_32);
		
		panel_34 = new JPanel();
		panel_34.setName("panel_34");
		panel_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_34.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_34.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_34.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_34.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_34");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_34.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_34.getBackground()==Color.GREEN || panel_34.getBackground()==Color.RED) {
					panel_34.setEnabled(true);
				}
				else {
					panel_34.setEnabled(false);
				}
				Color c1 = panel_34.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_34.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_34.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_34.setLayout(null);
		panel_34.setBounds(545, 395, 97, 82);
		panel.add(panel_34);
		
		popupMenu_33 = new JPopupMenu();
		addPopup(panel_34, popupMenu_33);
		
		mntmCancelarReservacin_25 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel33 = true;
						panel_34.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_34.getComponentCount();i++) {
							panel_34.getComponent(i).setVisible(false);
						}
						label34.setVisible(true);
						lblC_33.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_25.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_33.add(mntmCancelarReservacin_25);
		
		label34 = new JLabel("");
		label34.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label34.setHorizontalAlignment(SwingConstants.CENTER);
		label34.setBounds(14, 5, 79, 51);
		panel_34.add(label34);
		
		lblC_33 = new JLabel("C-34");
		lblC_33.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_33.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_33.setBounds(10, 56, 79, 20);
		panel_34.add(lblC_33);
		
		panel_35 = new JPanel();
		panel_35.setName("panel_35");
		panel_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_35.getBackground();
					if (c1!=c2 && c1!=c3)
						panel_35.setBackground(new Color(200,200,200));
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)){
					Color c1 = panel_35.getBackground();
					if (c1!=c2 && c1!=c3) {
						panel_35.setBackground(new Color (220,220,220));
						RentRoom rent = new RentRoom("panel_35");
						rent.setVisible(true);
					}
				}
			}
		});
		panel_35.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
				if (panel_35.getBackground()==Color.GREEN || panel_35.getBackground()==Color.RED) {
					panel_35.setEnabled(true);
				}
				else {
					panel_35.setEnabled(false);
				}
				Color c1 = panel_35.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_35.setBackground(new Color (220,220,220));
				}
			}
		});
		panel_35.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_35.setLayout(null);
		panel_35.setBounds(652, 395, 97, 82);
		panel.add(panel_35);
		
		popupMenu_34 = new JPopupMenu();
		addPopup(panel_35, popupMenu_34);
		
		mntmCancelarReservacin_26 = new JMenuItem("Cancelar reservaci\u00F3n");
		mntmCancelarReservacin_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la reserva?", "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if (resp == JOptionPane.YES_OPTION) {
						cancel34 = true;
						panel_35.setBackground(new Color(240,240,240));
						for (int i =0;i<panel_35.getComponentCount();i++) {
							panel_35.getComponent(i).setVisible(false);
						}
						label35.setVisible(true);
						lblC_34.setVisible(true);
						RentRoom.code--;
					}
				}
			}
		});
		mntmCancelarReservacin_26.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/cancelar_opt.png")));
		popupMenu_34.add(mntmCancelarReservacin_26);
		
		label35 = new JLabel("");
		label35.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/room_opt.png")));
		label35.setHorizontalAlignment(SwingConstants.CENTER);
		label35.setBounds(14, 5, 79, 51);
		panel_35.add(label35);
		
		lblC_34 = new JLabel("C-35");
		lblC_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_34.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblC_34.setBounds(10, 56, 79, 20);
		panel_35.add(lblC_34);
		
		
	}
	private void setOriginalColor() {
		Color c1 = panel_1.getBackground();
		Color cg = Color.GREEN;
		Color cr = Color.RED;
		Color c2 = panel_2.getBackground();
		Color c3 = panel_3.getBackground();
		Color c4 = panel_4.getBackground();
		Color c5 = panel_5.getBackground();
		Color c6 = panel_6.getBackground();
		Color c7 = panel_7.getBackground();
		Color c8 = panel_8.getBackground();
		Color c9 = panel_9.getBackground();
		Color c10 = panel_10.getBackground();
		Color c11 = panel_11.getBackground();
		Color c12 = panel_12.getBackground();
		Color c13 = panel_13.getBackground();
		Color c14 = panel_14.getBackground();
		Color c15 = panel_15.getBackground();
		Color c16 = panel_16.getBackground();
		Color c17 = panel_17.getBackground();
		Color c18 = panel_18.getBackground();
		Color c19 = panel_19.getBackground();
		Color c20 = panel_20.getBackground();
		Color c21 = panel_21.getBackground();
		Color c22 = panel_22.getBackground();
		Color c23 = panel_23.getBackground();
		Color c24 = panel_24.getBackground();
		Color c25 = panel_25.getBackground();
		Color c26 = panel_26.getBackground();
		Color c27 = panel_27.getBackground();
		Color c28 = panel_28.getBackground();
		Color c29 = panel_29.getBackground();
		Color c30 = panel_30.getBackground();
		Color c31 = panel_31.getBackground();
		Color c32 = panel_32.getBackground();
		Color c33 = panel_33.getBackground();
		Color c34 = panel_34.getBackground();
		Color c35 = panel_35.getBackground();
		if (c1!=cg && c1!=cr)
			panel_1.setBackground(new Color (240,240,240));
		if (c2!=cg && c2!=cr)
			panel_2.setBackground(new Color (240,240,240));
		if (c3!=cg && c3!=cr)
			panel_3.setBackground(new Color (240,240,240));
		if (c4!=cg && c4!=cr)
			panel_4.setBackground(new Color (240,240,240));
		if (c5!=cg && c5!=cr)
			panel_5.setBackground(new Color (240,240,240));
		if (c6!=cg && c6!=cr)
			panel_6.setBackground(new Color (240,240,240));
		if (c7!=cg && c7!=cr)
			panel_7.setBackground(new Color (240,240,240));
		if (c8!=cg && c8!=cr)
			panel_8.setBackground(new Color (240,240,240));
		if (c9!=cg && c9!=cr)
			panel_9.setBackground(new Color (240,240,240));
		if (c10!=cg && c10!=cr)
			panel_10.setBackground(new Color (240,240,240));
		if (c11!=cg && c11!=cr)
			panel_11.setBackground(new Color (240,240,240));
		if (c12!=cg && c12!=cr)
			panel_12.setBackground(new Color (240,240,240));
		if (c13!=cg && c13!=cr)
			panel_13.setBackground(new Color (240,240,240));
		if (c14!=cg && c14!=cr)
			panel_14.setBackground(new Color (240,240,240));
		if (c15!=cg && c15!=cr)
			panel_15.setBackground(new Color (240,240,240));
		if (c16!=cg && c16!=cr)
			panel_16.setBackground(new Color (240,240,240));
		if (c17!=cg && c17!=cr)
			panel_17.setBackground(new Color (240,240,240));
		if (c18!=cg && c18!=cr)
			panel_18.setBackground(new Color (240,240,240));
		if (c19!=cg && c19!=cr)
			panel_19.setBackground(new Color (240,240,240));
		if (c20!=cg && c20!=cr)
			panel_20.setBackground(new Color (240,240,240));
		if (c21!=cg && c21!=cr)
			panel_21.setBackground(new Color (240,240,240));
		if (c22!=cg && c22!=cr)
			panel_22.setBackground(new Color (240,240,240));
		if (c23!=cg && c23!=cr)
			panel_23.setBackground(new Color (240,240,240));
		if (c24!=cg && c24!=cr)
			panel_24.setBackground(new Color (240,240,240));
		if (c25!=cg && c25!=cr)
			panel_25.setBackground(new Color (240,240,240));
		if (c26!=cg && c26!=cr)
			panel_26.setBackground(new Color (240,240,240));
		if (c27!=cg && c27!=cr)
			panel_27.setBackground(new Color (240,240,240));
		if (c28!=cg && c28!=cr)
			panel_28.setBackground(new Color (240,240,240));
		if (c29!=cg && c29!=cr)
			panel_29.setBackground(new Color (240,240,240));
		if (c30!=cg && c30!=cr)
			panel_30.setBackground(new Color (240,240,240));
		if (c31!=cg && c31!=cr)
			panel_31.setBackground(new Color (240,240,240));
		if (c32!=cg && c32!=cr)
			panel_32.setBackground(new Color (240,240,240));
		if (c33!=cg && c33!=cr)
			panel_33.setBackground(new Color (240,240,240));
		if (c34!=cg && c34!=cr)
			panel_34.setBackground(new Color (240,240,240));
		if (c35!=cg && c35!=cr)
			panel_35.setBackground(new Color (240,240,240));
	}
	public static JLabel getLabel1() {
		return label1;
	}
	public static JLabel getLblC() {
		return lblC;
	}
	

	@Override
	public void run() {
		System.out.println("Is working");
	}
	public static JPanel getPanel(String name) {
		   JPanel aux = null;
		   for (int i=0;i<panel.getComponentCount();i++) {
			   if (panel.getComponent(i).getName().equals(name)) {
				   aux = (JPanel)panel.getComponent(i);
				   break;
			   }
		   }
		   return aux;
	   }

	public static JLabel getLabel2() {
		return label2;
	}

	public static JLabel getLblC_1() {
		return lblC_1;
	}

	public static JLabel getLabel3() {
		return label3;
	}

	public static JLabel getLblC_2() {
		return lblC_2;
	}

	public static JLabel getLabel4() {
		return label4;
	}

	public static JLabel getLblC_3() {
		return lblC_3;
	}

	public static JLabel getLabel5() {
		return label5;
	}

	public static JLabel getLblC_4() {
		return lblC_4;
	}

	public static JLabel getLabel6() {
		return label6;
	}

	public static JLabel getLblC_5() {
		return lblC_5;
	}

	public static JLabel getLabel7() {
		return label7;
	}

	public static JLabel getLblC_6() {
		return lblC_6;
	}

	public static JLabel getLabel8() {
		return label8;
	}

	public static JLabel getLblC_7() {
		return lblC_7;
	}

	public static JLabel getLabel9() {
		return label9;
	}

	public static JLabel getLblC_8() {
		return lblC_8;
	}

	public static JLabel getLabel10() {
		return label10;
	}

	public static JLabel getLblC_9() {
		return lblC_9;
	}

	public static JLabel getLabel11() {
		return label11;
	}

	public static JLabel getLblC_10() {
		return lblC_10;
	}

	public static JLabel getLabel12() {
		return label12;
	}

	public static JLabel getLblC_11() {
		return lblC_11;
	}

	public static JLabel getLabel13() {
		return label13;
	}

	public static JLabel getLblC_12() {
		return lblC_12;
	}

	public static JLabel getLabel14() {
		return label14;
	}

	public static JLabel getLblC_13() {
		return lblC_13;
	}

	public static JLabel getLabel15() {
		return label15;
	}

	public static JLabel getLblC_14() {
		return lblC_14;
	}

	public static JLabel getLabel16() {
		return label16;
	}

	public static JLabel getLblC_15() {
		return lblC_15;
	}

	public static JLabel getLabel17() {
		return label17;
	}

	public static JLabel getLblC_16() {
		return lblC_16;
	}

	public static JLabel getLabel18() {
		return label18;
	}

	public static JLabel getLblC_17() {
		return lblC_17;
	}

	public static JLabel getLabel19() {
		return label19;
	}

	public static JLabel getLblC_18() {
		return lblC_18;
	}

	public static JLabel getLabel20() {
		return label20;
	}

	public static JLabel getLblC_19() {
		return lblC_19;
	}

	public static JLabel getLabel21() {
		return label21;
	}

	public static JLabel getLabel22() {
		return label22;
	}

	public static JLabel getLblC_21() {
		return lblC_21;
	}

	public static JLabel getLabel23() {
		return label23;
	}

	public static JLabel getLblC_22() {
		return lblC_22;
	}

	public static JLabel getLabel24() {
		return label24;
	}

	public static JLabel getLblC_23() {
		return lblC_23;
	}

	public static JLabel getLabel25() {
		return label25;
	}

	public static JLabel getLblC_24() {
		return lblC_24;
	}

	public static JLabel getLabel26() {
		return label26;
	}

	public static JLabel getLblC_25() {
		return lblC_25;
	}

	public static JLabel getLabel27() {
		return label27;
	}

	public static JLabel getLblC_26() {
		return lblC_26;
	}

	public static JLabel getLabel28() {
		return label28;
	}

	public static JLabel getLblC_27() {
		return lblC_27;
	}

	public static JLabel getLabel29() {
		return label29;
	}

	public static JLabel getLblC_28() {
		return lblC_28;
	}

	public static JLabel getLabel30() {
		return label30;
	}

	public static JLabel getLblC_29() {
		return lblC_29;
	}

	public static JLabel getLabel31() {
		return label31;
	}

	public static JLabel getLblC_30() {
		return lblC_30;
	}

	public static JLabel getLabel32() {
		return label32;
	}

	public static JLabel getLblC_31() {
		return lblC_31;
	}

	public static JLabel getLabel33() {
		return label33;
	}

	public static JLabel getLblC_32() {
		return lblC_32;
	}

	public static JLabel getLabel34() {
		return label34;
	}

	public static JLabel getLblC_33() {
		return lblC_33;
	}

	public static JLabel getLabel35() {
		return label35;
	}

	public static JLabel getLblC_34() {
		return lblC_34;
	}
	public static JLabel getLblC_20() {
		return lblC_20;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					if (component.isEnabled())
						showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					if (component.isEnabled())
						showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
