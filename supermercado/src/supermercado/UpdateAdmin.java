package supermercado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateAdmin frame = new UpdateAdmin();
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
	public UpdateAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 153, 51));
		panel.setBounds(0, 38, 88, 27);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 153, 51));
		panel_1.setBounds(0, 103, 106, 27);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Panel panel_1_1 = new Panel();
		panel_1_1.setBackground(new Color(255, 153, 51));
		panel_1_1.setBounds(0, 168, 132, 27);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Panel panel_1_2 = new Panel();
		panel_1_2.setBackground(new Color(255, 153, 51));
		panel_1_2.setBounds(0, 298, 106, 27);
		contentPane.add(panel_1_2);
		panel_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(255, 153, 51));
		panel_2.setBounds(0, 233, 88, 27);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 153, 51));
		panel_3.setBounds(0, 0, 15, 365);
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTelaDeLogin_1 = new JLabel("UpdateAdmin");
		lblTelaDeLogin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelaDeLogin_1.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 28));
		lblTelaDeLogin_1.setBackground(Color.RED);
		lblTelaDeLogin_1.setBounds(172, 57, 276, 34);
		contentPane.add(lblTelaDeLogin_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setColumns(10);
		textField.setCaretColor(new Color(255, 255, 255));
		textField.setBorder(new LineBorder(new Color(255, 153, 51)));
		textField.setBounds(307, 129, 185, 27);
		contentPane.add(textField);
		
		JLabel lblTelaDeLogin_1_1 = new JLabel("ID Produto");
		lblTelaDeLogin_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelaDeLogin_1_1.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin_1_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 18));
		lblTelaDeLogin_1_1.setBackground(Color.RED);
		lblTelaDeLogin_1_1.setBounds(172, 125, 132, 34);
		contentPane.add(lblTelaDeLogin_1_1);
		
		JLabel lblTelaDeLogin_1_1_1 = new JLabel("Nome");
		lblTelaDeLogin_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelaDeLogin_1_1_1.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin_1_1_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 18));
		lblTelaDeLogin_1_1_1.setBackground(Color.RED);
		lblTelaDeLogin_1_1_1.setBounds(172, 176, 132, 34);
		contentPane.add(lblTelaDeLogin_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setColumns(10);
		textField_1.setCaretColor(new Color(255, 255, 255));
		textField_1.setBorder(new LineBorder(new Color(255, 153, 51)));
		textField_1.setBounds(307, 180, 185, 27);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 153, 51));
		btnNewButton.setBounds(170, 251, 108, 29);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.setForeground(new Color(255, 255, 255));
		btnLimpar.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		btnLimpar.setBorder(null);
		btnLimpar.setBackground(new Color(255, 153, 51));
		btnLimpar.setBounds(381, 251, 108, 29);
		contentPane.add(btnLimpar);
		
		JLabel lblTelaDeLogin_1_1_2 = new JLabel("X");
		lblTelaDeLogin_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDeLogin_1_1_2.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin_1_1_2.setFont(new Font("Poppins SemiBold", Font.PLAIN, 22));
		lblTelaDeLogin_1_1_2.setBackground(Color.RED);
		lblTelaDeLogin_1_1_2.setBounds(511, 11, 48, 28);
		contentPane.add(lblTelaDeLogin_1_1_2);
	}
}
