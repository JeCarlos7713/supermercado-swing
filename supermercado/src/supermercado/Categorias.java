package supermercado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Categorias extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Categorias frame = new Categorias();
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
	public Categorias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(255, 153, 51));
		contentPane_1.setBounds(0, 0, 855, 531);
		contentPane.add(contentPane_1);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setForeground(new Color(255, 153, 51));
		panel.setBackground(Color.WHITE);
		panel.setBounds(30, 17, 789, 496);
		contentPane_1.add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setCaretColor(new Color(255, 153, 51));
		textField.setBorder(new LineBorder(new Color(255, 153, 51)));
		textField.setBounds(171, 70, 134, 25);
		panel.add(textField);
		
		JLabel lblIdCat = new JLabel("ID Cat");
		lblIdCat.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdCat.setForeground(new Color(255, 153, 51));
		lblIdCat.setFont(new Font("Poppins SemiBold", Font.PLAIN, 15));
		lblIdCat.setBackground(Color.RED);
		lblIdCat.setBounds(63, 67, 129, 30);
		panel.add(lblIdCat);
		
		JLabel lblTelaDeLogin_1 = new JLabel("GERENCIADOR DE CATEGORIAS");
		lblTelaDeLogin_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDeLogin_1.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 22));
		lblTelaDeLogin_1.setBackground(Color.RED);
		lblTelaDeLogin_1.setBounds(214, 11, 361, 34);
		panel.add(lblTelaDeLogin_1);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 153, 51));
		btnNewButton.setBounds(63, 210, 108, 29);
		panel.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setCaretColor(new Color(255, 153, 51));
		textField_1.setBorder(new LineBorder(new Color(255, 153, 51)));
		textField_1.setBounds(171, 111, 134, 25);
		panel.add(textField_1);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setForeground(new Color(255, 153, 51));
		lblNome.setFont(new Font("Poppins SemiBold", Font.PLAIN, 15));
		lblNome.setBackground(Color.RED);
		lblNome.setBounds(63, 108, 129, 30);
		panel.add(lblNome);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescrio.setForeground(new Color(255, 153, 51));
		lblDescrio.setFont(new Font("Poppins SemiBold", Font.PLAIN, 15));
		lblDescrio.setBackground(Color.RED);
		lblDescrio.setBounds(479, 70, 129, 30);
		panel.add(lblDescrio);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setCaretColor(new Color(255, 153, 51));
		textField_2.setBorder(new LineBorder(new Color(255, 153, 51)));
		textField_2.setBounds(582, 72, 134, 25);
		panel.add(textField_2);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		btnEditar.setBorder(null);
		btnEditar.setBackground(new Color(255, 153, 51));
		btnEditar.setBounds(244, 210, 108, 29);
		panel.add(btnEditar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		btnLimpar.setBorder(null);
		btnLimpar.setBackground(new Color(255, 153, 51));
		btnLimpar.setBounds(425, 210, 108, 29);
		panel.add(btnLimpar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setForeground(Color.WHITE);
		btnDeletar.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		btnDeletar.setBorder(null);
		btnDeletar.setBackground(new Color(255, 153, 51));
		btnDeletar.setBounds(606, 210, 108, 29);
		panel.add(btnDeletar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID Cat", "Nome", "Descrição"
			}
		));
		table.setToolTipText("");
		table.setGridColor(new Color(255, 153, 51));
		table.setFont(new Font("Poppins", Font.PLAIN, 10));
		table.setEditingColumn(1);
		table.setBorder(new LineBorder(new Color(255, 153, 51)));
		table.setBounds(71, 288, 647, 208);
		panel.add(table);
		
		JLabel lblTelaDeLogin_1_1 = new JLabel("LISTA DE VENDEDORES");
		lblTelaDeLogin_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDeLogin_1_1.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin_1_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 18));
		lblTelaDeLogin_1_1.setBackground(Color.RED);
		lblTelaDeLogin_1_1.setBounds(214, 250, 361, 34);
		panel.add(lblTelaDeLogin_1_1);
		
		JLabel lblTelaDeLogin_1_1_1 = new JLabel("X");
		lblTelaDeLogin_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDeLogin_1_1_1.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin_1_1_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 22));
		lblTelaDeLogin_1_1_1.setBackground(Color.RED);
		lblTelaDeLogin_1_1_1.setBounds(741, 0, 48, 28);
		panel.add(lblTelaDeLogin_1_1_1);
	}
}
