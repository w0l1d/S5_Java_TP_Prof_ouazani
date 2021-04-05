package tp4.ex1;

public class Livre {
    private String titre, auteur;
    private int nbPages;
    private float prix;

    private static int nbLivres;

    public static final int MAX_LIVRES = 5;

    public Livre() {
        auteur = "inconnue"; titre = "inconnue";
        prix = 0; nbPages = 0;
    }

    public Livre(String a, String t, float p, int n) throws PrixException, TitreException {
        if (nbLivres >= MAX_LIVRES) {
            System.out.println("nombre maximal des livres est depassee.");
            return;
        }
        if (p < 0)
            throw new PrixException();
        if (t.length() > 50)
            throw new TitreException();
        this.auteur = a; this.titre = t;
        this.prix = p; this.nbPages = n;
        nbLivres++;
        System.out.println("Le livre est ajoute.");
    }


    public String getAuteur() {return this.auteur;}
    public String getTitre() {return this.titre;}
    public float getPrix() {return this.prix;}
    public int getNbPages() {return this.nbPages;}

    public String toString() {
        return "Auteur : " + getAuteur()
                + ".\nTitre : " + getTitre()
                + ".\nPrix : " + getPrix()
                + ".\nNombre des pages : " + getNbPages();
    }

    public static int getNbLivres() {return nbLivres;}


}
