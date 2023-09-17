package box_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"java", "kotlin", "python", "ruby", "c++"};
        for (String el: array){
            System.out.println(el);
        }
        System.out.println("------------------------------");
        for (int i = 0; i < array.length / 2; i++){
            String result = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = result;
        }
        for (String el: array){
            System.out.println(el);
        }
    }
}
