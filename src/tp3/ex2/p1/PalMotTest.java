package tp3.ex2.p1;

import java.util.Scanner;

public class PalMotTest {

    public  static void main(String[] args) {
        PalMot palMot = new PalMot();

        System.out.print("Entrer Le mot : ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        if (s.equals(palMot.inverse(s)))
            System.out.println("le mot est un palindrome");
        else
            System.out.println("le mot n'est pas un palindrome");

    }

}
