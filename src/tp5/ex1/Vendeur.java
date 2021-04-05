package tp5.ex1;


public class Vendeur extends Commercial {

    private final float POURCENT_VENDEUR = 0.2f;
    private final int BONUS_VENDEUR = 670;

    public Vendeur(String nom, String prenom, int age, String dateDebutSer, double chiffreAffaire) {
        super(nom, prenom, age, dateDebutSer, chiffreAffaire);
    }


    @Override
    public double calculerSalaireEmploye() {
        return getChiffreAffaire() * POURCENT_VENDEUR + BONUS_VENDEUR;
    }

    @Override
    public String getTitre() {
        return "Le vendeur";
    }
}
