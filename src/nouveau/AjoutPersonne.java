package nouveau;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class AjoutPersonne {

	private JFrame frame;
	private JTextField txtNom_1;
	private JTextField txtPrenom;
	private JTextField txtSexe;
	private JTextField txtJourmoisanne;
	private JTextField txtNaissance;
	private JTextField txtNom;
	private  Action action ;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutPersonne window = new AjoutPersonne();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}*/
		
	

	/**
	 * Create the application.
	 */
	public AjoutPersonne(Mairie m) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Votre nom");
		lblNewLabel.setBounds(26, 6, 81, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Votre prenom");
		lblNewLabel_1.setBounds(26, 44, 98, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sexe");
		lblNewLabel_2.setBounds(26, 83, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setBounds(26, 126, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Lieu");
		lblNewLabel_4.setBounds(26, 169, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Votre Id");
		lblNewLabel_5.setBounds(26, 218, 61, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		txtNom_1 = new JTextField();
		txtNom_1.setText("Nom");
		txtNom_1.setBounds(142, 1, 130, 26);
		frame.getContentPane().add(txtNom_1);
		txtNom_1.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setText("Prenom");
		txtPrenom.setBounds(136, 39, 130, 26);
		frame.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		
		txtSexe = new JTextField();
		txtSexe.setText("Sexe");
		txtSexe.setBounds(142, 78, 130, 26);
		frame.getContentPane().add(txtSexe);
		txtSexe.setColumns(10);
		
		txtJourmoisanne = new JTextField();
		txtJourmoisanne.setText("Jour/Mois/Année");
		txtJourmoisanne.setBounds(142, 121, 130, 26);
		frame.getContentPane().add(txtJourmoisanne);
		txtJourmoisanne.setColumns(10);
		
		txtNaissance = new JTextField();
		txtNaissance.setText("Naissance");
		txtNaissance.setBounds(142, 164, 130, 26);
		frame.getContentPane().add(txtNaissance);
		txtNaissance.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setText("Id");
		txtNom.setBounds(142, 213, 130, 26);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		int id = Integer.parseInt(txtNom.getText());
		
		JButton btnNewButton = new JButton("Valider");
		
		btnNewButton.setAction(action);
		btnNewButton.setBounds(315, 101, 117, 29);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(e->{
			if(txtNom_1.getText().equals("") && txtPrenom.getText() =="" && txtSexe.getText() =="" && txtJourmoisanne.getText() =="" && txtNaissance.getText() =="" && txtNom.getText() =="") {
				
			}
			else {
				
				
			}
			
		});
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setForeground(new Color(204, 0, 0));
		btnRetour.setBackground(new Color(0, 0, 0));
		btnRetour.setBounds(327, 237, 117, 29);
		frame.getContentPane().add(btnRetour);
		
		//Quitter fenetre
		btnRetour.addActionListener(e->{
			frame.dispose();
		});
	}
	
	
	
	
		
	
}
