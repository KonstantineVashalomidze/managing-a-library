import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Customer {
    private String name;
    private String surname;

    private Set<Book> borrowedBooks = new HashSet<>();

    // get name of customer
    public String getName() {
        return this.name;
    }

    // set name of customer
    public void setName(String name) {
        this.name = name;
    }

    // get surname of customer
    public String getSurname() {
        return this.surname;
    }

    // set surname of customer
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // search book in customer's borrowed books
    public Book searchBook(){
        // TO DO
    }

    // borrow book
    public void borrowBookWithName(String bookName){
        // setting searched book in local temporary book variable
        Book localBookTemp = BookStorage.getInstance().searchBookByName(bookName);
        if (localBookTemp != null){
            // remove book from BookStorage after borrowing it
            BookStorage.getInstance().removeBook(localBookTemp);
            // add borrowed book to borrowed book's set
            this.borrowedBooks.add(localBookTemp);
        } else {
            System.out.println("There is no book with name '".concat(bookName).concat("' in library"));
        }
    }

    // return book
    public void returnBookWithName(String bookName){
        // TO DO
    }

}
