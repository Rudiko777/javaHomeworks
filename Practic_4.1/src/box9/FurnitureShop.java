package box9;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture[] list = new Furniture[]{
                new Table("Белый", 1500, 15, 6,8),
                new Chair("Чёрный", 2000, 3, 4,5),
                new Table("Красный", 500, 8, 1,7),
                new Table("Оранжевый", 1500, 5, 16,18),
                new Closet("Белый", 1500, 1, 26,3),
                new Closet("Зелёный", 1500, 9, 16,5),
        };

        for(Furniture el: list){
            System.out.println(el);
        }
    }
}
