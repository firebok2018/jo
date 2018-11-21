package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DBugalowActividad extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DBugalowActividad dialog = new DBugalowActividad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DBugalowActividad() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNumeroDeBungalow = new JLabel("NUMERO DE BUNGALOW : ");
			lblNumeroDeBungalow.setBounds(10, 24, 168, 14);
			contentPanel.add(lblNumeroDeBungalow);
		}
		{
			JLabel lblEstado = new JLabel("ESTADO : ");
			lblEstado.setBounds(10, 49, 168, 14);
			contentPanel.add(lblEstado);
		}
		
		JComboBox cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"LIBRE", "OCUPADO"}));
		cboEstado.setBounds(188, 46, 129, 20);
		contentPanel.add(cboEstado);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(316, 211, 89, 23);
		contentPanel.add(btnSalir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(202, 211, 89, 23);
		contentPanel.add(btnAceptar);
	}
}
