package practic_3.ex2;

import java.util.Random;

public class Circle {
    private Point point;
    private int r;

    public Circle(int r) {
        Random rand = new Random();
        this.point = new Point(rand.nextDouble(100), rand.nextDouble(100));
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public int getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Circle { " +
                point.toString() +
                ", r = " + r +
                " }";
    }
}
