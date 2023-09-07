package box3;

import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Product[] list = new Product[]{
                new Product(Categories.Clothes, "Штаны" , 400),
                new Product(Categories.Chemicals, "Хуета" , 200),
                new Product(Categories.Electronics, "Пылесос" , 100),
                new Product(Categories.Food, "Яблоко" , 50)};

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин:");
        String log = sc.nextLine();
        System.out.println("Введите пароль:");
        String pas = sc.nextLine();

        showCatolog();
    }

    public static void showCatolog(){
        Catolog catolog = new Catolog(); int i = 1;
        System.out.println("Выберете категорию: ");
        for (Categories el : catolog.getList()){
            System.out.println(i + ")" + el);
            i++;
        }
    }

    public static void getCategoris(int x){
        int i =1;
        switch (x){
            case 1:
                Categories cat1 = Categories.Clothes;
                ArrayList<Product> elements1 = cat1.getAllProductInCat();
                for(Product el: elements1) {
                    System.out.println(i + ") " + el );
                }
                break;
            case 2:
                Categories cat2 = Categories.Chemicals;
                ArrayList<Product> elements2 = cat2.getAllProductInCat();
                for(Product el: elements2) {
                    System.out.println(i + ") " + el );
                }
                break;
            case 3:
                Categories cat3 = Categories.Electronics;
                ArrayList<Product> elements3 = cat3.getAllProductInCat();
                for(Product el: elements3) {
                    System.out.println(i + ") " + el );
                }
                break;
            case 4:
                Categories cat4 = Categories.Food;
                ArrayList<Product> elements4 = cat4.getAllProductInCat();
                for(Product el: elements4) {
                    System.out.println(i + ") " + el );
                }
                break;
            }
    }
}
