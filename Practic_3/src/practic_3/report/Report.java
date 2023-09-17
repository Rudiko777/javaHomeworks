package practic_3.report;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Report {
    static ArrayList<Employee> list = new ArrayList<>(Arrays.asList(
            new Employee("Иванов", 45626.985),
            new Employee("Петров", 34890.114),
            new Employee("Колесов", 58911.852)
    ));

    public static void generateReport(){
        System.out.println("Информация о сотрудниках");
        final String pattern = "#0.00";
        for (int i = 0; i < getList().size(); i++){
//            String name = getList().get(i).getFullname();
            String formattedDouble = new DecimalFormat(pattern).format(getList().get(i).getSalary());
            System.out.print("Сотрудник: " + getList().get(i).getFullname() + "\n");
            System.out.printf("%-15s %15s %n", " имеет зарплату ---> ", formattedDouble);
            System.out.println("\n");
        }
    }

    public static ArrayList<Employee>getList(){
        return list;
    }

    public static void main(String[] args) {
        generateReport();

    }
}
