package tp2.ex3;

public class TestLivre {

    public static void main(String[] args) {

        // question 6
        Livre livre1 = new Livre("Delannoy", "Progarammer en Java", 100, 788);
        Livre livre2 = new Livre("Chevallier", "Java 7", 220, 250);
        Livre livre3 = new Livre();

        // question 7
        System.out.print("L'auteur du livre " + livre1.getTitre()
                + " est " + livre1.getAuteur() + ". ");
        livre2.categoriePrix(livre1);

        //question 8
        livre1.setPrix(555);
        livre1.categoriePrix(livre1);
        livre2.setPrix(39);
        livre2.categoriePrix(livre2);

        //question 10
        System.out.println("Nombres de pages total des deux livres : "
                + (livre1.getNbPages() + livre2.getNbPages()));


        //Partie 2
        //question 14
        System.out.println("Nombre de Livres Crees : " + Livre.getNbLivres());

        new Livre();
    }

}
