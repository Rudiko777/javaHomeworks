package box1;

public class Test {
    public static void main(String[] args) {
        Shape share = new Shape("Окружность");
        Circle circle = new Circle(10, "Окружность");

        System.out.println(share);
        System.out.println("----------------------------------");
        System.out.println(circle);
    }
}
