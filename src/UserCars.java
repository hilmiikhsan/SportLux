import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserCars extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserCars frame = new UserCars();
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
	public UserCars() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 796);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Our Vehicles");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(24, 13, 182, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Find your BMW!");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(24, 40, 177, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(UserCars.class.getResource("/images/img_bmw-_view (1).jpg")));
		lblNewLabel_3.setBounds(329, -20, 90, 83);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DetailCar detailCar = new DetailCar();
				detailCar.setVisible(true);
				detailCar.setLocationRelativeTo(null);
				detailCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		lblNewLabel_3_1_1.setIcon(new ImageIcon(UserCars.class.getResource("/images/car-3.png")));
		lblNewLabel_3_1_1.setBounds(24, 88, 395, 133);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon(UserCars.class.getResource("/images/car-4.png")));
		lblNewLabel_3_1_1_1.setBounds(24, 233, 395, 133);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1_1.setIcon(new ImageIcon(UserCars.class.getResource("/images/car-5.png")));
		lblNewLabel_3_1_1_1_1.setBounds(24, 378, 395, 133);
		contentPane.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1_1_1.setIcon(new ImageIcon(UserCars.class.getResource("/images/car-6.png")));
		lblNewLabel_3_1_1_1_1_1.setBounds(24, 523, 395, 133);
		contentPane.add(lblNewLabel_3_1_1_1_1_1);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(UserCars.class.getResource("/images/bottomnav.png")));
		lblNewLabel_17.setBounds(22, 668, 440, 45);
		contentPane.add(lblNewLabel_17);
	}

}
