import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
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
		
		JLabel lblNewLabel_2 = new JLabel("Consultar Carros");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				Consultar_Carros Ccarro = new Consultar_Carros(); 
				Ccarro.setVisible(true);
				dispose();
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel_2.setForeground(new Color(153, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2.setForeground(Color.WHITE);
			}
		});
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(94, 180, 182, 59);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Inserir Carros");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Inserir_Carros Icarro = new Inserir_Carros(); 
				Icarro.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel_2_1.setForeground(new Color(153, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2_1.setForeground(Color.WHITE);
			}
		});
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1.setBounds(94, 240, 143, 59);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Eliminar Carros");
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Eliminar_Carros Ecarros = new Eliminar_Carros(); 
				Ecarros.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel_2_2.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2_2.setForeground(new Color(255, 102, 102));
			}
		});
		lblNewLabel_2_2.setForeground(new Color(255, 102, 102));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_2.setBounds(261, 361, 167, 59);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Editar Carros");
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Editar_Carros Ecarro = new Editar_Carros(); 
				Ecarro.setVisible(true);
				dispose();
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel_2_3.setForeground(new Color(153, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2_3.setForeground(Color.WHITE);
			}
		});
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_3.setBounds(94, 291, 143, 59);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Editar Clientes");
		lblNewLabel_2_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Editar_Clientes Eclientes = new Editar_Clientes(); 
				Eclientes.setVisible(true);
				dispose();
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel_2_3_1.setForeground(new Color(153, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2_3_1.setForeground(Color.WHITE);
			}
		});
		lblNewLabel_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_3_1.setBounds(401, 291, 143, 59);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Inserir Clientes");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Inserir_Clientes Iclientes = new Inserir_Clientes(); 
				Iclientes.setVisible(true);
				dispose();
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel_2_1_1.setForeground(new Color(153, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2_1_1.setForeground(Color.WHITE);
			}
		});
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1_1.setBounds(401, 240, 182, 59);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Consultar Clientes");
		lblNewLabel_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Consultar_Clientes Cclientes = new Consultar_Clientes(); 
				Cclientes.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel_2_4.setForeground(new Color(153, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2_4.setForeground(Color.WHITE);
			}
		});
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_4.setBounds(401, 180, 182, 59);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3 = new JLabel("\u2190");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Login login = new Login();
				login.setVisible(true);
				dispose();
				
			}
		});
		lblNewLabel_3.setFont(new Font("Source Code Pro Semibold", Font.BOLD, 55));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 0, 40, 45);
		contentPane.add(lblNewLabel_3);
	}
}
