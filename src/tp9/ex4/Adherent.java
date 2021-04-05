package tp9.ex4;

public class Adherent {
	private String nom, login, option, sexe, sport;

	public Adherent(String nom, String login, String option, String sexe, String sport) {
		super();
		this.nom = nom;
		this.login = login;
		this.option = option;
		this.sexe = sexe;
		this.sport = sport;
	}

	public String getNom() {
		return nom;
	}

	public String getLogin() {
		return login;
	}

	public String getOption() {
		return option;
	}

	public String getSexe() {
		return sexe;
	}

	public String getSport() {
		return sport;
	}
	
	

}
