package practic_3.ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("First Method\n");
        Random rand = new Random();
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            double randDouble = rand.nextDouble(100);
            list.add(randDouble);
        }
        for (double el: list){
            System.out.println(el);
        }
        System.out.println("--------------------------------");
        //Collections.sort(list);
        Collections.sort(list);
        for (double el: list){
            System.out.println(el);
        }

        System.out.println("\nSecond Method\n");
        list.clear();

        for (int i = 0; i < 10; i++){
            double randDouble = Math.random()*100;
            list.add(randDouble);
        }
        for (double el: list){
            System.out.println(el);
        }

        System.out.println("--------------------------------");
        //Collections.sort(list);
        Collections.sort(list);
        for (double el: list){
            System.out.println(el);
        }
    }
}
