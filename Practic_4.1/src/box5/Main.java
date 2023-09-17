package box5;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[]{
                new Reader("Чакрян Р.А.", 123, "Proggram", "12.10.2004", "89187777777"),
                new Reader("Джелетян В.А", 1531, "Proggram", "10.07.2004", "8913123227"),
                new Reader("Алексенко Д.Т.", 1853, "Proggram", "30.01.2002", "89187897217")
        };
        readers[0].returnBook(45);
        readers[0].returnBook(new String[]{"Война и Мир", "Герой нашего времени"});
        Book book1 = new Book("Капитанская дочка", "Пушкин А.С.");
        Book book2 = new Book("Преступление и наказание", "Достоевкий Ф.М.");
        readers[0].returnBook(new Book[]{book1, book2});
        System.out.println();
        readers[0].takeBook(new String[]{"Война и Мир", "Герой нашего времени"});
        readers[0].takeBook(10);
        readers[0].takeBook(new Book[]{book1, book2});
    }
}
