package nouveau;

import java.io.Serializable;

public class Mariage implements Serializable {
//Attributs
	Personne personne1, personne2;
	String lieu, date;
	
	
	//Méthodes
	
	public Mariage(Personne p1, Personne p2, String l, String d) {
		
		personne1 = p1;
		personne2 = p2;
		lieu = l;
		date = d;
		
	}
	
	public void InfoMariage() {
		
		System.out.println("Le Mariage entre " + personne1.nom + " " + personne1.prenom + " et " + personne2.nom + " " + personne2.prenom + " a eu lieu le " + date + " a " + lieu);
		
	}
	
	
	
	
	
}
