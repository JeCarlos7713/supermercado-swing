package supermercado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class Splash1 extends JFrame {

	private JPanel welcome;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Splash1() {
		setBackground(new Color(255, 99, 71));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 440);
		welcome = new JPanel();
		welcome.setBackground(new Color(255, 153, 51));
		welcome.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(welcome);
		welcome.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno07PROA\\Downloads\\carrinho.png"));
		lblNewLabel.setBounds(358, 0, 481, 380);
		welcome.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Supermercado do Jean");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 144, 413, 48);
		welcome.add(lblNewLabel_1);

		JLabel porcentagem = new JLabel("%");
		porcentagem.setDoubleBuffered(true);
		porcentagem.setHorizontalAlignment(SwingConstants.RIGHT);
		porcentagem.setForeground(Color.WHITE);
		porcentagem.setFont(new Font("Poppins SemiBold", Font.PLAIN, 30));
		porcentagem.setBounds(10, 328, 81, 37);
		welcome.add(porcentagem);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 104, 200, 40);
		welcome.add(panel_1);

		JLabel label = new JLabel("Seja bem-vindo ao");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label);
		label.setBackground(Color.RED);
		label.setForeground(new Color(255, 153, 51));
		label.setFont(new Font("Poppins SemiBold", Font.PLAIN, 18));

		JProgressBar Myprogress = new JProgressBar();
		Myprogress.setString("");
		Myprogress.setEnabled(false);
		Myprogress.setIndeterminate(true);
		Myprogress.setFont(new Font("Poppins", Font.PLAIN, 11));
		Myprogress.setStringPainted(true);
		Myprogress.setBounds(0, 376, 657, 25);
		welcome.add(Myprogress);
	}
	
	public static void main(String[] args) {
		Splash1 MySplash = new Splash1();

		MySplash.setVisible(true);
		try {
			for (int i = 0; i <= 100; i++) {
				Thread.sleep(2300);
				MySplash.Myprogress.setValue(i);
				MySplash.porcentagem.setText(Integer.toString(i) + "%");
			}
		} catch (Exception e) {

		}
		new Login().setVisible(true);
		MySplash.dispose();
	}

	private javax.swing.JProgressBar Myprogress;
	private javax.swing.JLabel porcentagem;
}
