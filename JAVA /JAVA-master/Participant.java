

public abstract class Participant {
	
	private String nomParticipant;
	
	public Participant (String nomParticipant ) {
		this.nomParticipant=nomParticipant;
	}
	
	public void  setnom( String nomnomParticipant) {
		this.nomParticipant=nomnomParticipant;
		
	}

	public String getnom() {
		return nomParticipant;
	}
	
	public abstract String affiche();

}
