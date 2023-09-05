package box_7;

public class Book {
    private String Autor;
    private String Name;
    private int Year;

    public Book(String autor, String name, int year) {
        Autor = autor;
        Name = name;
        Year = year;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString(){
        return "Book { Autor = " + Autor + "; Name = " + Name + "; Year = " + Year + " }";
    }
}
