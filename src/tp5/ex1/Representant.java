package tp5.ex1;

import java.util.Date;

public class Representant extends Commercial {

    private final float POURCENT_REPRESENTANT = 0.3f;
    private final int BONUS_REPRESENTANT = 1000;

    public Representant(String nom, String prenom, int age, String dateDebutSer, double chiffreAffaire) {
        super(nom, prenom, age, dateDebutSer, chiffreAffaire);
    }


    @Override
    public double calculerSalaireEmploye() {
        return getChiffreAffaire() * POURCENT_REPRESENTANT + BONUS_REPRESENTANT;
    }

    @Override
    public String getTitre() {
        return "Le representant";
    }
}
