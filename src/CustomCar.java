import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CustomCar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomCar frame = new CustomCar();
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
	public CustomCar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 740);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(" BMW Z4 sDrive30i");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 22, 215, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Build your dream car with SPORTLUX");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(22, 49, 241, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(DetailCar.class.getResource("/images/BMW (2)-removebg-preview (1).jpg")));
		lblNewLabel_3.setBounds(327, 0, 90, 83);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(UserCars.class.getResource("/images/bottomnav.png")));
		lblNewLabel_17.setBounds(0, 663, 452, 45);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/whitecar-removebg-preview (1).jpg")));
		lblNewLabel_3_1_1.setBounds(54, 108, 328, 133);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewLabel_3_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/whitecar-removebg-preview (1).jpg")));
				lblNewLabel_3_1_1.setBounds(54, 108, 328, 133);
				contentPane.add(lblNewLabel_3_1_1);
			}
		});
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/exwhite (1).png")));
		lblNewLabel_3_1_1_1.setBounds(40, 288, 114, 157);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Exterior Colours.");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(40, 261, 215, 15);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/silver-removebg-preview (1).jpg")));
				lblNewLabel_3_1_1.setBounds(54, 108, 328, 133);
				contentPane.add(lblNewLabel_3_1_1);
			}
		});
		lblNewLabel_3_1_1_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/exsilver.png")));
		lblNewLabel_3_1_1_1_1.setBounds(154, 288, 114, 157);
		contentPane.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/graycar-removebg-preview (1).jpg")));
				lblNewLabel_3_1_1.setBounds(54, 108, 328, 133);
				contentPane.add(lblNewLabel_3_1_1);
			}
		});
		lblNewLabel_3_1_1_1_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/exgray.png")));
		lblNewLabel_3_1_1_1_1_1.setBounds(268, 288, 114, 157);
		contentPane.add(lblNewLabel_3_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("");
		lblNewLabel_3_1_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/blackcar-removebg-preview (1).jpg")));
				lblNewLabel_3_1_1.setBounds(54, 108, 328, 133);
				contentPane.add(lblNewLabel_3_1_1);
			}
		});
		lblNewLabel_3_1_1_1_2.setIcon(new ImageIcon(CustomCar.class.getResource("/images/exblack.png")));
		lblNewLabel_3_1_1_1_2.setBounds(40, 465, 114, 157);
		contentPane.add(lblNewLabel_3_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1_2 = new JLabel("");
		lblNewLabel_3_1_1_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/bluecar (1)-removebg-preview (1).jpg")));
				lblNewLabel_3_1_1.setBounds(54, 108, 328, 133);
				contentPane.add(lblNewLabel_3_1_1);
			}
		});
		lblNewLabel_3_1_1_1_1_2.setIcon(new ImageIcon(CustomCar.class.getResource("/images/exblue.png")));
		lblNewLabel_3_1_1_1_1_2.setBounds(154, 465, 114, 157);
		contentPane.add(lblNewLabel_3_1_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/redcar-removebg-preview (1).jpg")));
				lblNewLabel_3_1_1.setBounds(54, 108, 328, 133);
				contentPane.add(lblNewLabel_3_1_1);
			}
		});
		lblNewLabel_3_1_1_1_1_1_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/exred.png")));
		lblNewLabel_3_1_1_1_1_1_1.setBounds(268, 465, 114, 157);
		contentPane.add(lblNewLabel_3_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(CustomCar.class.getResource("/images/next (3).png")));
		lblNewLabel_3_1.setBounds(154, 623, 90, 39);
		contentPane.add(lblNewLabel_3_1);
	}
}
