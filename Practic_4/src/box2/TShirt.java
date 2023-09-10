package box2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMan(){
        System.out.println("Одеть мужчину");
    }

    public TShirt(Sizes size, double price, String color){
        super(size, price, color);
    }

    @Override
    public void dressWomen(){
        System.out.println("Одеть женщину");
    }

    @Override
    public String toString(){
        return "Футболка: " +
                " Размер - " + getSize() +
                " Цена - " + getPrice() +
                " Цвет - " + getColor();
    }
}
