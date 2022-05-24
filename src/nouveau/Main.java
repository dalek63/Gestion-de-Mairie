package nouveau;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {
	public static void main(String[] args) {
		      
	Personne x = new Personne(1001, "Souleymane", "toto", "21/03/05" , "homme", "marié", 1002, "boulanger");
	Personne y = new Personne(1002, "tata", "tata", "21/03/05" , "femme", "mariée", 1001, "boulanger");
	
	/*Mariage z = new Mariage(x,y,"trifouilli les oies","12/12/12");*/
	
	
	Mairie m=new Mairie();
	
    /*z.InfoMariage();*/
	
	m.ajout(x);
	m.ajout(y);
	m.etat(x.identifiant);
	m.marier(1001, 1002, "lieu", "date" );
	x.afficher();
	
	
	
	
	
	try {
		FileOutputStream fos = new FileOutputStream("Mairie.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(x);
		oos.writeObject(y);
		oos.writeObject(m);
		/*oos.writeObject(z);*/
		oos.close();
	}  catch ( FileNotFoundException e) {
		e.printStackTrace();
	
	}  catch (IOException e) {
		
		e.printStackTrace();
	}
	
	try {
		FileInputStream fis = new FileInputStream("Mairie.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
			Personne personne1 = (Personne)ois.readObject();
			Personne personne2 = (Personne)ois.readObject();
			Mairie mairie = (Mairie)ois.readObject();
			
		
			mairie.ajout(personne1);
			mairie.ajout(personne2);
			mairie.affichelist();
		
			
			ois.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
		}
	 


