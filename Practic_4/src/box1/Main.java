package box1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Enum TIMEODYEAR;
        for(Enum element: Enum.values()){
            if (Objects.equals(element.toString(), "Osen")){
                TIMEODYEAR = element;
            }
        }
        //System.out.println(TIMEODYEAR.t);
    }
}
