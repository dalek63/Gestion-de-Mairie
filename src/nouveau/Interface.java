package nouveau;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Font;

public class Interface {

	private JFrame frmMairie;
	/**
	 * @wbp.nonvisual location=540,71
	 */
	//private final JLabel label = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmMairie.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	/**
	 * Create the application.
	 */
	public  Interface() {
		
	
		
		initialize();
	}
	
		
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmMairie = new JFrame();
		frmMairie.setTitle("MAIRIE");
		frmMairie.getContentPane().setBackground(Color.GREEN);
		frmMairie.setBounds(100, 100, 496, 347);
		frmMairie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMairie.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 147, 319);
		frmMairie.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton ListePop = new JButton("ListePopulation");
		ListePop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		JButton btnListeMariage = new JButton("ListeMariage");
		btnListeMariage.setBackground(Color.WHITE);
		btnListeMariage.setBounds(14, 6, 117, 29);
		panel.add(btnListeMariage);
		
		JButton btnNewButton_6 = new JButton("EtatCivil");
		btnNewButton_6.setBounds(14, 69, 117, 29);
		panel.add(btnNewButton_6);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(14, 223, 117, 29);
		panel.add(btnQuitter);
		
		//Quitter fenetre
		btnQuitter.addActionListener(e->{
			frmMairie.dispose();
		});
		
		JButton btnNewButton_1 = new JButton("ListePopul");
		btnNewButton_1.setBounds(14, 150, 117, 29);
		panel.add(btnNewButton_1);
		
		JButton btnsearchID = new JButton("SearchID");
		btnsearchID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnDeces = new JButton("Décés");
		btnDeces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnNaissance = new JButton("Naissance");
		btnNaissance.setBounds(171, 152, 117, 29);
		frmMairie.getContentPane().add(btnNaissance);
		
		JButton btnMariage = new JButton("Mariage");
	    btnMariage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Double cliquez  sur le bouton pour l'ouvrir
				Marier test=new Marier();
				test.NewScreen();
				
			}
		});
		btnMariage.setAction(action);
		btnMariage.setBounds(171, 36, 117, 29);
		frmMairie.getContentPane().add(btnMariage);
		
		JButton btnNewButton = new JButton("Déces");
		btnNewButton.setBounds(340, 36, 117, 29);
		frmMairie.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Bienvenue à la mairie !!!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Helvetica Neue", lblNewLabel.getFont().getStyle() & ~Font.BOLD | Font.ITALIC, lblNewLabel.getFont().getSize()));
		lblNewLabel.setBounds(256, 297, 178, 16);
		frmMairie.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Divorce");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Double cliquez  sur le bouton pour l'ouvrir
				Divorcer test2=new Divorcer();
				test2.newScreen2();
				
			}
		});
		btnNewButton_2.setBounds(340, 152, 117, 29);
		frmMairie.getContentPane().add(btnNewButton_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Mariage");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		
		
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
