package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class DlgSocios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtPaterno;
	private JTextField txtMaterno;
	private JTextField txtNombre;
	private JTextField txtDni;
	private JTextField txtTelefono;
	private JTable tblUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgSocios frame = new DlgSocios();
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
	public DlgSocios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImgUsuario = new JLabel("");
		lblImgUsuario.setBounds(20, 25, 144, 178);
		contentPane.add(lblImgUsuario);
		
		JLabel lblCdigoSocio = new JLabel("C\u00F3digo Socio:");
		lblCdigoSocio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigoSocio.setBounds(193, 25, 115, 35);
		contentPane.add(lblCdigoSocio);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidoPaterno.setBounds(193, 71, 131, 14);
		contentPane.add(lblApellidoPaterno);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		lblApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidoMaterno.setBounds(193, 106, 115, 14);
		contentPane.add(lblApellidoMaterno);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombres.setBounds(193, 144, 105, 14);
		contentPane.add(lblNombres);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDni.setBounds(443, 37, 91, 14);
		contentPane.add(lblDni);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelfono.setBounds(443, 71, 91, 14);
		contentPane.add(lblTelfono);
		
		JButton button = new JButton("Consultar");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(684, 49, 151, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Modificar");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(684, 74, 151, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Eliminar");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(684, 99, 151, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Listar");
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(684, 124, 151, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Adicionar");
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(683, 25, 151, 23);
		contentPane.add(button_4);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(311, 34, 115, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtPaterno = new JTextField();
		txtPaterno.setColumns(10);
		txtPaterno.setBounds(311, 70, 115, 20);
		contentPane.add(txtPaterno);
		
		txtMaterno = new JTextField();
		txtMaterno.setColumns(10);
		txtMaterno.setBounds(311, 105, 115, 20);
		contentPane.add(txtMaterno);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(311, 143, 115, 20);
		contentPane.add(txtNombre);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(515, 34, 115, 20);
		contentPane.add(txtDni);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(515, 70, 115, 20);
		contentPane.add(txtTelefono);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 214, 815, 243);
		contentPane.add(scrollPane);
		
		tblUsuario = new JTable();
		scrollPane.setViewportView(tblUsuario);
	}
}
