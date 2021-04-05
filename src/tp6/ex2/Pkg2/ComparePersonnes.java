package tp6.ex2.Pkg2;

import tp6.ex2.Pkg1.Personne;

import java.util.Comparator;

public class ComparePersonnes implements Comparator<Personne> {


    @Override
    public int compare(Personne p1, Personne p2) {
        if (critere.equals(TypeComp.Nom))
            return p1.compareTo(p2);
        int c1 = p1.getPrenom().compareTo(p2.getPrenom());
        return  c1 != 0? c1:p1.getNom().compareTo(p2.getNom());

    }

    public enum TypeComp {
        Nom,
        Prenom
    }

    private TypeComp critere;

    public ComparePersonnes(TypeComp critere) {
        this.critere = critere;
    }


}
