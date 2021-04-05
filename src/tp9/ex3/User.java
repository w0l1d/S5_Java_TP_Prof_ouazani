package tp9.ex3;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private String nom;
    private String prenom;
    private String dateInsc;
    private String phone;
    private String login;
    private String password;
    private float montant;
    private String adresse;
    private String sexe;
    private String loisirs;

    public User(ResultSet rst) throws SQLException {
        this.nom = rst.getString(1);
        this.prenom = rst.getString(2);
        this.dateInsc = rst.getString(3);
        this.phone = rst.getString(4);
        this.login = rst.getString(5);
        this.password = rst.getString(6);
        this.montant = rst.getFloat(7);
        this.adresse = rst.getString(8);
        this.sexe = rst.getString(9);
        this.loisirs = rst.getString(10);
    }


    public User(String nom, String prenom, String dateInsc, String phone, String login, String password, float montant, String adresse, String sexe, String loisirs) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateInsc = dateInsc;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.montant = montant;
        this.adresse = adresse;
        this.sexe = sexe;
        this.loisirs = loisirs;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateInsc() {
        return dateInsc;
    }

    public void setDateInsc(String dateInsc) {
        this.dateInsc = dateInsc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getLoisirs() {
        return loisirs;
    }

    public void setLoisirs(String loisirs) {
        this.loisirs = loisirs;
    }
}
