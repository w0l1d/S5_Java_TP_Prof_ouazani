package tp2.ex3;

public class Livre {

    String auteur;
    String titre;
    float prix;
    int nbPages;

    static int nbLivres;
    static final int MAX_LIVRES = 3;

    public Livre() {
        this("sddf", "dfsd", 564, 46);
    }
    public Livre(String auteur, String titre, float prix, int nbPages) {
        if (nbLivres < MAX_LIVRES) {
            nbLivres++;
            this.auteur = auteur;
            this.titre = titre;
            this.prix = prix;
            this.nbPages = nbPages;
            System.out.println("Livre créé avec succès ");
        } else
            System.out.println("Livre n'est pas cree");

    }

    public static int getNbLivres() {
        return nbLivres;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void categoriePrix(Livre l) {
        if (l.prix <= 25)
            System.out.println("Ce livre n'est pas cher.");
        else if (l.prix <= 60)
            System.out.println("Ce livre est de prix moyen.");
        else
            System.out.println("Ce livre est cher.");
    }
}

