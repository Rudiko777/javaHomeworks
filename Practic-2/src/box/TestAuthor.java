package box;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Alex", "Pushkin@mail.ru", 'm');
        System.out.println("Имя автора: " + author.getName());
        System.out.println("Почта автора: " + author.getEmail());
        System.out.println("Пол автора: " + author.getGender());
        System.out.println("Также выведем общую информацию об авторе:" + "\n" + author.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите электронную почту автора: ");
        String newEmail = scanner.nextLine();
        author.setEmail(newEmail);
        System.out.println("Новая почта автора: " + author.getEmail());
    }
}
