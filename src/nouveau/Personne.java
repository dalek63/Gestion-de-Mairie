package nouveau;

import java.io.Serializable;

public class Personne implements Serializable{
//Attributs
	
 int identifiant, identifiant_conjoint;
 String nom, prenom, sexe, etat, metier, date_naissance;
 
 //Méthodes
 
 public Personne(int id, String n, String p, String d, String s, String e, int idc, String m) {
	 identifiant = id;
	 nom = n;
	 prenom = p;
	 date_naissance = d;
	 sexe = s;
	 etat = e;
	 identifiant_conjoint = idc;
	 metier = m;
 }
 
 
 public void afficher() {
	/* System.out.println("identifiant : " + identifiant);*/
	 System.out.println("nom : " + nom);
	 System.out.println("prenom : " + prenom);
	 System.out.println("date_naissance : " + date_naissance);
	 System.out.println("sexe : " + sexe);
	 System.out.println("etat : " + etat);
	 /*System.out.println("identifiant_conjoint : " + identifiant_conjoint );*/
	/* System.out.println("metier : " + metier);*/
 }

 
       /*int getId() { 
    	   return(identifiant);  
       }*/
       
      
       
      
}
	 