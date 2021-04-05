package tp4.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntException {
    public static int saisieInt() {
        int i = 0;
        boolean check = true;
        Scanner in = new Scanner(System.in);
        System.out.print(" saisie un entier valide: ");
        do {
            try {
                i = in.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                System.out.println(" ce n'est pas un entier!");
            }
        } while (check);
        return i;
    }


    public static void main(String[] args) {
        System.out.println("L'entier saisie est : " + saisieInt());
    }

}
