import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.ScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inserir_Carros extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	/**
	 * @wbp.nonvisual location=587,-31
	 */
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserir_Carros frame = new Inserir_Carros();
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
	public Inserir_Carros() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				try {            		

		            Class.forName("com.mysql.jdbc.Driver");

		            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

		            Statement stmt=con.createStatement();

		            String sql="Select Nome, NIF, IdCliente  from cliente";

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
		lblNewLabel.setBounds(225, 22, 244, 99);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 73));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Oficina");
		lblNewLabel_1.setBounds(227, 24, 244, 99);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 73));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<");
		lblNewLabel_2.setBounds(10, 11, 52, 35);
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
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Inserir Carros");
		lblNewLabel_3.setBounds(274, 103, 129, 35);
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Marca");
		lblNewLabel_4.setBounds(54, 185, 58, 17);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(131, 152, 162, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 185, 162, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Modelo ");
		lblNewLabel_4_1.setBounds(54, 216, 69, 17);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Ano");
		lblNewLabel_4_2.setBounds(72, 247, 40, 17);
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_4_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 216, 162, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(131, 247, 162, 20);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Proprietario");
		lblNewLabel_4_3.setBounds(13, 284, 110, 17);
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblCarroInserido = new JLabel("Carro inserido");
		lblCarroInserido.setForeground(Color.DARK_GRAY);
		lblCarroInserido.setBounds(462, 426, 109, 14);
		contentPane.add(lblCarroInserido);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				try {

				    String sql="Insert into automovel (Matricula, Marca, Modelo, Ano, Proprietario, IdCliente) "
				    		+ "Values ('"+textField.getText() + "', '"+textField_1.getText()+"','"+textField_2.getText()+
				    			  "', '"+ textField_3.getText() +"', '"+textField_4.getText()+"', '"+textField_5.getText()+
				    			  "')";

					

				    Class.forName("com.mysql.jdbc.Driver");

					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

					Statement stmt= con.createStatement();	

					int ok=stmt.executeUpdate(sql);

						System.out.println("inseridas " + ok +  " linhas na BD");

					}catch (Exception ex1) {

						System.out.println(ex1);

					}
				
				lblCarroInserido.setForeground(new Color(250, 128, 114));
				
				//Timer
				Timer timer = new Timer();

				timer.schedule(new TimerTask() {

					@Override
					public void run() {

				
						lblCarroInserido.setForeground(Color.DARK_GRAY);
					}}, 4000, 1000);
				
			
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(440, 399, 119, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Matricula");
		lblNewLabel_4_3_1.setBounds(33, 152, 88, 17);
		lblNewLabel_4_3_1.setForeground(Color.WHITE);
		lblNewLabel_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_4_3_1);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(131, 284, 162, 20);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_4_3_2 = new JLabel("Id. Cliente");
		lblNewLabel_4_3_2.setBounds(10, 321, 110, 17);
		lblNewLabel_4_3_2.setForeground(Color.WHITE);
		lblNewLabel_4_3_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_4_3_2);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_5.setBounds(131, 321, 162, 20);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int index=table.getSelectedRow();
			    TableModel row=table.getModel();

			    String Cod_cliente = row.getValueAt(index, 2).toString();
			    textField_5.setText(Cod_cliente);

			    String Nome_cliente = row.getValueAt(index, 0).toString();
			    textField_4.setText(Nome_cliente);

				
			}
		});
		scrollPane_1.setBounds(369, 152, 244, 186);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel_4_3_1_1 = new JLabel("Escolher Propriet\u00E1rio");
		lblNewLabel_4_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_3_1_1.setBounds(423, 132, 190, 17);
		contentPane.add(lblNewLabel_4_3_1_1);
		
		
	}
}
