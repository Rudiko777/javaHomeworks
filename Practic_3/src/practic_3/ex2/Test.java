package practic_3.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Test {
    private static ArrayList<Circle> circles = new ArrayList<>();

    public Circle min(){
        Circle curr = circles.get(0);
        for(Circle el: circles){
            if(curr.getR() > el.getR())
                curr = el;
        }
        return curr;
    }

    public Circle max(){
        Circle curr = circles.get(0);
        for(Circle el: circles){
            if(curr.getR() < el.getR())
                curr = el;
        }
        return curr;
    }

    public static void sortCircles(){
        Collections.sort(circles, ((o1, o2) -> o1.getR() - o2.getR()));
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int k_circle = rand.nextInt(30);
        for(int i = 0 ; i < k_circle; i++) {
            Circle el = new Circle(rand.nextInt(100));
            circles.add(el);
        }

        int i = 1;
        for(Circle el: circles) {
            System.out.println(i + ". " + el.toString());
            i++;
        }
    }
}
