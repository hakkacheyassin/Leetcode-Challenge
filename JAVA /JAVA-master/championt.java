import java.util.*;

public class championt {

	public static void main(String[] args) {
		ArrayList<Equipe> listEquipe = new ArrayList<Equipe>();
		ArrayList<Joueur> ListeJoueurs = new ArrayList<Joueur>();
		Scanner  input =new Scanner (System.in);
		Equipe [] equipe=new Equipe[5];
		for(int i=0;i<5;i++) {		
			System.out.print("Nom de l'Equipe "+(i+1)+": ");
			String  nom = input.nextLine();
			equipe[i] = new Equipe(nom, ListeJoueurs);	
			for(int k = 0;k<=4;k++) {		
				System.out.print("Joueur  "+(k+1)+" :");
				String nj= input.nextLine();
				System.out.print("Position:");
				char p= input.nextLine().charAt(0);
				equipe[i].ajouterj( new Joueur(nj,p));
				}	
			listEquipe.add(equipe[i]);
		}
		for(int j=0;j<5;j++) {
		System.out.println(equipe[j].toString());			
		}
		
	
		System.out.println("List match:");
		for(int i =0;i<listEquipe.size();i++) {
			for(int j =i+1;j<listEquipe.size();j++) {
				System.out.print(listEquipe.get(i).getNomEquipe()+"<==>"+listEquipe.get(j).getNomEquipe()+"\n");
			}	
		}
		

	}

}
