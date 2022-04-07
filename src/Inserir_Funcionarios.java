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
import javax.swing.JRadioButton;

public class Inserir_Funcionarios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserir_Funcionarios frame = new Inserir_Funcionarios();
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
	public Inserir_Funcionarios() {
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Admin");
		
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
		
		JLabel lblNewLabel_3 = new JLabel("Inserir Funcionarios");
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
		lblNewLabel_4.setBounds(225, 198, 51, 17);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Username");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(200, 231, 86, 17);
		contentPane.add(lblNewLabel_4_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(286, 231, 162, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Password");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_2.setBounds(200, 262, 86, 17);
		contentPane.add(lblNewLabel_4_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(286, 262, 162, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Morada");
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_3.setBounds(210, 290, 67, 17);
		contentPane.add(lblNewLabel_4_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(286, 293, 162, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				try {

					if (rdbtnNewRadioButton.isSelected()) {
						
					    String sql="Insert into funcionario (Username,Password, Nome, Morada, NIF, NIB, perfil) Values ('"+textField_1.getText() + "', '"+textField_2.getText()+"','"+textField.getText()+
								"', '"+ textField_3.getText() +"', '"+ textField_4.getText()+"','"+ textField_5.getText()+ "','"+ "Administrador" +"' )";

					    Class.forName("com.mysql.jdbc.Driver");

						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

						Statement stmt= con.createStatement();	

						int ok=stmt.executeUpdate(sql);
						
					}else {
						
						
					    String sql="Insert into funcionario (Username,Password, Nome, Morada, NIF, NIB, perfil) Values ('"+textField_1.getText() + "', '"+textField_2.getText()+"','"+textField.getText()+
								"', '"+ textField_3.getText() +"', '"+ textField_4.getText()+"','"+ textField_5.getText()+ "','"+ "Funcionario" +"' )";

					    Class.forName("com.mysql.jdbc.Driver");

						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

						Statement stmt= con.createStatement();	

						int ok=stmt.executeUpdate(sql);
					}
					
					

					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					
					
					}catch (Exception ex1) {

						

						System.out.println(ex1);



					}
				
				
			}
		});
		btnNewButton.setBounds(273, 399, 119, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("NIF");
		lblNewLabel_4_3_1.setForeground(Color.WHITE);
		lblNewLabel_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_3_1.setBounds(236, 321, 40, 17);
		contentPane.add(lblNewLabel_4_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(286, 321, 162, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_4_3_2 = new JLabel("NIB");
		lblNewLabel_4_3_2.setForeground(Color.WHITE);
		lblNewLabel_4_3_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_3_2.setBounds(236, 351, 40, 17);
		contentPane.add(lblNewLabel_4_3_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(286, 351, 162, 20);
		contentPane.add(textField_5);
		
		
		rdbtnNewRadioButton.setBounds(293, 168, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
	}
}
