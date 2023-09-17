package box10;

public abstract class Transport {
    protected double speed;
    protected int countSide;
    protected double price;

    public Transport(double speed, int countSide, double price) {
        this.speed = speed;
        this.countSide = countSide;
        this.price = price;
    }

    public abstract double cost();
}
