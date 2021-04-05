package tp3.ex2.p1;

public class PalMot {

    public String inverse(String mot) {
        StringBuffer inv = new StringBuffer("");

        for (int i = mot.length()-1; i >=0; i--)
            inv.append(mot.charAt(i));

        return inv.toString();
    }




}
