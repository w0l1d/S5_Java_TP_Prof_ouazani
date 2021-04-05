package tp7.ex2;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {


        File f = new File("src/tp7/ex3/test.txt");
        File f2 = new File("src/tp7/ex3/testCopie.txt");


        try (FileInputStream fo = new FileInputStream(f)) {
            FileOutputStream fos = new FileOutputStream(f2);

            int i;
            while((i=fo.read())!=-1) {
                System.out.println(((char)i) + " " + i);
                fos.write(i);
            }
            fo.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




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

