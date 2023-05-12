import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserRegister extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField phoneNumberField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegister frame = new UserRegister();
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
	public UserRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 559);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UserRegister.class.getResource("/images/usericon-fotor-bg-remover-20230401154849 (1).png")));
		lblNewLabel.setBounds(136, 46, 109, 105);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setToolTipText("Name");
		txtName.setText("Name");
		txtName.setForeground(Color.RED);
		txtName.setColumns(10);
		txtName.setBorder(new LineBorder(Color.RED, 2, true));
		txtName.setBackground(Color.PINK);
		txtName.setBounds(96, 214, 197, 32);
		contentPane.add(txtName);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Email");
		txtEmail.setText("Email");
		txtEmail.setForeground(Color.RED);
		txtEmail.setColumns(10);
		txtEmail.setBorder(new LineBorder(Color.RED, 2, true));
		txtEmail.setBackground(Color.PINK);
		txtEmail.setBounds(96, 258, 197, 32);
		contentPane.add(txtEmail);
		
		phoneNumberField = new JTextField();
		phoneNumberField.setToolTipText("Phone Number");
		phoneNumberField.setText("Phone Number");
		phoneNumberField.setForeground(Color.RED);
		phoneNumberField.setColumns(10);
		phoneNumberField.setBorder(new LineBorder(Color.RED, 2, true));
		phoneNumberField.setBackground(Color.PINK);
		phoneNumberField.setBounds(96, 302, 197, 32);
		contentPane.add(phoneNumberField);
		
		passwordField = new JPasswordField();
		passwordField.setText("frame405");
		passwordField.setBorder(new LineBorder(Color.RED, 2));
		passwordField.setBackground(Color.PINK);
		passwordField.setBounds(96, 346, 197, 32);
		contentPane.add(passwordField);
		
		Button registerButton = new Button("Continue");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String email = txtEmail.getText();
				String phoneNumber = phoneNumberField.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				String role = "user";
				int len = phoneNumber.length();
				
				if (name.equals("")) {
					JOptionPane.showMessageDialog(registerButton, "Name is required");
					return;
				}
				
				if (email.equals("")) {
					JOptionPane.showMessageDialog(registerButton, "Email is required");
					return;
				}
				
				if (checkEmail(email)) {
					JOptionPane.showMessageDialog(registerButton, "This Email Already Exist");
					return;
				}
				
				if (phoneNumber.equals("")) {
					JOptionPane.showMessageDialog(registerButton, "Phone Number is required");
					return;
				}
				
				if (password.equals("")) {
					JOptionPane.showMessageDialog(registerButton, "Password is required");
					return;
				}
				
				
				String msg = "" + name;
                msg += " \n";
				if (len != 12) {
					JOptionPane.showMessageDialog(registerButton, "Enter a valid mobile number");
					return;
				}
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sportlux", "root", "#21012123Op");
					String query = "INSERT INTO users(name, email, password, phone_number, role) VALUES('" + name + "','" + email + "','" + password + "','" + phoneNumber + "','" + role + "')";
					
					Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                    	JOptionPane.showMessageDialog(registerButton, "This is already exist");
                    } else {
                    	JOptionPane.showMessageDialog(registerButton, "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
				} catch (Exception exception) {
                    exception.printStackTrace();
                }
			}
		});
		registerButton.setForeground(Color.WHITE);
		registerButton.setFont(new Font("Dialog", Font.BOLD, 12));
		registerButton.setBackground(Color.RED);
		registerButton.setBounds(123, 398, 140, 32);
		contentPane.add(registerButton);
		
		Label loginPage = new Label("Already have an account ? Sign In");
		loginPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserLogin loginForm = new UserLogin();
				loginForm.setVisible(true);
				loginForm.setLocationRelativeTo(null);
				loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		loginPage.setFont(new Font("Dialog", Font.BOLD, 12));
		loginPage.setForeground(Color.GRAY);
		loginPage.setBounds(85, 474, 249, 21);
		contentPane.add(loginPage);
	}
	
	public boolean checkEmail(String email) {
		String emailData = txtEmail.getText();
		boolean checkUser = false;
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sportlux", "root", "#21012123Op");
			PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("Select email from users where email = ?");
			
			st.setString(1, emailData);
			ResultSet rs = st.executeQuery();
			
			if (rs.next()) {
				checkUser = true;
			}
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return checkUser;
	}
}
