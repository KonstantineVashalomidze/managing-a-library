public class Main {


    public static void main(String[] args) {
        // create library storage
        BookStorage bookStorage = new BookStorage();


        // create book
        Book book1 = new Book();
        book1.setName("name1");
        book1.setAuthor("author1");
        book1.setBarCode("barcode1");
        book1.setDescription("description1");


        // add book in library storage
        bookStorage.addNewBook(book1);

        // get book by name
        System.out.println(bookStorage.getBookByName("name1"));

        // remove book
        bookStorage.removeBook(bookStorage.getBookByName("name1"));
    }
}