package tp4.ex1;

public class PrixException extends Exception {
    public PrixException() {
        System.out.println("Erreur: Prix doit etre positif");
    }
}
