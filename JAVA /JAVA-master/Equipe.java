
import java.util.*;
public class Equipe {
	private int no;
	private static int nb=0;
	private  final  int  maxJoueurs=5;
	private String nomEquipe;
	private ArrayList<Joueur> ListeJoueurs=new ArrayList <Joueur>();

	public String getNomEquipe() {
		return nomEquipe;
	}


	public Equipe (String nomEquipe , ArrayList <Joueur>  ListeJoueurs) {
		
		this.no=++nb;
		this.nomEquipe=nomEquipe;
		this.ListeJoueurs = ListeJoueurs;
		
	}
	

	public void ajouterj(Joueur joueur){
		if(this.ListeJoueurs.size()<=maxJoueurs) 
			this.ListeJoueurs.add(joueur);
	}
	
	public String listj(ArrayList<Joueur> ListeJoueurs)
	{
		String results = "";
		
			for(Joueur j: ListeJoueurs)
	       {
				results += j.toString();
	       }
			
		    return results;
	}

	
	public String toString() {
		
		return "Nom de l'Equipe  "+ this.no+  ":"+ this.nomEquipe + "\n" + this.listj(this.ListeJoueurs)+"\n";
	}

	
}
