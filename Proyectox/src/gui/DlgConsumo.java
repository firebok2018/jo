package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgConsumo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgConsumo frame = new DlgConsumo();
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
	public DlgConsumo() {
		setTitle("Consumo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo Socio:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(23, 22, 115, 35);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(141, 31, 115, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 67, 115, 20);
		contentPane.add(textField_1);
		
		JLabel label_1 = new JLabel("Apellido Paterno:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(23, 68, 131, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Apellido Materno:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(23, 103, 115, 14);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(141, 102, 115, 20);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Nombres:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(23, 141, 105, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(141, 140, 115, 20);
		contentPane.add(textField_3);
		
		JButton button = new JButton("Adicionar");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(529, 88, 151, 23);
		contentPane.add(button);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEliminar.setBounds(530, 112, 151, 23);
		contentPane.add(btnEliminar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(Color.BLACK);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar.setBounds(530, 137, 151, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProducto.setBounds(298, 34, 69, 14);
		contentPane.add(lblProducto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"P0001", "P0002", "P0003", "P0004", "P0005", "P0006", "P0007", "P0008", "P0009", "P0010"}));
		comboBox.setBounds(377, 31, 105, 20);
		contentPane.add(comboBox);
		
		JButton btnListarProductos = new JButton("Listar Productos");
		btnListarProductos.setForeground(Color.BLACK);
		btnListarProductos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnListarProductos.setBounds(515, 28, 182, 23);
		contentPane.add(btnListarProductos);
		
		JLabel lblEsyado = new JLabel("Estado:");
		lblEsyado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEsyado.setBounds(298, 103, 69, 14);
		contentPane.add(lblEsyado);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1"}));
		comboBox_1.setBounds(377, 102, 105, 20);
		contentPane.add(comboBox_1);
		
		JLabel label_4 = new JLabel("0 = Pendiente");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_4.setBounds(387, 141, 95, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("1 = Pagado");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_5.setBounds(387, 166, 95, 14);
		contentPane.add(label_5);
		
		JScrollPane tblConsumo = new JScrollPane();
		tblConsumo.setBounds(23, 190, 674, 254);
		contentPane.add(tblConsumo);
		
		table = new JTable();
		tblConsumo.setViewportView(table);
	}

}
