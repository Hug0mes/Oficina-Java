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
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Eliminar_Carros extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public String id; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eliminar_Carros frame = new Eliminar_Carros();
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
	public Eliminar_Carros() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {            		

		            Class.forName("com.mysql.jdbc.Driver");

		            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

		            Statement stmt=con.createStatement();

		            String sql="Select Matricula, Marca, Modelo, Ano, Proprietario, IdCliente, IdAutomovel from automovel";

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
		lblNewLabel_1.setForeground(Color.RED);
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
		
		JLabel lblNewLabel_3 = new JLabel("Eliminar Carros");
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(269, 110, 129, 35);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int index=table.getSelectedRow();
			    TableModel row=table.getModel();
				id = row.getValueAt(index, 6).toString();
				
			}
		});
		scrollPane_1.setBounds(10, 144, 643, 195);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setForeground(Color.WHITE);
		table.setBackground(Color.DARK_GRAY);
		scrollPane_1.setViewportView(table);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			if (JOptionPane.showConfirmDialog(null, "Pretende Eliminar este registo?", "Atenção!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

					try {

						


					    String sql="DELETE FROM automovel where IdAutomovel = '"+id+"'";

					    Class.forName("com.mysql.jdbc.Driver");

						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina","root","");

						Statement stmt=con.createStatement();	

						int ok=stmt.executeUpdate(sql);

							System.out.println("Foi apagada " + ok +  " linha na BD");

							
							
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
		btnEliminar.setBounds(279, 384, 119, 23);
		contentPane.add(btnEliminar);
	}
}
