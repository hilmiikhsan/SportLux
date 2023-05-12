import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserForm frame = new UserForm();
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
	public UserForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 740);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserCars carsForm = new UserCars();
				carsForm.setVisible(true);
				carsForm.setLocationRelativeTo(null);
				carsForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		lblNewLabel.setIcon(new ImageIcon(UserForm.class.getResource("/images/BMW (2)-removebg-preview (1).jpg")));
		lblNewLabel.setBounds(40, 66, 97, 83);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Modification");
		lblNewLabel_1.setBounds(30, 12, 97, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Choose your brand cars");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_1_1.setBounds(30, 39, 177, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("BMW");
		lblNewLabel_2.setBounds(67, 150, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(UserForm.class.getResource("/images/Mercedes.png")));
		lblNewLabel_3.setBounds(187, 66, 97, 83);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mercedes");
		lblNewLabel_2_1.setBounds(197, 150, 70, 15);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(UserForm.class.getResource("/images/Mitsubishi.png")));
		lblNewLabel_4.setBounds(315, 66, 97, 83);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mitsubishi");
		lblNewLabel_2_2.setBounds(325, 150, 108, 15);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(UserForm.class.getResource("/images/Ford.png")));
		lblNewLabel_5.setBounds(40, 189, 97, 83);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_3 = new JLabel("Ford");
		lblNewLabel_2_3.setBounds(67, 249, 70, 15);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(UserForm.class.getResource("/images/Audi.png")));
		lblNewLabel_6.setBounds(187, 189, 97, 83);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_4 = new JLabel("Audi");
		lblNewLabel_2_4.setBounds(214, 249, 70, 15);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(UserForm.class.getResource("/images/Honda-removebg-preview (1).jpg")));
		lblNewLabel_7.setBounds(315, 189, 97, 83);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2_5 = new JLabel("Honda");
		lblNewLabel_2_5.setBounds(331, 249, 70, 33);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(UserForm.class.getResource("/images/Toyota-removebg-preview (1) (1).jpg")));
		lblNewLabel_8.setBounds(40, 309, 97, 83);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_6 = new JLabel("Toyota");
		lblNewLabel_2_6.setBounds(62, 378, 49, 15);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(UserForm.class.getResource("/images/suzuki.png")));
		lblNewLabel_9.setBounds(197, 309, 97, 74);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_2_7 = new JLabel("Suzuki");
		lblNewLabel_2_7.setBounds(214, 378, 80, 33);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(UserForm.class.getResource("/images/jeep-removebg-preview (1).jpg")));
		lblNewLabel_10.setBounds(315, 309, 97, 83);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_2_8 = new JLabel("Jeep");
		lblNewLabel_2_8.setBounds(342, 377, 70, 15);
		contentPane.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(UserForm.class.getResource("/images/nissan-removebg-preview (1).jpg")));
		lblNewLabel_11.setBounds(40, 424, 97, 83);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_2_9 = new JLabel("Nissan");
		lblNewLabel_2_9.setBounds(62, 509, 75, 15);
		contentPane.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(UserForm.class.getResource("/images/Daihatsu.png")));
		lblNewLabel_12.setBounds(187, 423, 97, 83);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_2_9_1 = new JLabel("Daihatsu");
		lblNewLabel_2_9_1.setBounds(204, 496, 80, 15);
		contentPane.add(lblNewLabel_2_9_1);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(UserForm.class.getResource("/images/volkswogen-removebg-preview (1).jpg")));
		lblNewLabel_13.setBounds(315, 424, 97, 83);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_2_9_2 = new JLabel("Volkswogen");
		lblNewLabel_2_9_2.setBounds(325, 509, 108, 15);
		contentPane.add(lblNewLabel_2_9_2);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(UserForm.class.getResource("/images/lexus-removebg-preview (1).jpg")));
		lblNewLabel_14.setBounds(40, 558, 97, 83);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_2_9_3 = new JLabel("Lexus");
		lblNewLabel_2_9_3.setBounds(62, 627, 49, 33);
		contentPane.add(lblNewLabel_2_9_3);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(UserForm.class.getResource("/images/mazda-removebg-preview (1).jpg")));
		lblNewLabel_15.setBounds(187, 558, 97, 83);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_2_9_4 = new JLabel("Mazda");
		lblNewLabel_2_9_4.setBounds(209, 636, 80, 24);
		contentPane.add(lblNewLabel_2_9_4);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(UserForm.class.getResource("/images/mini-cooper-removebg-preview (1).jpg")));
		lblNewLabel_16.setBounds(315, 558, 97, 83);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_2_9_4_1 = new JLabel("Mini Cooper");
		lblNewLabel_2_9_4_1.setBounds(315, 627, 97, 24);
		contentPane.add(lblNewLabel_2_9_4_1);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(UserForm.class.getResource("/images/bottomnav.png")));
		lblNewLabel_17.setBounds(31, 673, 440, 45);
		contentPane.add(lblNewLabel_17);
	}
}
