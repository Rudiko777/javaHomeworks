package box9;

public abstract class Furniture {
    protected String color;
    protected double price;

    public Furniture(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public abstract int getV();
}
