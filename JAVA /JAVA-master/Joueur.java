

public class Joueur extends Participant {

	private char Position;
	
	public Joueur(String nomParticipant ,char p) {
		
		super(nomParticipant);
		this.Position=p;
		
	}

	 public String toString() {
		 return "Le joueur : "+super.getnom() +"\n"+ "Position :"+this.Position+"\n";
		 
	 }
	public String affiche() {
		return "joueur";
	}
	
}
