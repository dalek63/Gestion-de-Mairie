package nouveau;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Color;

public class Déces {

	private JFrame frame;
	private JTextField txtVotreId;
	private JTextField txtJourmoisanne;
	private JTextField txtLieu;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Déces window = new Déces();
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
	public Déces() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("TextArea.selectionBackground"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Votre ID");
		lblNewLabel.setBounds(30, 26, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		txtVotreId = new JTextField();
		txtVotreId.setText(" ID");
		txtVotreId.setBounds(96, 16, 130, 26);
		frame.getContentPane().add(txtVotreId);
		txtVotreId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setBounds(30, 95, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtJourmoisanne = new JTextField();
		txtJourmoisanne.setText("Jour/Mois/Année");
		txtJourmoisanne.setBounds(96, 90, 130, 26);
		frame.getContentPane().add(txtJourmoisanne);
		txtJourmoisanne.setColumns(10);
		
		txtLieu = new JTextField();
		txtLieu.setText("Lieu");
		txtLieu.setBounds(106, 162, 130, 26);
		frame.getContentPane().add(txtLieu);
		txtLieu.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBackground(new Color(204, 204, 153));
		btnNewButton.setBounds(314, 90, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRetour = new JButton("retour");
		btnRetour.setForeground(new Color(255, 0, 0));
		btnRetour.setBounds(333, 237, 117, 29);
		frame.getContentPane().add(btnRetour);
		
 
		       //Quitter fenetre
				btnRetour.addActionListener(e->{
					frame.dispose();
				});
		
		
	}
}
