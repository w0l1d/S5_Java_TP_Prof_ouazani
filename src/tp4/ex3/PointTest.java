package tp4.ex3;

public class PointTest {
    public static void main(String[] args) throws PointException {
        Point a = new Point(4,3);
        Point b = null;
        try {
            b = new Point(-5, 1);
        } catch (PointException e) {

        } finally {
            if (b == null)
                b = new Point();
            System.out.println("Fin du programme.");
        }
        System.out.println(a.toString());
        System.out.println(b.toString());

    }


}
