package box_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookShelf {
    private ArrayList<Book> bookshelf = new ArrayList<>();
    private int lenght = 0;

    public BookShelf(){
    }

    public void addBook(Book book){
        bookshelf.add(book);
        lenght+=1;
    }

    public String minYear(){
        Book curr = bookshelf.get(0);
        for (Book el: bookshelf){
            if(curr.getYear() > el.getYear()){
                curr = el;
            }
        }
        return curr.toString();
    }

    public String maxYear(){
        Book curr = bookshelf.get(0);
        for (Book el: bookshelf){
            if(curr.getYear() < el.getYear()){
                curr = el;
            }
        }
        return curr.toString();
    }

    public void bookSort(){
        Collections.sort(bookshelf, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getYear() - o2.getYear();
            }
        });
    }

    public void printBookShelf(){
        for (Book el: bookshelf){
            System.out.println(el.toString());
        }
    }
}
