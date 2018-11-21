package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import arreglos.ArregloIngreso;
import clase.Ingreso;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.spi.NumberFormatProvider;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class DlgIngreso extends JDialog implements ActionListener {
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JTextField txtIngreso;
	private JTextField txtSocio;
	private JTextField txtFIngreso;
	private JTextField txtHIngreso;
	private JTextField txtInvitados;
	private JTextField txtCIngreso;
	private JComboBox cboEstado;
	private JLabel label_7;
	private JLabel label_8;
	private JButton btnGuardar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnAdicionar;
	private JScrollPane scrollPane;
	private DefaultTableModel modelo;
	ArregloIngreso ingre = new  ArregloIngreso();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgIngreso dialog = new DlgIngreso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgIngreso() {
		setBounds(100, 100, 880, 554);
		getContentPane().setLayout(null);
		
		label = new JLabel("C\u00F3digo Ingreso:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(43, 12, 117, 25);
		getContentPane().add(label);
		
		label_1 = new JLabel("C\u00F3digo Socio:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(43, 48, 95, 29);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("Fecha Ingreso:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(43, 88, 95, 27);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("Hora Ingreso:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(43, 126, 106, 27);
		getContentPane().add(label_3);
		
		label_4 = new JLabel("N\u00B0 Invitados:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(282, 12, 100, 14);
		getContentPane().add(label_4);
		
		label_5 = new JLabel("Costo Ingreso:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(282, 48, 106, 14);
		getContentPane().add(label_5);
		
		label_6 = new JLabel("Estado:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(282, 88, 100, 14);
		getContentPane().add(label_6);
		
		txtIngreso = new JTextField();
		txtIngreso.setText("40001");
		txtIngreso.setColumns(10);
		txtIngreso.setBounds(157, 11, 86, 20);
		getContentPane().add(txtIngreso);
		
		txtSocio = new JTextField();
		txtSocio.setColumns(10);
		txtSocio.setBounds(157, 47, 86, 20);
		getContentPane().add(txtSocio);
		
		txtFIngreso = new JTextField();
		txtFIngreso.setColumns(10);
		txtFIngreso.setBounds(157, 87, 86, 20);
		getContentPane().add(txtFIngreso);
		
		txtFIngreso.setText(Dia());
		
		
		txtHIngreso = new JTextField();
		txtHIngreso.setColumns(10);
		txtHIngreso.setBounds(157, 125, 86, 20);
		getContentPane().add(txtHIngreso);
	
		txtHIngreso.setText(hora());
		
		
		
		txtInvitados = new JTextField();
		txtInvitados.setColumns(10);
		txtInvitados.setBounds(392, 11, 86, 20);
		getContentPane().add(txtInvitados);
		
		txtCIngreso = new JTextField();
		txtCIngreso.setColumns(10);
		txtCIngreso.setBounds(392, 47, 86, 20);
		getContentPane().add(txtCIngreso);
		
		cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Pendiente", "Pagado"}));
		cboEstado.setBounds(390, 87, 88, 20);
		getContentPane().add(cboEstado);
		
		label_7 = new JLabel("0 = Pendiente");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(383, 126, 95, 14);
		getContentPane().add(label_7);
		
		label_8 = new JLabel("1 = Pagado");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(383, 153, 95, 14);
		getContentPane().add(label_8);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setForeground(Color.BLACK);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar.setBounds(529, 111, 151, 23);
		getContentPane().add(btnGuardar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEliminar.setBounds(529, 64, 151, 23);
		getContentPane().add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setForeground(Color.BLACK);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnModificar.setBounds(529, 39, 151, 23);
		getContentPane().add(btnModificar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setForeground(Color.BLACK);
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdicionar.setBounds(528, 12, 151, 23);
		getContentPane().add(btnAdicionar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 211, 831, 293);
		getContentPane().add(scrollPane);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Codigo de Ingreso");
		modelo.addColumn("Codigo de Socio");
		modelo.addColumn("Fecha de Ingreso");
		modelo.addColumn("Hora de Ingreso");
		modelo.addColumn("Numero de Invitados");
		modelo.addColumn("Costo de Ingreso");
		modelo.addColumn("Estado");
		
		
		table = new JTable();
		table.setModel(modelo);
	    listar();
		scrollPane.setViewportView(table);
		
	}
	
	
	private JTable table;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnModificar) {
			actionPerformedBtnModificar(e);
		}
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
	}
	String hora(){
		Date d= new Date();
		DateFormat t= DateFormat.getTimeInstance();
		String time=t.format(d);
		return time;
	}
	
	String Dia(){
		Date s= new Date();
		DateFormat f= DateFormat.getDateInstance();
		String fecha=f.format(s);
		return fecha;
	}
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
		try {
			int cod=codigoIngreso();
			if (cod!=0) {
				try {
					int so=codigoSocio();
					if(so!=0){
						String fecha=fechaIngreso();
						if (fecha.length()!=0) {
							String hora =horaIngreso();
							if (hora.length()!=0) {
								try {
									int num=numeroInvitados();
									if (num!=0) {
										try {
											double costo=costoIngreso();
											if (costo!=0){
												int est=estado();
												Ingreso n = new Ingreso(cod, so, Dia(), hora(), num, costo, est);
												ingre.adicionar(n);
												//ingre.grabarIngreso();
												listar();
												txtIngreso.setText(ingre.code()+"");
												limpiar();
												
												
											}else{
												mensaje("costo minimo $10");
											}
											
										} catch (NumberFormatException e2) {
											error("Ingreso Costo", txtCIngreso);
										}
										
									}else{
										mensaje("minimo de invitado 1");
									}
								} catch (NumberFormatException e2) {
									// TODO: handle exception
									error("Ingrese Un numero", txtInvitados);
								}
								
							}else{
								error("ingrese la hora", txtHIngreso);
							}
						}else{
							error("Ingrese la fecha",txtFIngreso);
						}
					}else{
						mensaje("ingrese un numero valido");
					}
				} catch (NumberFormatException e2) {
					// TODO: handle exception
					error("Ingrese Codigo del Socio", txtSocio);
				}
				
			}else{
				mensaje("Codigo no generado");
			}
			
		} catch (NumberFormatException e2) {
			// TODO: handle exception
			error("ingrese un codigo de Ingreso", txtIngreso);
		}
	}
	
	int codigoIngreso(){
		return Integer.parseInt(txtIngreso.getText());
	}
	int codigoSocio(){
		return Integer.parseInt(txtSocio.getText());
	}
	String fechaIngreso(){
		
		
		return txtFIngreso.getText();
	}
	String horaIngreso(){
		
		return txtHIngreso.getText();
	}
	int numeroInvitados(){
		return Integer.parseInt(txtInvitados.getText());
	}
	double costoIngreso(){
		return Double.parseDouble(txtCIngreso.getText());
	}
	int estado(){
		return cboEstado.getSelectedIndex();
	}
	
	void error(String s, JTextField x){
		mensaje(s);
		x.setText(null);
		x.requestFocus();
		
	}

	void mensaje(String s) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, s);
	}	
	void listar(){
		Ingreso i;
		modelo.setRowCount(0);
		for (int j = 0; j < ingre.tamaño() ; j++) {
			i=ingre.obtener(j);
			Object [] fila ={
					i.getCodigoIngreso(),
					i.getCodigoSocio(),
					i.getFechaIngreso(),
					i.getHoraIngreso(),
					i.getNumeroInvitados(),
					i.getCostoIngreso(),
					i.getEstado()
			};
		modelo.addRow(fila);
		}
	}
	void limpiar(){
		txtCIngreso.setText(null);
		txtInvitados.setText(null);
		txtCIngreso.setText(null);
		txtSocio.setText(null);
		
		txtSocio.requestFocus();
		
	}
		
		
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		
		ingre.grabarIngreso();
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		//ingre.cargarIngreso();
	}
	protected void actionPerformedBtnModificar(ActionEvent e) {
		
		
	}
}

