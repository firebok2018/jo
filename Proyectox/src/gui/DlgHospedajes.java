package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class DlgHospedajes extends JFrame {

	private JPanel contentPane;
	private JTextField txtPaterno;
	private JTextField txtCodigoHospedaje;
	private JTextField txtMaterno;
	private JTextField txtNombres;
	private JTextField txtFechaSalida;
	private JTextField txtHoraSalida;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgHospedajes frame = new DlgHospedajes();
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
	public DlgHospedajes() {
		setTitle("Hospedajes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPaterno = new JTextField();
		txtPaterno.setColumns(10);
		txtPaterno.setBounds(135, 57, 115, 20);
		contentPane.add(txtPaterno);
		
		JLabel label = new JLabel("Apellido Paterno:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 57, 131, 14);
		contentPane.add(label);
		
		JLabel lblCdigoHospedaje = new JLabel("C\u00F3digo Hospedaje:");
		lblCdigoHospedaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigoHospedaje.setBounds(10, 11, 131, 35);
		contentPane.add(lblCdigoHospedaje);
		
		txtCodigoHospedaje = new JTextField();
		txtCodigoHospedaje.setColumns(10);
		txtCodigoHospedaje.setBounds(135, 21, 115, 20);
		contentPane.add(txtCodigoHospedaje);
		
		JLabel label_2 = new JLabel("Apellido Materno:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 92, 115, 14);
		contentPane.add(label_2);
		
		txtMaterno = new JTextField();
		txtMaterno.setColumns(10);
		txtMaterno.setBounds(135, 92, 115, 20);
		contentPane.add(txtMaterno);
		
		JLabel label_3 = new JLabel("Nombres:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(10, 130, 105, 14);
		contentPane.add(label_3);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(135, 130, 115, 20);
		contentPane.add(txtNombres);
		
		JLabel lblFechaSalida = new JLabel("Fecha Salida:");
		lblFechaSalida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaSalida.setBounds(277, 20, 95, 14);
		contentPane.add(lblFechaSalida);
		
		txtFechaSalida = new JTextField();
		txtFechaSalida.setColumns(10);
		txtFechaSalida.setBounds(370, 19, 86, 20);
		contentPane.add(txtFechaSalida);
		
		JLabel lblHoraSalida = new JLabel("Hora Salida:");
		lblHoraSalida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHoraSalida.setBounds(277, 58, 106, 14);
		contentPane.add(lblHoraSalida);
		
		txtHoraSalida = new JTextField();
		txtHoraSalida.setColumns(10);
		txtHoraSalida.setBounds(370, 57, 86, 20);
		contentPane.add(txtHoraSalida);
		
		JLabel label_1 = new JLabel("Estado:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(277, 95, 100, 14);
		contentPane.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1"}));
		comboBox.setBounds(370, 91, 88, 20);
		contentPane.add(comboBox);
		
		JLabel label_4 = new JLabel("0 = Pendiente");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(370, 130, 95, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("1 = Pagado");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(370, 157, 95, 14);
		contentPane.add(label_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 202, 675, 213);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnMostrarHabitaciones = new JButton("Mostrar Habitaciones");
		btnMostrarHabitaciones.setForeground(Color.BLACK);
		btnMostrarHabitaciones.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMostrarHabitaciones.setBounds(479, 21, 193, 23);
		contentPane.add(btnMostrarHabitaciones);
		
		JButton btnGuardar = new JButton("Guardar ");
		btnGuardar.setForeground(Color.BLACK);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar.setBounds(494, 88, 151, 23);
		contentPane.add(btnGuardar);
	}
}
