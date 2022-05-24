package nouveau;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Label;

public class Divorcer {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtId_1;
	private JTextField txtJourmoisannee;

	/**
	 * Launch the application.
	 */
	public static void newScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divorcer window = new Divorcer();
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
	public Divorcer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("DIVORCE");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 450, 272);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtId = new JTextField();
		txtId.setText("ID1");
		txtId.setBounds(116, 6, 130, 26);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtId_1 = new JTextField();
		txtId_1.setText("ID2");
		txtId_1.setBounds(116, 84, 130, 26);
		panel.add(txtId_1);
		txtId_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(281, 104, 117, 29);
		panel.add(btnNewButton);
		
		txtJourmoisannee = new JTextField();
		txtJourmoisannee.setText("Jour/Mois/Annee");
		txtJourmoisannee.setBounds(116, 151, 130, 26);
		panel.add(txtJourmoisannee);
		txtJourmoisannee.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Votre ID");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(10, 11, 61, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Votre ID");
		lblNewLabel_1.setBounds(10, 89, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setBounds(10, 156, 61, 16);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("retour");
		btnNewButton_1.setBounds(313, 213, 85, 21);
		panel.add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton_1);
		
		
		//Quitter fenetre
			btnNewButton_1.addActionListener(e->{
					frame.dispose();
				});

		
	}
	
}
