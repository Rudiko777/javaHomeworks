package box2;

public class Skirt extends Clothes implements WomenClothing{
    @Override
    public void dressWomen(){
        System.out.println("Одеть женщину");
    }

    Skirt(Sizes size, double price, String color){
        super(size, price, color);
    }

    @Override
    public String toString(){
        return "Юбка: " +
                " Размер - " + getSize() +
                " Цена - " + getPrice() +
                " Цвет - " + getColor();
    }
}
