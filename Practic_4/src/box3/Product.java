package box3;

public class Product{
    private Categories categor;
    private String name;
    private int cost;

    public Product(Categories categor, String name, int cost) {
        this.categor = categor;
        this.name = name;
        this.cost = cost;
    }


    public Categories getCategor() {
        return categor;
    }

    @Override
    public String toString() {
        return "Товар {Название = " + name +
                ", Цена = " + cost +
                "р.}";
    }
}
