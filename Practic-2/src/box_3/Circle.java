package box_3;

public class Circle extends Point{
    private Point point = new Point();
    private int radius;

    Circle(double x, double y, int radius){
        this.point = new Point(x, y);
        this.radius = radius;
    }

    Circle(int radius){
        this.radius = radius;
    };

    public void setPoint(double x, double y){
        this.point = new Point(x, y);
    }
}
