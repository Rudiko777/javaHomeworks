package box;

import java.util.Scanner;

public class Job_1 {
    public static void main(String[] args) {
        //task 1
        ex1();

        //task 2
        ex2();

        //task 3
        ex3(args);

        //task 4
        ex4();

        //task 5
        ex5();
    }

    public static void ex1(){
        int[] array = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        float middle;

        for (int el: array){
            sum += el;
        }

        middle = (float) sum / array.length;
        System.out.println(sum);
        System.out.println(middle);
    }

    public static void ex2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int arrayNum = scanner.nextInt();
        int[] array = new int[arrayNum];
        System.out.println("Введите числа: ");
        for (int i = 0; i < array.length; i++){
            int element = scanner.nextInt();
            array[i] = element;
        }

        int min = array[0];
        int iter_first = 0;
        do{
            iter_first++;
            if (array[iter_first] < min){
                min = array[iter_first];
            }
        }
        while (iter_first != array.length - 1);

        int max = array[0];
        int iter_second = 0;
        while(iter_second != array.length - 1){
            iter_second++;
            if (array[iter_second] > max){
                max = array[iter_second];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void ex3(String[] args){
        for (String el: args){
            System.out.println(el);
        }
    }

    public static void ex4(){
        float sum = 0;
        for (float i = 1; i < 10 + 1; i++){
            sum += (1 / i);
        }
        System.out.println("Сумма гармонического ряда первых 10-и элементов: " + sum);
    }

    public static int factorial(int num){
        if (num == 1){
            return 1;
        }
        else {
            return num * (factorial(num - 1));
        }
    }

    public static void ex5(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }
}
