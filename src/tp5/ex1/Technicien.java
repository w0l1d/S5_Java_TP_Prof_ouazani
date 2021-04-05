package tp5.ex1;

import java.util.Date;

public class Technicien extends Employe {

    private final int FACTEUR_UNITE = 5;

    private int nbrProduitesMensuel;

    public Technicien(String nom, String prenom, int age, String dateDebutSer, int nbrProduitesMensuel) {
        super(nom, prenom, age, dateDebutSer);
        this.nbrProduitesMensuel = nbrProduitesMensuel;
    }

    @Override
    public double calculerSalaireEmploye() {
        return nbrProduitesMensuel * FACTEUR_UNITE;
    }

    @Override
    public String getTitre() {
        return "Le technicien";
    }
}
