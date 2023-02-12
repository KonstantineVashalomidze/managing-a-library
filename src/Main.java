import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("amiko");
        customer.setSurname("esadze");

        Customer customer1 = new Customer();
        customer1.setName("amiko");
        customer1.setSurname("esadze2");

        Book book1 = new Book();
        book1.setName("name");
        book1.setDescription("description");
        book1.setBarCode("barcode");
        book1.setAuthor("author");

        Book book2 = new Book();
        book1.setName("name2");
        book1.setDescription("description2");
        book1.setBarCode("barcode2");
        book1.setAuthor("author2");

        BorrowingHistory.getInstance().borrowed(customer, book1, "2002-01-12");
        BorrowingHistory.getInstance().borrowed(customer, book2, "2002-01-12");

        System.out.println(BorrowingHistory.getInstance().getCustomerHistory().get(customer).size());




    }
}