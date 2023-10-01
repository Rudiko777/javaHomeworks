package box1;

import java.util.Date;

public class Practice1 {
    public static void main(String[] args) {
        String developerLastName = "Smith"; // Фамилия разработчика

        // Получение текущей даты и времени при получении задания
        Date dateReceived = new Date();

        // Предположим, что задание было сдано сегодня
        Date dateSubmitted = new Date();

        // Вывод информации
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}
