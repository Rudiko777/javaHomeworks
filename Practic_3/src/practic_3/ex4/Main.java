package practic_3.ex4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = scanner.nextInt();
        while (n < 0){
            System.out.println("Введите корректное значение: ");
            n = scanner.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            int num = rand.nextInt(n);
            list.add(num);
            System.out.println(list.get(i));
        }
        System.out.println("-----------------");
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                newList.add(list.get(i));
            }
        }
        for (int i = 0; i < newList.size(); i++){
            System.out.println(newList.get(i));
        }
    }
}
