package nouveau;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;



import java.awt.Color;
import java.awt.EventQueue;

public class Naissance {

	private JFrame frame;
	private JTextField txtNaissance;
	private JTextField txtJourmoisanne;
	private JTextField txtId;
	private JTextField txtId_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Naissance window = new Naissance();
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
	public Naissance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("TextField.selectionBackground"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id_pere");
		lblNewLabel.setBounds(26, 27, 52, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id_Mere");
		lblNewLabel_1.setBounds(26, 91, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lieu");
		lblNewLabel_2.setBounds(26, 153, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setBounds(26, 216, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtNaissance = new JTextField();
		txtNaissance.setText("Naissance");
		txtNaissance.setBounds(136, 148, 130, 26);
		frame.getContentPane().add(txtNaissance);
		txtNaissance.setColumns(10);
		
		txtJourmoisanne = new JTextField();
		txtJourmoisanne.setText("Jour/Mois/Année");
		txtJourmoisanne.setBounds(134, 211, 130, 26);
		frame.getContentPane().add(txtJourmoisanne);
		txtJourmoisanne.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Valider");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(327, 107, 117, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		txtId = new JTextField();
		txtId.setText("ID2");
		txtId.setBounds(136, 86, 130, 26);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtId_1 = new JTextField();
		txtId_1.setText("ID1");
		txtId_1.setBounds(136, 22, 130, 26);
		frame.getContentPane().add(txtId_1);
		txtId_1.setColumns(10);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setForeground(Color.RED);
		btnRetour.setBounds(327, 237, 117, 29);
		frame.getContentPane().add(btnRetour
				
				);
		
		//Quitter fenetre
		btnRetour.addActionListener(e->{
			frame.dispose();
		});
	}

}
