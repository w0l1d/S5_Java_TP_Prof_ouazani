package tp5.ex1;

import java.util.Date;

public class Manutentionnaire extends Employe {
    private int nbrHeuresMensuel;
    private final int SALIAIRE_HORAIRE = 100;

    public Manutentionnaire(String nom, String prenom, int age, String dateDebutSer, int nbrHeuresMensuel) {
        super(nom, prenom, age, dateDebutSer);
        this.nbrHeuresMensuel = nbrHeuresMensuel;
    }

    @Override
    public double calculerSalaireEmploye() {
        return nbrHeuresMensuel * SALIAIRE_HORAIRE;
    }

    @Override
    public String getTitre() {
        return "Le manutentionnaire";
    }
}
