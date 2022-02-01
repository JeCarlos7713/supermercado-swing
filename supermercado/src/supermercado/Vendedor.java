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
import javax.swing.DefaultComboBoxModel;

public class Vendedor extends JFrame {
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
					Vendedor frame = new Vendedor();
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
	public Vendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 516);
		getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 200, 51));
		contentPane.setBounds(0, 0, 840, 477);
		getContentPane().add(contentPane);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setForeground(new Color(255, 153, 51));
		panel.setBackground(Color.WHITE);
		panel.setBounds(25, 13, 789, 450);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setCaretColor(new Color(255, 153, 51));
		textField.setBorder(new LineBorder(new Color(255, 153, 51)));
		textField.setBounds(171, 70, 134, 25);
		panel.add(textField);
		
		JLabel lblIdProduto = new JLabel("ID Vendedor");
		lblIdProduto.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdProduto.setForeground(new Color(255, 153, 51));
		lblIdProduto.setFont(new Font("Poppins SemiBold", Font.PLAIN, 15));
		lblIdProduto.setBackground(Color.RED);
		lblIdProduto.setBounds(63, 67, 129, 30);
		panel.add(lblIdProduto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Outro"}));
		comboBox.setForeground(new Color(255, 153, 51));
		comboBox.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		comboBox.setBorder(new CompoundBorder());
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(582, 111, 134, 25);
		panel.add(comboBox);
		
		JLabel lblTelaDeLogin_1 = new JLabel("GERENCIADOR DE VENDEDORES");
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
		
		JLabel lblQuantidade = new JLabel("Senha");
		lblQuantidade.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuantidade.setForeground(new Color(255, 153, 51));
		lblQuantidade.setFont(new Font("Poppins SemiBold", Font.PLAIN, 15));
		lblQuantidade.setBackground(Color.RED);
		lblQuantidade.setBounds(479, 70, 129, 30);
		panel.add(lblQuantidade);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setCaretColor(new Color(255, 153, 51));
		textField_2.setBorder(new LineBorder(new Color(255, 153, 51)));
		textField_2.setBounds(582, 72, 134, 25);
		panel.add(textField_2);
		
		JLabel lblCategoria = new JLabel("G\u00EAnero");
		lblCategoria.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategoria.setForeground(new Color(255, 153, 51));
		lblCategoria.setFont(new Font("Poppins SemiBold", Font.PLAIN, 15));
		lblCategoria.setBackground(Color.RED);
		lblCategoria.setBounds(479, 108, 129, 30);
		panel.add(lblCategoria);
		
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
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID Vendedor", "Nome", "Senha", "G\u00EAnero"
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
