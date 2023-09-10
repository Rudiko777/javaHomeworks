package box5;

public class Reader {
    private String FIO;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String numberPhone;

    public Reader(String FIO, int cardNumber, String faculty, String dateOfBirth, String numberPhone) {
        this.FIO = FIO;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.numberPhone = numberPhone;
    }

    public void takeBook(){
        System.out.println("Взял книгу");
    };

    public void takeBook(int num){
        System.out.println(getFIO() + " взял " + num + " книги");
    }

    public void takeBook(String[] books){
        System.out.print(getFIO() + " взял книги: ");
        for(int i = 0; i < books.length; i++){
            if (i == books.length - 1){
                System.out.println(books[i]);
            }
            else {
                System.out.print(books[i] + ",");
            }
        }
    }

    public void takeBook(Book[] books){
        System.out.print(getFIO() + " взял книги: ");
        for(int i = 0; i < books.length; i++){
            if (i == books.length - 1){
                System.out.println(books[i].getName());
            }
            else {
                System.out.print(books[i].getName() + ",");
            }
        }
    }

    public void returnBook(){
        System.out.println("Вернул книгу");
    };

    public void returnBook(int num){
        System.out.println(getFIO() + " вернул " + num + " книги");
    };

    public void returnBook(String[] books){
        System.out.print(getFIO() + " вернул книги: ");
        for(int i = 0; i < books.length; i++){
            if (i == books.length - 1){
                System.out.println(books[i]);
            }
            else {
                System.out.print(books[i] + ",");
            }
        }
    }

    public void returnBook(Book[] books){
        System.out.print(getFIO() + " вернул книги: ");
        for(int i = 0; i < books.length; i++){
            if (i == books.length - 1){
                System.out.println(books[i].getName());
            }
            else {
                System.out.print(books[i].getName() + ",");
            }
        }
    }

    public String getFIO(){
        return FIO;
    }
}
