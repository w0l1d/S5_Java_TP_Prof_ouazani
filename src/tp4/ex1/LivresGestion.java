package tp4.ex1;

import tp3.ex3.LivreString;

import java.util.Scanner;

public class LivresGestion {
    private Livre[] tab;

    public LivresGestion(int n) {
        tab = new Livre[n];
    }

    public void remplir() {
        String auteur, titre;
        int nbPages;
        float prix;
        Scanner in = new Scanner(System.in);
        System.out.print("Entrer le auteur du livre : ");
        auteur = in.nextLine();

        System.out.print("Entrer le titre du livre : ");
        titre = in.nextLine();

        System.out.print("Entrer le prix du livre : ");
        prix = in.nextFloat();

        System.out.print("Entrer le nombre des pages du livre : ");
        nbPages = in.nextInt();

        try {
            tab[Livre.getNbLivres()] = new Livre(auteur, titre, prix, nbPages);
        } catch (PrixException | TitreException Exception ) {
            System.out.println("Livre n'est pas cree, reessayez avec des donees corrects.");
        }
    }

    public void afficherLivres() {
        for (int i = 0; i < Livre.getNbLivres(); i++) System.out.println(tab[i].toString());
    }

    public void afficherNbLivres() {
        System.out.println("Nombre de Livres : " + Livre.getNbLivres());
    }

    public void rechercherLivres() {
        Scanner in = new Scanner(System.in);
        int critere;

        System.out.println("Rechercher par :" +
                "\n1-> Titre du livre." +
                "\n2-> Auteur du Livre.");
        System.out.print("--Entrer le numero correspond : ");
        critere = in.nextInt();
        System.out.println("\n");
        if (critere != 1 && critere != 2){
            System.out.println("Choix Invalide!\n");
            return;
        }

        System.out.print("Entrer le mot de recherche : ");
        String mot = in.next();
        System.out.println("\n\n");
        boolean found = false;
        switch (critere) {
            case 1:
                for (int i = 0; i < Livre.getNbLivres(); i++) {
                    if (tab[i].getTitre().contains(mot)) {
                        System.out.println(tab[i].toString());
                        found = true;
                    }
                }
                break;

            case 2:
                for (int i = 0; i < Livre.getNbLivres(); i++) {
                    if (tab[i].getAuteur().contains(mot)) {
                        System.out.println(tab[i].toString());
                        found = true;
                    }
                }
                break;
        }
        if (!found)
            System.out.println("Le mot rechercher n'existe pas dans le tableau.");
    }

    public void menu() {
        int choix;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("*******Menu de Livres********");
            System.out.println("1-> Ajouter un livre.");
            System.out.println("2-> Afficher les livres.");
            System.out.println("3-> Afficher le nombre des livres.");
            System.out.println("4-> Chercher sur un livre.");
            System.out.println("5-> Quitter\n");
            System.out.print("Entrer Votre choix: ");
            choix = in.nextInt();
            switch (choix) {
                case 1: remplir();break;
                case 2: afficherLivres();break;
                case 3: afficherNbLivres();break;
                case 4: rechercherLivres();break;
                default:
                    System.out.println("Choix Invalide!");
            }
            System.out.println("\n\n\n\n\n");
        }while (choix != 5);

    }

    public static void main(String[] args) throws InterruptedException {
        LivresGestion livresGestion = new LivresGestion(10);
        livresGestion.menu();
    }

}
