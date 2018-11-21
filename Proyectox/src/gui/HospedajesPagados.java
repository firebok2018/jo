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

public class HospedajesPagados extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HospedajesPagados frame = new HospedajesPagados();
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
	public HospedajesPagados() {
		setTitle("Hospedajes Pagados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 563, 388);
		contentPane.add(panel);
		
		JLabel label = new JLabel("C\u00F3digo Hospedaje:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 11, 131, 35);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 21, 115, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 57, 115, 20);
		panel.add(textField_1);
		
		JLabel label_1 = new JLabel("Apellido Paterno:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 57, 131, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Apellido Materno:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 92, 115, 14);
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 92, 115, 20);
		panel.add(textField_2);
		
		JLabel label_3 = new JLabel("Nombres:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(10, 130, 105, 14);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 130, 115, 20);
		panel.add(textField_3);
		
		JLabel label_4 = new JLabel("Fecha Salida:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(277, 20, 95, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Hora Salida:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(277, 58, 106, 14);
		panel.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(370, 57, 86, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(370, 19, 86, 20);
		panel.add(textField_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 168, 543, 209);
		panel.add(scrollPane);
		
		JLabel label_6 = new JLabel("Total a pagar:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(277, 131, 106, 14);
		panel.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(370, 130, 86, 20);
		panel.add(textField_6);
	}

}
