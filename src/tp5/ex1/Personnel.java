package tp5.ex1;

import java.util.Scanner;

public class Personnel {
    protected Employe[] employes;
    private int nbEmployes;
    private final int MAX_EMPLOYES = 10;


    public Personnel(int n) {
        if (n > MAX_EMPLOYES) {
            System.out.println("Erreur: Le nom bres des employes ne doit pas depasser " + MAX_EMPLOYES);
            return;
        }
        employes = new Employe[n];
    }

    public void remplirEmploye() {
        int choix = 0;
        Employe employe = null;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("fonction de l'employe : ");
            System.out.println("1 -> Vendeur.");
            System.out.println("2 -> Reperesentant.");
            System.out.println("3 -> Technicien.");
            System.out.println("4 -> Technicien avec Risque.");
            System.out.println("5 -> Manutentionnaire.");
            System.out.println("6 -> Manutentionnaire avec Risque");
            System.out.println("7 -> retour");
            System.out.print("Entrer votre choix");
            choix = in.nextInt();
            if (choix == 7)
                return;
            if (choix < 0 || choix > 8)
                System.out.println("Choix Invalide!\n\n");
        } while (choix < 0 || choix > 8);


        System.out.println("entrer les infomations de l'employe:");
        System.out.print("Nom : ");
        String nom = in.next();
        System.out.print("Prenom : ");
        String prenom = in.next();
        System.out.print("Age : ");
        int age = in.nextInt();
        System.out.print("Date du debut de service : ");
        String dateDebutSer = in.next();


        switch (choix) {
            case 1, 2 -> {
                System.out.print("Entrer le chiffre d'affaire : ");
                if (choix == 1)
                    employe = new Vendeur(nom, prenom, age, dateDebutSer, in.nextDouble());
                else
                    employe = new Representant(nom, prenom, age, dateDebutSer, in.nextDouble());
            }
            case 3, 4 -> {
                System.out.print("Nombre d'unites produites mensuellement : ");
                if (choix == 3)
                    employe = new Technicien(nom, prenom, age, dateDebutSer, in.nextInt());
                else
                    employe = new TechnicienARisque(nom, prenom, age, dateDebutSer, in.nextInt());
            }
            case 5, 6 -> {
                System.out.print("Nombre d'heures de travail mensuel : ");
                if (choix == 5)
                    employe = new Manutentionnaire(nom, prenom, age, dateDebutSer, in.nextInt());
                else
                    employe = new ManutentionnaireARisque(nom, prenom, age, dateDebutSer, in.nextInt());
            }
            default -> System.out.println("Choix Invalide.");
        }
        if (employe != null)
            ajouterEmploye(employe);
    }

    public void ajouterEmploye(Employe e) {
        if (nbEmployes >= MAX_EMPLOYES) {
            System.out.println("Erreur: Nombre maximal des employes est depasse.");
            return;
        }
        employes[nbEmployes] = e;
        nbEmployes++;
        System.out.println("Employe est ajoute.");
    }

    public void afficherSalaires() {
        for (int i = 0; i<nbEmployes; i++)
            System.out.println(employes[i].toString() + ", " + employes[i].calculerSalaireEmploye());
    }

    public double salaireMoyen() {
        if (nbEmployes == 0 )
            return 0;
        double tmp = 0;
        for (int i = 0; i<nbEmployes; i++) {
            tmp += employes[i].calculerSalaireEmploye();
        }
        if (tmp == 0)
            return 0;
        return tmp / nbEmployes;
    }


    public static void menu() {
        Scanner in = new Scanner(System.in);
        int choix = 0;

        System.out.println("Entrer le nombre maximal des employes : ");
        Personnel personnel = new Personnel(in.nextInt());

        do {
            System.out.println("*********Menu***********");
            System.out.println("1-> Ajouter un employe.");
            System.out.println("2-> afficher les employes.");
            System.out.println("3-> afficher la moyenne des salaires.");
            System.out.println("4-> Quitter.");
            System.out.println("Entrer votre choix : ");
            choix = in.nextInt();
            switch (choix) {
                case 1: personnel.remplirEmploye(); break;
                case 2: personnel.afficherSalaires(); break;
                case 3: System.out.println("La moyenne des salaires est : "
                        + personnel.salaireMoyen()); break;
                case 4: break;
                default:
                    System.out.println("Choix Invalide.");
            }
        }while (choix != 4);
    }

    public static void main(String[] args) {
        menu();
    }


}
