package tp4.ex3;

import java.util.IllegalFormatCodePointException;

public class Point {
    private int x,y;

    public Point() {
        x=-10000; y=-10000;
    }

    public Point(int x, int y) throws PointException {
        if (x<0 || y<0)
            throw new PointException();
        this.x = x; this.y = y;
        System.out.println("Le point est cree avec succes.");
    }

    public String toString() {
        return "Le point se trouve dans la position : " + x + " " + y;
    }

}
