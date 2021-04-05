package tp3.ex2.p2;

import tp3.ex2.p1.PalMot;

import java.util.Arrays;
import java.util.Scanner;

public class PalPhrase {

    String supEspace(String phrase) {
        String[] tmp = phrase.split(" ");
        StringBuffer s = new StringBuffer();

        for (String tmp2 : tmp)
            s.append(tmp2);

        return s.toString();
    }


    public static void main(String[] args) {
        PalMot palMot = new PalMot();
        PalPhrase palPhrase = new PalPhrase();

        System.out.print("Entrer La phrase : ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        s = palPhrase.supEspace(s);
        if (s.equals(palMot.inverse(s)))
            System.out.println("le mot est un palindrome");
        else
            System.out.println("le mot n'est pas un palindrome");



    }
}
