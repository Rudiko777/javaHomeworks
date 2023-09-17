package box3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(
                new Object("Планшет"),
                new Object("Животные"),
                new Object("Машины")
        ));

        for(Object el: list){
            System.out.println(el.getName());
        }
    }
}
