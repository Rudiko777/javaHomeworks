package box1;

public class Test {
    public static void main(String[] args) {
        Share share = new Share("Окружность");
        Circle circle = new Circle(10, "Окружность");

        System.out.println(share);
        System.out.println("----------------------------------");
        System.out.println(circle);
    }
}
