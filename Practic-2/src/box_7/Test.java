package box_7;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Иванов И.И.", "Рассвет", 1999);
        Book book2 = new Book("Петров И.И.", "Закат", 1998);
        Book book3 = new Book("Героинов И.И.", "Ночь", 2003);
        BookShelf shelf = new BookShelf();

        shelf.addBook(book1); shelf.addBook(book2); shelf.addBook(book3);

        System.out.println("Самый поздний срок издания: " + shelf.maxYear());
        System.out.println("Самый ранний срок издания: " + shelf.minYear());
        shelf.bookSort();
        System.out.println("Отсортиврованный шкаф:");
        shelf.printBookShelf();
    }
}
