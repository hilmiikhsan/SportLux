import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class UserLogin extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField txtEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
//					frame.setUndecorated(true);
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
	public UserLogin() {
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 488);
//		setUndecorated(true);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(UserLogin.class.getResource("/images/3.png")));
		label.setBounds(34, 22, 493, 128);
		getContentPane().add(label);
		
		Label label_1 = new Label("Create Account");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserRegister registerForm = new UserRegister();
				registerForm.setVisible(true);
				registerForm.setLocationRelativeTo(null);
				registerForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1.setForeground(Color.GRAY);
		label_1.setBounds(111, 367, 105, 21);
		getContentPane().add(label_1);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(Color.RED);
		txtEmail.setText("Email");
		txtEmail.setToolTipText("Email");
		txtEmail.setBackground(Color.PINK);
		txtEmail.setBorder(new LineBorder(Color.RED, 2, true));
		txtEmail.setBounds(212, 212, 197, 32);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.PINK);
		passwordField.setBounds(212, 256, 197, 32);
		passwordField.setText(getName());
		passwordField.setBorder(new LineBorder(Color.RED, 2));
		getContentPane().add(passwordField);
		
		Button button_1_1 = new Button("Sign In");
		button_1_1.setBackground(Color.RED);
		button_1_1.setForeground(Color.WHITE);
		button_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1_1.setBounds(240, 304, 140, 32);
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = txtEmail.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				try {
					Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sportlux",
	                        "root", "#21012123Op");
					
					PreparedStatement st = (PreparedStatement) connection
	                        .prepareStatement("Select email, password from users where email = ? and password = ?");
					
					st.setString(1, email);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
//                        dispose();
//                        UserLogin ah = new UserLogin(email);
//                        ah.setTitle("Welcome");
//                        ah.setVisible(true);
//                        JOptionPane.showMessageDialog(button_1_1, "You have successfully logged in");
                    	UserForm userForm = new UserForm();
                    	userForm.setVisible(true);
                    	userForm.setLocationRelativeTo(null);
                    	userForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        				dispose();
                    } else {
                        JOptionPane.showMessageDialog(button_1_1, "Wrong Email or Password");
                    }
				} catch (SQLException sqlException) {
					sqlException.printStackTrace();
				}
				
			}
		});
		getContentPane().add(button_1_1);
		
	}

	public Button getButton() {
		return getButton();
	}
}
