package tp5.ex1;

import java.io.Serializable;

public abstract class Employe implements Serializable {

    private String nom, prenom;
    private int age;
    private String dateDebutSer;


    public Employe(String nom, String prenom, int age, String dateDebutSer) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateDebutSer = dateDebutSer;
    }

    public String getTitre() {return "L'employe";}

    public abstract double calculerSalaireEmploye();


    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateDebutSer='" + dateDebutSer + '\'' +
                '}';
    }
}
