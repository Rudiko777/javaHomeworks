package box2;

public class Pants extends Clothes implements WomenClothing, MenClothing{
    @Override
    public void dressMan(){
        System.out.println("Одеть мужчину");
    }

    @Override
    public void dressWomen(){
        System.out.println("Одеть женщину");
    }

    Pants(Sizes size, double price, String color){
        super(size, price, color);
    }

    @Override
    public String toString(){
        return "Штаны: " +
                " Размер - " + getSize() +
                " Цена - " + getPrice() +
                " Цвет - " + getColor();
    }
}
