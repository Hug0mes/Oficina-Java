import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
public class Login extends JFrame {

	
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPassword;
	private JLabel lblLogin;
	private JLabel lblLogin_1;
	public char firstChar;
	public String useramd;
	public String func = "1";
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
			
			}
		});
		
		
		
		
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 442);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {
				
			}
		});
		textField.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(37, 209, 202, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(230, 230, 250));
		lblNewLabel.setBackground(new Color(230, 230, 250));
		lblNewLabel.setBounds(37, 186, 116, 25);
		contentPane.add(lblNewLabel);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(230, 230, 250));
		lblPassword.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblPassword.setBackground(new Color(230, 230, 250));
		lblPassword.setBounds(37, 256, 116, 25);
		contentPane.add(lblPassword);
		
		  textField_1 = new JTextField();
		  textField_1.setForeground(Color.WHITE);
		  textField_1.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		  textField_1.setColumns(10);
		  textField_1.setBackground(Color.DARK_GRAY);
		  textField_1.setBounds(37, 280, 202, 25);
		  contentPane.add(textField_1);
		
		lblLogin = new JLabel("Login");
		lblLogin.setForeground(new Color(230, 230, 250));
		lblLogin.setFont(new Font("Yu Gothic", Font.BOLD, 44));
		lblLogin.setBackground(new Color(230, 230, 250));
		lblLogin.setBounds(86, 85, 136, 52);
		contentPane.add(lblLogin);
		
		lblLogin_1 = new JLabel("Login");
		lblLogin_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				try {
					
					   Class.forName("com.mysql.jdbc.Driver");

			            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

			            Statement stmt=con.createStatement();

			            String sql="SELECT COUNT(*) AS Username FROM funcionario Where Username = '" + textField.getText() + "' AND Password= '" + textField_1.getText() +"'"; 

			            ResultSet rs=stmt.executeQuery(sql);
			            rs.next();
										
						int count = rs.getInt("Username");
						
							useramd = textField.getText();
							firstChar = useramd.charAt(0);
							
						
						if(count >= 1) {
							

							
							if ( firstChar == 'a'  ) {
								
								StartAdm ADM = new StartAdm(); 
								ADM.setVisible(true);
								dispose();
								
							}else {
								
								
							
								Start StartForm = new Start(); 
								StartForm.setVisible(true);
								dispose();
								
							}
						
							}
						
				}catch (Exception ex1) {

					System.out.println(ex1);

				}
				
				
				
			}
		});
		lblLogin_1.setForeground(new Color(230, 230, 250));
		lblLogin_1.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		lblLogin_1.setBackground(new Color(230, 230, 250));
		lblLogin_1.setBounds(113, 325, 57, 25);
		contentPane.add(lblLogin_1);
		  Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		  lblLogin_1.setCursor(cursor);
		  
		
	}
}
