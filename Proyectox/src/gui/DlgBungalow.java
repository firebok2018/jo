package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DlgBungalow extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgBungalow dialog = new DlgBungalow();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgBungalow() {
		setBounds(100, 100, 638, 474);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton button = new JButton("Adicionar");
			button.setBounds(32, 11, 89, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("Consultar");
			button.setBounds(141, 11, 89, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("Modificar");
			button.setBounds(254, 11, 89, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("Eliminar");
			button.setBounds(367, 11, 89, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("Listar");
			button.setBounds(484, 11, 89, 23);
			contentPanel.add(button);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(32, 51, 548, 362);
			contentPanel.add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"NUMERO", "ESTADO"
					}
				));
				table.setFillsViewportHeight(true);
				scrollPane.setViewportView(table);
			}
		}
	}

}
