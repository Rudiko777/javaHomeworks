package practic_3.ex3;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 4; i++){
            int num = rand.nextInt(10, 99);
            list.add(num);
        }
        for (int el: list){
            System.out.print(el + " " );
        }
        System.out.print("\n");
        for(int i = 0; i < list.size() - 1; i++){
            if (list.get(i) > list.get(i + 1)){
                System.out.println("Массив не строго возрастающий");
                System.exit(0);
            }
        }
        System.out.println("Массив строго возрастающий");
    }
}
