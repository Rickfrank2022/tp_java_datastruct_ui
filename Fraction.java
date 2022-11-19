package accueil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;



public class Fraction {

	private JFrame frame;
	private JTextField Field;
	private JTextField Field_1;
	private JTextField Field_2;
	private JTextField Field_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fraction window = new Fraction();
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
	public Fraction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Table_fraction = new JLabel("FRACTION");
		Table_fraction.setFont(new Font("Arial Black", Font.BOLD, 20));
		Table_fraction.setBounds(239, 8, 134, 26);
		frame.getContentPane().add(Table_fraction);
		
		
		JButton soustraction = new JButton("Sub");
		soustraction.setForeground(Color.BLUE);
		soustraction.setFont(new Font("Arial Black", Font.BOLD, 18));
		soustraction.setBounds(44, 209, 77, 31);
		frame.getContentPane().add(soustraction);
		
		JButton multiplicaton = new JButton("Mul");
		multiplicaton.setFont(new Font("Arial Black", Font.BOLD, 18));
		multiplicaton.setForeground(Color.BLUE);
		multiplicaton.setBounds(44, 259, 77, 31);
		frame.getContentPane().add(multiplicaton);
		
		JButton division = new JButton("Div");
		division.setForeground(Color.BLUE);
		division.setFont(new Font("Arial Black", Font.BOLD, 18));
		division.setBounds(44, 309, 77, 31);
		frame.getContentPane().add(division);
		
		JLabel fonction_1 = new JLabel("F1");
		fonction_1.setForeground(Color.BLUE);
		fonction_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		fonction_1.setBounds(220, 62, 37, 20);
		frame.getContentPane().add(fonction_1);
		
		Field = new JTextField();
		Field.setToolTipText("numerateur_1");
		Field.setBounds(277, 62, 66, 22);
		frame.getContentPane().add(Field);
		Field.setColumns(10);
		
		Field_1 = new JTextField();
		Field_1.setBounds(376, 64, 66, 20);
		frame.getContentPane().add(Field_1);
		Field_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("/");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(353, 62, 13, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel fonction_2 = new JLabel("F2");
		fonction_2.setForeground(Color.BLUE);
		fonction_2.setFont(new Font("Arial Black", Font.PLAIN, 18));
		fonction_2.setBounds(220, 95, 39, 26);
		frame.getContentPane().add(fonction_2);
		
		Field_2 = new JTextField();
		Field_2.setColumns(10);
		Field_2.setBounds(277, 103, 66, 20);
		frame.getContentPane().add(Field_2);
		
		JLabel bare_de_fraction = new JLabel("/");
		bare_de_fraction.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bare_de_fraction.setBounds(353, 103, 13, 17);
		frame.getContentPane().add(bare_de_fraction);
		
		Field_3 = new JTextField();
		Field_3.setColumns(10);
		Field_3.setBounds(376, 99, 66, 22);
		frame.getContentPane().add(Field_3);
		
		JButton addition = new JButton("Add");
		addition.setForeground(Color.BLUE);
		addition.setFont(new Font("Arial Black", Font.BOLD, 18));
		addition.setBounds(44, 161, 77, 26);
		frame.getContentPane().add(addition);
		
		JLabel NewLabel= new JLabel("}");
		NewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
		NewLabel.setBounds(437, 159, 70, 181);
		frame.getContentPane().add(NewLabel);
		
		JLabel affichage = new JLabel("résultats");
		affichage.setForeground(Color.BLACK);
		affichage.setFont(new Font("Arial Black", Font.PLAIN, 18));
		affichage.setBounds(491, 235, 98, 44);
		frame.getContentPane().add(affichage);
		
		JLabel result_Add = new JLabel("................................");
		result_Add.setFont(new Font("Arial Black", Font.PLAIN, 17));
		result_Add.setBounds(277, 161, 165, 24);
		frame.getContentPane().add(result_Add);
		
		JLabel result_sous = new JLabel("................................");
		result_sous.setFont(new Font("Arial Black", Font.PLAIN, 17));
		result_sous.setBounds(277, 216, 165, 24);
		frame.getContentPane().add(result_sous);
		
		JLabel result_mul = new JLabel("................................");
		result_mul.setFont(new Font("Arial Black", Font.PLAIN, 17));
		result_mul.setBounds(277, 272, 165, 24);
		frame.getContentPane().add(result_mul);
		
		JLabel result_div = new JLabel("................................");
		result_div.setFont(new Font("Arial Black", Font.PLAIN, 17));
		result_div.setBounds(277, 322, 165, 24);
		frame.getContentPane().add(result_div);
	}
}
