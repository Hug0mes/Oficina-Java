import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inserir_Clientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserir_Clientes frame = new Inserir_Clientes();
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
	public Inserir_Clientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 490);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Oficina");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 73));
		lblNewLabel.setBounds(225, 22, 244, 99);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Oficina");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 73));
		lblNewLabel_1.setBounds(227, 24, 244, 99);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
Login log = new Login(); 
				
				if ( log.func ==   "1" ){
					
					StartAdm Startadm = new StartAdm(); 
					Startadm.setVisible(true);
					dispose();
					
				}
				if ( log.func == "2" ){
			
				Start StartForm = new Start(); 
				StartForm.setVisible(true);
				dispose();
				
				}
			}
		});
		lblNewLabel_2.setFont(new Font("Maiandra GD", Font.PLAIN, 47));
		lblNewLabel_2.setForeground(new Color(204, 204, 255));
		lblNewLabel_2.setBounds(10, 11, 52, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Inserir Clientes");
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(273, 112, 129, 35);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(286, 198, 162, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nome");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(218, 198, 58, 17);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Telefone");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(200, 231, 86, 17);
		contentPane.add(lblNewLabel_4_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(286, 231, 162, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("NIF");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_2.setBounds(235, 262, 40, 17);
		contentPane.add(lblNewLabel_4_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(286, 262, 162, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Email");
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_3.setBounds(218, 293, 58, 17);
		contentPane.add(lblNewLabel_4_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(286, 293, 162, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				try {

				    String sql="Insert into cliente (Nome,Telefone, NIF,Email) Values ('"+textField.getText() + "', '"+textField_1.getText()+"','"+textField_2.getText()+
				    																											"', '"+ textField_3.getText() +"')";

					

				    Class.forName("com.mysql.jdbc.Driver");

					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

					Statement stmt= con.createStatement();	

					int ok=stmt.executeUpdate(sql);

					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					
					
					}catch (Exception ex1) {

						

						System.out.println(ex1);



					}
				
				
			}
		});
		btnNewButton.setBounds(273, 382, 119, 23);
		contentPane.add(btnNewButton);
	}
}
