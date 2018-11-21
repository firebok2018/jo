package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DlgProducto extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable tblProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgProducto dialog = new DlgProducto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgProducto() {
		setBounds(100, 100, 642, 462);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton button = new JButton("Adicionar");
		button.setBounds(36, 11, 89, 23);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("Consultar");
		button_1.setBounds(145, 11, 89, 23);
		contentPanel.add(button_1);
		
		JButton button_2 = new JButton("Modificar");
		button_2.setBounds(258, 11, 89, 23);
		contentPanel.add(button_2);
		
		JButton button_3 = new JButton("Eliminar");
		button_3.setBounds(371, 11, 89, 23);
		contentPanel.add(button_3);
		
		JButton button_4 = new JButton("Listar");
		button_4.setBounds(488, 11, 89, 23);
		contentPanel.add(button_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 56, 546, 356);
		contentPanel.add(scrollPane);
		
		tblProducto = new JTable();
		tblProducto.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CODIGO", "DETALLE", "PRECIO", "STOCK"
			}
		));
		tblProducto.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblProducto);
	}
}
