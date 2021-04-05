package tp6.ex2.Pkg1;

import java.util.ArrayList;
import java.util.ListIterator;

public class PersonneTest {


    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.add(new Personne(1, "ahmed", "Mohammed"));
        personnes.add(new Personne(2, "khatab", "omar"));
        personnes.add(new Personne(3, "alawi", "othman"));
        personnes.add(new Personne(5, "ah", "walid2"));
        personnes.add(new Personne(4, "abdullah", "khadija"));
        personnes.add(new Personne(5, "ah", "walid"));


        System.out.println("Affichage avant le trie :");
        for (ListIterator t = personnes.listIterator(); t.hasNext();)
            System.out.println(t.next().toString());


        //le trie des personnes
        personnes.sort(Personne::compareTo);


        System.out.println("Affichage avant le trie :");
        for (ListIterator t = personnes.listIterator(); t.hasNext();)
            System.out.println(t.next().toString());


    }
}
