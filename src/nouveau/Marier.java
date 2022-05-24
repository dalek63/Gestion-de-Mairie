package nouveau;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;

public class Marier {

	private JFrame frame;
	private JTextField txtNom;
	private JTextField txtPreom;
	private JTextField txtJourmoisanne;
	private JTextField txtLieu;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marier window = new Marier();
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
	public Marier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNom = new JTextField();
		txtNom.setText("ID1");
		txtNom.setHorizontalAlignment(SwingConstants.LEFT);
		txtNom.setBounds(89, 6, 130, 26);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtPreom = new JTextField();
		txtPreom.setText("ID2");
		txtPreom.setBounds(89, 78, 130, 26);
		frame.getContentPane().add(txtPreom);
		txtPreom.setColumns(10);
		
		txtJourmoisanne = new JTextField();
		txtJourmoisanne.setText("Jour/Mois/Année");
		txtJourmoisanne.setBounds(89, 148, 130, 26);
		frame.getContentPane().add(txtJourmoisanne);
		txtJourmoisanne.setColumns(10);
		
		txtLieu = new JTextField();
		txtLieu.setText("Lieu");
		txtLieu.setBounds(89, 222, 130, 26);
		frame.getContentPane().add(txtLieu);
		txtLieu.setColumns(10);
		
		btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(242, 78, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Votre ID");
		lblNewLabel.setBounds(6, 11, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Votre ID");
		lblNewLabel_1.setBounds(6, 83, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setBounds(6, 153, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lieu");
		lblNewLabel_3.setBounds(6, 227, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnQuitter = new JButton("Retour");
		btnQuitter.setBackground(Color.GRAY);
		btnQuitter.setBounds(327, 222, 117, 29);
		frame.getContentPane().add(btnQuitter);
		
		
		//Quitter fenetre
				btnQuitter.addActionListener(e->{
					frame.dispose();
				});
	}
}
