import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Editar_Clientes extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public String id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editar_Clientes frame = new Editar_Clientes();
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
	public Editar_Clientes() {
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				

				try {            		

		            Class.forName("com.mysql.jdbc.Driver");

		            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

		            Statement stmt=con.createStatement();

		            String sql="Select Nome,Telefone, NIF, Email from cliente";

		            ResultSet rs=stmt.executeQuery(sql);

		            table.setModel(DbUtils.resultSetToTableModel(rs));

		            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		           
		            con.close();

		            }

				catch(Exception ee){

		            	System.out.println(ee);

		            	}
				
				
			}
		});
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
		
		JLabel lblNewLabel_3 = new JLabel("Editar Clientes");
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(268, 114, 129, 35);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int index=table.getSelectedRow();
			    TableModel row=table.getModel();
			    
				id = row.getValueAt(index, 0).toString();			    

			    String Nome_cliente = row.getValueAt(index, 0).toString();
			    textField.setText(Nome_cliente);

			    String Telefone_cliente = row.getValueAt(index, 1).toString();
			    textField_1.setText(Telefone_cliente);
				
			    String NIF_cliente = row.getValueAt(index, 2).toString();
			    textField_2.setText(NIF_cliente);

			    String Email_cliente = row.getValueAt(index, 3).toString();
			    textField_3.setText(Email_cliente);
			    
			 

			   
			}
		});
		scrollPane_1.setBounds(288, 165, 365, 275);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(Color.LIGHT_GRAY);
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("Nome");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(48, 198, 58, 17);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(116, 198, 162, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_4_1 = new JLabel("Telefone");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(30, 231, 86, 17);
		contentPane.add(lblNewLabel_4_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 231, 162, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("NIF");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_2.setBounds(65, 262, 40, 17);
		contentPane.add(lblNewLabel_4_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 262, 162, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Email");
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_3.setBounds(48, 293, 58, 17);
		contentPane.add(lblNewLabel_4_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 293, 162, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (JOptionPane.showConfirmDialog(null, "Pretende Editar este registo?", "Atenção!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

					try {

						

					    String sql="UPDATE cliente SET Nome='"+textField.getText()+"', Telefone='"+textField_1.getText()+"',NIF='"+textField_2.getText()+
					    							 "',Email='"+textField_3.getText()+"' WHERE IdCliente='"+ id +"'";;

						

					    Class.forName("com.mysql.jdbc.Driver");

						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

						Statement stmt=con.createStatement();	

						int ok=stmt.executeUpdate(sql);

						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						

						}catch (Exception ex1) {

							

							System.out.println(ex1);



						}
					
					Start StartForm = new Start();
					StartForm.setVisible(true);
					dispose();
				
			}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setBounds(165, 367, 89, 23);
		contentPane.add(btnNewButton);
	}
}
