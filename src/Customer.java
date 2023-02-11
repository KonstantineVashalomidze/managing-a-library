import java.util.HashMap;

public class Customer {
    private String name;
    private String surname;
    private HashMap<Book, Integer> booksBorrowedForNDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public HashMap<Book, Integer> getBooksBorrowedForNDays() {
        return booksBorrowedForNDays;
    }

    public void setBooksBorrowedForNDays(HashMap<Book, Integer> booksBorrowedForNDays) {
        this.booksBorrowedForNDays = booksBorrowedForNDays;
    }
}
