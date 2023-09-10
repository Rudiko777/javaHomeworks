package box2;

public class Tie extends Clothes implements MenClothing{
    @Override
    public void dressMan(){
        System.out.println("Одеть мужчину");
    }

    Tie(Sizes size, double price, String color){
        super(size, price, color);
    }

    @Override
    public String toString(){
        return "Галстук: " +
                " Размер - " + getSize() +
                " Цена - " + getPrice() +
                " Цвет - " + getColor();
    }
}
