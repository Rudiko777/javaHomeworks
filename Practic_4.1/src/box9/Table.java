package box9;

public class Table extends Furniture{
    private int x;
    private int y;
    private int z;

    public Table(String color, double price, int x, int y, int z) {
        super(color, price);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getV(){
        return x*y*z;
    }

    @Override
    public String toString() {
        return "Стол {" +
                "цена = " + price +
                ", цвет = " + color +
                ", объём = " + getV() +
                " }";
    }
}