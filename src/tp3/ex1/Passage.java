package tp3.ex1;

public class Passage {

    void methode1(int n) {
        n+=10;
    }

    void methode2() {
        int n = 2;
        methode1(n);
        System.out.println("n=" + n);
    }
    public static String concat1(String s, String s2) {
        s +=s2;
        return s;
    }
    public static void concat2(StringBuffer s, StringBuffer s2) {
        s.append(s2);
    }
    void methode3() {
        String s = "Salam";
        s = concat1(s, " tout le monde");
        System.out.println(s);
    }
    void methode4() {
        StringBuffer s1 = new StringBuffer("Salam");
        StringBuffer s2 = new StringBuffer(" tout le monde");
        concat2(s1, s2);
        System.out.println(s1);
    }


}
