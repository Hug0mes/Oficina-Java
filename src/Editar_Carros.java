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

import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Editar_Carros extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public String id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editar_Carros frame = new Editar_Carros();
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
	public Editar_Carros() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {	
				

				try {            		

		            Class.forName("com.mysql.jdbc.Driver");

		            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

		            Statement stmt=con.createStatement();

		            String sql="Select IdAutomovel, Matricula, Marca, Modelo, Ano, Proprietario from automovel";

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
		lblNewLabel.setBounds(221, 0, 244, 99);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Oficina");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 73));
		lblNewLabel_1.setBounds(223, 2, 244, 99);
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
		
		JLabel lblNewLabel_3 = new JLabel("Editar Carros");
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(264, 81, 129, 35);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int index=table.getSelectedRow();
			    TableModel row=table.getModel();

				id = row.getValueAt(index, 0).toString();
				    
				
			    String Matricula = row.getValueAt(index, 1).toString();
			    textField.setText(Matricula);

			    String Marca = row.getValueAt(index, 2).toString();
			    textField_1.setText(Marca);
				
			    String Modelo = row.getValueAt(index, 3).toString();
			    textField_2.setText(Modelo);

			    String Ano = row.getValueAt(index, 4).toString();
			    textField_3.setText(Ano);

			    String Proprietario = row.getValueAt(index, 5).toString();
			    textField_4.setText(Proprietario);

			    String IdAutomovel = row.getValueAt(index, 0).toString();
			    textField_5.setText(IdAutomovel);
			    
			   
			 
				
			}
		});
		scrollPane_1.setBounds(0, 110, 663, 99);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setForeground(Color.WHITE);
		table.setBackground(Color.DARK_GRAY);
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("Matricula");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(344, 321, 77, 17);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(453, 321, 162, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_4_1 = new JLabel("Marca");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(34, 259, 76, 17);
		contentPane.add(lblNewLabel_4_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 259, 162, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Modelo");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_2.setBounds(34, 290, 76, 17);
		contentPane.add(lblNewLabel_4_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 290, 162, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Ano");
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_3.setBounds(34, 321, 76, 17);
		contentPane.add(lblNewLabel_4_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(120, 321, 162, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Proprietario");
		lblNewLabel_4_4.setForeground(Color.WHITE);
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_4.setBounds(344, 256, 107, 17);
		contentPane.add(lblNewLabel_4_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(453, 256, 162, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Cod Cliente");
		lblNewLabel_4_5.setForeground(Color.WHITE);
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_5.setBounds(344, 287, 99, 17);
		contentPane.add(lblNewLabel_4_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(453, 287, 162, 20);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (JOptionPane.showConfirmDialog(null, "Pretende Editar este registo?", "Atenção!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

					try {

						

					    String sql="UPDATE automovel SET Matricula='"+textField.getText()+"', Marca='"+textField_1.getText()+"',Modelo='"+textField_2.getText()+
					    							 "',Ano='"+textField_3.getText()+"',Proprietario='"+textField_4.getText()+
					    							 "',IdCliente='"+textField_5.getText()+"' WHERE IdAutomovel='"+ id +"'";;

						

					    Class.forName("com.mysql.jdbc.Driver");

						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

						Statement stmt=con.createStatement();	

						int ok=stmt.executeUpdate(sql);

							System.out.println("Foi Editado " + ok +  " linha na BD");

						}catch (Exception ex1) {

							System.out.println(ex1);

						}
					
					
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
				
			}
		});
		btnNewButton.setBounds(281, 417, 104, 34);
		contentPane.add(btnNewButton);
	}
}
