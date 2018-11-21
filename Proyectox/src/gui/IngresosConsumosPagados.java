package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class IngresosConsumosPagados extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoIngreso;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable tblPagados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresosConsumosPagados frame = new IngresosConsumosPagados();
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
	public IngresosConsumosPagados() {
		setTitle("Ingresos y Consumos Pagados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo Ingreso:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 11, 115, 35);
		contentPane.add(label);
		
		txtCodigoIngreso = new JTextField();
		txtCodigoIngreso.setColumns(10);
		txtCodigoIngreso.setBounds(128, 20, 115, 20);
		contentPane.add(txtCodigoIngreso);
		
		JLabel label_1 = new JLabel("Apellido Paterno:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 57, 131, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 56, 115, 20);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Apellido Materno:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 92, 115, 14);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 91, 115, 20);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Nombres:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(10, 130, 105, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(128, 129, 115, 20);
		contentPane.add(textField_3);
		
		JLabel lblTotalPagado = new JLabel("Total pagado:");
		lblTotalPagado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalPagado.setBounds(287, 125, 131, 24);
		contentPane.add(lblTotalPagado);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(373, 129, 115, 20);
		contentPane.add(textField_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 189, 479, 217);
		contentPane.add(scrollPane);
		
		tblPagados = new JTable();
		scrollPane.setRowHeaderView(tblPagados);
	}

}
