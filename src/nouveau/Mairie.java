package nouveau;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.Serializable;

public class Mairie implements Serializable{

	ArrayList<Personne> population = new ArrayList<Personne>();
	
	ArrayList<Personne> cimetiere = new ArrayList<Personne>();
	
	ArrayList<Mariage> listeMariage = new ArrayList<Mariage>();
	
	Personne getPersById(int id){
		for (int i = 0; i < population.size(); i++) {
			if(population.get(i).identifiant==id) {
				return(population.get(i));
			}
		    }
		return(null);
		
		
	}
	
	void getId(String n, String p) {
		
		for (int i = 0; i < population.size(); i++) {
		if(population.get(i).nom==n && population.get(i).prenom==p) {
			System.out.println(n+ ", " + p+ " " + population.get(i).identifiant);
			}
		}
	}
	
	
	 void ajout(Personne p) {
		population.add(p);
	}
	
	 void marier( int id1 , int id2, String d, String l) {
		 Personne p1 = getPersById(id1);
		 Personne p2 = getPersById(id2);
		 
		 
		if(population.contains(p1)&&population.contains(p2)) {
	     if(p1.etat=="marié"||p2.etat=="marié") {
	    	 System.out.println("Impossible de marier une personne déjà mariée.");
		 
	       }
		 	else {
		 		p1.etat = "marié";
		 		p2.etat = "marié";
			             				
		 		p1.identifiant_conjoint=id2;
		 		p2.identifiant_conjoint=id1;
			
		 			if(p1.sexe=="femme") {
		 				p1.nom=p2.nom;
		 			}
		 			else if(p2.sexe=="femme") {
		 				p2.nom=p1.nom;
		 			}
		 			ajoutMariage(new Mariage(getPersById(id1),getPersById(id2),d,l));
		 		}
		 
		 	}
		else {
			System.out.println("Erreur de saisie des identifiants ");
			}
	 }
	 
	 void divorcer(int id1, int id2) {
		 Personne p1 = getPersById(id1);
		 Personne p2 = getPersById(id2);
		 
	 if ( p1.identifiant_conjoint == p2.identifiant) {
		 p1.etat="divorcé";
		 p2.etat="divorcé";
		 
		 p1.identifiant_conjoint=0;
		 p2.identifiant_conjoint=0;
	     }
	 else {
		 System.out.println( p1.prenom + " " + p2.nom + " et " + p2.prenom + " " + p2.nom + " ne sont pas mariés, Impossible de les divorcer.");
	     }
	 
	 
	 }
	 
	 void deces(int id, String date,String lieu) {
		 Personne p = getPersById(id);
		 population.remove(p);
		 cimetiere.add(p);
		 if(p.etat=="marié") {
			 getPersById(p.identifiant_conjoint).etat="célibataire";
		 }
		 
		 if(p.sexe=="femme") {
			 p.etat="morte";
			 System.out.println(p.nom + " " + p.prenom + " est décédée le " + date + " à " + lieu );
		 }
		 if(p.sexe=="homme") {
			 p.etat="mort";
			 System.out.println(p.nom + " " + p.prenom + " est décédé le " + date + " à " + lieu );
		 }
		 
	 }
	 
	 void naissance(int id1, int id2) {
		Scanner scanner = new Scanner( System.in );
	    int id=1000,idc;
		String n,p,d,s,e,m;
		
		for (int i = 0; i < population.size(); i++) {
			if(population.get(i).identifiant==id) {
				id=id+1;
			}
		}
		
		idc=0;
		
		n = getPersById(id1).nom;
		
		System.out.print( "Veuillez saisir le prénom du nouveau né : " );
		p= scanner.next();
		System.out.print("Veuillez saisir la date de naissance du nouveau né :");
		d= scanner.next();
		System.out.print("Veuillez saisir le sexe du nouveau né :");
		s= scanner.next();
        e="célibataire";
        m="sans emploi";
        scanner.close();
        ajout(new Personne(id, n, p, d, s, e, idc, m));
		
	 }
	 
	 void etat(int id) {
		 Personne p = getPersById(id);
	 if(population.contains(p)) {
		 p.afficher();
		 if(p.etat=="marié" || p.etat== "mariée") {
		 if(p.identifiant_conjoint==0) {
			 System.out.println("L'identifiant du conjoint du citoyen n° " + p.identifiant + " n'a pas été transmis !");
		 }
		 else {
		 System.out.println("nom du conjoint: "+ getPersById(p.identifiant_conjoint).nom);
		 System.out.println("prenom du conjoint: "+ getPersById(p.identifiant_conjoint).prenom);
		 }
		 }
	 }
	 else {
		 System.out.println("Erreur : identifiant incorrect");
		 }
		 
	 }
	 
	 void affichelist() {
		 for (int i = 0; i < population.size(); i++) {
				    Personne p= population.get(i);
					p.afficher();
					if(p.etat=="marié" || p.etat== "mariée") {
					if(p.identifiant_conjoint==0) {
					 System.out.println("L'identifiant du conjoint du citoyen n° " + p.identifiant + " n'a pas été transmis !");
					}
					else {
					System.out.println("nom du conjoint: "+ getPersById(p.identifiant_conjoint).nom);
					System.out.println("prenom du conjoint: "+ getPersById(p.identifiant_conjoint).prenom);
					}
					}
			    }
	 }
	 
		//fonctions de modification 

		void modifNom(int id, String n) {
			getPersById(id).nom=n;
		}
	
		void modifPrenom(int id,String n) {
			getPersById(id).prenom=n;
		} 
		
		void modifMetier(int id,String n) {
			getPersById(id).metier=n;
		} 
		
		void ajoutMariage(Mariage m) {
			listeMariage.add(m);
		}
		void afficheListeMariage() {
			for (int i = 0; i < listeMariage.size(); i++) {			
				Mariage m=listeMariage.get(i);
				m.InfoMariage();
			    }
		}
		
}


