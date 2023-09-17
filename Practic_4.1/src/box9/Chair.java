package box9;

public class Chair extends Furniture{
    private int x;
    private int y;
    private int z;

    public Chair(String color, double price, int x, int y, int z) {
        super(color, price);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getV() {
        return x * y * z;
    }

    @Override
    public String toString() {
        return "Стул {" +
                "цена = " + price +
                ", цвет = " + color +
                ", объём = " + getV() +
                " }";
    }
}
