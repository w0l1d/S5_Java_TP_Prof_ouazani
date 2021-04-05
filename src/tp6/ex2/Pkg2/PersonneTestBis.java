package tp6.ex2.Pkg2;

import tp6.ex2.Pkg1.Personne;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PersonneTestBis {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String criter;

        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.add(new Personne(1, "ahmed", "Mohammed"));
        personnes.add(new Personne(2, "khatab", "omar"));
        personnes.add(new Personne(3, "alawi", "othman"));
        personnes.add(new Personne(4, "ah", "walid2"));
        personnes.add(new Personne(5, "abdullah", "khadija"));
        personnes.add(new Personne(6, "ah", "walid"));

        System.out.println("affichage du contenue : ");
        for (Personne p:personnes)
            System.out.println(p.toString());


        do {
            System.out.print("Entrer un critere de tri : ");
            criter = in.next();
            System.out.println();
        } while (criter.toUpperCase().compareTo(ComparePersonnes.TypeComp.Nom.toString().toUpperCase()) != 0
        && criter.toUpperCase().compareTo(ComparePersonnes.TypeComp.Prenom.toString().toUpperCase()) != 0);

        if (criter.toUpperCase().compareTo(ComparePersonnes.TypeComp.Prenom.toString().toUpperCase()) == 0)
            personnes.sort(new ComparePersonnes(ComparePersonnes.TypeComp.Prenom));
        else
            personnes.sort(new ComparePersonnes(ComparePersonnes.TypeComp.Nom));

        System.out.println("affichage du contenue apres le tri: ");
        for (Personne p:personnes)
            System.out.println(p.toString());


        System.out.println("cerche sur le personne avec l'id 2 : ");
        for (Personne p:
             personnes) {
            if (p.getId() == 2){
                System.out.println(p.toString());
                break;
            }
        }


        System.out.println("chercher en utilisant le binarySearch : ");
        System.out.print("entrer le id : ");
        int id = in.nextInt();
        System.out.print("entrer le nom : ");
        String nom = in.next();
        System.out.print("entrer le prenom : ");
        String prenom = in.next();
        int index = Collections.binarySearch(personnes,
                new Personne(id, nom, prenom),
                new ComparePersonnes(ComparePersonnes.TypeComp.Nom));
        if (index < 0)
            System.out.println("Le personne n'est pas trouvee");
        else
            System.out.println(personnes.get(index).toString());


        System.out.println("Chercher le monimum d'une llist : ");
        Personne min = null;
        Personne max = null;
        for (Personne p: personnes) {
            if (min == null)
                min = p;
            if (max == null)
                max = p;
            if (p.compareTo(min) > 0)
                min = p;
            if (new ComparePersonnes(ComparePersonnes.TypeComp.Prenom).compare(p, max) < 0)
                max = p;
        }
        System.out.println("le monimum de la list est : ");
        System.out.println(min.toString());
        System.out.println("le maximum de la list est : ");
        System.out.println(max.toString());





    }

}
