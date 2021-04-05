package tp5.ex1;

import java.util.Date;

public class TechnicienARisque extends Technicien implements Risque {
    public TechnicienARisque(String nom, String prenom, int age, String dateDebutSer, int nbrProduitesMensuel) {
        super(nom, prenom, age, dateDebutSer, nbrProduitesMensuel);
    }

    @Override
    public double calculerSalaireEmploye() {
        return super.calculerSalaireEmploye() + PRIME;
    }
}
