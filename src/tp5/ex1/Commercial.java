package tp5.ex1;

public class Commercial extends Employe {

    private double chiffreAffaire;

    public Commercial(String nom, String prenom, int age, String dateDebutSer, double chiffreAffaire) {
        super(nom, prenom, age, dateDebutSer);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }


    @Override
    public String getTitre() {
        return "Le Commercial";
    }

    @Override
    public double calculerSalaireEmploye() {
        return 0;
    }
}
