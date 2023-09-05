package box_6;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double countAreaOfCircle(){
        return Math.PI * Math.pow(radius, 2);
    }

    public static void comparisonOfCircles(Circle first, Circle second){
        System.out.println("Сравним расположение по оси x:");
        if (first.getX() > second.getX()){
            System.out.println("Первая окружность: " + first.getX() + ". Вторая окружность: " + second.getX());
        } else if (first.getX() < second.getX()) {
            System.out.println("Первая окружность: " + first.getX() + ". Вторая окружность: " + second.getX());
        }
        else {
            System.out.println("Первая окружность: " + first.getX() + ". Вторая окружность: " + second.getX());
        }

        System.out.println("Сравним расположение по оси y:");
        if (first.getY() > second.getY()){
            System.out.println("Первая окружность: " + first.getY() + ". Вторая окружность: " + second.getY());
        } else if (first.getY() < second.getY()) {
            System.out.println("Первая окружность: " + first.getY() + ". Вторая окружность: " + second.getY());
        }
        else {
            System.out.println("Первая окружность: " + first.getY() + ". Вторая окружность: " + second.getY());
        }

        System.out.println("Сравним длину радиусов:");
        if (first.getRadius() > second.getRadius()){
            System.out.println("Первая окружность: " + first.getRadius() + ". Вторая окружность: " + second.getRadius());
        } else if (first.getRadius() < second.getRadius()) {
            System.out.println("Первая окружность: " + first.getRadius() + ". Вторая окружность: " + second.getRadius());
        }
        else {
            System.out.println("Первая окружность: " + first.getRadius() + ". Вторая окружность: " + second.getRadius());
        }
    }
}
