package box_2;

import java.util.Scanner;

public class TestBall{
    public static void main(String[] args) {
        Ball ball_1 = new Ball(0, 0);
        Ball ball_2 = new Ball();
        System.out.println("Текущее местоположение первого мяча: " +
                ball_1.getX() + " по оси x и " + ball_1.getY() + " по оси y");
        System.out.println("Давайте зададим новое местоположение второго мяча: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        ball_2.setXY(x, y);
        System.out.println("Текущее местоположение второго мяча: " +
                ball_2.getX() + " по оси x и " + ball_2.getY() + " по оси y");
        System.out.println("Изменим координаты первго мяча - введите новые координаты");
        double newX = scanner.nextDouble();
        double newY = scanner.nextDouble();
        ball_1.move(newX, newY);
        System.out.println("Выведем общую информацию о мячах: ");
        System.out.println(ball_1.toString());
        System.out.println(ball_2.toString());
    }
}
