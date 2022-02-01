package supermercado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel Login;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBackground(new Color(255, 153, 51));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 424);
		Login = new JPanel();
		Login.setBackground(new Color(255, 255, 255));
		Login.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Login);
		Login.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno07PROA\\Downloads\\Design sem nome.png"));
		lblNewLabel.setBounds(0, 0, 305, 385);
		Login.add(lblNewLabel);
		
		JLabel lblTelaDeLogin = new JLabel("Voc\u00EA \u00E9");
		lblTelaDeLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelaDeLogin.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		lblTelaDeLogin.setBackground(Color.RED);
		lblTelaDeLogin.setBounds(333, 120, 100, 28);
		Login.add(lblTelaDeLogin);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(255, 153, 51)));
		textField.setCaretColor(new Color(255, 153, 51));
		textField.setBounds(440, 183, 209, 28);
		Login.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(new Color(255, 153, 51)));
		textField_1.setColumns(10);
		textField_1.setBounds(440, 233, 209, 28);
		Login.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setForeground(new Color(255, 153, 51));
		comboBox.setBorder(new CompoundBorder());
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Cliente"}));
		comboBox.setFont(new Font("Poppins Medium", Font.PLAIN, 19));
		comboBox.setBounds(440, 119, 148, 28);
		Login.add(comboBox);
		
		JLabel lblTelaDeLogin_1 = new JLabel("Tela de Login");
		lblTelaDeLogin_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDeLogin_1.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 22));
		lblTelaDeLogin_1.setBackground(Color.RED);
		lblTelaDeLogin_1.setBounds(420, 42, 174, 28);
		Login.add(lblTelaDeLogin_1);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setForeground(new Color(255, 153, 51));
		lblId.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		lblId.setBackground(Color.RED);
		lblId.setBounds(333, 183, 65, 28);
		Login.add(lblId);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setForeground(new Color(255, 153, 51));
		lblSenha.setFont(new Font("Poppins SemiBold", Font.PLAIN, 20));
		lblSenha.setBackground(Color.RED);
		lblSenha.setBounds(333, 233, 75, 28);
		Login.add(lblSenha);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(255, 153, 51));
		btnNewButton.setBounds(333, 293, 136, 36);
		Login.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 153, 51));
		btnNewButton_1.setBounds(513, 293, 136, 36);
		Login.add(btnNewButton_1);
		
		JLabel lblTelaDeLogin_1_1 = new JLabel("X");
		lblTelaDeLogin_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDeLogin_1_1.setForeground(new Color(255, 153, 51));
		lblTelaDeLogin_1_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 22));
		lblTelaDeLogin_1_1.setBackground(Color.RED);
		lblTelaDeLogin_1_1.setBounds(661, 0, 48, 28);
		Login.add(lblTelaDeLogin_1_1);
	}
}
