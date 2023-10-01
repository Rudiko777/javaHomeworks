package box1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // Получение текущей даты и времени
        Date currentDate = new Date();

        // Ввод даты пользователем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате dd.mm.yyyy: ");
        String userInput = scanner.nextLine();

        // Преобразование строки в объект Date
        Date userDate = null;
        try {
            // Парсинг строки в формате dd.mm.yyyy
            userDate = new SimpleDateFormat("dd.MM.yyyy").parse(userInput);
        } catch (ParseException e) {
            System.out.println("Ошибка: Некорректный формат даты.");
            System.exit(0);
        }

        // Сравнение дат
        if (currentDate.before(userDate)) {
            System.out.println("Введенная дата позже текущей даты.");
        } else if (currentDate.after(userDate)) {
            System.out.println("Введенная дата раньше текущей даты.");
        } else {
            System.out.println("Введенная дата совпадает с текущей датой.");
        }
    }
}
