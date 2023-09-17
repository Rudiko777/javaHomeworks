package practic_3.converter;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
//        double dollar = scanner.nextDouble();
        Conventer converter = new Conventer();
        System.out.println("Есть возможность оплаты валютой: dollar и ruble");
        System.out.println("Выберите валюту: ");
        String moneyType = scanner.nextLine();
        if (Objects.equals(moneyType, "dollar")){
            System.out.println("Введите сколько у вас денег: ");
            double money = scanner.nextDouble();
            money = converter.dollarToRuble(money);
            if (money < shop.getMinListItem()){
                System.out.println("У вас не хватает денег!!!");
                System.exit(0);
            }
            System.out.println("У вас есть возможность купить следующие товары: ");
            for (int i = 0; i < shop.getList().size(); i++){
                if (shop.getList().get(i).getPrice() <= money){
                    System.out.println("Вам хватает на " + (i+1) + " товар");
                }
            }
        } else if (Objects.equals(moneyType, "ruble")) {
            System.out.println("Введите сколько у вас денег: ");
            double money = scanner.nextDouble();
            if (money < shop.getMinListItem()){
                System.out.println("У вас не хватает денег!!!");
                System.exit(0);
            }
            System.out.println("У вас есть возможность купить следующие товары: ");
            for (int i = 0; i < shop.getList().size(); i++){
                if (shop.getList().get(i).getPrice() <= money){
                    System.out.println("Вам хватает на " + (i+1) + " товар");
                }
            }
        }
    }
}
