package tp6.ex2.Pkg1;

public class Personne implements Comparable<Personne>{

    private long id;
    private String nom, prenom;


    public Personne(long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + "\'";
    }

    @Override
    public int compareTo(Personne personne) {
        int c1 = getNom().compareTo(personne.getNom());
        return c1 != 0? c1: getPrenom().compareTo(personne.prenom);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
