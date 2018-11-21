package gui;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Proyecto2018 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuProyecto;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnRegistro;
	private JMenu mnPago;
	private JMenu mnReporte;
	private JMenuItem mntmSalir;
	private JMenuItem mntmSocios;
	private JMenuItem mntmProducto;
	private JMenuItem mntmBungalow;
	private JMenuItem mntmIngreso;
	private JMenuItem mntmConsumo;
	private JMenuItem mntmHospedaje;
	private JMenuItem mntmIngresosConsumos;
	private JMenuItem mntmIngresosConsumosPendientes;
	private JMenuItem mntmIngresosConsumosPagados;
	private JMenuItem mntmHospedajesPendientes;
	private JMenuItem mntmHospedajesPagados;
	private JLabel lblFondo;
	private JMenuItem mntmHospedajes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto2018 frame = new Proyecto2018();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proyecto2018() {
		final int ANCHO = 1004, ALTO = 722;
		
		setResizable(false);
		setTitle("Proyecto 2018 - II");
		setIconImage(new ImageIcon("imagenes/PrimaTaxi.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(ANCHO, ALTO);
		this.setLocationRelativeTo(null);
		
		menuProyecto = new JMenuBar();
		setJMenuBar(menuProyecto);

		mnArchivo = new JMenu("Archivo");
		mnArchivo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnArchivo.setIcon(new ImageIcon("imagenes/archivo.png"));
		menuProyecto.add(mnArchivo);

		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setIcon(new ImageIcon("imagenes/salir.png"));
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);

		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnMantenimiento.setIcon(new ImageIcon("imagenes/mantenimiento.png"));
		menuProyecto.add(mnMantenimiento);

		mntmSocios = new JMenuItem("Socio");
		mntmSocios.addActionListener(this);
		mntmSocios.setIcon(new ImageIcon("imagenes/usuario.png"));
		mnMantenimiento.add(mntmSocios);

		mntmProducto = new JMenuItem("Producto");
		mntmProducto.addActionListener(this);
		mntmProducto.setIcon(new ImageIcon("imagenes/cliente.png"));
		mnMantenimiento.add(mntmProducto);

		mntmBungalow = new JMenuItem("Bungalow");
		mntmBungalow.addActionListener(this);
		mntmBungalow.setIcon(new ImageIcon("imagenes/genero.png"));
		mnMantenimiento.add(mntmBungalow);
	
		mnRegistro = new JMenu("Registro");
		mnRegistro.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnRegistro.setIcon(new ImageIcon("imagenes/registro.png"));
		menuProyecto.add(mnRegistro);
		
		mntmIngreso = new JMenuItem("Ingreso");
		mntmIngreso.addActionListener(this);
		mntmIngreso.setIcon(new ImageIcon("imagenes/pedido.png"));
		mnRegistro.add(mntmIngreso);

		mntmConsumo = new JMenuItem("Consumo");
		mntmConsumo.addActionListener(this);
		mntmConsumo.setIcon(new ImageIcon("imagenes/falta.png"));
		mnRegistro.add(mntmConsumo);

		mntmHospedaje = new JMenuItem("Hospedaje");
		mntmHospedaje.addActionListener(this);
		mntmHospedaje.setIcon(new ImageIcon("imagenes/falta.png"));
		mnRegistro.add(mntmHospedaje);
		
		mnPago = new JMenu("Pago");
		mnPago.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnPago.setIcon(new ImageIcon("imagenes/pago.png"));
		menuProyecto.add(mnPago);

		mntmIngresosConsumos = new JMenuItem("Ingresos y consumos");
		mntmIngresosConsumos.addActionListener(this);
		mntmIngresosConsumos.setIcon(new ImageIcon("imagenes/falta.png"));
		mnPago.add(mntmIngresosConsumos);
		
		mntmHospedajes = new JMenuItem("Hospedajes");
		mntmHospedajes.addActionListener(this);
		mnPago.add(mntmHospedajes);

		mnReporte = new JMenu("Reporte");
		mnReporte.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnReporte.setIcon(new ImageIcon("imagenes/reporte.png"));
		menuProyecto.add(mnReporte);

		mntmIngresosConsumosPendientes = new JMenuItem("Ingresos y consumos pendientes");
		mntmIngresosConsumosPendientes.addActionListener(this);
		mntmIngresosConsumosPendientes.setIcon(new ImageIcon("imagenes/falta.png"));
		mnReporte.add(mntmIngresosConsumosPendientes);

		mntmIngresosConsumosPagados = new JMenuItem("Ingresos y consumos pagados");
		mntmIngresosConsumosPagados.addActionListener(this);
		mntmIngresosConsumosPagados.setIcon(new ImageIcon("imagenes/falta.png"));
		mnReporte.add(mntmIngresosConsumosPagados);

		mntmHospedajesPendientes = new JMenuItem("Hospedajes pendientes");
		mntmHospedajesPendientes.addActionListener(this);
		mntmHospedajesPendientes.setIcon(new ImageIcon("imagenes/falta.png"));
		mnReporte.add(mntmHospedajesPendientes);

		mntmHospedajesPagados = new JMenuItem("Hospedajes pagados");
		mntmHospedajesPagados.addActionListener(this);
		mntmHospedajesPagados.setIcon(new ImageIcon("imagenes/falta.png"));
		mnReporte.add(mntmHospedajesPagados);
		
		JMenu mnBoleta = new JMenu("Boleta");
		mnBoleta.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuProyecto.add(mnBoleta);
		getContentPane().setLayout(null);

		lblFondo = new JLabel(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Lighthouse.jpg"));
		lblFondo.setSize(ANCHO, ALTO);	
		getContentPane().add(lblFondo);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmHospedajesPagados) {
			actionPerformedMntmHospedajesPagados(arg0);
		}
		if (arg0.getSource() == mntmHospedajesPendientes) {
			actionPerformedMntmHospedajesPendientes(arg0);
		}
		if (arg0.getSource() == mntmIngresosConsumosPagados) {
			actionPerformedMntmIngresosConsumosPagados(arg0);
		}
		if (arg0.getSource() == mntmIngresosConsumosPendientes) {
			actionPerformedMntmIngresosConsumosPendientes(arg0);
		}
		if (arg0.getSource()== mntmHospedajes){
			actionPerformedMntmHospedajes(arg0);
		}
		if (arg0.getSource() == mntmIngresosConsumos) {
			actionPerformedMntmIngresosConsumos(arg0);
		}
		if (arg0.getSource() == mntmHospedaje) {
			actionPerformedMntmHospedaje(arg0);
		}
		if (arg0.getSource() == mntmConsumo) {
			actionPerformedMntmConsumo(arg0);
		}
		if (arg0.getSource() == mntmIngreso) {
			actionPerformedMntmIngreso(arg0);
		}
		if (arg0.getSource() == mntmBungalow) {
			actionPerformedMntmBungalow(arg0);
		}
		if (arg0.getSource() == mntmProducto) {
			actionPerformedMntmProducto(arg0);
		}
		if (arg0.getSource() == mntmSocios) {
			actionPerformedMntmSocio(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		int ok = confirmacionDeSalida();	
		if (ok == 0)
			System.exit(0);
	}
	protected void actionPerformedMntmSocio(ActionEvent arg0) {
		DlgSocios du = new DlgSocios();
		du.setLocationRelativeTo(this);
		du.setVisible(true);
	}
	protected void actionPerformedMntmProducto(ActionEvent arg0) {
		DlgProducto dc = new DlgProducto();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmBungalow(ActionEvent arg0) {
		DlgBungalow dg = new DlgBungalow();
		dg.setLocationRelativeTo(this);
		dg.setVisible(true);
	}
	protected void actionPerformedMntmIngreso(ActionEvent arg0) {
		DlgIngreso dp = new DlgIngreso();
		dp.setLocationRelativeTo(this);
		dp.setVisible(true);
	}
	protected void actionPerformedMntmConsumo(ActionEvent arg0) {

		DlgConsumo c = new DlgConsumo();
		c.setLocationRelativeTo(this);
		c.setVisible(true);
	}
	protected void actionPerformedMntmHospedaje(ActionEvent arg0) {
		DlgHospedaje hp = new DlgHospedaje();
		hp.setLocationRelativeTo(this);
		hp.setVisible(true);

	}
	protected void actionPerformedMntmIngresosConsumos(ActionEvent arg0) {
		IngresosConsumos ic = new IngresosConsumos();
		ic.setLocationRelativeTo(this);
		ic.setVisible(true);

	}
	protected void actionPerformedMntmHospedajes(ActionEvent arg0) {
		DlgHospedajes hps = new DlgHospedajes();
		hps.setLocationRelativeTo(this);
		hps.setVisible(true);

	}
	
	protected void actionPerformedMntmIngresosConsumosPendientes(ActionEvent arg0) {
		IngresosConsumosPendientes icp = new IngresosConsumosPendientes();
		icp.setLocationRelativeTo(this);
		icp.setVisible(true);

	}
	protected void actionPerformedMntmIngresosConsumosPagados(ActionEvent arg0) {
		IngresosConsumosPagados icpa = new IngresosConsumosPagados();
		icpa.setLocationRelativeTo(this);
		icpa.setVisible(true);

	}
	protected void actionPerformedMntmHospedajesPendientes(ActionEvent arg0) {
		HospedajesPendientes hpe = new HospedajesPendientes();
		hpe.setLocationRelativeTo(this);
		hpe.setVisible(true);

	}
	protected void actionPerformedMntmHospedajesPagados(ActionEvent arg0) {
		HospedajesPagados hpa = new HospedajesPagados();
	    hpa.setLocationRelativeTo(this);
		hpa.setVisible(true);

	}
	public int confirmacionDeSalida() {
		return JOptionPane.showConfirmDialog(this,
			   "¿ Desea salir del programa ?",
			   "MN-Global ® >>> PrimaTaxi ®", 0, -1, new ImageIcon("imagenes/PrimaTaxi.png"));
	}

}