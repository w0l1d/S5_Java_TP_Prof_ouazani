package tp2.ex1;

import java.util.Scanner;

public class TestEtudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant etudiant1 = new Etudiant("dfs", "dsfssd", 54455);
		System.out.println("nom : " + etudiant1.getNom());
		System.out.println("prenom : " + etudiant1.getPrenom());
		System.out.println("CNE : " + etudiant1.getCNE());
		
		System.out.print("Entrer le nouveau CNE : ");
		Scanner in = new Scanner(System.in);
		int nCNE = in.nextInt();
		
		System.out.println("Nouveau CNE : " + nCNE);
		
		
		
	}

}
