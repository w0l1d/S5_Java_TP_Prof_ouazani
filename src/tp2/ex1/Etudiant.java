package tp2.ex1;

public class Etudiant {
	
	private String nom;
	private String prenom;
	private int cne;
	
	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Etudiant(String n, String p, int c) {
		this(n, p);
		this.cne = c;
	}
	
	
	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}
	
	public int getCNE() {
		return this.cne;
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setCNE(int cne) {
		this.cne = cne;
	}
	
}
