package tp4.ex1;

public class TitreException extends Exception {
    public TitreException() {
        System.out.println("Erreur: La longuer du titre ne doit pas depasse 50 caractere");
    }
}
