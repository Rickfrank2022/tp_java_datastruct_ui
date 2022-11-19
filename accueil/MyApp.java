package accueil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenu;

public class MyApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp window = new MyApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("FRACTION");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(26, 333, 117, 23);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("COMPLEXE");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(172, 333, 117, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PILE");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBounds(320, 333, 103, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("FILE");
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBounds(460, 334, 103, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("WELCOM IN MY APPLICATION");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\KENGNE RICK FRANK\\Desktop\\nouveau\\Nouveau dossier\\index.jpg"));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBackground(new Color(204, 255, 255));
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setBounds(107, 99, 372, 95);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IG-G51");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 34));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(216, 205, 140, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 16));
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"File", "FRACTION", "COMPLEXE", "PILE", "FILE", "", "QUITTER"}));
		comboBox.setBounds(10, 0, 103, 28);
		frame.getContentPane().add(comboBox);
		
		JMenu mnNewMenu = new JMenu("Help");
		mnNewMenu.setFont(new Font("Arial Black", Font.BOLD, 18));
		mnNewMenu.setForeground(Color.WHITE);
		mnNewMenu.setBounds(107, 0, 117, 28);
		frame.getContentPane().add(mnNewMenu);
		
		JButton btnNewButton_4 = new JButton("Close");
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_4.setBounds(485, 429, 91, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\KENGNE RICK FRANK\\Desktop\\nouveau\\Nouveau dossier\\cybersecurity-03.jpg"));
		lblNewLabel_2.setBounds(0, 0, 586, 463);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
