package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;

//import org.jvnet.substance.SubstanceLookAndFeel;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;






import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
	
	
	//private Thread t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
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
		setTitle("Caba\u00F1a809");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 573);
		setLocationRelativeTo(null);
		setResizable(false);
		
		//t = new Thread(this);
		//t.start();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProductos = new JMenu("Productos");
		menuBar.add(mnProductos);
		
		JMenuItem mntmAgregarProducto = new JMenuItem("A\u00F1adir producto");
		mntmAgregarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoProducto nu = new NuevoProducto(false, -1);
				nu.setModal(true);
				nu.setLocationRelativeTo(null);
				nu.setResizable(false);
				nu.setVisible(true);
			}
		});
		mnProductos.add(mntmAgregarProducto);
		
		JMenuItem mntmListaDeProductos = new JMenuItem("Lista de productos");
		mntmListaDeProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Oferta o = new Oferta();
				o.setModal(true);
				o.setLocationRelativeTo(null);
				o.setResizable(false);
				o.setVisible(true);

			}
		});
		mnProductos.add(mntmListaDeProductos);
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
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Control de Caba\u00F1as", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 759, 491);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setName("panel_1");
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Color c1 = panel_1.getBackground();
				if (c1.getRGB()!=c2.getRGB() && c1.getRGB()!=c3.getRGB())
					panel_1.setBackground(new Color (200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_1.getBackground();
				if (c1.getRGB()!=c2.getRGB() && c1.getRGB()!=c3.getRGB()) {
					panel_1.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_1");
					rent.setVisible(true);
				}
			}
		});
		panel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label1 = new JLabel("");
		label1.setBounds(14, 5, 79, 51);
		panel_1.add(label1);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
		
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
				Color c1 = panel_2.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_2.setBackground(new Color (200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_2.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_2.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_2");
					rent.setVisible(true);
				}
			}
		});
		panel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label2 = new JLabel("");
		label2.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_3.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_3.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_3.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_3.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_3");
					rent.setVisible(true);
				}
			}
		});
		panel_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label3 = new JLabel("");
		label3.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_4.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_4.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_4.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_4.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_4");
					rent.setVisible(true);
				}
			}
		});
		panel_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label4 = new JLabel("");
		label4.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_5.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_5.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_5.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_5.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_5");
					rent.setVisible(true);
				}
			}
		});
		panel_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label5 = new JLabel("");
		label5.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_6.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_6.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_6.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_6.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_6");
					rent.setVisible(true);
				}
			}
		});
		panel_6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label6 = new JLabel("");
		label6.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_7.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_7.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_7.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_7.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_7");
					rent.setVisible(true);
				}
			}
		});
		panel_7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label7 = new JLabel("");
		label7.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_8.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_8.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_8.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_8.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_8");
					rent.setVisible(true);
				}
			}
		});
		panel_8.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label8 = new JLabel("");
		label8.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_9.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_9.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_9.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_9.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_9");
					rent.setVisible(true);
				}
			}
		});
		panel_9.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label9 = new JLabel("");
		label9.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_10.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_10.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_10.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_10.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_10");
					rent.setVisible(true);
				}
			}
		});
		panel_10.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label10 = new JLabel("");
		label10.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_11.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_11.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_11.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_11.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_11");
					rent.setVisible(true);
				}
			}
		});
		panel_11.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label11 = new JLabel("");
		label11.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_12.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_12.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_12.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_12.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_12");
					rent.setVisible(true);
				}
			}
		});
		panel_12.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		 
		label12 = new JLabel("");
		label12.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_13.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_13.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_13.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_13.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_13");
					rent.setVisible(true);
				}
			}
		});
		panel_13.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label13 = new JLabel("");
		label13.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_14.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_14.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_14.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_14.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_14");
					rent.setVisible(true);
				}
			}
		});
		panel_14.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label14 = new JLabel("");
		label14.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_15.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_15.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_15.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_15.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_15");
					rent.setVisible(true);
				}
			}
		});
		panel_15.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label15 = new JLabel("");
		label15.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_16.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_16.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_16.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_16.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_16");
					rent.setVisible(true);
				}
			}
		});
		panel_16.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label16 = new JLabel("");
		label16.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_17.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_17.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_17.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_17.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_17");
					rent.setVisible(true);
				}
			}
		});
		panel_17.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label17 = new JLabel("");
		label17.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_18.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_18.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_18.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_18.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_18");
					rent.setVisible(true);
				}
			}
		});
		panel_18.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label18 = new JLabel("");
		label18.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_19.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_19.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_19.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_19.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_19");
					rent.setVisible(true);
				}
			}
		});
		panel_19.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label19 = new JLabel("");
		label19.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_20.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_20.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_20.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_20.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_20");
					rent.setVisible(true);
				}
			}
		});
		panel_20.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label20 = new JLabel("");
		label20.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_21.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_21.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_21.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_21.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_21");
					rent.setVisible(true);
				}
			}
		});
		panel_21.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label21 = new JLabel("");
		label21.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_22.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_22.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_22.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_22.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_22");
					rent.setVisible(true);
				}
			}
		});
		panel_22.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label22 = new JLabel("");
		label22.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_23.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_23.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_23.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_23.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_23");
					rent.setVisible(true);
				}
			}
		});
		panel_23.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label23 = new JLabel("");
		label23.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_24.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_24.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_24.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_24.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_24");
					rent.setVisible(true);
				}
			}
		});
		panel_24.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label24 = new JLabel("");
		label24.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_25.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_25.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_25.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_25.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_25");
					rent.setVisible(true);
				}
			}
		});
		panel_25.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label25 = new JLabel("");
		label25.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_26.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_26.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_26.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_26.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_26");
					rent.setVisible(true);
				}
			}
		});
		panel_26.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label26 = new JLabel("");
		label26.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_27.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_27.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_27.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_27.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_27");
					rent.setVisible(true);
				}
			}
		});
		panel_27.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label27 = new JLabel("");
		label27.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_28.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_28.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_28.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_28.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_28");
					rent.setVisible(true);
				}
			}
		});
		panel_28.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label28 = new JLabel("");
		label28.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_29.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_29.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_29.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_29.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_29");
					rent.setVisible(true);
				}
			}
		});
		panel_29.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label29 = new JLabel("");
		label29.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_30.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_30.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_30.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_30.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_30");
					rent.setVisible(true);
				}
			}
		});
		panel_30.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label30 = new JLabel("");
		label30.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_31.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_31.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_31.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_31.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_31");
					rent.setVisible(true);
				}
			}
		});
		panel_31.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label31 = new JLabel("");
		label31.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_32.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_32.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_32.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_32.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_32");
					rent.setVisible(true);
				}
			}
		});
		panel_32.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label32 = new JLabel("");
		label32.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_33.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_33.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_33.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_33.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_33");
					rent.setVisible(true);
				}
			}
		});
		panel_33.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		
		label33 = new JLabel("");
		label33.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_34.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_34.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_34.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_34.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_34");
					rent.setVisible(true);
				}
			}
		});
		panel_34.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label34 = new JLabel("");
		label34.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
				Color c1 = panel_35.getBackground();
				if (c1!=c2 && c1!=c3)
					panel_35.setBackground(new Color(200,200,200));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Color c1 = panel_35.getBackground();
				if (c1!=c2 && c1!=c3) {
					panel_35.setBackground(new Color (220,220,220));
					RentRoom rent = new RentRoom("panel_35");
					rent.setVisible(true);
				}
			}
		});
		panel_35.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setOriginalColor();
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
		
		label35 = new JLabel("");
		label35.setIcon(new ImageIcon(VisualMain.class.getResource("/icons/bedroom-512_opt.png")));
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
	
}
