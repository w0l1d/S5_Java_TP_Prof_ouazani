package tp5.ex1;


public class ManutentionnaireARisque extends Manutentionnaire implements Risque {
    public ManutentionnaireARisque(String nom, String prenom, int age, String dateDebutSer, int nbrHeuresMensuel) {
        super(nom, prenom, age, dateDebutSer, nbrHeuresMensuel);
    }

    @Override
    public double calculerSalaireEmploye() {
        return super.calculerSalaireEmploye() + PRIME;
    }

}
