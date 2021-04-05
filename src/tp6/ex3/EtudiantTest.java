package tp6.ex3;

import tp6.ex3.Etudiant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EtudiantTest {

    public static double getMoyenne(HashMap<Long, Etudiant> map) {
        double m = 0;
        for (Map.Entry<Long, Etudiant> etudiant:
             map.entrySet()) {
            m += etudiant.getValue().getNote();
        }
        return m/map.size();
    }

    public static void affiche(HashMap<Long, Etudiant> map) {
        for (Map.Entry<Long, Etudiant> etudiant:
                map.entrySet())
            System.out.println(etudiant.getValue().toString());
    }



    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        HashMap<Long, Etudiant> map = new HashMap<>();
        map.put(1L, new Etudiant(1, "walid", "Mohammed5", 19));
        map.put(9L, new Etudiant(9, "ahmed", "Mohammed", 17));
        map.put(2L, new Etudiant(2, "khatab", "omar", 15));
        map.put(3L, new Etudiant(3, "alawi", "othman", 18));
        map.put(5L, new Etudiant(5, "ah", "walid2", 16));
        map.put(4L, new Etudiant(4, "abdullah", "khadija", 14));
        map.put(8L, new Etudiant(5, "ah", "walid", 17));


        System.out.println("Les etudiants : ");
        affiche(map);



        System.out.println("La moyenne des etudiant : ");
        System.out.println(getMoyenne(map));



        System.out.print("Entrer id d'etudiant a supprimer : ");
        map.remove(scr.nextLong());

        System.out.println("affichage apres la suppression : ");
        System.out.println("des etudiants : ");
        affiche(map);
        System.out.println("de la moyenne : " + getMoyenne(map));


/*
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("ronaldo", 300);
        map1.put("messi", 30);
        map1.put("ronaldinho", 20);
        map1.put("maradona", 370);
        map1.put("znati", 250);
        map1.put("iniesta", 360);
        map1.put("suarez", 80);



        Map.Entry<String, Integer> max = null;
        
        
        for (Map.Entry<String, Integer> player:
                map1.entrySet()) {
            if (max == null)
                max = player;
            if (max.getValue() < player.getValue())
                max = player;
        }

        System.out.println(max.getKey() + " " + max.getValue());
*/

    }


}
