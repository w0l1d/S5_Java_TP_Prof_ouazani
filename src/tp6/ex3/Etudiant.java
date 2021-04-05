package tp6.ex3;

import tp6.ex2.Pkg1.Personne;

public class Etudiant extends Personne {

    private long note;
    public Etudiant(long id, String nom, String prenom, long note) {
        super(id, nom, prenom);
        this.note = note;
    }

    public long getNote() { return this.note; }

    @Override
    public String toString() {
        return super.toString() +
                ", note=\'" + note + "\'";
    }



}
