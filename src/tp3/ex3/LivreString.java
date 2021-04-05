package tp3.ex3;

import javax.script.ScriptContext;
import java.util.Scanner;

public class LivreString {

    String[][] livres;
    int MAX_LIVRES;
    int NOMBRE_LIVRES;

    public LivreString(int n) {
        NOMBRE_LIVRES = 0;
        this.livres = new String[n][3];
    }

    public void remplir() {
        if (NOMBRE_LIVRES >= livres.length) {
            System.out.println("nombre de livre maximal est depassee.");
            return;
        }

        String auteur, titre, domaine;
        Scanner in = new Scanner(System.in);

        System.out.print("Entrer le auteur du livre : ");
        auteur = in.nextLine();

        System.out.print("Entrer le titre du livre : ");
        titre = in.nextLine();

        System.out.print("Entrer le domaine du livre : ");
        domaine = in.nextLine();

        livres[NOMBRE_LIVRES][0] = titre;
        livres[NOMBRE_LIVRES][1] = auteur;
        livres[NOMBRE_LIVRES][2] = domaine;
        NOMBRE_LIVRES++;
    }


    public void afficher() {
        for (int i = 0; i < NOMBRE_LIVRES; i++) {
            System.out.println("\n\ntitre : " + livres[i][0]);
            System.out.println("auteur : " + livres[i][1]);
            System.out.println("domaine : " + livres[i][2]);
        }
    }

    public void rechercher() {
        System.out.print("Chercher sur : ");
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();

        for (String[] livre : livres) {
            if (livre[0].equals(s) || livre[1].contains(s)) {
                System.out.println("\n\ntitre : " + livre[0]);
                System.out.println("auteur : " + livre[1]);
                System.out.println("domaine : " + livre[2]);
            }
        }
    }

    public void menu() {
        int choix;
        LivreString livreString = new LivreString(5);
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("*******Menu de Livres********");
            System.out.println("1-> Ajouter un livre.");
            System.out.println("2-> Afficher les livres.");
            System.out.println("3-> Chercher sur un livre.");
            System.out.println("4-> Quitter\n");
            System.out.print("Entrer Votre choix: ");
            choix = in.nextInt();
            switch (choix) {
                case 1: livreString.remplir();break;
                case 2: livreString.afficher();break;
                case 3: livreString.rechercher();break;
                default:
                    System.out.println("Choix Invalide!");
            }
            System.out.println("\n\n");
        }while (choix != 4);

    }

    public static void main(String[] args) {
        new LivreString(10).menu();
    }


}
