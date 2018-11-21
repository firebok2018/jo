package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class IngresosConsumos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresosConsumos frame = new IngresosConsumos();
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
	public IngresosConsumos() {
		setTitle("Ingresos y Consumos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo Ingreso:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(23, 22, 117, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("C\u00F3digo Socio:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(23, 58, 95, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Costo Ingreso:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(296, 23, 106, 14);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(406, 22, 86, 20);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Apellido Paterno:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(23, 98, 131, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(141, 97, 115, 20);
		contentPane.add(textField_3);
		
		JLabel label_4 = new JLabel("Apellido Materno:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(23, 133, 115, 14);
		contentPane.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 132, 115, 20);
		contentPane.add(textField_4);
		
		JLabel label_5 = new JLabel("Nombres:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(23, 171, 105, 14);
		contentPane.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(141, 170, 115, 20);
		contentPane.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(141, 21, 117, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(141, 57, 115, 20);
		contentPane.add(comboBox_1);
		
		JLabel label_6 = new JLabel("Estado:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(296, 106, 100, 14);
		contentPane.add(label_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(404, 105, 88, 20);
		contentPane.add(comboBox_2);
		
		JLabel label_7 = new JLabel("0 = Pendiente");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(397, 144, 95, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("1 = Pagado");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(397, 171, 95, 14);
		contentPane.add(label_8);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnListar.setBounds(403, 56, 89, 23);
		contentPane.add(btnListar);
		
		JLabel lblProductos = new JLabel("Productos:");
		lblProductos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProductos.setBounds(296, 60, 95, 14);
		contentPane.add(lblProductos);
		
		JButton button = new JButton("Guardar");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(527, 104, 151, 23);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 211, 669, 213);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setRowHeaderView(table);
	}

}
