package box6789;

public class Book implements Printable{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.println("Объект " + name +
                ", цена - " + price + ", автор - " + author);
    }
}
