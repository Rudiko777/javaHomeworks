package box1;

import java.sql.Time;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Times time = Times.Autumn;
        System.out.println("First - " + time + "\n");

        myFavoriteTimes(time);
        for(Times anyTime: Times.values()){
            System.out.println(
                    "Время года: " + anyTime + "\n" +
                    "Средняя температура: " + anyTime.getTemperature() + "\n" +
                    "Описание: " + anyTime.getDescription() + "\n"
            );
        }
    }

    public static void myFavoriteTimes(Times time){
        switch (time){
            case Autumn:
                System.out.println("Я очень люблю Осень");
                break;
            case Spring:
                System.out.println("Я очень люблю Весну");
                break;
            case Winter:
                System.out.println("Я очень люблю Зиму");
                break;
            case Summer:
                System.out.println("Я очень люблю Лето");
        }
    }

    public String getDescription(){
        return "Холодное время года";
    }


}
