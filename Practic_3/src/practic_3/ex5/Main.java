package practic_3.ex5;

public class Main {
    public static void main(String[] args) {
        //task1
        Double obj = Double.valueOf(25.5);

        //task2
        String age = "18.9";
        double ageDouble = Double.parseDouble(age);

        //task3
        Double obj_2 = Double.valueOf(26.9);
        int obj_2_int = obj_2.intValue();
        char obj2_char = (char)obj_2.intValue();
        boolean obj_2_bool = 0 != obj_2;

        //task4
        System.out.println(obj_2);

        //task5
        String d = Double.toString(obj_2);
        System.out.println(d);
    }
}
