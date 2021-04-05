package tp7.ex1;

import java.io.File;

public class Fichier {


    public static void main(String[] args) {
        File f = new File("src\\tp7\\test.txt");
        afficherDetails(f);

        File rep = new File("src\\tp7\\repTest");
        rep.mkdir();
        afficherDetails(rep);


        System.out.println("Affichage des lecteurs à la racine du PC:");
        for(File lecteur: File.listRoots())
        { //c’est une méthode static
            System.out.println(lecteur.getAbsolutePath());
            try {
                //On parcourt la liste des fichiers et répertoires
                for(File fichier : lecteur.listFiles())
                    //S'il s'agit d'un dossier, on ajoute un "/"
                    afficherDetails(fichier);
            } catch (NullPointerException e) {
                //L'instruction peut générer une NullPointerException s'il n'y a pas de sous-fichier !
            }
        }


        System.out.println("le fichier et le repertoire crees sont supprimer : ");
        f.delete();
        rep.delete();
        afficherDetails(f);
        afficherDetails(rep);








    }




    public static void afficherDetails(File f) {
        //affichage du chemin absolu
        System.out.println("chemin absolu : " + f.getAbsolutePath());

        //affichage du nom
        System.out.println("nom : " + f.getName());


        //affichage du si il exist
        System.out.println("exist : " + f.exists());

        //affichage du typde de fichier
        System.out.println("type : " + (f.isDirectory()? "repertoire":"fichier"));

        //affichage des droits d'acces au fichier
        System.out.println("les droits d'acces au fichier : "
                + (f.canRead()?"lire ":"")
                + (f.canWrite()?"ecrire ":"")
                + (f.canExecute()?"executer ":"")
        );
    }
}
