package box_6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты и радиус 1-ой окружности: ");
        double x_1 = scanner.nextDouble();
        double y_1 = scanner.nextDouble();
        double radius_1 = scanner.nextDouble();
        Circle firstCircle = new Circle(x_1, y_1, radius_1);

        System.out.println("Введите координаты и радиус 2-ой окружности: ");
        double x_2 = scanner.nextDouble();
        double y_2 = scanner.nextDouble();
        double radius_2 = scanner.nextDouble();
        Circle secondCircle = new Circle(x_2, y_2, radius_2);

        System.out.println("Площадь 1-ой окружности = " + firstCircle.countAreaOfCircle());
        System.out.println("Площадь 2-ой окружности = " + secondCircle.countAreaOfCircle());

        Circle.comparisonOfCircles(firstCircle, secondCircle);
    }
}
