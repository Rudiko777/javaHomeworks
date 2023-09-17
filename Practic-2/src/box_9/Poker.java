package box_9;

import box_4.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> listCards = new ArrayList<>(){};
        listCards.add("9buby");
        listCards.add("9chervi");
        listCards.add("9krest");
        listCards.add("9piki");

        listCards.add("10buby");
        listCards.add("10chervi");
        listCards.add("10krest");
        listCards.add("10piki");

        listCards.add("Valetbuby");
        listCards.add("Valetchervi");
        listCards.add("Valetkrest");
        listCards.add("Valetpiki");

        listCards.add("Damabuby");
        listCards.add("Damachervi");
        listCards.add("Damakrest");
        listCards.add("Damapiki");

        listCards.add("Kingbuby");
        listCards.add("Kingchervi");
        listCards.add("Kingkrest");
        listCards.add("Kingpiki");

        listCards.add("Tbuby");
        listCards.add("Tchervi");
        listCards.add("Tkrest");
        listCards.add("Tpiki");

        Collections.shuffle(listCards);

//        Random random = ThreadLocalRandom.current();
//        for(int i = listCards.size() - 1; i > 0; i--){
//            int index = random.nextInt(i + 1);
//            int a = listCards.indexOf(index);
//            listCards.indexOf()
//
//        }
        System.out.println(listCards);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        if (n > 4){
            System.out.println("Для данного кол-ва карт игроков слишком много");
            System.exit(1);
        }

        for (int i = 0; i < n; i++){
            for (int x = 0; x < 5; x++){
                System.out.println("Выдана карта: " + listCards.get(x));
                listCards.remove(x);
            }
            System.out.println();
        }
    }
}
